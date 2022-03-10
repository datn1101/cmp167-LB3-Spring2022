# String formatting

# Format specifier
	%S string 
	%c char 
	%d int 
	%f float double 
-	flags : 0, -, + 
-	width number of characters to display 
-	precision point : specify the number of decimal places after the dat

## Syntax:
	%(flags) (width) (-precision)specifier 
## Example
	n = 7.1 
	%.3f 	 	--> 7.100 
	name = "Mia" 
	%10s -->	 	     Mia 
	%-10s --> Mia_________
	%010.3f -->000007.100 
# printf() 
## Syntax:
	System.out.printf ("Format", data); 
## Example:
	System.out.printf("total is: %.3f ", n);

# String.format() 
## Syntax:
	String variableName = String.format("Format", data); 
## Example:
	String sentence = String.format("total is: %.3f ", n);

