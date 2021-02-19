package Homework1;

public class Competition {

    Movements[] participantsList = new Movements[50];
    Obstacle[] obstaclesList = new Obstacle[50];

    private int participantPosition = 0;
    private int obstaclePosition = 0;

    public void fullfilParticipantsList(Movements movements){
        if (this.participantPosition >= 50) {
            System.out.println("Participants number is reached.");
        }else{
            this.participantsList[this.participantPosition] = movements;
            this.participantPosition++;
        }
    }

    public void fullfilObstaclesList(Obstacle obstacle){
        if(this.obstaclePosition >= 50) {
            System.out.println("Obstacles number is full.");
        }else{
            this.obstaclesList[obstaclePosition] = obstacle;
            this.obstaclePosition++;
        }
    }

    public void beginCompetition(){
        for (Movements movements: participantsList){
            if(movements == null){
                System.out.println("Everyone, let's get started!");
                break;
            }
            for(Obstacle obstacle: obstaclesList){
                int ans;

                if(obstacle == null){
                    System.out.println("All obstacles were done.");
                    System.out.println();
                    break;
                }

                if(obstacle instanceof Wall){
                    ans = movements.jump(((Wall) obstacle).getWallHeight());
                }else{
                    ans = movements.run(((RunWay) obstacle).getDistance());
                }
                if(ans == 0){

                }
            }
        }
    }
}
