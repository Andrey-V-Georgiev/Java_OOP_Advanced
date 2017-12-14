package _02_InterfacecAndAbstractionEX._09_CollectionHierarchy;

import _02_InterfacecAndAbstractionEX._09_CollectionHierarchy.classes.AddCollection;
import _02_InterfacecAndAbstractionEX._09_CollectionHierarchy.classes.AddRemoveCollection;
import _02_InterfacecAndAbstractionEX._09_CollectionHierarchy.classes.MyList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<String> firstInputResults = new ArrayList<>();
    private static List<String> secondInputResults = new ArrayList<>();
    private static List<String> thirdInputResults = new ArrayList<>();
    private static List<String> secondRemoveResults = new ArrayList<>();
    private static List<String> thirdRemoveResults = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyList myList = new MyList();
        String[] addTokens = bf.readLine().split(" ");
        for (String token : addTokens) {
            firstInputResults.add(addCollection.add(token));
            secondInputResults.add(addRemoveCollection.add(token));
            thirdInputResults.add(myList.add(token));
        }
        int removeCount = Integer.parseInt(bf.readLine());
        for (int i = 0; i < removeCount; i++) {
            secondRemoveResults.add(addRemoveCollection.remove());
            thirdRemoveResults.add(myList.remove());
        }

        System.out.println(String.join(" ", firstInputResults));
        System.out.println(String.join(" ", secondInputResults));
        System.out.println(String.join(" ", thirdInputResults));
        System.out.println(String.join(" ", secondRemoveResults));
        System.out.println(String.join(" ", thirdRemoveResults));
    }
}
