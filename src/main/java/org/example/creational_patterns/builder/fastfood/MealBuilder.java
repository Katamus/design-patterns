package org.example.creational_patterns.builder.fastfood;

public interface MealBuilder {

    public void buildBurger();
    public void buildDrink();
    public void buildComplement();
    public void buildToy();
    public Meal getMeal();
}
