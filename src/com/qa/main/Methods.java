package com.qa.main;

public class Methods {
	
	public String logic(int i) {
		
		String output = "";
		
		if ( i % 3 == 0 ) {
			output = "Fizz";
		}
		
		if ( i % 5 == 0) {
			output = output + "Buzz";
		} 
		
		if ( output.contentEquals("") ) {
			output = output + i;
		}

		System.out.println(output);
		return output;
		
	}
	
	public void fizzBuzz(int length) {
		
		if ( length < 0 ) {
			
			for (int i = -1 ; i >= length; i--) {
				
				logic(i);
			
			}	
			
		} else if ( length > 0 ) {
			
			for (int i = 1 ; i <= length; i++) {
			
				logic(i);
			
			}
			
		} else {
			System.out.println("0");
		}
			
	}
	
}
