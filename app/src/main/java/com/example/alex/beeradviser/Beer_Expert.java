package com.example.alex.beeradviser;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Alex on 30-01-2018.
 */

public class Beer_Expert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
        if (color.equals("Amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}