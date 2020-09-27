package Lesson1;

import Lesson1.Obstacle.Track;
import Lesson1.Obstacle.Wall;
import Lesson1.Participant.Participant;
import Lesson1.Participant.Cat;
import Lesson1.Participant.Human;
import Lesson1.Participant.Robot;

import java.util.Random;

public class StartCompetition {
    public static void main(String[] args) {
        Competition competition = createAndPrepareCompetition();

        System.out.println("Начинаем соревнования!");
        competition.startCompetition();

        System.out.println("Соревнование окончено. Победители: ");
        for (Participant winner : competition.getLastWinners()) {
            System.out.println(winner);
        }
    }

    private static Competition createAndPrepareCompetition() {
        Participant human = new Human ("Иван", 140, 800);
        Participant cat = new Cat("Киса", 140, 800);
        Participant robot = new Robot("Боб", 140, 800);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(180));
        Track track = new Track(random.nextInt(1600));

        Competition competition = new Competition();
        competition.setParticipants(human, cat, robot);
        competition.setObstacles(wall, track);
        return competition;
    }
}
