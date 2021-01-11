package com.qa.main;

public class Methods {
	
	public void fizzBuzz(int length) {
		
		for (int i = 1 ; i <= length; i++) {
			
			String output = "";
			
			if ( i % 3 == 0 ) {
				output = "Fizz";
			}
			
			if ( i % 5 == 0) {
				output = output + "Buzz";
			} 
			
			if ( output.contentEquals("") ) {
				output = "" + i;
			}

			System.out.println(output);
			
		}
		
	}
	
}
