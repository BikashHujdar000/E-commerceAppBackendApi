package com.bikash.ecommerceApi.Models;


import com.bikash.ecommerceApi.Domain.AccountStatus;
import com.bikash.ecommerceApi.Domain.USER_ROLE;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sellerName;
    private String mobile;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @Embedded
    private BusinessDetails businessDetails = new BusinessDetails();


    @Embedded
    private BankDetails bankDetails = new BankDetails();


    @OneToOne(cascade = CascadeType.ALL)
    private Address pickUpAddres = new Address();


    private String gst;

    private USER_ROLE role = USER_ROLE.ROLE_SELLER;

    private boolean isEmailVerified = false;

    private AccountStatus accountStatus = AccountStatus.PENDING_VERIFICATION;


}
