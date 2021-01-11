# Quick FizzBuzz in Java!

```java
public class Runner {

	public static void main(String[] args) {
		
		Methods mtds = new Methods();
		
		mtds.fizzBuzz(16);
		mtds.fizzBuzz(-16);
		mtds.fizzBuzz(0);
	}

}
```

```java
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
```
