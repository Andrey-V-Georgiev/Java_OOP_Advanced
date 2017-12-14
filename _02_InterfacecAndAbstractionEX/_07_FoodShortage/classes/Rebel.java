package _02_InterfacecAndAbstractionEX._07_FoodShortage.classes;

import _02_InterfacecAndAbstractionEX._07_FoodShortage.interfaces.Buyer;

public class Rebel implements Buyer{
    private int age;
    private String group;
    private int food;

    public Rebel(int age, String group) {
        this.setAge(age);
        this.setGroup(group);
        this.food = 0;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return this.group;
    }

    private void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void buyFood() {
        this.food += 5;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
