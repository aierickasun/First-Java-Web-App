package com.sample;

import com.sample.model.FoodType;

import java.util.ArrayList;
import java.util.List;

public class FoodService {

    public List getAvailableFoods( FoodType foodType ) {

        List foods = new ArrayList();

        if ( foodType.equals( FoodType.PIZZA ) ) {
            foods.add( "Pizza Hut" );
            foods.add( "Dominos" );
        } else if ( foodType.equals( FoodType.BURGER ) ) {
            foods.add( "Burger King" );
            foods.add( "Gordon Ramsay's Restaurant somewhere" );
        } else if ( foodType.equals( FoodType.SUSHI ) ) {
            foods.add( "Blue Fish" );
            foods.add( "Jiro's Sushi" );
        } else {
            foods.add( "No foods available" );
        }

        return foods;
    }

}
