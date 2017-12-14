package _04_GenericsEX._11_Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] firstL = bf.readLine().split(" ");
        Threeuple<?, ?, ?> firstT = new  Threeuple<>(String.format("%s %s",firstL[0], firstL[1]), firstL[2], firstL[3]);
        System.out.println(firstT.toString());

        String[] secondL = bf.readLine().split(" ");
        Threeuple<?, ?, ?> secondT = new  Threeuple<>(secondL[0], Integer.parseInt(secondL[1]),
                secondL[2].equalsIgnoreCase("drunk")? true : false);
        System.out.println(secondT.toString());

        String[] thirdL = bf.readLine().split(" ");
        Threeuple<?, ?, ?> thirdT = new  Threeuple<>(thirdL[0], Double.parseDouble(thirdL[1]), thirdL[2]);
        System.out.println(thirdT.toString());
    }
}
