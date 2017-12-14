package _06_IteratorsAndComparatorsEX._01_ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    static ListyIterator newListy;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        while(!"END".equals(input)){
            String[] tokens = input.split(" ");
            switch (tokens[0]){
                case "Create":
                    String[] arr = Stream.of(tokens).skip(1).toArray(String[]::new);
                    newListy = new ListyIterator (arr);
                    break;
                case "Move":
                    System.out.println(newListy.Move());
                    break;
                case "HasNext":
                    System.out.println(newListy.HasNext());
                    break;
                case "Print":

                    try{
                        System.out.println(newListy.print());
                    }catch(Exception ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
            }
            input = bf.readLine();
        }
    }
}
