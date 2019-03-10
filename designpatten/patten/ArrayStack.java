package patten;

import java.util.ArrayList;
//ĸ��ȭ.
public class ArrayStack {
	private ArrayList<Integer> itemArray;
	private int stackSize;

	public ArrayStack(int stackSize) {
		itemArray = new ArrayList<Integer>(stackSize);
		this.stackSize = stackSize;
	}

	public boolean isEmpty() {// ������ ��� �ִ��� �˻�
		return itemArray.isEmpty();
	}

	public boolean isFull() { // ������ �� á���� �˻�
		return (itemArray.size()>=this.stackSize);
	}

	public void push(int item) { // ���ÿ� ������ �߰�
		if (isFull()) {
			System.out.println("Inserting fail! Array stack is full!!");
		} else {
			itemArray.add(new Integer(item));
			System.out.println("Inserted Item:" + item);
		}
	}

	public int pop() {// ������ �鿡 �ִ� ������ ��ȯ
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
