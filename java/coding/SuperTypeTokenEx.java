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
		Map<TypeReference<?>, Object> map = new HashMap<>();

		<T> void put(TypeReference<T> tr, T value) {
			map.put(tr, value);
		}

		<T> T get(TypeReference<T> tr) {
			if (tr.type instanceof Class<?>)
				return ((Class<T>) tr.type).cast(map.get(tr));// tr<String>
			else
				return ((Class<T>) ((ParameterizedType) tr.type).getRawType()).cast(map.get(tr)); // tr<List<String>>
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
		map.put(new TypeReference<String>() {
		}, "123");
		map.put(new TypeReference<Integer>() {
		}, 1);
		map.put(new TypeReference<List<String>>() {
		}, Arrays.asList("1", "2", "3")); // List<String>
		map.put(new TypeReference<List<Integer>>() {
		}, Arrays.asList(1, 2, 3));// List<Integer>

		System.out.println(map.get(new TypeReference<String>() {
		}));
		System.out.println(map.get(new TypeReference<Integer>() {
		}));
		System.out.println(map.get(new TypeReference<List<String>>() {
		}));
		System.out.println(map.get(new TypeReference<List<Integer>>() {
		}));
		// 이러한 단점을 보완하기위해 SuperTypeToke 을 알아보자.
	}
}
