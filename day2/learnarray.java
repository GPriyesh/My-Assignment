package Week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class learnarray {

	public static void main(String[] args) {
	int[] num={22, 3981, -19, 82, 0, 45, 37};
	Arrays.sort(num);
	System.out.println("The max num is"+ num[6]);
	System.out.println("The min num is"+ num[0]);
	int e=3981;
	int s=0;
	for (int i=0;i<num.length-1;i++) {
		System.out.println(num[i]);
		if(num[i]==e) {
			s++;
			
		}
	}



}
}
