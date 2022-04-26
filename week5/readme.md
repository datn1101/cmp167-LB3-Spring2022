#Loops: Control structure, A loop is a block of code that repeats itself, a loop can be defined or counted and indefinite and infinite 
# Every cycle in a loops is called an iteration 
# While Loop 
## Syntax: 
	while (condition) {
	statements
## Semantics
 - Evaluate the condition 
 - If the condition is true, execute inner statements and go back to step 1 
 - If the condition is false ignore inner statements and end the loop

#Using A sentinel value
	while ( n != sentinel ) {
		statements 
		n = user_input;
	}
	
# Using a flag
	while (flag) {
		statements 
		if (condition)
			flag = false;
		}
# Using true
	while ( true ) {
		statements 
		if (condition)
			break;
		}
# Using incrementing code
	while ( n <= limit ) {
		statements 
		n++; // n = n+1; n += 1;
	}
# do While Loop 
## syntax
	do{
	statements; 
	} while (condition); 
## Semantics
- Execute the inner statements 
- Then check the condition
- if condition is true repeat step one 
- if the condition is false end the loop


# For loop
## Syntax 
	for ( start ; stop ; step) {
		statements
-- Start code: Initialization or assign values or leave it empty 
-- Stop code: condition that if it is true, the inner statements will be executed 
-- Step code: Incrementing code 
## Semantics 
- 1. run the start code
- 2. Check the stop condition 
- 3. If condition is true, the inner statement are going to be executed
- 3.1. run the step code and repeat step 2 
- 4. If condition is false, the for loop is going to stop
-

# For each loop 
## Syntax: 
	for ( DataType tempVariable : arrayReferrence ) {
		Statements;
	}
## Semantics 
- Loop through the array 
- Assign each element's value to the temporary variable



