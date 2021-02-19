package Homework1;

import Homework1.Obstacle;

public class RunWay extends Obstacle {

    private int distance = 15;

    public RunWay(){

    }

    public RunWay(int distance){
        this.distance = distance;
    }

    public int getDistance(){
        return distance;
    }
}
