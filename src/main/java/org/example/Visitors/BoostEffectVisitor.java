package org.example.Visitors;

import org.example.Character;

public class BoostEffectVisitor implements EffectVisitor {
    @Override
    public void applyEffect(Character character) {
        System.out.println("Applying boost effect.");
    }
}
