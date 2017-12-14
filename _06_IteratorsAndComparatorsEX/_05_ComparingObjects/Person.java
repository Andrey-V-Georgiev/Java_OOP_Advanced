package _06_IteratorsAndComparatorsEX._05_ComparingObjects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.setName(name);
        this.setAge(age);
        this.setTown(town);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getTown() {
        return this.town;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person person) {
        if(this.getName().equals(person.getName())){
            if(this.getAge() == person.getAge()){
                if(this.getTown().equals(person.getTown())){
                    return 0;
                } else if(this.getTown().compareTo(person.getTown()) > 0){
                    return 1;
                } else {
                    return -1;
                }
            } else if(this.getAge() > person.getAge()){
                return 1;
            }else {
                return -1;
            }
        } else if(this.getName().compareTo(person.getName()) > 0){
            return 1;
        } else {
            return -1;
        }
    }
}
