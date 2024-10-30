/**
 * The AttackAction class represents an attack action
 * and inherits the abstract GameAction class
 */
public class AttackAction extends GameAction {

    // The performAction method causes the character to perform an attack
    @Override
    protected void performAction(Character character) {
        character.performFight();
    }
}