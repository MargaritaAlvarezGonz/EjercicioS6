package java8;
interface Follower{
	void unfollow(); 
	static void follow() {
		System.out.println("Esto es un metodo generico para seguir a alguien");
	}
	
	static void print () {
		System.out.println("ESto es un metodo static en una interfaz");
	}
}

class TwitterFollower implements Follower{

	@Override
	public void unfollow() {
		System.out.println("Unfollow de twitter");
		
	}
	//nose pueden sobre escribir 
}

public class MetodosStaticsEnInterfaces {
	public static void main(String[] args) {
		Follower.print();
	}
	

}
