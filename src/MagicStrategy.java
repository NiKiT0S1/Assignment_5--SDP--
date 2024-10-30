// The MagicStrategy class implements a magic attack strategy
public class MagicStrategy implements Strategy {

    /**
     * The fight method outputs a message about a magic attack
     * and calls the attack method on the character
     */
    @Override
    public void fight(Character character) {
        System.out.println("Fighting with magic strategy.");
        character.attack();
    }
}
