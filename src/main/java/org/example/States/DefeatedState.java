package org.example.States;

public class DefeatedState implements CharacterState {
    @Override
    public void attack() {
        System.out.println("Cannot attack, character is defeated.");
    }
}
