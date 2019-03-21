public class LamЬda {
    MyNumber newMyNum;

    public void simple(){
        MyNumber myNum;
        myNum = () -> 123.74;
        System.out.println("Заданное значение:" +myNum.getValue());
        myNum = () -> Math.random()*100;
        System.out.println("Случайное значение:"+myNum.getValue());
    }
}
