package org.example;

public class Human implements Participants, SuperRun {
    private String name;
    private int maxJumpHeight;
    private int maxRunDistance;
    public static int superRunCount = 2;

    public Human(String name, int maxJumpHeight, int maxRunDistance) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
    }

    public boolean jump(int height) {
        return maxJumpHeight >= height;
    }

    public boolean run(int distance) {
        if (superRunCount > 0 && maxRunDistance < distance) {
            return superRun(name, distance);
        }
        return maxRunDistance >= distance;
    }

    public String getName() {
        return name;
    }
}