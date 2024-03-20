package t5_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class T2_Test {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("성명", "홍길동");
		map.put("나이", "25");
		map.put("성별", "남자");
		map.put("주소", "서울");
		System.out.println("1.크기 : "+map.size());
		System.out.println("1.toString : "+map);
		System.out.println();
		
		// 검색?
		System.out.println("성명 : "+map.get("성명"));
		String age = "나이";
		System.out.println("나이 : "+map.get(age));
		System.out.println("성별 : "+map.get("성별"));
		System.out.println("주소 : "+map.get("주소"));
		System.out.println();
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(11, "홍길동");
		map2.put(13, "김말숙");
		map2.put(21, "고인돌");
		map2.put(15, "이기자");
		map2.put(19, "강감찬");
		map2.put(17, "오사랑");
		
		// entrySet()
		System.out.println("번호\t성명");
		System.out.println("-----------------------");
		for(Entry<Integer, String> en: map2.entrySet()) {
			System.out.print(en.getKey()+"\t"+en.getValue()+"\n");
		}
		System.out.println("-----------------------");
		System.out.println();
		
		// key만 출력 : keySet() - Set으로 받음
		Set<Integer> key = map2.keySet();
		for(Integer k : key) {
			System.out.println("key : " + k + ", value : "+map2.get(k));
		}
		System.out.println();
		
		// 값만 출력 : values() - Collection 으로 받음
		Collection<String> val = map.values();
		System.out.println("값 : "+ val);
		System.out.println();
		
		System.out.println("key : "+map.keySet());
		System.out.println("value : "+map.values());
		System.out.println();
		
		// Iterator
		Iterator<Entry<Integer,String>> it = map2.entrySet().iterator(); // entrySet은 Entry타입으로 받음, Entry<키,값>
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
