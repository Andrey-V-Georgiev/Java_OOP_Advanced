package _16_ObjectCommunicationEX._04_WorkForce;

import _16_ObjectCommunicationEX._04_WorkForce.eployees.PartTimeEmployee;
import _16_ObjectCommunicationEX._04_WorkForce.eployees.StandartEmployee;
import _16_ObjectCommunicationEX._04_WorkForce.interfaces.Employee;
import _16_ObjectCommunicationEX._04_WorkForce.interfaces.Job;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        CustomArrayList jobs = new CustomArrayList();
        Map<String, Employee> employees = new HashMap<>();

        while(true){
            String[] tokens = bf.readLine().split(" ");
            if("End".equalsIgnoreCase(tokens[0])){
                return;
            }
            switch(tokens[0]){
                case "Job":
                    Job newJob = new JobImpl(tokens[1], Integer.parseInt(tokens[2]), employees.get(tokens[3]));
                    jobs.add(newJob);
                    break;
                case "StandartEmployee":
                    Employee newStandartEmployee = new StandartEmployee(tokens[1]);
                    employees.put(tokens[1], newStandartEmployee);
                    break;
                case "PartTimeEmployee":
                    Employee newPartTimeEmployee = new PartTimeEmployee(tokens[1]);
                    employees.put(tokens[1], newPartTimeEmployee);
                    break;
                case "Pass":
                    jobs.pass();
                    break;
                case "Status":
                    jobs.status();
                    break;
            }
        }
    }
}
