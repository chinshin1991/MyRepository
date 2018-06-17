package com.hrorizen.chin.pattern;

/**
 * @author chenxin
 * 单例模式
 */
public class Singleton {
	
	//懒汉式
	private static Singleton LazyInstance;
	
	public static Singleton getLasyInstance(){
		if( LazyInstance == null ){
			LazyInstance = new Singleton();
		}
		return LazyInstance;
	}
	
	//饿汉式
	private static Singleton HungryInstance = new Singleton();
	
	public static Singleton getHungryInstance(){
		return HungryInstance;
	}
	

}
