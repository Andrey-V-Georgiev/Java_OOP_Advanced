package _02_InterfacecAndAbstractionEX._10_MooD3;

public class Demon  extends GameObjects  {


    public Demon(String userName, String characterType, double specialPoints, int level) {
        super(userName, characterType, specialPoints, level);
        super.setHashedPassword(String.format("%s", (userName.length() * 217)));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\"%s\" | \"%s\" -> %s%n",
                super.getUsername(), super.getHashedPassword(), super.getCharacterType()));
        sb.append(super.getSpecialPoints() * super.getLevel());
        return sb.toString();
    }
}
