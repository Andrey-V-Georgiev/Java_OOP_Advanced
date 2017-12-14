package _13_DependencyInversionLAB.src.p03_employee_info.implementations;

import _13_DependencyInversionLAB.src.p03_employee_info.interfaces.Formatter;

public class ConsoleFormatter implements Formatter{

    @Override
    public String format(Iterable<Employee> employees) {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
