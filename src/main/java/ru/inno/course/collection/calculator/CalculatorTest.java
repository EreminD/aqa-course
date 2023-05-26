package ru.inno.course.collection.calculator;

import java.util.ArrayList;
import java.util.Collection;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = null; // здесь ваша имплементация

        System.out.println(calc.sum(10, 5) == 15);
        System.out.println(calc.sub(10, 3) == 7);
        System.out.println(calc.mul(10, 4) == 40);
        System.out.println(calc.div(10, 4) == 2.5);

        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        System.out.println(calc.avg(numbers) == 3.0);
        System.out.println(calc.max(numbers) == 5);
        System.out.println(calc.min(numbers) == 1);
    }
}
