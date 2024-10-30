/**
 * The EffectVisitor class implements the Visitor interface
 * for applying effects to a character
 */
public class EffectVisitor implements Visitor {

    /**
     * The applyBoost method applies a boost
     * by changing the character's state to PoweredUpState
     */
    @Override
    public void applyBoost(Character character) {
        System.out.println("Applying boost to the character.");
        character.setState(new PoweredUpState());
    }

    /**
     * The applyDamage method applies damage
     * by changing the character's state to DefeatedState
     */
    @Override
    public void applyDamage(Character character) {
        System.out.println("Applying damage to the character.");
        character.setState(new DefeatedState());
    }
}
