package _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.classes;

import _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.intefaces.Unit;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList<Unit> {
    public void removeUnit(Unit unit){
        if(unit.isDead()){
           super.remove(unit);
        }
    }
}
