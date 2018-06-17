package com.hrorizen.chin.pattern.singleton;

/**
 * @author chenxin
 * 单例模式
 */
public class Singleton {
	
	//懒汉式
	private static Singleton lazyInstance;
	
	/**
	 * 只有当调用getLasyInstance的时候，才回去初始化这个单例
	 * 懒汉式本身是非线程安全的
	 * @return
	 */
	public static Singleton getLasyInstance(){
		if( lazyInstance == null ){
			lazyInstance = new Singleton();
		}
		return lazyInstance;
	}
	
	//for thread safe method 
	//method 1
	/**
	 * 在getInstance方法上加同步
	 * @return
	 */
	public static synchronized Singleton getLazyInstanceSafe1(){
		if( lazyInstance == null ){
			lazyInstance = new Singleton();
		}
		return lazyInstance;
	}
	
	//method 2 
	/**
	 * 双重检查锁定
	 * @return
	 */
	public static Singleton getLasyInstanceSafe2(){
		if( lazyInstance == null ){
			synchronized (Singleton.class) {    
               if ( lazyInstance == null ) {    
            	   lazyInstance = new Singleton();   
               }    
	        }    
		}
		return lazyInstance;
	}
	
	//method 3
	private static class LazyMan{
		private static final Singleton LAZY_ONE = new Singleton();
	}
	
	/**
	 * 使用静态内部类  性能最好
	 * @return
	 */
	public static final Singleton getLazyInstance(){
		return LazyMan.LAZY_ONE;
	}
	
	//饿汉式
	private static Singleton hungryInstance = new Singleton();
	
	/**
	 * 饿汉就是类一旦加载，就把单例初始化完成，保证getHungryInstance的时候，单例是已经存在的了
	 * 饿汉式天生就是线程安全的，可以直接用于多线程而不会出现问题
	 * @return
	 */
	public static Singleton getHungryInstance(){
		return hungryInstance;
	}
	

}
