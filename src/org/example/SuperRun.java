package org.example;

public interface SuperRun
{
    default boolean superRun(String name, int distance)
    {
        Human.superRunCount--;
        System.out.println(name + " использовал cупер-бег (осталось " + Human.superRunCount + ")");
        return true;
    }
}