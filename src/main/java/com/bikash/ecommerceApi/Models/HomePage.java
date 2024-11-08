package com.bikash.ecommerceApi.Models;

import lombok.Data;

import java.util.List;

@Data
public class HomePage {

    private List<HomeCategory> grid;
    private List<HomeCategory> shopByCategory;
    private List<HomeCategory> electricCategory;
    private List<HomeCategory> dealCategory;

    private List<Deal> deals ;


}
