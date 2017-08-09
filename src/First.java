import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Ashish Sharma");
		
		
		
		System.out.println("Enter the Number one");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println();
		
		System.out.println("The Entered number is "+num);
		String numString=Integer.toString(num);
		
		int totalDigits=numString.length();
		
		
		
		
		System.out.println("Total number of digits entered are "+totalDigits);
		
		System.out.println(numString.charAt(1));
		
		
	}

}
