package _02_InterfacecAndAbstractionEX._07_FoodShortage.classes;


import _02_InterfacecAndAbstractionEX._07_FoodShortage.interfaces.Birthday;
import _02_InterfacecAndAbstractionEX._07_FoodShortage.interfaces.Buyer;
import _02_InterfacecAndAbstractionEX._07_FoodShortage.interfaces.Identifiable;

public class Citizen implements Birthday, Identifiable, Buyer {
    private int age;
    private String id;
    private String birthday;
    private int food;

    public Citizen(int age, String id, String birthday) {
        this.setAge(age);
        this.setId(id);
        this.setBirthday(birthday);
        this.food = 0;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getId() {
        return this.id;
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    private void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
