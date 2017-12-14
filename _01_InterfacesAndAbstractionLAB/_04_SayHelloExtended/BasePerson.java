package _01_InterfacesAndAbstractionLAB._04_SayHelloExtended;

public abstract class BasePerson implements Person{

    private String name;

    protected BasePerson(String name) {
        this.setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }


    public abstract String sayHello();
}
