package _02_InterfacecAndAbstractionEX._02_MultipleImplementation.classes;

import _02_InterfacecAndAbstractionEX._02_MultipleImplementation.interfaces.Birthable;
import _02_InterfacecAndAbstractionEX._02_MultipleImplementation.interfaces.Identifiable;
import _02_InterfacecAndAbstractionEX._02_MultipleImplementation.interfaces.Person;

public class Citizen implements Person , Birthable, Identifiable{
    private String name;
    private int age;
    private String id;
    private String birthDate;


    public Citizen(String name, int age, String id, String birthDate){
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthDate(birthDate);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthdate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
