package lesson6.day6;

public class ObjectMain {
    public static void main(String[] args) {
        ObjectMain om = new ObjectMain();
        om.test3();
        //ObjectMain.test1();
    }

    public static void test1() {
        ObjectTest ot = new ObjectTest();
        ot.compareTest();
    }

    public void test2() {
        ObjectTest ot = new ObjectTest();
        ot.compareTest2();
    }

    public void test3() {
        ObjectTest ot = new ObjectTest();
        ot.compareString();
    }

}
