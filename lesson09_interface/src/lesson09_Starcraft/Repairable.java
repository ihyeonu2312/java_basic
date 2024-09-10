package lesson09_Starcraft;

public interface Repairable {
	
	static void sm() {
		System.out.println("sm()");
	}
	
	default void dm() {
		System.out.println("dm()");
	}
}
