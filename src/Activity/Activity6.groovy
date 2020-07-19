package Activity

/*
    For this exercise, create a map with 3 key-value pairs using the put() method.
    Print the key-value pairs one by one using a loop
    Use the plus() method to combine another Map with your existing Map and store in a variable called newMap. Print the full newMap.
    Next, print only the values from the newMap in ascending order of string length

 * 
 */
class Activity6 {
	
	static void main(def args) {
		
		def map=[:]
		map.put(1,"Cats")
		map.put(2, "Dogs")
		map.put(3,"Wolves")
		
		for (var in map) {
			println var
		}
		
		def newmap=map.plus([4:"Horses",5:"Donkey"])
		println newmap
		
		println newmap.values().sort()
		println newmap.values().sort({it.length()})
		
	}
}
