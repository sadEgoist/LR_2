package org;
import main.java.org.example.*;

public class Main {
    public static void main(String[] args) {
        Participants[] participants = {
                new Human("Миша", 16, 125),
                new Cat("Мурзик", 4, 85),
                new Robot("R2-D2", 7, 60),
                new Human("Юра", 11, 145),
                new Human("Коля", 14, 115),
        };

        Obstacle[] obstacles = {
                new Wall(Height.LOW),
                new Track(Distance.SHORT),
                new Wall(Height.MEDIUM),
                new Track(Distance.MEDIUM),
                new Wall(Height.HIGH),
                new Track(Distance.LONG)
        };

        for (Participants participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.PassObstacle(participant)) {
                    break;
                }
            }
            System.out.println("==========================================");
        }
    }
}