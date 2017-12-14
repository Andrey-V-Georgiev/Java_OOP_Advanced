package _16_ObjectCommunicationEX._04_WorkForce;

import _16_ObjectCommunicationEX._04_WorkForce.interfaces.Job;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList<Job> {
    private int counter = 0;

    public void pass(){
        super.forEach(x->{
            x.update();
            if(x.getJobHours() <= 0){
                System.out.println(x.checkJobHours());
            }
        });

        super.removeIf(x->x.getJobHours() <= 0);
    }

    public void status(){
        super.forEach(x-> System.out.println(String.format("Job: %s Hours Remaining: %d",x.getName(), x.getJobHours())));
    }
}
