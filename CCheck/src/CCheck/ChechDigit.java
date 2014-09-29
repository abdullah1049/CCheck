package CCheck;

import java.util.Scanner;

public class ChechDigit {
	public long my_card(){

		String get_long;
		Scanner input_user = new Scanner(System.in);
		
		System.out.println("Enter Long: ");
		get_long = input_user.nextLine();
		

		
	long sum1=0;
	int sum2=0;
	int sum_second2 =0;
	    
	    for (int i=get_long.length()-2; i>=0; i-=2  ){
	    	int get_second =2* Character.getNumericValue(get_long.charAt(i));
		    	String sum_doubled= Integer.toString(get_second);
		    	
			    for (int j=0; j<sum_doubled.length(); j++  ){
		    	int get_second2 = Character.getNumericValue(sum_doubled.charAt(j));
		    	sum1 += get_second2;
			    }
		    }
	    
	    for (int i=get_long.length()-1;i>=0;i-=2){
	    	sum2 = sum2 + Character.getNumericValue(get_long.charAt(i));
	    }
	    int total = (int) (sum1+sum2);

	    if (total%10==0){
	    System.out.println("Credit Card #" + get_long + " is valid");
	    }   	  
		
	else{
	    System.out.println("Credit Card #" + get_long + " is not valid");

	}
		return total;
	    }
}