package org.example;

public enum Distance {
    SHORT(50), MEDIUM(100), LONG(150);

    private int distance;

    Distance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
