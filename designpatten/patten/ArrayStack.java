package patten;

import java.util.ArrayList;
//캡슐화.
public class ArrayStack {
	private ArrayList<Integer> itemArray;
	private int stackSize;

	public ArrayStack(int stackSize) {
		itemArray = new ArrayList<Integer>(stackSize);
		this.stackSize = stackSize;
	}

	public boolean isEmpty() {// 스택이 비어 있는지 검사
		return itemArray.isEmpty();
	}

	public boolean isFull() { // 스택이 꽉 찼는지 검사
		return (itemArray.size()>=this.stackSize);
	}

	public void push(int item) { // 스택에 아이템 추가
		if (isFull()) {
			System.out.println("Inserting fail! Array stack is full!!");
		} else {
			itemArray.add(new Integer(item));
			System.out.println("Inserted Item:" + item);
		}
	}

	public int pop() {// 스택의 톱에 있는 아이템 반환
		if (isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!");
			return -1;
		} else {
			return itemArray.remove(itemArray.size()-1);
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Peeking fail! Array Stack is empty!");
			return -1;
		} else {
			return itemArray.get(itemArray.size()-1);
		}
	}
}
