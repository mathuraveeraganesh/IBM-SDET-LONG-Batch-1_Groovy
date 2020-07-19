package ClassWork

class Array {
	
	static main(args) {
    def birdArr = ["Parrot", "Cockatiel", "Pigeon"]
    println birdArr
    /*Output
    [Parrot, Cockatiel, Pigeon]
    */
	
	def birds = ["Parrot", "Cockatiel", "Pigeon"]
	
		println birds[0] // Parrot
		println birds[2] // Pigeon
		println birds.getAt(1) // Cockatiel
	
		println birds[-1] // Pigeon
		println birds[-3] // Parrot
		
		def birdsWithoutParrot = birds - "Parrot"
		
		println birds // [Parrot, Cockatiel, Pigeon]
		println birdsWithoutParrot // [Cockatiel, Pigeon]
		
		def numbers = [32, 44, 12, 9, 100, 180]
		
		println numbers.max() // 180
		println numbers.min() // 9
		
		
		println birds.max { it.size() } // Cockatiel
		println birds.min { it.size() } // Parrot
}
}
