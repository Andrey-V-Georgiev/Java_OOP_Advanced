package _12_LiskovAndOCP_EX._01_Logger.implementations;

import _12_LiskovAndOCP_EX._01_Logger.interfaces.Appender;
import _12_LiskovAndOCP_EX._01_Logger.interfaces.Layout;
import _12_LiskovAndOCP_EX._01_Logger.interfaces.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller implements Runnable {
    private static List<Appender> appenders = new ArrayList<>();
    private static Appender newAppender;

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            switch (tokens[0]) {
                case "ConsoleAppender":
                    Layout consoleAppenderLayout = createLayout(tokens[1]);
                    if (tokens.length == 3) {
                        Importance importance = Importance.valueOf(tokens[2]);
                        newAppender = new ConsoleAppender(consoleAppenderLayout, importance);
                    } else {
                        newAppender = new ConsoleAppender(consoleAppenderLayout);
                    }
                    break;
                case "FileAppender":
                    Layout fileAppenderLayout = createLayout(tokens[1]);
                    if (tokens.length == 3) {
                        Importance importance = Importance.valueOf(tokens[2]);
                        newAppender = new FileAppender(fileAppenderLayout, importance);
                    } else {
                        newAppender = new FileAppender(fileAppenderLayout);
                    }
                    break;
            }
            appenders.add(newAppender);
        }

        Logger logger = new MessageLogger(appenders);
        while (true) {
            String[] tokens = scanner.nextLine().split("\\|");
            switch (tokens[0]) {
                case "INFO":
                    logger.logInfo(tokens[1], tokens[2]);
                    break;
                case "WARNING":
                    logger.logWarning(tokens[1], tokens[2]);
                    break;
                case "ERROR":
                    logger.logError(tokens[1], tokens[2]);
                    break;
                case "CRITICAL":
                    logger.logCritical(tokens[1], tokens[2]);
                    break;
                case "FATAL":
                    logger.logFatal(tokens[1], tokens[2]);
                    break;
                case "END":
                    logger.printResults();
                    return;
            }
        }
    }

    private Layout createLayout(String layoutType) {
        Layout newLayout = null;
        switch (layoutType) {
            case "SimpleLayout":
                newLayout = new SimpleLayout();
                break;
            case "XmlLayout":
                newLayout = new XmlLayout();
                break;
        }
        return newLayout;
    }
}
