package Lesson1.Obstacle;

import Lesson1.Participant.Participant;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.jump() > height) {
            System.out.println("участник" + participant + "успешно преодолел стену");
            return true;
        } else {
            System.out.println("участник" + participant + "не смог преодолеть стену" + height);
            return false;
        }
    }
}
