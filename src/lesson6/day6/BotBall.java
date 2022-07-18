package lesson6.day6;

import java.util.Random;

public class BotBall {
    private int number;
    private boolean isSelectTed;

    public BotBall(int number){
        this.number = number;
    }
    public int getNumber() {
        return this.number;
    }
    public boolean isSelectTed(){
        return this.isSelectTed;
    }
    public void setSelectTed(boolean selectTed) {
        this.isSelectTed = selectTed;
    }
    // 재정의
    @Override
    public String toString(){
        return  this.number+"";
    }
}
