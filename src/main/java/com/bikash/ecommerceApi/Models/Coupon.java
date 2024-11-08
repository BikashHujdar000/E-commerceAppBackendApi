package com.bikash.ecommerceApi.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String code ;

    private  double discountPercentage;

    private LocalDate startDate;

    private  LocalDate endDate;

    private  double minOrder;

    private  boolean isActive = true;

    @ManyToMany(mappedBy = "usedCoupon")
    private Set<User>  couponUsers  = new HashSet<>();







}
