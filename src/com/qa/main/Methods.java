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

		return output;
		
	}
	
	public void fizzBuzz(int length) {
		
		if ( length < 0 ) {
			
			for (int i = -1 ; i >= length; i--) {		
				System.out.println( logic(i) ); 
			}	
	
		} else if ( length > 0 ) {
			
			for (int i = 1 ; i <= length; i++) {
				System.out.println( logic(i) ); 
			}
		} else {
			
			System.out.println( "0" );
			
		}
			
	}
	
}
