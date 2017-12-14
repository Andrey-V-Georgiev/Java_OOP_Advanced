package _02_InterfacecAndAbstractionEX._06_BirthdayCelebrations.classes;

import _02_InterfacecAndAbstractionEX._06_BirthdayCelebrations.interfaces.Birthday;

public class Pet implements Birthday {
    private String name;
    private String birthday;

    public Pet(String name, String birthday) {
        this.setName(name);
        this.setBirthday(birthday);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    private void setBirthday(String birthday) {
        this.birthday = birthday;
    }

}
