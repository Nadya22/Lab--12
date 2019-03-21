public class Main {

    public static void main(String[] args) {
	System.out.println("\nИспользование лямбда-выражения без параметров:");
	LamЬda lam1 = new LamЬda();
	lam1.simple();

	System.out.println("\nИспользование лямбда-выражения с одним параметром:");
	OneParam lam2 = new OneParam();
	lam2.one();

	System.out.println("\nИспользование лямбда-выражения с двумя параметрами:");
	TwoParam lam3 = new TwoParam();
	lam3.two();

	System.out.println("\nИспользование блочного лямбда-выражения:");
	Bloc lam4 = new Bloc();
	lam4.bloc();
    }
}
