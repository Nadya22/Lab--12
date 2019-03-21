public class TwoParam {
    NumericTest2 newNumericTest2;

    public void two(){
        NumericTest2 isNumb =(a,b) ->(a%b)==0;
        if(isNumb.test(20,4))
            System.out.println("Число 4 является делителем числа 20");
        if(isNumb.test(50,8))
            System.out.println("Число 8 не является делителем числа 50");
    }
}
