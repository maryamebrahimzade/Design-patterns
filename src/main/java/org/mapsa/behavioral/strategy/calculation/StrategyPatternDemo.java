package org.mapsa.behavioral.strategy.calculation;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        float num1 = 3f;
        float num2 = 2f;

        Context context = new Context(new Addition());
        System.out.println("Addition = " + context.executeStrategy(num1, num2));

        context = new Context(new Subtraction());
        System.out.println("Subtraction = " + context.executeStrategy(num1, num2));

        context = new Context(new Multiplication());
        System.out.println("Multiplication = " + context.executeStrategy(num1, num2));
    }
}
