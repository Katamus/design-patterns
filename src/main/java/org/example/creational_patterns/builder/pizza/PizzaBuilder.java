package org.example.creational_patterns.builder.pizza;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }
    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public PizzaBuilder setSauce(Sauce sauce) {
        pizza.setSauce(sauce);
        return this;
    }

    public PizzaBuilder setDough(Dough dough) {
        pizza.setDough(dough);
        return this;
    }

    public abstract PizzaBuilder setTopping(Ingredients topping);
}
