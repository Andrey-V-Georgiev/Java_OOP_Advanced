package _00_DESIGN_PATTERNS._01_COMMAND_PATTERN;

public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println(String.format(
                "\"Stock [Name: \"%s\", Quantity: \"%d\"] bought\"",this.name, this.quantity ));
    }

    public void sell(){
        System.out.println(String.format(
                "\"Stock [Name: \"%s\", Quantity: \"%d\"] sold\"", this.name, this.quantity) );
    }
}
