package patten3;

public class Clinet {
	private static final int THREAD_NUM = 5;
	public static void main (String[] args){
		UserThread[] user = new UserThread[THREAD_NUM];
		for (int i = 0; i < user.length; i++) {
			user[i] = new UserThread((i+1) + "-thread");
			user[i].start();
		}
	}
}
