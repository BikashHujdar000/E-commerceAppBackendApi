package com.bikash.ecommerceApi.Models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String name;

    @NotNull
    @Column(unique = true)
     private  String categoryId;


    @ManyToOne
    private  Category parentCategory;


    private  String level;

}
