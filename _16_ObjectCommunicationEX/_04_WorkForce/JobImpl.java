package _16_ObjectCommunicationEX._04_WorkForce;

import _16_ObjectCommunicationEX._04_WorkForce.interfaces.Employee;
import _16_ObjectCommunicationEX._04_WorkForce.interfaces.Job;

public class JobImpl implements Job {
    private String name;
    private int jobHours;
    private Employee employee;

    public JobImpl(String name, int jobHours, Employee employee) {
        this.name = name;
        this.jobHours = jobHours;
        this.employee = employee;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getJobHours() {
        return this.jobHours;
    }

    @Override
    public String checkJobHours() {
        return String.format("Job %s done!", this.name);
    }

    @Override
    public void update() {
        this.jobHours -= employee.getWeekHours();
    }

}
