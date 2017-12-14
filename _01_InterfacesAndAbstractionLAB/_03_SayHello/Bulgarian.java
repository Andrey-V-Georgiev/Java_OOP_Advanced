package _01_InterfacesAndAbstractionLAB._03_SayHello;

public class Bulgarian implements Person {

    private String name;

    Bulgarian(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }

    private void setName(String name) {
        this.name = name;
    }


}
