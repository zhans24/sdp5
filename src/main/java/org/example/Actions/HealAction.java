package org.example.Actions;

import org.example.Character;

public class HealAction extends GameAction {
    @Override
    protected void action(Character character) {
        System.out.println("Character is healing.");
    }
}
