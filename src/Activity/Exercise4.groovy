package Activity

class Exercise4 {
	
	static void main(def args) {
		def val="This is a Groovy Language"
		println "Reverse String-"+val.reverse()
		println "Sub String-"+val.substring(10)
		println "Split String-"+val.split(" ")
		println "Remove Word-"+val.minus("Groovy")
		println "Lower Case-"+val.toLowerCase()
		println "Upper Case-"+val.toUpperCase()
		
		//REGEX OPERATIONS
		//matches()
		def matchStatus = val.matches("(.*)Groovy(.*)")
		if(matchStatus) { println "String matches" }
		//replaceAll()
			def replaceWith = "very Groovy"
			println(val.replaceAll("Groovy", replaceWith))
			//Notice that the original string is not changed
			println val
		
	}
}
