package org.example;


import org.example.Actions.AttackAction;
import org.example.Actions.HealAction;
import org.example.States.DefeatedState;
import org.example.States.PoweredUpState;
import org.example.Strategies.RangedStrategy;
import org.example.Visitors.BoostEffectVisitor;

public class Main {
    public static void main(String[] args) {
        Character player=new Character(new PoweredUpState(),new RangedStrategy());
        player.executeAction(new AttackAction());
        player.accept(new BoostEffectVisitor());
        player.executeAction(new HealAction());
    }
}