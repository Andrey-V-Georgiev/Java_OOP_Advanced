package _02_InterfacecAndAbstractionEX._04_Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Smartphone smartPhone = new Smartphone();
        String[] numbers = bf.readLine().split(" ");
        String[] addresses = bf.readLine().split(" ");
        for (String number : numbers) {
            System.out.println(smartPhone.calling(number));
        }
        for (String address : addresses) {
            System.out.println(smartPhone.browsing(address));
        }
    }
}
