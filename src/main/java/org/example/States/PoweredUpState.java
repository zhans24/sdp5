package org.example.States;

public class PoweredUpState implements CharacterState {
    @Override
    public void attack() {
        System.out.println("Powerful attack with increased strength.");
    }
}
