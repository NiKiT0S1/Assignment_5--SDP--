// The RangedStrategy class implements a ranged strategy
public class RangedStrategy implements Strategy {

    /**
     * The fight method displays a message about ranged combat
     * and calls the character's attack method
     */
    @Override
    public void fight(Character character) {
        System.out.println("Fighting with ranged strategy.");
        character.attack();
    }
}
