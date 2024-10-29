package org.example.Strategies;

public class MeleeStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Using melee combat.");
    }
}
