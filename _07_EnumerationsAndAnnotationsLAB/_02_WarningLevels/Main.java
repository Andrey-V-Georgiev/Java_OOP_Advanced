package _07_EnumerationsAndAnnotationsLAB._02_WarningLevels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Importance importance = Enum.valueOf(Importance.class, bf.readLine());
        Logger logger = new Logger(importance);
        String[] input =  bf.readLine().split(": ");
        while(!"END".equals(input[0])){
            Message message = new Message(Enum.valueOf(Importance.class, input[0]),input[1]);
            logger.log(message);
            input =  bf.readLine().split(": ");
        }
        for(Message msg : logger.getMessages()){
            System.out.println(msg);
        }
    }
}
