package ch11.ex;

import java.util.*;

class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5);	// 용량(capacity)이 5인 Vector를 생성한다.
		v.add("1");
		v.add("2");
		v.add("3");



		print(v);

		v.trimToSize();	// 빈 공간을 없앤다.(용량과 크기가 같아진다. 당연히 사이즈는 용량보다 클 수 없기에 용량(배열의 크기)을 줄이는것이다)

		System.out.println("=== After trimToSize() ===");
		print(v);

		v.ensureCapacity(6); //현재 용량이 인자보다 작을 경우만 처리함
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);

		v.setSize(7); //용량이 사이즈 보다 커야 하므로 내부적으로 용량은 원래 사이즈의 2배인 12로 만들고 사이즈를 7로 만듦.
		System.out.println("=== After setSize(7) ===");
		print(v); //데이터는 3개만 있지만 사이즈를 7로 만들었기에 빈값들 출력
		
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size :" + v.size());
		System.out.println("capacity :" + v.capacity());
	}
}
