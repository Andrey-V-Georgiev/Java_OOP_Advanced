package _04_GenericsEX._07_CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Box box = new Box();

        while(true){
           String[] tokens = bf.readLine().split(" ");
            switch(tokens[0]){
                case "Add":
                    box.add(tokens[1]);
                    break;
                case "Remove":
                    box.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(box.contains(tokens[1]));
                    break;
                case "Swap":
                    box.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(box.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(box.getMax().toString()
                            .replace("Optional[","").replace("]",""));
                    break;
                case "Min":
                    System.out.println(box.getMin().toString()
                            .replace("Optional[","").replace("]",""));
                    break;
                case "Print":
                    box.print();
                    break;
                case "END":
                    return;

            }
        }
    }
}
