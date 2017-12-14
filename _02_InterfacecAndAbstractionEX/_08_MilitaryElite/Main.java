package _02_InterfacecAndAbstractionEX._08_MilitaryElite;

import _02_InterfacecAndAbstractionEX._08_MilitaryElite.classes.*;
import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static final String AIRFORCE = "Airforces";
    static final String MARINES = "Marines";
    static final String INPROGRESS = "inProgress";
    static final String FINISHED = "Finished";
    static Map<Integer, ISoldier> army = new LinkedHashMap<>();
    static Map<Integer, IPrivate> bankPrivates = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] tokens = bf.readLine().split(" ");
            if ("End".equals(tokens[0])) {
                printResults();
                return;
            }
            String command = tokens[0];
            int id = Integer.parseInt(tokens[1]);
            String firstName = tokens[2];
            String lastName = tokens[3];

            switch (command) {
                case "Private":
                    double salary = Double.parseDouble(tokens[4]);
                    IPrivate newPrivate = new Private(id, firstName, lastName, salary);
                    army.putIfAbsent(id, newPrivate);
                    bankPrivates.putIfAbsent(id, newPrivate);
                    break;

                case "LeutenantGeneral":
                    salary = Double.parseDouble(tokens[4]);
                    List<Integer> privatesIDs = Stream.of(tokens).skip(5).map(Integer::parseInt).collect(Collectors.toList());
                        List<IPrivate> privates = createPrivates(Stream.of(tokens).skip(5).map(Integer::parseInt).collect(Collectors.toList()));
                        ILeutenantGeneral newLeutenant = new LeutenantGeneral(id, firstName, lastName, salary, privates);
                        army.putIfAbsent(id, newLeutenant);
                    break;

                case "Engineer":
                    salary = Double.parseDouble(tokens[4]);
                    String corps = tokens[5];
                    List<String> repairArgs = Stream.of(tokens).skip(6).collect(Collectors.toList());
                        if (corps.equals(AIRFORCE) || corps.equals(MARINES)) {
                            List<IRepair> repairs = createRepairs(repairArgs);
                            IEngineer newEngineer = new Engineer(id, firstName, lastName, salary, corps, repairs);
                            army.putIfAbsent(id, newEngineer);
                        }
                    break;

                case "Commando":
                    salary = Double.parseDouble(tokens[4]);
                    corps = tokens[5];
                    List<String> missionsArgs = Stream.of(tokens).skip(6).collect(Collectors.toList());
                        if (corps.equals(AIRFORCE) || corps.equals(MARINES)) {
                            List<IMission> missions = createMissions(missionsArgs);
                            ICommando newCommando = new Commando(id, firstName, lastName, salary, corps, missions);
                            army.putIfAbsent(id, newCommando);
                        }
                    break;

                case "Spy":
                    String codeNumber = tokens[4];
                    ISpy newSpy = new Spy(id, firstName, lastName, codeNumber);
                    army.putIfAbsent(id, newSpy);
                    break;
            }
        }
    }

    private static void printResults() {
        for (ISoldier soldier : army.values()) {
            System.out.print(soldier.toString());
        }
    }

    private static List<IPrivate> createPrivates(List<Integer> privatesIDs) {
        List<IPrivate> privates = new ArrayList<>();
        for (Integer id : privatesIDs) {
            if (army.containsKey(id)) {
                privates.add(bankPrivates.get(id));
            }
        }
        return privates;
    }

    private static List<IRepair> createRepairs(List<String> repairArgs) {
        List<IRepair> repairs = new ArrayList<>();
        for (int i = 0; i < repairArgs.size(); i += 2) {
            IRepair newRepair = new Repair(repairArgs.get(i), Integer.parseInt(repairArgs.get(i + 1)));
            repairs.add(newRepair);
        }
        return repairs;
    }

    private static List<IMission> createMissions(List<String> missionsArgs) {
        List<IMission> missions = new ArrayList<>();
        for (int i = 0; i < missionsArgs.size(); i += 2) {
            String state = missionsArgs.get(i + 1);
            if (state.equals(INPROGRESS) || state.equals(FINISHED)) {
                IMission newMission = new Mission(missionsArgs.get(i), state);
                missions.add(newMission);
            }
        }
        return missions;
    }
}
