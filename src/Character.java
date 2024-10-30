public class Character {

    /**
     * A field of the character status,
     * combat strategies, attack forces and defense
     */
    private State state;
    private Strategy strategy;
    private int attackStrength;
    private int defense;

    /**
     * The constructor initializes a character with normal state,
     * melee attack strategy,
     * attack power 10, and defense 5
     */
    public Character() {
        this.state = new NormalState();
        this.strategy = new MeleeStrategy();
        this.attackStrength = 10;
        this.defense = 5;
    }

    // Method for setting a new character state
    public void setState(State state) {
        this.state = state;
    }

    // Method for setting a new character strategy
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Method for executing the current attack strategy
    public void performFight() {
        strategy.fight(this);
    }

    // Method for a character's attack that depends on the current state
    public void attack() {
        state.attack(this);
    }

    // Method for a character's attack that depends on the current state
    public int getAttackStrength() {
        return attackStrength;
    }

    // Method for getting character protection
    public int getDefense() {
        return defense;
    }

    // Method for getting character protection
    public void accept(Visitor visitor) {
        visitor.applyBoost(this);
        visitor.applyDamage(this);
    }
}