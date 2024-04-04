package t7_Comparable_Comparator;

import java.util.Comparator;

// 익명 이너클래스를 사용하여 객체를 비교
class Student3VO {
	int age; // 나이
	int classNumber; // 학급

	public Student3VO(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
}

/* 객체 비교
	Comparable() - 인터페이스 : 자기자신과 매개변수를 비교한다.
	compareTo() 메소드를 반드시 구현해야 한다.
*/
public class T1_객체비교3 {
	public static void main(String[] args) {
		// 익명 객체 구현방법1 (사용하고자 하는 메소드 안에서)
		Comparator<Student3VO> comp2 = new Comparator<Student3VO>() {
			
			@Override
			public int compare(Student3VO o1, Student3VO o2) {
				return o1.classNumber = o2.classNumber;
			}
		};		
	}
	// 익명 객체 구현방법2 (메인 바깥에서)
	public static Comparator<Student3VO> com2 = new Comparator<Student3VO>() {
		@Override
		public int compare(Student3VO o1, Student3VO o2) {
			
			return o1.classNumber = o2.classNumber;
		}
	};
}
