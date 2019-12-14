package Initial;

public class VariableArguments1 {
	static void fun(int ...a)
	{
		System.out.println("Number of arguments: "+a.length);
		
		for(int i:a)
			System.out.println(i+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		fun(100);
		fun(1,2,3,4,5);
		fun();
		fun(2,23,4,21,566,3,21,2,23,4,5,6,7,8,9,11,22,33,44,55);

	}

}
