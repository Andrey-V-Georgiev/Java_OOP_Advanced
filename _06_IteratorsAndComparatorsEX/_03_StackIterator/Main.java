package _06_IteratorsAndComparatorsEX._03_StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new StackImpl();

        while(true){
            String[] tokens = bf.readLine().split("[,\\s]+");
            switch (tokens[0]){
                case "Push":
                    stack.push(Stream.of(tokens).skip(1).map(Integer::parseInt).collect(Collectors.toList()));
                    break;
                case "Pop":
                    stack.pop();
                    break;
                case "END":
                    System.out.println(stack.print());
                    return;
            }
        }
    }
}
