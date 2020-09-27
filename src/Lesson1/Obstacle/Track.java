package Lesson1.Obstacle;

import Lesson1.Participant.Participant;

public class Track implements Obstacle {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.run() > length) {
            System.out.println("участник " + participant + "успешно пробежал дистанцию/");
            return true;
        }
        else {
            System.out.println("участник " + participant + "не смог пробежать дистанцию - " + length);
            return false;
        }
    }
}
