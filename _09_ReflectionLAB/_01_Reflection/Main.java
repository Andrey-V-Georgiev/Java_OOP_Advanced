package _09_ReflectionLAB._01_Reflection;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class ref = Reflection.class;
        System.out.println(ref);
        System.out.println(ref.getSuperclass());
        Class[] interfaces = ref.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
        Reflection reflection = (Reflection) ref.newInstance();
        System.out.println(reflection);

    }
}
