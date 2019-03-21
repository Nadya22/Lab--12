public class OneParam {
    NumericTest newNumericTest;

    public void one()
    {
        NumericTest isEnen = (b) -> (b % 3) == 0;
        if (isEnen.test(15))
            System.out.println("Число 15 делиться на 3 и это равно 5");
        if (isEnen.test(8))
            System.out.println("Число 8 не делиться на 3");
    }
}

