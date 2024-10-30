// The DefeatedState class represents the state of the defeated character
public class DefeatedState implements State {

    /**
     * // Attack method displays a message stating
     * that an attack cannot be made when the character is defeated
     */
    @Override
    public void attack(Character character) {
        System.out.println("Can't attack, character is defeated.");
    }
}
