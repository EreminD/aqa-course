package ru.inno.course.collection.calculator;

import java.util.Collection;

public interface Calculator {

    /** Складывает числа a и b */
    public int sum(int a, int b);

    /** Вычитывает из a число b */
    public int sub(int a, int b);

    /** Умножает a на b */
    public int mul(int a, int b);

    /** Делит a на b */
    public double div(int a, int b);

    /** Находит среднее значение из переданной коллекции. Сумма всех чисел, разделенная на количество */
    public double avg(Collection<Integer> nums);

    /** Находит минимальное значение из переданной коллекции. */
    public int min(Collection<Integer> nums);

    /** Находит максимальное значение из переданной коллекции. */
    public int max(Collection<Integer> nums);

}
