package queue;

public class IntQueue {
	private int max; //ť�� �뷮
	private int front; //ù ���� ��� Ŀ��
	private int rear; //������ ��� Ŀ��
	private int num; //���� ������ ��
	private int[] que; //ť ��ü
	
	//���� �� ���� : ť�� ��� ����
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {
			
		}
	}
	//����� ���� : ť�� ������
	public class OverflowIntException extends RuntimeException{
		public OverflowIntException() {
			
		}
	}
	
	//������
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max= capacity;
		try {
			que = new int [max];
			} catch (OutOfMemoryError e) {
				max = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntException{
		if(num>= max)
			throw new OverflowIntException();
		que[rear++]=x; //ù��° �� ù��° �ƿ�
		num++;
		if(rear==max)
			rear=0;
		return x;
	}
	public int deque()throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front == max)
			front =0;
		return x;
	}
	public int peek() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i+front) % max;
			if(que[idx]==x)
				return idx;
		}
		return -1;
	}
	public void clear() {
		num = front = rear = 0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	public boolean isEmpty() {
		return num<=0;
	}
	public boolean isFull() {
		return num>= max;
	}
	public void dump() {
		if(num <= 0)
			System.out.println("que is Empty");
		else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i+front)%max]+" ");
				System.out.println();
			}
		}
	}
}
