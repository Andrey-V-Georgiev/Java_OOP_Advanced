package _13_DependencyInversionLAB.src.p04_recharge.implementations;



public abstract class Worker{

    private String id;
    private int workingHours;

    public Worker(String id) {
        this.id = id;
    }

    public void work(int hours) {
        this.workingHours += hours;
    }
}
