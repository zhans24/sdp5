package org.example.Actions;

import org.example.Character;

public abstract class GameAction {
    public final void executeAction(Character character) {
        prepare();
        action(character);
        conclude();
    }

    protected void prepare() {
        System.out.println("Preparing action...");
    }

    protected abstract void action(Character character);

    protected void conclude() {
        System.out.println("Action concluded.");
    }
}

