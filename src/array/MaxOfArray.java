package array;

public class MaxOfArray {
static int[] a = {172,153,192,140,165};

public static void main(String[] args) {
	System.out.println(maxOf(a));
}
static int maxOf(int[] a) {
	
	int max = a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i]>max)
			max=a[i];
	}
	
	return max; 
}
}
