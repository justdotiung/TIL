package patten;

import java.util.ArrayList;
//일반화 관계와 위임.
public class pattenEx1 {
	public static void main(String[] args) {
		Mystack<String> ms = new Mystack<String>();
			ms.push("1");
			ms.push("1");
	}
}

class Mystack<String> {
	
	private ArrayList<String> arList = new ArrayList<String>();
	
	public boolean isEmpty() {
		return arList.isEmpty();
	}
	
	public int size() {
		return arList.size();
	}
	
	public void push(String element) {
		arList.add(element);
	}

	public String pop() {
		return arList.remove(size() - 1);
	}
}