package com.hrorizen.chin.pattern.singleton;

public class TestSingleton {
	
	private String name;

	private static class Local{ private static final TestSingleton Instatce = new TestSingleton(); }
	
	public static TestSingleton getInstance(){
		return Local.Instatce;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printName(){
		System.out.println( "the Instance Name is ： " + name );
	}
	
	public static void main(String[] args) {
		
		TestSingleton t1 = TestSingleton.getInstance();
		t1.setName( "test1" );
		TestSingleton t2 = TestSingleton.getInstance();
		t2.setName( "test2" );
		
		t1.printName();
		t2.printName();
	}
}
