public class Factorial{
	public int factorialOfANumber(int n){
		int result=1;
		int i=1;
		while(i<=n){
			result=result*i;
			i++;
		}
		return result;
	}
	public static void main(String args[]){
		Factorial fact=new Factorial();
		int output=fact.factorialOfANumber(7);
		System.out.println("Factorial of 7 is "+output);
	}
}
