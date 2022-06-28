package recursion;

public class GuessTheOutput {
	
	public static void func(int x) {
		System.out.println(x);
		if(x>=3) return;
		
		func(x+1);
		func(x+2);
	}

	public static void main(String[] args) {
		func(0);
	}
}
