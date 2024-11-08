package com.bikash.ecommerceApi.Models;

import com.bikash.ecommerceApi.Domain.OrderStatus;
import com.bikash.ecommerceApi.Domain.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity()
@Table(name =" orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String orderId;

    @ManyToOne
    private User user;

    private Long sellerId;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems = new ArrayList<>();


    @ManyToOne
    private Address shippingAddress;

    @Embedded

    @AttributeOverride(name = "paymentStatus", column = @Column(name = "payment_status_details"))
    private PaymentDetails paymentDetails = new PaymentDetails();


    private double totalMrpPrice;
    private double sellingPrice;
    private double discount;

    private OrderStatus orderStatus;

    private int totalItem;

    private PaymentStatus paymentStatus = PaymentStatus.PENDING;

    private LocalDateTime orderDateTime = LocalDateTime.now();

    private LocalDateTime deliveryDate = LocalDateTime.now().plusDays(7);


}
