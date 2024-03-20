package t4_Set;

import java.util.TreeSet;

/*
	TreeSet : Set계열 자료구조, 집합자료구조, HashSet과의 차이점: 순서 없이 들어가 있는 자료를 꺼낼 때는 오름차순 정렬되어 꺼내준다.
*/
public class T2_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		
//		for(int i=0; i<10; i++) {
//			treeSet.add((int)(Math.random()*100)+1);
//		}
//		treeSet.add(5);
//		treeSet.add(5);
		
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		
		System.out.println("1.크기 : "+treeSet.size());
		System.out.println("1.treeSet: " + treeSet);
		System.out.println();
		
		System.out.println("2.first() : "+treeSet.first());
		System.out.println("3.last() : "+treeSet.last());
		System.out.println("4.lower() : "+treeSet.lower(26)); // 내가 입력한 수치보다 작은 데이터중에서 가장 큰값 출력
		System.out.println("5.higher() : "+treeSet.higher(26));
		System.out.println("6.floor() : "+treeSet.floor(26)); // 내가 입력한 수치와 같거나 작은 데이터 중에서 가장 큰 값
		System.out.println("7.ceiling() : "+treeSet.ceiling(26)); // 내가 입력한 수치와 같거나 큰 데이터 중에서 가장 작은 값
		System.out.println();
		
		// pollFirst() : 원소들 중에서 작은 원소값 순으로 꺼내어준다
		System.out.println("8.size() : "+treeSet.size());
		System.out.print("8.pollFirst() : ");			
		for(int i=0; i<25; i++) {
			System.out.print(+treeSet.pollFirst()+ " ");			
		}
		System.out.println();
		
		// 위의 pollFirst에서 자료를 다 꺼내줘서 다시 삽입
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		
		// pollLast() : 원소들 중에서 큰 원소값 순으로 꺼내어준다
		System.out.println("9.size() : "+treeSet.size());
		System.out.print("9.pollLast() : ");			
		for(int i=0; i<25; i++) {
			System.out.print(+treeSet.pollLast()+ " ");			
		}
		System.out.println();
	}
}
