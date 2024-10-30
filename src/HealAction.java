/**
 * The HealAction class represents the treatment action
 * and inherits the GameAction class
 */
public class HealAction extends GameAction {

    /**
     * The performAction method performs the treatment action
     * by displaying the corresponding message
     */
    @Override
    protected void performAction(Character character) {
        System.out.println("Healing the character.");
    }
}
