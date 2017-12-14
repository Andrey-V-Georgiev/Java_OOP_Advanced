package _13_DependencyInversionLAB.src.p03_employee_info.interfaces;

import _13_DependencyInversionLAB.src.p03_employee_info.implementations.Employee;

import java.util.List;

public interface InfoProvider {
    List<Employee> getEmployeesByName();

    Iterable<Employee> getEmployeesBySalary();
}
