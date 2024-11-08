package com.bikash.ecommerceApi.Models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SellerReports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long totalEarning = 0L;
    private Long totalSales = 0L;
    private Long totalRefund = 0L;
    private Long totalTax = 0L;

    private Long netEarning = 0L;
    private Integer totalOrders = 0;
    private Integer totalTransactions = 0;
    private Integer cancelOrders = 0;


    @OneToOne
    private Seller seller;

}
