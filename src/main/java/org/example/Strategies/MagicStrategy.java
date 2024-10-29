package org.example.Strategies;

public class MagicStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Using magic combat.");
    }
}
