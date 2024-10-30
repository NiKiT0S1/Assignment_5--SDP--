/**
 * The GameAction abstract class
 * defines a template for performing various actions
 */
public abstract class GameAction {
    public void executeAction(Character character) {
        startAction();
        performAction(character);
        endAction();
    }

    // The StartAction method displays a message about the start of the action
    protected void startAction() {
        System.out.println("Starting action...");
    }

    // Abstract method performAction, implemented in concrete actions
    protected abstract void performAction(Character character);

    // The endAction method displays a message about the end of the action
    protected void endAction() {
        System.out.println("Ending action...");
    }
}