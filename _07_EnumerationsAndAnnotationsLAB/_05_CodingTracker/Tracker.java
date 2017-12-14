package _07_EnumerationsAndAnnotationsLAB._05_CodingTracker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tracker {
    private static Map<String, List<String>> map = new HashMap<>();

    @Author(name = "Pesho")
    public static void main(String[] args) {
        Tracker.printMethodsByAuthor(Tracker.class);
    }

    @Author(name = "Pesho")
    public static void printMethodsByAuthor(Class<?> cl){
        Method[] arr = cl.getDeclaredMethods();
        for (Method method : arr) {
            Author annotation = method.getAnnotation(Author.class);
            if(annotation != null){
                String methodName = method.getName() + "()";
                String annotationValue = annotation.name();
                map.putIfAbsent(annotationValue, new ArrayList<>());
                map.get(annotationValue).add(methodName);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + String.join(", ", entry.getValue()));
        }
    }
}
