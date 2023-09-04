package org.example;

import test.Calculate;
import test.Decorator;

public class Main {
    public static void main(String[] args) {

        /**
         * Вход в программу
         */
        int result = Calculate.plus(3,4);
        System.out.println(Decorator.decorate(result));

        result = Calculate.subtraction(3,4);
        System.out.println(Decorator.decorate(result));

        result = Calculate.multiplication(3,4);
        System.out.println(Decorator.decorate(result));

        result = Calculate.division(3,4);
        System.out.println(Decorator.decorate(result));
    }
}