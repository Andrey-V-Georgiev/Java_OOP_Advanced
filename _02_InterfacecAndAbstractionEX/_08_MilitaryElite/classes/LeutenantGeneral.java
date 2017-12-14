package _02_InterfacecAndAbstractionEX._08_MilitaryElite.classes;

import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.ILeutenantGeneral;
import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.IPrivate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LeutenantGeneral extends Private implements ILeutenantGeneral {
    private List<IPrivate> privates;

    public LeutenantGeneral(int id, String firstName, String lastName, double salary, List<IPrivate> privates) {
        super(id, firstName, lastName, salary);
        this.setPrivates(privates);
    }

    public List<IPrivate> getPrivates() {
        return this.privates.stream().sorted((a,b)-> Integer.compare(b.getId(), a.getId())).collect(Collectors.toList());
    }

    private void setPrivates(List<IPrivate> privates) {
        if(privates.size() == 0){
            this.privates = new ArrayList<>();
        } else {
            this.privates = new ArrayList<>(privates);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Privates:").append(System.lineSeparator());
        for (IPrivate currentPrivate : this.getPrivates()) {
            sb.append(String.format("  %s", currentPrivate.toString()));
        }
        return sb.toString();
    }
}
