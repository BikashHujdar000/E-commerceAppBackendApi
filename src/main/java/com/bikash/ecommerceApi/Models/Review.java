package com.bikash.ecommerceApi.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false)
    private  String reviewText;


    @Column(nullable = false)
    private  double rating;



    @ElementCollection
private List<String> productImages ;


    @JsonIgnore
    @ManyToOne
    @Column(nullable = false)
    private  Product product;


    @ManyToOne
    @Column(nullable = false)
     private  User user;

    @Column(nullable = false)
    private LocalDate createdDate;



}
