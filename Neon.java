public class Neon{
	public void isNeon(int num){
		int square=num*num;
		int sum=0;
		while(square!=0){
			int rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		if(num==sum)
			System.out.println(num+" is a Neon Number");
		else
			System.out.println(num+" Not a Neon Number");
	}
	public static void main(String args[]){
		Neon obj=new Neon();
		obj.isNeon(9);
	}
}
	
			
			