// The MeleeStrategy class implements a melee strategy
public class MeleeStrategy implements Strategy {

    /**
     * The fight method displays a melee message
     * and calls the character's attack method
     */
    @Override
    public void fight(Character character) {
        System.out.println("Fighting with melee strategy.");
        character.attack();
    }
}
