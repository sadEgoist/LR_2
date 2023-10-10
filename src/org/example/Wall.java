package org.example;

public class Wall implements Obstacle {
    Height height;

    public Wall(Height height) {
        this.height = height;
    }

    public boolean PassObstacle(Participants participants) {
        if (participants.jump(height.getHeight())) {
            System.out.printf("%s перепрыгнул стену высотой %d м \n", participants.getName(), height.getHeight());
            return true;
        } else {
            System.out.printf("%s не перепрыгнул стену высотой %d м \n", participants.getName(), height.getHeight());
            return false;
        }
    }
}
