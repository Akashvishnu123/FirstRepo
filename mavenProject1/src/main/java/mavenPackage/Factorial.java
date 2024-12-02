package mavenPackage;

public class Factorial {
	public static void factorial1(int number){
		int i,fact=1;
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial.factorial1(10);

	}

}
