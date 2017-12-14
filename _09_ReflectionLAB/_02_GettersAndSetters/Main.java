package _09_ReflectionLAB._02_GettersAndSetters;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(Reflection.class.getDeclaredMethods())
        .filter(method->method.getName().startsWith("get"))
        .sorted(Comparator.comparing(Method::getName))
        .forEach(m-> System.out.println(String.format(
                "%s will return %s",m.getName(), m.getReturnType())));

        Arrays.stream(Reflection.class.getDeclaredMethods())
                .filter(method->method.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m-> System.out.println(String.format(
                        "%s and will set field of %s",m.getName(), m.getParameterTypes()[0])));

    }
}
