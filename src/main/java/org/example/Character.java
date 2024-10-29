package org.example;

import org.example.Actions.GameAction;
import org.example.States.CharacterState;
import org.example.Strategies.FightingStrategy;
import org.example.Visitors.EffectVisitor;

public class Character {
    private CharacterState state;
    private FightingStrategy strategy;

    public Character(CharacterState state, FightingStrategy strategy) {
        this.state = state;
        this.strategy = strategy;
    }

    public void setState(CharacterState newState) {
        this.state = newState;
    }

    public void setStrategy(FightingStrategy newStrategy) {
        this.strategy = newStrategy;
    }

    public void performAttack() {
        state.attack();
        strategy.fight();
    }

    public void executeAction(GameAction action) {
        action.executeAction(this);
    }

    public void accept(EffectVisitor visitor) {
        visitor.applyEffect(this);
    }
}
