package ClassWork

class Range {

		static void main(String[] args) {
			// Example of an Integer using def
			def rint = 1..10
	
			//contains()
			println(rint.contains(2)) //true
			println(rint.contains(11)) //false
	
			//get()
			println(rint.get(4)) //5
			println(rint.get(9)) //10
	
			//getFrom and getTo()
			println(rint.getFrom()) //1
			println(rint.getTo()) //10
	
			//size()
			println(rint.size()) //10
		}
	}

