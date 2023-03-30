package org.example.structural_patterns.decorator.pizza;

public abstract class ToppingDecorator implements Pizza{

    protected Pizza temporalPizza;

    public ToppingDecorator(Pizza temporalPizza) {
        this.temporalPizza = temporalPizza;
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription();
    }

    @Override
    public double getPrice() {
        return temporalPizza.getPrice();
    }

}
