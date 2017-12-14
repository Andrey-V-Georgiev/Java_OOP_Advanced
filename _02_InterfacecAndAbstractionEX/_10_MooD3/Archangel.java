package _02_InterfacecAndAbstractionEX._10_MooD3;

public class Archangel extends GameObjects{


    public Archangel(String userName, String characterType, double specialPoints, int level) {
        super(userName, characterType, specialPoints, level);
        StringBuilder sb = new StringBuilder(userName);
        super.setHashedPassword((sb.reverse().toString()) + (getUsername().length() * 21));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\"%s\" | \"%s\" -> %s%n",
                super.getUsername(), super.getHashedPassword(), super.getCharacterType()));
        sb.append(String.format("%.0f",(super.getSpecialPoints() * super.getLevel())));
        return sb.toString();
    }
}
