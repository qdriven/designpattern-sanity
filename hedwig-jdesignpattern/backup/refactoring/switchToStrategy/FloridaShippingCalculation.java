package io.hedwig.basic.refactoring.switchToStrategy;

/**
 * Created by patrick on 15/10/28.
 */
public class FloridaShippingCalculation
        implements IShippingCalculation {
    @Override
    public double calculate() {
        return 3;
    }
}
