package Homework1;

public class Human implements Movements {

    private int maxRunDistance = 500;
    private int maxJumpDistance = 20;

    public Human(){

    }

    public Human(int maxRunDistance, int maxJumpDistance){
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;

    }

    public int run(int distance){
        if (this.maxRunDistance >= distance){
            System.out.println("The human is strong enough.");
        }else{
            System.out.println("The human can't run so long.");
        }
        return distance;
    }

    public int jump(int height){
        if (maxJumpDistance >= height) {
            System.out.println("The human is strong enough to jump so high.");
        } else{
            System.out.println("The human can't jump so high.");
        }
        return height;
    }



    public int run(){
        int humanRun = 500;
        System.out.println("Homework1.Human tries to run.");
        return humanRun;
    }

    public int jump(){
        int humanJump = 20;
        System.out.println("Homework1.Human tries to jump.");
        return humanJump;
    }
}
