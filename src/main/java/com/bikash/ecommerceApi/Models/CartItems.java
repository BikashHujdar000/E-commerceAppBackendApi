package com.bikash.ecommerceApi.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CartItems {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @ManyToOne
    @JsonIgnore
    private  Cart cart;


    private  Product product;


    private  String size;


    private  int quantity = 1;

    private   double mrpPrice;

    private  double sellingPrice;

    private  Long userId;






}
