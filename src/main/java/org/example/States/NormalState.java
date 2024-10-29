package org.example.States;

public class NormalState implements CharacterState {
    @Override
    public void attack() {
        System.out.println("Normal attack power.");
    }
}
