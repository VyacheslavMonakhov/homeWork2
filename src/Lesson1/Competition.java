package Lesson1;

import Lesson1.Obstacle.Obstacle;
import Lesson1.Participant.Participant;

import java.util.LinkedList;
import java.util.List;

public class Competition {

    private Obstacle[] obstacles;
    private Participant[] participants;

    private List<Participant> lastWinners = new LinkedList<>();

    public void setObstacles(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant... participants) {
        this.participants = participants;
    }

    public void startCompetition() {
        lastWinners.clear();

        for (Participant participant : participants) {
            boolean success = passAllObstacle(participant);
            if (!success) {
                System.out.println("Участник " + participant + " выбыл с соревнований.");
            } else {
                lastWinners.add(participant);
            }

        }
    }

    public List<Participant> getLastWinners() {
        return lastWinners;
    }

    private boolean passAllObstacle(Participant participant) {
        for (Obstacle obstacle : obstacles) {
            if (!obstacle.passObstacleBy(participant)) {
                return false;
            }
            System.out.println();
        }
        return true;
    }
}
