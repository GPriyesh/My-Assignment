package Week1.day2;

public class palindrome {

	public static void main(String[] args) {
		int input=34343;
		String s=Integer.toString(input);
		int temp=input;
		int sum=0;
		for(int i=s.length();i>0;i++) {
			sum=(sum*10)+(input%10);
			input=input/10;
			
		}
		if(temp==sum) {
			System.out.println(temp+"is a palindrome");
			
		}
		else {
			System.out.println(temp+"is a not a palindrome");
		}

	}

}
