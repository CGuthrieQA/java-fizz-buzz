# Quick FizzBuzz in Java!

```java
public class Runner {

	public static void main(String[] args) {
		
		Methods mtds = new Methods();
		
		mtds.fizzBuzz(100);
		
	}

}
```

```java
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
```