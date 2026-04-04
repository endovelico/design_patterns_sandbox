package com.dp.sandobx.behavioral.intreperter;

public class Main {

    public static void main(String[] args) {

        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);

        Expression sum = new AddExpression(five, three);

        System.out.println(sum.interpret()); // Output: 8
    }
}
