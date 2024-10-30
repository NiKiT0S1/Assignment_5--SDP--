// The PoweredUpState class represents the enhanced state of a character
public class PoweredUpState implements State {

    /**
     * The attack method performs an enhanced attack,
     * doubling the character's attack power
     */
    @Override
    public void attack(Character character) {
        System.out.println("Powered Up attack with strength " + (character.getAttackStrength() * 2));
    }
}
