package singletonPattern;

public class SingletonObject {
	
	private static SingletonObject instance = new SingletonObject();
	
	private SingletonObject(){}
	
	public static SingletonObject getInstance(){
		return instance;
	}
	
	public void message(){
		
		System.out.println("Hello Message: Singleton method has implemented.");
	}

}
