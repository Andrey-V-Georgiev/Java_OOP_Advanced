import core.impl.ManagerControllerImpl;
import core.interfaces.ManagerController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
    private static ManagerController mController = new ManagerControllerImpl();

    public static void main(String[] args) throws IOException {
        String input = bReader.readLine();
        while (!"Exit".equals(input)) {
            List<String> currentRow = commandSplitter(input);
            commandExe(currentRow);
            input = bReader.readLine();
        }

    }

    private static void commandExe(List<String> currentRow) {
        switch (currentRow.get(0)) {
            case "AddPlayer":
                mController.addPlayer(currentRow.get(1), currentRow.get(2));
                break;
            case "AddCard":
                mController.addCard(currentRow.get(1), currentRow.get(2));
                break;
            case "AddPlayerCard":
                mController.addPlayerCard(currentRow.get(1), currentRow.get(2));
                break;
            case "Fight":
                mController.fight(currentRow.get(1), currentRow.get(2));
                break;
            case "Report":
                mController.report();
                break;
        }
    }

    private static List<String> commandSplitter(String input) {
        return new ArrayList<>(Arrays.asList(input.split("\\s")));
    }
}
