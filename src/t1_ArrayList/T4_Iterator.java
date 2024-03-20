package t1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class T4_Iterator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> vos = new ArrayList<>();
		for(int i=0; i<10; i++) {
			vos.add((int)(Math.random()*100)+1);
		}
		System.out.println("1.vos: " + vos);
		System.out.println();
		
		// 향상된 for문 = for ~ each문
		for(int vo : vos ) {
			System.out.print(vo+" ");
		}
		System.out.println("\n");
		
		// 수를 입력받아 vos에 들어있으면 '당첨' 그렇지 않으면 '다음 기회에...' 출력
		System.out.print("수를 입력하세요: ");
		int num = sc.nextInt();
		
		int cnt = 0;
		for(int i=0; i<vos.size(); i++) {
			// if(num == vos.get(i)) {
			if(vos.get(i).equals(num)) {
				System.out.println("당첨");
				break;
			}
			cnt++;
		}
		if(vos.size() == cnt) System.out.println("다음 기회에...");
		System.out.println("작업을 마칩니다.");
		System.out.println();
		
		// Iterator(반복지시자)로 vos객체를 꺼내기
		Iterator<Integer> it = vos.iterator();
		System.out.println("2.it : " + it);
		while(it.hasNext()) { // hasNext(): it안에 vos에서 가져온 자료가 있는지 묻기
			// hasMoreElement() 도 사용 가능
			int item = it.next(); // hasNext()
			System.out.print(item+" ");
		}
		System.out.println("\n");
		
		// 스트림(Stream)객체로 출력하기
		Stream<Integer> stream = vos.stream();
		stream.forEach(no -> System.out.print(no + " ")); // no: 자동으로 위에서 선언한 변수타입으로 지정해주기 때문에 타입을 따로 적어주지 않아도 됨
		// 변수 -> 변수가 처리할 내용 중괄호 사용 가능
		
		sc.close();
	}
}
