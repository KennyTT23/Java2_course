package Homework1;

public class Cat implements Movements {

    private int maxRunDistance = 1000;
    private int maxJumpHeight = 40;

    public Cat(){

    }

    public Cat(int maxRunDistance, int maxJumpHeight){
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public int run(int distance){
        if (maxRunDistance >= distance)  {
            System.out.println("The cat is strong enough.");
        } else{
            System.out.println("The cat can't run so long.");
        }
        return distance;
    }

    public int jump(int height){
        if (maxJumpHeight >= height){
            System.out.println("The cat is strong enough to jump so high.");
        } else{
            System.out.println("The cat can't jump so high.");
        }
        return height;
    }

    public int run(){
        int catRun = 1000;
        System.out.println("Homework1.Cat tries to run.");
        return catRun;
    }

    public int jump(){
        int catJump = 40;
        System.out.println("Homework1.Cat tries to jump.");
        return catJump;
    }
}
