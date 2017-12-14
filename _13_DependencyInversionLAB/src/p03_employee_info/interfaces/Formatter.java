package _13_DependencyInversionLAB.src.p03_employee_info.interfaces;

import _13_DependencyInversionLAB.src.p03_employee_info.implementations.Employee;

public interface Formatter {
    String format(Iterable<Employee> employees);
}
