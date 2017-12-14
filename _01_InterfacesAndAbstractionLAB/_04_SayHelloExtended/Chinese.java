package _01_InterfacesAndAbstractionLAB._04_SayHelloExtended;

public class Chinese extends BasePerson implements Person{

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
