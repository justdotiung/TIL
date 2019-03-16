package coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeTokenEx {

	static class TypeSafeMap {
		Map<Class<?>, Object> map = new HashMap<>();

		<T> void put(Class<T> clazz, T value) {
			map.put(clazz, value);
		}

		<T> T get(Class<T> clazz) {
			return clazz.cast(map.get(clazz));
		}

	}
	// Ư�� Ÿ���� Ŭ���� ������ �Ѱܼ� Ÿ�� �������� �Ҽ��ֵ��� ����� ��� TypeToken .
	public static void main(String[] args) throws Exception {
	
		TypeSafeMap map = new TypeSafeMap();
		map.put(String.class, "123");
		map.put(Integer.class, 1);
		//���� ���� Ÿ���̶�� ���� ��������. ���׸� ��� �Ұ�. 
		map.put(List.class, Arrays.asList("1", "2", "3")); //List<Integer>
		map.put(List.class, Arrays.asList(1,2,3)); //List<String> 
			
		System.out.println(map.get(String.class));
		System.out.println(map.get(Integer.class));
		System.out.println(map.get(List.class));
		//�̷��� ������ �����ϱ����� SuperTypeToke �� �˾ƺ���.
	}
}
