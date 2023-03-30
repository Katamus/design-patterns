package org.example.structural_patterns.decorator.pizza;

public class PizzaMaker {

    public static void main(String[] args) {
        Pizza pizza = new Mozzarella(new TomatoSauce(new PlainPizza()));
        System.out.println("Ingredients: " + pizza.getDescription());
        System.out.println("Total Price: " + pizza.getPrice());
    }

}
