package ru.inno.course.collection.calculator;

import java.util.Collection;

public interface Calculator {

    public int sum(int a, int b);
    public int sub(int a, int b);
    public int mul(int a, int b);
    public double div(int a, int b);
    public double avg(Collection<Integer> nums);
    public int min(Collection<Integer> nums);
    public int max(Collection<Integer> nums);

}
