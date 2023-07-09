import java.util.List;
import java.util.ArrayList;

class FibonacciManager {
	private List<Integer> numList;

	public FibonacciManager() {
		this.numList = new ArrayList<Integer>();
	}

	public void addNumber(int number) {
		this.numList.add(number);
	}

	public int getLength() {
		return this.numList.size();
	}

	public List<Integer> getList() {
		return this.numList;
	}

	public int getNextNumber() {
		if(this.numList.size() < 2) {
			return (this.numList.isEmpty()) ? 0 : 1;
		} else {
			return this.numList.get(this.numList.size()-1) + this.numList.get(this.numList.size()-2);
		}
	}
}

public class Fibonacci {

	private static void run() {
		FibonacciManager fibList = new FibonacciManager();
		int maxLength = 10;
		int nextNumber = 0;

		while(fibList.getLength() != maxLength) {
			fibList.addNumber(nextNumber);
			nextNumber = fibList.getNextNumber();
		}			

		System.out.println(fibList.getList());
	}

	public static void main(String[] args) {
		run();
	}
}