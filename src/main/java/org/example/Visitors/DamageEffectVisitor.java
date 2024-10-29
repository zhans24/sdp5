package org.example.Visitors;

import org.example.Character;

public class DamageEffectVisitor implements EffectVisitor {
    @Override
    public void applyEffect(Character character) {
        System.out.println("Applying damage effect.");
    }
}
