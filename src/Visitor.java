// The user interface defines methods for applying effects to the character
public interface Visitor {
    void applyBoost(Character character);
    void applyDamage(Character character);
}
