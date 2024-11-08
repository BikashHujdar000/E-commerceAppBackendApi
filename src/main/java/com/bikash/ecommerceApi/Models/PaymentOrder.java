package com.bikash.ecommerceApi.Models;

import com.bikash.ecommerceApi.Domain.PaymentMethod;
import com.bikash.ecommerceApi.Domain.PaymentOrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class PaymentOrder {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private  Long amount;



    private PaymentOrderStatus paymentOrderStatus = PaymentOrderStatus.PENDING;


    private PaymentMethod paymentMethod ;

    private  String paymentLinkId;


    @ManyToOne
    private  User user;

   @OneToMany
    private Set<Order> orders = new HashSet<>();







}
