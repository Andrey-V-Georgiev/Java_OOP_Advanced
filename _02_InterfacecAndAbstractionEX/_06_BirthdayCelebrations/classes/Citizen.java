package _02_InterfacecAndAbstractionEX._06_BirthdayCelebrations.classes;

import _02_InterfacecAndAbstractionEX._06_BirthdayCelebrations.interfaces.Birthday;
import _02_InterfacecAndAbstractionEX._06_BirthdayCelebrations.interfaces.Identifiable;

public class Citizen implements Birthday, Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthday;

    public Citizen(String name, int age, String id, String birthday) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthday(birthday);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
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
}
