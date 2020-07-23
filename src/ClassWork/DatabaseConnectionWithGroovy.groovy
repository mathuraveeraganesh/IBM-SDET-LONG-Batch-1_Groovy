package ClassWork

class DatabaseConnectionWithGroovy {
	
	/* Import the Groovy class required to work with SQL databases.
	import groovy.sql.Sql
	
	// Set up database connection properties.
	// IMPORTANT: must start with jdbc:mysql:// 
	def url = 'jdbc:mysql://localhost:3306/test'
	def user = 'root'
	def password = 'password'
	def driver = 'com.mysql.jdbc.Driver'
	
	// Register the MySQL JDBC driver – required for Groovy to send requests to the database.
	com.eviware.soapui.support.GroovyUtils.registerJdbcDriver( driver )
	
	// Connect to the SQL instance.
	def sql = Sql.newInstance(url, user, password, driver)
	
	// Use the SQL instance.
	sql.eachRow('SELECT * FROM table') { row ->
		log.info row[0]
	}
	
	// Close the SQL instance.
	sql.close()
	
	// Creating a connection to the database
	def sql = Sql.newInstance('jdbc:mysql://localhost:3306/test', 'testuser', 'test123', 'com.mysql.jdbc.Driver')
	
	//Create Query
	def sqlstr = """CREATE TABLE EMPLOYEE (
    FIRST_NAME CHAR(20) NOT NULL,
    LAST_NAME CHAR(20),
    AGE INT,
    SEX CHAR(1),
    INCOME FLOAT
)"""
	
	//Execute Query
	sql.execute(sqlstr);
	
	//Close connection
	sql.close()
	
	// Creating a connection to the database
	def sql = Sql.newInstance('jdbc:mysql://localhost:3306/test', 'testuser', 'test123', 'com.mysql.jdbc.Driver')
	sql.connection.autoCommit = false
	
	//Create Query
	def sqlstr = """INSERT INTO EMPLOYEE(
    FIRST_NAME,
    LAST_NAME,
    AGE,
    SEX,
    INCOME)
    VALUES ('Mac', 'Mohan', 20, 'M', 2000)"""
	try {
		//Execute Query
		sql.execute(sqlstr)
		sql.commit()
		log.info("Successfully committed")
	} catch(Exception ex) {
		//Rollback if fails
		sql.rollback()
		log.info("Transaction rollback")
	}
	
	//Close connection
	sql.close()
	
	// Creating a connection to the database
	def sql = Sql.newInstance('jdbc:mysql://localhost:3306/TESTDB', 'testuser', 'test123', 'com.mysql.jdbc.Driver')
	sql.connection.autoCommit = false
	
	def sqlstr = """INSERT INTO EMPLOYEE(
    FIRST_NAME,
    LAST_NAME,
    AGE,
    SEX,
    INCOME)
    VALUES """ + "(${firstname}, ${lastname}, ${age}, ${sex}, ${income} )"
	
	try {
		//Execute Query
		sql.execute(sqlstr)
		sql.commit()
		log.info("Successfully committed")
	} catch(Exception ex) {
		//Rollback if fails
		sql.rollback()
		log.info("Transaction rollback")
	}
	
	//Close connection
	sql.close()
	
	// Creating a connection to the database
	def sql = Sql.newInstance('jdbc:mysql://localhost:3306/TESTDB', 'testuser', 'test123', 'com.mysql.jdbc.Driver')
	
	//Read rows
	sql.eachRow('select * from employee') { tp ->
		println([tp.FIRST_NAME, tp.LAST_NAME, tp.age, tp.sex,tp.INCOME])
	}
	
	//Close connection
	sql.close()  */
	
}
