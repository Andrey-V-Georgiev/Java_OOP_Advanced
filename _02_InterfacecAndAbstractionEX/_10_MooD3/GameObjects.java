package _02_InterfacecAndAbstractionEX._10_MooD3;

public abstract class GameObjects implements GameObjectsInterface{
    private String userName;
    private String characterType;
    private String hashedPassword;
    private double specialPoints;
    private int level;

    public GameObjects(String userName, String characterType, double specialPoints, int level) {
            this.setUserName(userName);
            this.setCharacterType(characterType);
            this.setSpecialPoints(specialPoints);
            this.setHashedPassword(userName);
            this.setLevel(level);
    }

    public String getUsername() {
        return this.userName;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getCharacterType() {
        return this.characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    @Override
    public String getHashedPassword() {
        return this.hashedPassword;
    }

    protected void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    @Override
    public double getSpecialPoints() {
        return this.specialPoints;
    }

    private void setSpecialPoints(double specialPoints) {
        this.specialPoints = specialPoints;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    private void setLevel(int level) {
        this.level = level;
    }
}
