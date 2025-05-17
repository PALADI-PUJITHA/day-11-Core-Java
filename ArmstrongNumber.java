public class ArmstrongNumber{
	public void isArmstrong(int num){
		int temp1=num;
		int temp2=num;
		int count=0;
		int sum=0;
		while(temp1!=0){
			temp1=temp1/10;
			count++;
		}
		temp1=num;
		while(temp1!=0){
			int rem=temp1%10;
			sum=sum+(int)Math.pow(rem,count);
			temp1=temp1/10;
		}
		if(sum==temp2)
			System.out.println(temp2+" is an Armstrong Number");
		else
			System.out.println(temp2+" not an Armstrong Number");
	}
	public static void main(String args[]){
		ArmstrongNumber obj=new ArmstrongNumber();
		obj.isArmstrong(153);
	}
}	
				
		
		