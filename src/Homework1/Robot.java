package Homework1;

import Homework1.Movements;

public class Robot implements Movements {

    private int maxRunDistance = 4000;
    private int maxJumpHeight = 70;

    public Robot(){

    }

    public Robot(int maxRunDistance, int maxJumpHeight){
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public int run(int runDistance) {
        if (maxRunDistance >= runDistance) {
            System.out.println("The robot is strong enough.");
        } else {
            System.out.println("The robot can't run so long.");
        }
        return runDistance;
    }

    public int jump(int height){
        if (this.maxJumpHeight >= height){
            System.out.println("The robot is strong enough to jump so high.");

        }else  {
            System.out.println("The robot can't jump so high.");
        }
        return height;
    }

    public int run(){
        int robotRun = 4000;
        System.out.println("Homework1.Robot tries to run.");
        return robotRun;
    }

    public int jump(){
        int robotJump = 70;
        System.out.println("Homework1.Robot tries to jump.");
        return robotJump;
    }
}
