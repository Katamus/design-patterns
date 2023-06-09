package org.example.creational_patterns.builder.fastfood;

public class ChildrensMealBuilder implements MealBuilder{

    private Meal meal;

    public ChildrensMealBuilder(){
        this.meal = new Meal();
    }

    @Override
    public void buildBurger() {
        meal.setBurger("Cheese Burger");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Orange Juice");
    }

    @Override
    public void buildComplement() {
        meal.setComplement("Cheese Fingers");
    }

    @Override
    public void buildToy() {
        meal.setToy("Spongebob Action Figure");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
