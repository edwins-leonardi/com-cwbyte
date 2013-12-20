package algorithms.tests;

public class Fibonacci {
	public static int calc(int termo){
		if (termo < 0)
			return 0;
		if (termo == 1 || termo == 2)
			return 1;
		else
			return calc(termo-2) + calc(termo-1);
	}
}
