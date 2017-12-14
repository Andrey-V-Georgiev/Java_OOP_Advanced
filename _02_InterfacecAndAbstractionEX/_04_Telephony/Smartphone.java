package _02_InterfacecAndAbstractionEX._04_Telephony;


public class Smartphone implements Browsing, Calling{
    public Smartphone() {
    }

    @Override
    public String browsing(String address) {
        if(!address.matches(".*\\d+.*")){
            return String.format("Browsing: %s!", address);
        } else {
            return "Invalid URL!";
        }
    }

    @Override
    public String calling(String number) {
        if(number.matches("\\d+")){
            return String.format("Calling... %s", number);
        } else{
            return "Invalid number!";
        }
    }
}
