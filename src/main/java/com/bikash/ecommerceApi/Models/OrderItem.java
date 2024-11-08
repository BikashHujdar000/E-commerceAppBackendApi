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
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JsonIgnore
  @ManyToOne
    private  Order order;

  @ManyToOne
  private  Product product;

  private  String size;

  private  int quantity;

  private  double mrpPrice;

  private  double sellingPrice;

  private Long userId;





}
