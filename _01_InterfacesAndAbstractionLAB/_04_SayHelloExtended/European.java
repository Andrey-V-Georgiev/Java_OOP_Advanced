package _01_InterfacesAndAbstractionLAB._04_SayHelloExtended;

public class European  extends BasePerson implements Person{

    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
