package com.bikash.ecommerceApi.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class WishList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @OneToOne
    private  User user ;


    @ManyToMany()
    private Set<Product> products  = new HashSet<>();

}
