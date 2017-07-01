package singletonPattern;

public class SingletonObjectDemo {

	public static void main(String[] args){
		
		//illigal access - SingletonObject constructor is private
		//SingletonObject so = new SingletonObject();
		
		// getInstance 
		SingletonObject so = SingletonObject.getInstance();
		
		so.message();
	}
	
}
