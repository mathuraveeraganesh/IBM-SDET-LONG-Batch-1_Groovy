package ClassWork

class List {

		static void main(String[] args) {
			
		//A list of integer values
		[11, 12, 13, 14]
		
		//A heterogeneous list of object references
		["Groovy", 21, 2.11]
		
		//A nested list
		[1, 2, [3, 4], 5]
		
		def list1 = [11, 15, 12, 10];
		def newList = []

		//add(Object value)
		list1.add(16)
		println(list1)
		//add(int index, Object value)
		list1.add(2, 20)
		println(list1)

		//remove(int index)
		list1.remove(3)
		println(list1)

		//plus(Collection collection)
		newList = list1.plus([21, 22])
		println(newList)

		//minus(Collection collection)
		newList = list1.minus([14, 15])
		println(newList)

		//size()
		println(list1.size())
		println(newList.size())

		//sort()
		println(list1.sort())
		println(newList.sort())
	}
	
}
