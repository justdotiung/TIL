package coding;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;

import coding.SuperTypeTokenEx2.Sup;
import coding.TypeTokenEx.TypeSafeMap;

public class SuperTypeTokenEx {
	static class TypeSafeMap {
		Map<Type, Object> map = new HashMap<>();

		<T> void put(TypeReference<T> tr, T value) {
			map.put(tr.type, value);
		}

		<T> T get(TypeReference<T> tr) {
			if (tr.type instanceof Class<?>)
				return ((Class<T>) tr.type).cast(map.get(tr.type));// tr<String>
			else
				return ((Class<T>)((ParameterizedType) tr.type).getRawType()).cast(map.get(tr.type)); //type 은 지네릭 정보를 보두 가지고 있다.
		}
	}

	static class TypeReference<T> { // ==Sup
		Type type;

		public TypeReference() {
			Type stype = getClass().getGenericSuperclass();
			if (stype instanceof ParameterizedType) {
				this.type = ((ParameterizedType) stype).getActualTypeArguments()[0];
			} else {
				throw new RuntimeException();
			}
		}

		@Override
		public int hashCode() { //hashCode 먼저 확인 equals만가지고는 비교 못함.
			final int prime = 31;
			int result = 1;
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass().getSuperclass() != obj.getClass().getSuperclass())// Supclass 를 비교해야한다.
				return false;
			TypeReference other = (TypeReference) obj;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			return true;
		}

	}//
//SuperTypeToken 
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		TypeReference<String> t = new TypeReference<String>() {
		};
		System.out.println(t.type);
		TypeSafeMap map = new TypeSafeMap();
		map.put(new TypeReference<String>() {}, "123");
		map.put(new TypeReference<Integer>() {}, 1);
		map.put(new TypeReference<List<String>>() {}, Arrays.asList("1", "2", "3")); // List<String>
		map.put(new TypeReference<List<Integer>>() {}, Arrays.asList(1, 2, 3));// List<Integer>
		map.put(new TypeReference<List<List<String>>>() {}, Arrays.asList(
				Arrays.asList("a","b"),Arrays.asList("c","d"),Arrays.asList("e")));// 3중으로 지네릭 타입을 가지고 있어도 알아낼수있다.

		Map<String,String> m = new HashMap<>();
		m.put("key1","value1");
		m.put("key2","value2");
		map.put(new TypeReference<Map<String,String>>(){}, m);
		
		
		System.out.println(map.get(new TypeReference<String>() {
		}));
		System.out.println(map.get(new TypeReference<Integer>() {
		}));
		System.out.println(map.get(new TypeReference<List<String>>() {
		}));
		System.out.println(map.get(new TypeReference<List<Integer>>() {
		}));
		System.out.println(map.get(new TypeReference<List<List<String>>>() {
		}));
		System.out.println(map.get(new TypeReference<Map<String,String>>(){}));
		
		
	
	}
}
