package t1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T1_Basic {
	public static void main(String[] args) {
		// ArrayList<String> arrayList = new ArrayList<String>();
		// ArrayList<String> arrayList = new ArrayList<>();
		List<String> arrayList = new ArrayList<>(); // ArrayList 는 List(인터페이스)계열에 속해있기 때문에 List로 정의 가능
		// List<String> arrayList = new ArrayList<>(20); // 용량(capacity()) 저장 가능 - 기본은 10
		
		System.out.println("1. arrayList 크기 : " + arrayList.size());
		System.out.println("1. toString : " + arrayList.toString()); // 내용보기 (이미 오버라이드가 되어있기 때문에 주소 대신 값을 출력)
		System.out.println("1. toString : " + arrayList); // toString()은 자주 쓰기 때문에 생략 가능
		System.out.println();
		
		// 자료추가(add)
		arrayList.add("100");
		arrayList.add("홍길동");
		arrayList.add("Hong Kil Dong");
		arrayList.add("김말숙");
		arrayList.add("이기자");
		
		arrayList.add("홍길동"); // 인덱스로 관리하기 때문에 중복 허용
		System.out.println("2. arrayList 크기 : " + arrayList.size());
		System.out.println("2. toString : " + arrayList); // 순차적으로 입력
		System.out.println();
		
		// 특정위치(인덱스)에 자료 추가: .add(인덱스, 자료)
		arrayList.add(2,"소나무");
		System.out.println("3. arrayList 크기 : " + arrayList.size());
		System.out.println("3. toString : " + arrayList);
		System.out.println();
		
		// 검색: .get(인덱스)
		String name = arrayList.get(2); // 리턴 타입 = 제너릭
		System.out.println("4. name : "+name);
		System.out.println();
		
		// 변경: .set(인덱스, 자료)
		arrayList.set(2, "감나무");
		System.out.println("5. arrayList 크기 : " + arrayList.size());
		System.out.println("5. toString : " + arrayList);
		System.out.println();
		
		// 삭제: .remove(인덱스) or .remove("값")
		arrayList.remove(2);
		arrayList.remove("홍길동"); // 두 개중 앞에 있는 값이 지워짐(순차구조)
		System.out.println("6. arrayList 크기 : " + arrayList.size());
		System.out.println("6. toString : " + arrayList);
		System.out.println();
		
		List<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(0);
		for(int i=1; i<=5; i++) {			
			arrayList2.add(i,(i*100));
		}
		System.out.println("7. arrayList2 크기 : " + arrayList2.size());
		System.out.println("7. toString : " + arrayList2);
		System.out.println();
		
		// arrayList2.remove(200); // 그냥 숫자로 입력하면 입력한 숫자 대신 인덱스 번호로 인식해서 에러가 남		
		arrayList2.remove(new Integer(200)); // 실제 값을 삭제하려면 객체 형식으로 입력해야 함
		System.out.println("8. arrayList2 크기 : " + arrayList2.size());
		System.out.println("8. toString : " + arrayList2);
		System.out.println();
		
		// 향상된 for문을 이용한 ArrayList객체의 활용
		String str = "";
		for(String s: arrayList) {
			str += s + "/";
		}
		str = str.substring(0, str.length()-1);
		System.out.println("9. str : "+ str);
		System.out.println();
		
		// 일반 for문
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(i + "번지 : "+arrayList.get(i));
		}
		System.out.println();
		
		// 모든 자료 삭제: .clear()
		arrayList.clear();
		System.out.println("10. arrayList 크기 : " + arrayList.size());
		System.out.println("10. toString : " + arrayList);
		System.out.println();
		
		
		ArrayList<String> arrayList3 = new ArrayList<>();
		arrayList3.add("서울");
		arrayList3.add("청주");
		arrayList3.add("부산");
		arrayList3.add("제주");
		System.out.println("11. arrayList3 크기 : " + arrayList3.size());
		System.out.println("11. toString : " + arrayList3);
		System.out.println();
		
		// ArrayList객체의 내용을 모두 추가(합치기) : .addAll()
		arrayList.addAll(arrayList3);
		System.out.println("12. arrayList 크기 : " + arrayList.size());
		System.out.println("12. toString : " + arrayList);
		System.out.println();
		
		arrayList.addAll(1,arrayList3); // index 1번 앞에 내용 끼워넣기
		System.out.println("13. arrayList 크기 : " + arrayList.size());
		System.out.println("13. toString : " + arrayList);
		System.out.println();
		
		arrayList.addAll(arrayList); // 자기 객체에 자신의 내용을 추가할 수 있으나 타입이 맞아야 함
		System.out.println("14. arrayList 크기 : " + arrayList.size());
		System.out.println("14. toString : " + arrayList);
		System.out.println();
	}
}
