package Activity

import org.apache.ivy.Main

class Exercise1 {
	
	static void main(def args) {
		def x;
		int y;
		
		def array=[1,2.0,"sting",true,x,y]
		array.each { println"value is-"+ it +". and the Data Type-"+ it.getClass() }
		
	}
}
