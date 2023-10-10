package org.example;

public class Track implements Obstacle {
    Distance distance;

    public Track(Distance distance) {
        this.distance = distance;
    }

    public boolean PassObstacle(Participants participants) {
        if (participants.run(distance.getDistance())) {
            System.out.printf("%s пробежал дорожку длиной %d м \n", participants.getName(), distance.getDistance());
            return true;
        } else {
            System.out.printf("%s НЕ пробежал дорожку длиной %d м \n", participants.getName(), distance.getDistance());
            return false;
        }
    }
}
