package _15_ObjectCommunicationLAB.heroes;


import _15_ObjectCommunicationLAB.abstractClasses.AbstractHero;
import _15_ObjectCommunicationLAB.enumerations.LogType;
import _15_ObjectCommunicationLAB.interfaces.Handler;
import _15_ObjectCommunicationLAB.interfaces.Target;

public class Warrior extends AbstractHero {

    private static final String ATTACK_MESSAGE = "%s damages %s for %s";

    public Warrior(String id, int dmg, Handler handler) {
        super(id, dmg, handler);
    }

    @Override
    protected void executeClassSpecificAttack(Target target, int dmg) {
        super.getHandler().handle(LogType.ATTACK, String.format(ATTACK_MESSAGE, this, target, dmg));
        target.receiveDamage(dmg);
    }

    @Override
    public void update(int reward) {
        super.getHandler().handle(LogType.EVENT, super.getId() + "earns " + reward);
    }
}
