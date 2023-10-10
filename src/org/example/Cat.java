package org.example;

public class Cat implements Participants {
    private String name;
    private int maxJumpHeight;
    private int maxRunDistance;

    public Cat(String name, int maxJumpHeight, int maxRunDistance) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
    }

    public boolean jump(int height)
    {
        return maxJumpHeight >= height;
    }

    public boolean run(int distance) {
        return maxRunDistance >= distance;
    }

    public String getName() {
        return name;
    }
}
