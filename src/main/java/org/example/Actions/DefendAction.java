package org.example.Actions;

import org.example.Character;

public class DefendAction extends GameAction {
    @Override
    protected void action(Character character) {
        System.out.println("Character is defending.");
    }
}
