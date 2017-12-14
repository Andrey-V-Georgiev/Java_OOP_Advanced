package _14_DependencyInversionEX.src.engines;

import _14_DependencyInversionEX.src.contracts.CommandHandler;
import _14_DependencyInversionEX.src.contracts.InputReader;
import _14_DependencyInversionEX.src.contracts.OutputWriter;
import _14_DependencyInversionEX.src.contracts.Runnable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Engine implements Runnable{
    private InputReader reader;
    private OutputWriter writer;
    private CommandHandler commandHandler;

    public Engine(InputReader reader, OutputWriter writer, CommandHandler commandHandler)
    {
        this.reader = reader;
        this.writer = writer;
        this.commandHandler = commandHandler;
    }

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            String line = scanner.nextLine();
            String name = "";
            List<String> parameters = new ArrayList<>();

            if (line.equals("End")) {
                break;
            }

            List<String> tokens = Arrays.asList(line.split("\\\\"));
            name = tokens.get(0);
            parameters = tokens.stream().skip(1).collect(Collectors.toList());

            try
            {
                String commandResult = this.commandHandler.executeCommand(name, parameters);
                System.out.println(commandResult);
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }

            line = scanner.nextLine();
        }
    }
}
