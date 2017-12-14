package _01_InterfacesAndAbstractionLAB._03_SayHello;

public class European implements Person {
    private String name;

    European(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }

    private void setName(String name) {
        this.name = name;
    }


}
