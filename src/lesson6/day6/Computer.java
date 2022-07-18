package lesson6.day6;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private BotBall[] balls;
    private PlayerBall[] Pballs;

    public Computer() {
    }

    public void setBalls(BotBall[] balls) {
        this.balls = balls;
    }
    public void setPballs(PlayerBall[] Pballs){
        this.Pballs = Pballs;
    }

    public void startGame() {
        this.selectBalls();
        this.playerSelectBalls();
    }

    public void selectBalls() {
        // 선택된 4개의 볼을 출력
        BotBall[] selectedBalls = new BotBall[4];
        for (int i = 0; i < 4; i++) {
            selectedBalls[i] = this.getBall();
        }
        for (int i = 0; i < selectedBalls.length; i++) {
            //System.out.print(selectedBalls[i].getNumber()+" ");
            System.out.print(selectedBalls[i] + " ");
        }
        System.out.println();
    }

    public void playerSelectBalls(){
        PlayerBall[] balls = new PlayerBall[4];
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        for(int i=0; i < 4; i++){
            int number = num.charAt(i);
            balls[i] = new PlayerBall(number);
        }
        for (int i = 0; i < balls.length; i++) {
            //System.out.print(selectedBalls[i].getNumber()+" ");
            System.out.print(balls[i] + " ");
        }
    }
    private BotBall getBall() {
        BotBall ball = null;
        Random r = new Random();
        while (true) {
            int index = r.nextInt(10);
            ball = balls[index];
            // 중복 처리
            if (!ball.isSelectTed()) {
                break;
            }
        }
        ball.setSelectTed(true);
        return ball;
    }
//    private PlayerBall PgetBall(){
//        PlayerBall ball = PgetBall().getNumber();
//        return ball;
//    }
}
