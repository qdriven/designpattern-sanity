package io.hedwig.basic.refactoring.replaceConditionWithPolymorphism;

/**
 * Created by patrick on 15/11/4.
 */
public class NonEmployee extends Customer {
    @Override
    double tax() {
        return 0.10;
    }
}
