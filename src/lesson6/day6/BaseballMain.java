package lesson6.day6;

import java.util.Scanner;

public class BaseballMain {
    public static void main(String[] args){
        BaseballMain bm = new BaseballMain();
        bm.Computer();
    }
    public void Computer(){
        Computer cm = new Computer();
        cm.setBalls(this.readyBalls());
        cm.startGame();
    }
    public BotBall[] readyBalls() {
        BotBall[] balls = new BotBall[10];
        int ballNum = 0;
        for(int i = 0; i < 10; i++){
            balls[i] = new BotBall(ballNum++);
        }
        return balls;
    }

}
