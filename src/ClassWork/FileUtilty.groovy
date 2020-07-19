package ClassWork

class FileUtilty {
	static void main (def args)
	{
		def file = new File('E:/Directory')
    file.mkdir()
	
	//Prints true if "rando" is a file
	println "File? ${file.isFile()}"

	//Prints true if "rando" is a directory
	println "Directory? ${file.isDirectory()}"
	
	def file1 = new File('E:/Example.txt')
	file1.delete()
	
	//Create two files
	def src = new File("example1.txt")
	def dst = new File("example2.txt")
	
	//Copy
	dst << src.text
	
	
	/*def rootFiles = new File("filePath").listRoots()
	rootFiles.each {
		file1 -> println file.absolutePath
		}
		
		
		new File("filePath").eachFile(){
		file1->println file.getAbsolutePath()}*/
		
	
	/*static void ReadFromFile1() {
		// write the content of the file to the console
		def file = new File("./resources/text.txt")
		
		//Print each line in the file
		file.eachLine{ line -> println line }
	
		// adds a line number in front of each line to the console
		def lineNumber = 0
		file.eachLine {
			line ->
			lineNumber++
			println "$lineNumber: $line"
		}
	
		static void WriteToFile1() {
			// write the content of the file to the console
			File file = new File("./resources/output.txt")
			
			//Writing to the file
			file.write "Hello\n"
			
			//Appending to same file
			file.append "Testing\n"
			file << "More appending...\n"
			
			//Print file as a single string
			println file.text
			println file.getText()
		}*/
	}
}	
