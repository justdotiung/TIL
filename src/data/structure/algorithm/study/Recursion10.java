package data.structure.algorithm.study;

/**
 * Designing Recursion 
 * 순환적 알고리즘 설계방법. 
 * 암시적 매개변수 를 '명시적' 매개변수로 표현.
 * 
 */
public class Recursion10 {
//순차검색
	int search(int[] data, int target) {
		for (int i = 0; i < data.length; ++i)
			if (data[i] == target)
				return i;
		return -1;
	}

	/**
	 * 매개변수 명시화 - 순차 검색
	 *  begin 과 end (위치) 명시적 매개변수 표현. 
	 *  자기자신을 호출시 명시적 표현이 좀더 설계를 할때 쉽게 해준다.
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
	 * 매개변수 명시화 - 최대값 찾기
	 * ver.begin 과 end 사이에서 찾기
	 * ver2 중간값 으로부터 찾기 
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