package queue;

public class IntQueue {
	private int max; //큐의 용량
	private int front; //첫 번재 요소 커서
	private int rear; //마지막 요소 커서
	private int num; //현재 데이터 수
	private int[] que; //큐 본체
	
	//실행 시 예외 : 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {
			
		}
	}
	//실행시 예외 : 큐가 가득참
	public class OverflowIntException extends RuntimeException{
		public OverflowIntException() {
			
		}
	}
	
	//생성자
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
		que[rear++]=x; //첫번째 인 첫번째 아웃
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
