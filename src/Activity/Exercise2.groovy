package Activity

class Exercise2 {
	static void main(def args) {
		def arr=[20,50,40,90,100]
		def sum=0;
		def avg=0;
		def grade="F"
		arr.each { sum+=it }
		avg=sum/arr.size()
		
		switch(grade) {
			
			case 90..100:
				grade="A"
				break;
			case 80..89:
				grade="B"
				break;
			case 70..79:
				grade="C"
				break;
			case 50..69:
				grade="D"
				break;
			case 0..49:
				grade="C"
				break;
		}
			println "Maximum Mark-"+ arr.max()
			println "Minimum Mark-"+ arr.min()
			println "Average Mark-"+ avg
			println "Grade Mark-"+ grade
			
	}
	
	
}
