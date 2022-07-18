package lesson6.day6;

public class PlayerBall {
    private int number;

    public PlayerBall(int number){
        this.number = number;
    }
    public int getNumber() {
        return this.number;
    }
    // 재정의
    @Override
    public String toString(){
        return  this.number+"";
    }
}
