package algorithms.numbers.conversion;

public class Binary2 {

	public static void main(String[] args) {
		int number = 61;
		String bin = "";
		
		while(number > 0){
			bin = Integer.toString(number % 2) + bin;
			number = number / 2;
		}
		System.out.println(bin);
	}

}
