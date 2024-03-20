package t1_ArrayList;

import java.util.ArrayList;
import java.util.List;

// List 객체를 배열로 변환 : toArray()
public class T2_toArray {
	public static void main(String[] args) {
		List<Integer> vos = new ArrayList<>();
		
		vos.add(10);
		vos.add(20);
		vos.add(30);
		vos.add(40);
		vos.add(50);
		
		System.out.println("1.vos : "+ vos);
		System.out.println();
		
		Object[] objects = vos.toArray();
		System.out.println("2.objects : "+objects);
		System.out.println();
		
		int cnt = 0;
		for(Object obj : objects) { // Object로 받았기 때문에 같은 타입으로 받아야함
			System.out.println("obj["+cnt+"] : "+obj + " , "+((Integer)obj + 10)); // 타입이 Object기 때문에 Integer로 다운캐스팅 후 연산 가능
			cnt++;
		}
		System.out.println();
		
		cnt = 0;
		Integer[] integers = vos.toArray(new Integer[vos.size()]); // 리스트 계열을 array계열로 변환할때 바꾸고자하는 배열로 지정한다
		// Integer로 받기 위해서 배열 형태를 Integer로 지정해줘야 함
		for(Integer ii : integers) {
			System.out.println("Integer["+cnt+"] : "+ii + " , "+(ii + 10));
			cnt++;
		}
		System.out.println();
		
		cnt = 0;
		Integer[] integers2 = vos.toArray(new Integer[0]); // 크기를 맞게 주지 않아도 알아서 들어온 자료 크기만큼 증가함
		for(Integer ii : integers2) {
			System.out.println("Integer2["+cnt+"] : "+ii + " , "+(ii + 10));
			cnt++;
		}
		System.out.println();
	}
}
