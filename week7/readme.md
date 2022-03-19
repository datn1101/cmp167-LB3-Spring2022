# Array: a collection of elements of the data type with a fixed size.
## Syntax: 

	DataTypeOfElements [] nameOfArray = { element1, element2, element 3 };
	
	DataTypeOfElements [] nameOfArray = new DataTypeOfElements[sizeOfArray];
	DataTypeOfElements [] nameOfArray = new DataTypeOfElements[]{element1, element2,...elementN};
	
	
# Semantics
- 	Hold a space in memory
-	store the reference of it into a variable


# Indexes to identify each sub-container in the array, the first index is zero

## Accessing an array

	nameOfArray [index
	
## Get length of an array
	nameofArray.length
	

## Replacing a value at specific index
	nameOfArray[index] = newElement;
	
##Example

	String [] names = {"Maria", "Azis", "Galin", "Galena" };
	
	System.out.println(names[1]); // -> Azis
	
	names[0] = "Celine Dion"; // {"Celine Dion", "Azis", "Galin", "Galena" }
	
	int aLength = names.length; // 4
	
	names[3]; //Galena, 
	
	//Last index ==> length -1
	names[names.length -1 ]; //
	//---------------------------------------------------------------------------
	int [] numbers = new int[100];
	numbers[0] = 54;
	
	//---------------------------------------------------------------------------
	double [] balances = new double[]{45.23, 46.85, 50.47};
	balances.length; // 3
	//---------------------------------------------------------------------------
	
# Iterating through an array, traversing an array	
	
	for {int i = 0; i < nameOfArray.length; i++)
	{
		nameOfArray[i] = modifying;
	}
	
	for ( DataType temp : nameOfArray){
		System.out.println(temp);
	}

# Arrays class
	// import the Arrays class
	
	System.out.print(Arrays.toString(nameOfArray)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	