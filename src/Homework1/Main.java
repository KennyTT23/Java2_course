package Homework1;

import Homework1.Cat;
import Homework1.Competition;
import Homework1.Human;

public class Main {

    public static void main(String[] args) {
        Competition competition = new Competition();
        for(int i = 0; i < 2; i++){

            competition.fullfilParticipantsList(new Cat());
            competition.fullfilParticipantsList(new Human());
            competition.fullfilParticipantsList(new Robot());

            competition.fullfilObstaclesList(new RunWay());
            competition.fullfilObstaclesList(new Wall());
        }

        competition.beginCompetition();
    }

}
