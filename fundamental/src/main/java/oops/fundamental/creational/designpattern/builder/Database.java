package oops.fundamental.creational.designpattern.builder;

//How
//Step 1 : Hide outer class constructor and Create static inner class
//Step 2 : Copy all the fields of outer class to inner class
//Step 3: Expose setter on builder 
//Step 4: call build method
//Note Outer class is immutable and inner class mutable.

public class Database {

	private String name;
    private String host;
    private int port;
    private DatabaseType type;
	
    
    private Database() {}
    
    public static DatabaseBuilder Builder() {
    	return new DatabaseBuilder();
    }
    
	public static class DatabaseBuilder{
		 private String name;
	        private String host;
	        private int port;
	        private DatabaseType type;
	        

	        // Step 3 - Create fluent interfaces for setter
	        public DatabaseBuilder withName(String name) {
	            this.name = name;
	            return this;
	        }

	        public DatabaseBuilder withUrl(String host, int port) {
	            this.host = host;
	            this.port = port;
	            return this;
	        }

	        public DatabaseBuilder mysql() {
	            this.type = DatabaseType.MYSQL;
	            return this;
	        }
	        
	        public Boolean isValid() {
	            if (this.name == null) {
	                return false;
	            }
	            return true;
	        }
	        
	        public Database build() {

	            if (!isValid()){
	                throw new IllegalArgumentException("Invalid database configuration");
	            }
	            Database database = new Database();
	            database.name = this.name;
	            database.host = this.host;
	            database.port = this.port;
	            database.type = this.type;
	            return database;
	        }
	}
}
