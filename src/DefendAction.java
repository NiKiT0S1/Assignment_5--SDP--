/**
 * The DefendAction class represents a protection action
 * and inherits the GameAction class
 */
public class DefendAction extends  GameAction {

    /**
     * The performAction method performs a protection action
     * using the character's protection value
     */
    @Override
    protected void performAction(Character character) {
        System.out.println("Defending with defense " + character.getDefense());
    }
}
