package _02_InterfacecAndAbstractionEX._03_Ferrari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        Car car = new Ferrari(name);
        System.out.println(car.toString());

    }
}