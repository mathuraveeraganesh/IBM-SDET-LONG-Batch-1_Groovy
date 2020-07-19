package Activity

/*
 * 
    Your task is to separate out the integers and the string into two different lists, intList and strList
    Then print the sorted version of both the intList and strList
 */

class Activity5 {
	
	static void main(def args) {
		def arr=[11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		def strList=arr.minus([11,2,19,5])
		def intList=arr.minus(["Mango", "Apple", "Watermelon"])
		
		println "${strList.sort()}"
		println "${intList.sort()}"
	}
}
