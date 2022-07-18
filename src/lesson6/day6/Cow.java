package lesson6.day6;

public class Cow extends Animal{
    public Cow(){
        this.kind = "포유류";
    }
    @Override
    public void sound(){
        System.out.println("음메");
    }
}
