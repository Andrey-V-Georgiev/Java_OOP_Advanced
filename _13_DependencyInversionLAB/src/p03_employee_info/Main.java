package _13_DependencyInversionLAB.src.p03_employee_info;

import _13_DependencyInversionLAB.src.p03_employee_info.implementations.ConsoleFormatter;
import _13_DependencyInversionLAB.src.p03_employee_info.implementations.EmployeeDatabase;
import _13_DependencyInversionLAB.src.p03_employee_info.implementations.EmployeeInfoProvider;
import _13_DependencyInversionLAB.src.p03_employee_info.interfaces.Database;
import _13_DependencyInversionLAB.src.p03_employee_info.interfaces.Formatter;
import _13_DependencyInversionLAB.src.p03_employee_info.interfaces.InfoProvider;

public class Main {

    public static void main(String[] args) {
        Database db = new EmployeeDatabase();
        InfoProvider employeeInfo = new EmployeeInfoProvider(db);
        Formatter formatter = new ConsoleFormatter();

        String output = formatter.format(employeeInfo.getEmployeesByName());
        System.out.println(output);
    }
}
