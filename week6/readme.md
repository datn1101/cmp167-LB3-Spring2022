# Methods: Block of code that has a declaration/header and body. It is used to promote reusability, it can be called anywhere in the code to perform 1 specific task 
# Method Definition 
## Syntax:
	accessModifier staticOrNot dataTypeOfReturnValue nameOfMethod ( parameterList ) ExceptionList
	{
		body
	}
	
-	**access modifier** : public, private, protected, default or package (optional) 
-	**static or not **  : static elements belong to the class, no object construction required to access static elements( methods, variables ) ( optional ) 
-	** data type of return values** : the type of the element to be returned, if nothing is going to be return then set to **void** ( required ) 
-	** name of method ** : cannot start with a number, it must start with a letter, $, (required) 
-	** parameter list ** : contains the declaration of a set of variables that will be used the tasks of the methods ( required ) 
-	**Exception list**   : exceptions to handle unexpected errors 
-	** body ** 			 : Contains the set of statements to be executed

## Example:
-	Method to return the sum of three numbers

	public static int sum3 ( int numi, int num2, int num3 )
	{
		return numl + num2 + num3;
	}
-	Main method
	
	public static void main(String[] args)
	{
		String fname = args[0]; 
		String sname = args[1];
	
	}
#Method signature: Name of method and the data types of the parameters 
# Method Call 
## syntax:

	nameOfMethod (ArgumentList);
	
## Semantics:
-	Grab a space in memory, and give that space the corresponding method name and argument values 
-	Search for the method declaration that matches the method signature of the method call 
-	if there is a match found, assign the argument values to the parameter variables and execute statements
-		if there is a value to return replace the method call with the value and end the method call, free out the space in memory 
-	If a signature match is not found, an error will occur.

## Example:
	sum3 ("5", "6", 8); // Error

	sum3 (5, 4, 6); // It's a match


# Return statement 
## Syntax:
	return expression;

## Semantics:
-	Evaluate the expression 
-	Replace the method call with the value 
-	End the method call

	