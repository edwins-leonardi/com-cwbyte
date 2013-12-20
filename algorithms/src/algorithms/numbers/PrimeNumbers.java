package algorithms.numbers;

import java.util.ArrayList;
import java.util.List;


/*
 * public class Prime {

    public static void main(String[] args) { 
        long N = Long.parseLong(args[0]);
        boolean isPrime = true;
        if (N < 2) isPrime = false;

        // try all possible factors i of N
        // if if N has a factor, then it has one less than or equal to sqrt(N),
        // so for efficiency we only need to check i <= sqrt(N) or equivalently i*i <= N
        for (long i = 2; i*i <= N; i++) {

            // if i divides evenly into N, N is not prime, so break out of loop
            if (N % i == 0) {
                isPrime = false;
                break;
            }
        }

        // print out whether or not N is prime
        if (isPrime) System.out.println(N + " is prime");
        else         System.out.println(N + " is not prime");
    }
}

 */

public class PrimeNumbers {
	
	/**
	 * Return the prime numbers from 1 to range
	 * @param range
	 */
	public static List<Integer> getPrimeNumbers(int range){
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 2; i < range; i++){
			if(i <= 3){
				numbers.add(i);
			}
			else{
				int sqr = (int) Math.floor(Math.sqrt(i));
				// if even or is a square root then is not a prime number
				if((i % 2 != 0) && (Math.sqrt(i) - sqr > 0.0)){
					int divisor = sqr;
					if(divisor % 2 == 0){
						divisor--; //divisor cannot be even
					}	
					if(divisor == 1){ 
						numbers.add(i);
					}else{
						boolean prime = true;
						while(divisor > 1){
							if(i % divisor == 0){
								prime = false;
								break;
							}
							divisor -= 2;
						}
						if(prime){
							numbers.add(i);
						}
					}					
				}
			}
		}
		
		return numbers;
	}

}
