package t9_exam;

import java.util.ArrayList;

// 데이터 설계 : 큰 그릇을 만들고 VO 만들기 -> VO 담기
// VO에 자료를 넣고 VO를 ArrayList에 넣는다
public class Test1Run {
	public static void main(String[] args) {
		// ArrayList 에서 VO에 있는 모든 객체를 관리하려고 할 때 (이름이면 String, 나이면 Age... << 한개의 자료만 다룸)
		ArrayList<Test1VO> vos = new ArrayList<>(); // VO를 사용하기 위해 그릇 만들기... (타입을 VO 타입으로 줌)
		
		Test1VO vo = null; // 1.vo를 선언만 해줌
		
		vo = new Test1VO(); // 2.객체를 따로따로 만들어줘야 함
		vo.setName("홍길동");
		vo.setAge(20);
		vo.setGender("남자");
		vo.setAddress("서울");		
		vos.add(vo);
		
		vo = new Test1VO();
		vo.setName("김말숙");
		vo.setAge(29);
		vo.setGender("여자");
		vo.setAddress("청주");		
		vos.add(vo);
		
		vo = new Test1VO();
		vo.setName("이기자");
		vo.setAge(33);
		vo.setGender("남자");
		vo.setAddress("제주");		
		vos.add(vo);
		
		for(Test1VO v : vos) {
			System.out.println(v);
			// Test1VO vo = new Test1VO(); 로 한번만 선언하게 되면 set에 입력한 데이터가 전부 같은 객체를 가리키고 있기 때문에 마지막에 넣은 데이터만 출력 됨(얕은복사)
		}
	}
}
