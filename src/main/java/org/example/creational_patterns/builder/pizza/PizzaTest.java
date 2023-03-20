package org.example.creational_patterns.builder.pizza;

public class PizzaTest {

    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector(new SpicyPizzaBuilder());
        director.makePizza(Ingredients.HAM);

        Pizza pizza  = director.getPizza();
        System.out.println(pizza.toString());
    }

}
