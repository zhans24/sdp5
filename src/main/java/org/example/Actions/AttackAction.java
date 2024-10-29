package org.example.Actions;

import org.example.Character;

public class AttackAction extends GameAction {
    @Override
    protected void action(Character character) {
        System.out.println("Character is attacking.");
        character.performAttack();
    }
}
