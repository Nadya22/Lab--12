public class Bloc {
    numericFanc newnumericFank;

    public void bloc() {
        numericFanc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Факториал числа 5 равен:"+factorial.func(5));
    }
}
