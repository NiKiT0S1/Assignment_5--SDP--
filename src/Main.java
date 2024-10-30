//  TEST
class Main {
    public static void main(String[] args) {
        Character character = new Character();

        // Test State pattern
        System.out.println("\nTesting State Pattern:");
        character.attack();
        character.setState(new PoweredUpState());
        character.attack();
        character.setState(new DefeatedState());
        character.attack();

        // Test Strategy pattern
        System.out.println("\nTesting Strategy Pattern:");
        character.setStrategy(new MeleeStrategy());
        character.performFight();
        character.setStrategy(new RangedStrategy());
        character.performFight();
        character.setStrategy(new MagicStrategy());
        character.performFight();

        // Test Template pattern
        System.out.println("\nTesting Template Pattern:");
        GameAction attack = new AttackAction();
        attack.executeAction(character);
        GameAction defend = new DefendAction();
        defend.executeAction(character);
        GameAction heal = new HealAction();
        heal.executeAction(character);

        // Test Visitor pattern
        System.out.println("\nTesting Visitor Pattern:");
        Visitor effectVisitor = new EffectVisitor();
        character.accept(effectVisitor);
    }
}