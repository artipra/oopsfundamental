package creational.designpattern.builder;

import creational.designpattern.builder.Database.DatabaseBuilder;

public class Runner {

	public static void main(String[] args) {
	 Database db = Database.Builder().withName("test").withUrl("root",8080).mysql().build();	
	}

}
