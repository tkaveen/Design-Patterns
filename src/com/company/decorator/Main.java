package com.company.decorator;

public class Main {

    public static void main(String[] args){

        Pizza pizza = new ThinCrustPizza();
        Pizza bbqChickenPizza = new BBQChicken(pizza);
        Pizza bbqChickenWithExtraCheese = new ExtraCheese(bbqChickenPizza);
        System.out.println( " Cost : " + bbqChickenWithExtraCheese.getCost());

        Pizza panPizza = new PanPizza();
        Pizza thandooriChickenPizza = new ThandooriChicken(panPizza);
        System.out.println( " Cost : " + thandooriChickenPizza.getCost());


    }
}
