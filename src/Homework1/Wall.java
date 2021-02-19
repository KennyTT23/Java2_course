package Homework1;

import Homework1.Obstacle;

public class Wall extends Obstacle {

    private int wallHeight = 30;

    public Wall(){

    }

    public Wall(int height){
        this.wallHeight = height;
    }

    public int getWallHeight(){
        return wallHeight;
    }
}
