package data.structure.algorithm.study;

/**
 * Designing Recursion 
 * ��ȯ�� �˰��� ������. 
 * �Ͻ��� �Ű����� �� '�����' �Ű������� ǥ��.
 * 
 */
public class Recursion10 {
//�����˻�
	int search(int[] data, int target) {
		for (int i = 0; i < data.length; ++i)
			if (data[i] == target)
				return i;
		return -1;
	}

	/**
	 * �Ű����� ���ȭ - ���� �˻�
	 *  begin �� end (��ġ) ����� �Ű����� ǥ��. 
	 *  �ڱ��ڽ��� ȣ��� ����� ǥ���� ���� ���踦 �Ҷ� ���� ���ش�.
	 */
	int search(int[] data, int begin, int end, int target) {
		if (begin > end)
			return -1;
		else if (target == data[begin])
			return begin;
		else
			return search(data, begin + 1, end, target);
	}

	/**
	 * �Ű����� ���ȭ - �ִ밪 ã��
	 * ver.begin �� end ���̿��� ã��
	 * ver2 �߰��� ���κ��� ã�� 
	 */
	int max(int[] data,int begin,int end) {
		if (begin==end)
			return data[begin];
		else
			return Math.max(data[begin], max(data,begin+1,end));
//		if (begin==end)
//			return data[begin];
//		else {
//			int mid =(begin+end)/2;
//			int fir= max(data,begin,mid);
//			int sec= max(data,mid+1,end);
//			return Math.max(fir,sec);
//		}	
	}
	int binarysearch(String[] items,String target,int begin,int end) {
		if (begin>end)
			return -1;
		else {
			int mid = (begin+end)/2;
			int result = target.compareTo(items[mid]);
			if(result==0)
				return mid;
			else if (result<0)
				return binarysearch(items, target, begin, mid-1);
			else
				return binarysearch(items, target, mid+1, end);			
		}
	}
	
}