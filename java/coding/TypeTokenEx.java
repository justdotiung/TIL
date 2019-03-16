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
	// 특정 타입의 클래스 정보를 넘겨서 타입 안전성을 할수있도록 만드는 방법 TypeToken .
	public static void main(String[] args) throws Exception {
	
		TypeSafeMap map = new TypeSafeMap();
		map.put(String.class, "123");
		map.put(Integer.class, 1);
		//단점 같은 타입이라면 덮어 쓰여진다. 제네릭 사용 불가. 
		map.put(List.class, Arrays.asList("1", "2", "3")); //List<Integer>
		map.put(List.class, Arrays.asList(1,2,3)); //List<String> 
			
		System.out.println(map.get(String.class));
		System.out.println(map.get(Integer.class));
		System.out.println(map.get(List.class));
		//이러한 단점을 보완하기위해 SuperTypeToke 을 알아보자.
	}
}
