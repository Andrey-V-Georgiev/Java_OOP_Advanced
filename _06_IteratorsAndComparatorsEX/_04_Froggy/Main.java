package _06_IteratorsAndComparatorsEX._04_Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ILake lake = new Lake(Stream.of(bf.readLine().split("[,\\s]+")).map(Integer::parseInt).collect(Collectors.toList()));
       if("END".equals(bf.readLine())){
           System.out.println(lake.resultString());
       }
    }
}
