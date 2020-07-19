package ClassWork
/*
 * // return the input, using the implicit variable it
def returnInput = {it}

// return the input without implicit variable
def returnInput2 = {s-> s}

//b has a default value of 10
def multiply = {int a, int  b = 10 -> println a * b}

multiply(2) //Returns 20

//Overriding the default value
multiple(2, 5) //Returns 10
 */
class Closure {

		def static Display(clo) {
			//This time the $param parameter gets replaced by the string "Inner"
			clo.call("Inner");
		}
	
		static void main(String[] args) {
			def str1 = "Hello";
			def clos = { param -> println "${str1} ${param}" }
			clos.call("World");
	
			// We are now changing the value of the String str1
			//which is referenced in the closure
			str1 = "Welcome";
			clos.call("World");
	
			// Passing our closure to a method
			Closure.Display(clos);
		}
	}

