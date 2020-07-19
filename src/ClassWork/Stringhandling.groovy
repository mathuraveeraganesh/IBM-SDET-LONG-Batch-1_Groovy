package ClassWork

class Stringhandling {
	static void main(def args) {
	def name = "John"
	def s1 = "Hello $name" // $name will be replaced
	def s2 = 'Hello $name' // $name will not be replaced
	println s1
	println s2
	
	//print type of variable
	println s1.getClass()
	println s2.getClass()
	
	// demonstrates object references and method calls
	def date = new Date()
	println "We met at $date"
	
	println 'ABCDEF'.length()               // output: 6
	println 'ABCDEF'.substring(1)           // output: BCDEF
	println 'ABCDEF'.indexOf('C')           // output: 2
	println 'ABCDEF'.replace('CD', 'XX')    // output: ABXXEF
	println 'ABCDEF'.toLowerCase()          // output: abcdef
	
	println 'ABC' - 'B'   // output: AC
	println 'ABBC' - 'B'  // output: ABC
	println 'ABBC' - 'BB' // output: AC
	println 'ABC' * 2     // output: ABCABC
	println 'ABC' * 3     // output: ABCABCABC
	
	def str1 = """#1 Hello
This is a multi line
string example
"""
	 
	def str2 = '''#2
	This is
	Another multi line
	string sammple
	'''
	 
	def str3 = '#3 This is\
	a sample with\
	backslash'
	 
	def str4 = '\n#4 Another example\n\
	with backslash\n\
	and next line'

/*	Output
 * 
 * #1 Hello
	This is a multi line
	string example
	 
	#2
	This is
	Another multi line
	string sammple
	 
	#3 This isa sample withbackslash
	 
	#4 Another example
	with backslash
	and next line
	*/
	}
}
