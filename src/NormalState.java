// The NormalState class represents the character's normal state
public class NormalState implements State {

    /**
     * The attack method performs a normal attack
     * using the character's attack power
     */
    @Override
    public void attack(Character character) {
        System.out.println("Normal attack with strength " + character.getAttackStrength());
    }
}
