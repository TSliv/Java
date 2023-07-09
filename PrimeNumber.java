import java.util.List;
import java.util.ArrayList;

class PrimeNumberManager {
	private List<Integer> primeList;

	public PrimeNumberManager() {
		primeList = new ArrayList<Integer>();
	}

	public boolean isPrime(int number) {
		int count = 0;
		for(int i = 2; i < number; i++) {
			if(number % i == 0) { count++; }
		}
		return (count > 0)?false:true;
	}

	public void addPrime(int number) {
		this.primeList.add(number);
	}

	public List<Integer> getPrimeList() { return this.primeList; }
}

public class PrimeNumber {
	private static void run() {
		PrimeNumberManager p = new PrimeNumberManager();
		int maxLength = 10;

		for(int i = 1; i <= maxLength; i++) {
			if(p.isPrime(i)) {
				p.addPrime(i);
			}			
		}

		System.out.println(p.getPrimeList());		
	}

	public static void main(String[] args) {
		run();
	}
}