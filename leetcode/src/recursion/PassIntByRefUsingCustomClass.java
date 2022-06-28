package recursion; 

public class PassIntByRefUsingCustomClass {
	
	public static void func(WrapperInt x) {
		System.out.println(x.value);
		
		if(x.value>=3) {
			return;
		}
		
		x.value++;
		func(x);
		x.value++;
		func(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperInt x = new WrapperInt();
		x.value=0;
		func(x);
	}

}
