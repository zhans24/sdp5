package org.example.Strategies;

public class RangedStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Using ranged combat.");
    }
}
