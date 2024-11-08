package com.bikash.ecommerceApi.Models;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.history.Revision;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String title;

    private  String description;

    private  double mrpPrice;

    private  double sellingPrice;

    private  double discountPercent;

    private  int quantity;

     private  String  color;

     @ElementCollection
     private List<String> images = new ArrayList<>();

     private  int numRating;

     @ManyToOne
     private  Category category;


     @ManyToOne
     private  Seller seller;


     private LocalDate createdTime;

     private  String size;


     @OneToMany(mappedBy = "product" ,cascade = CascadeType.ALL,orphanRemoval = true)
      private List<Review>  reviews = new ArrayList<>();








}
