package t6_Stack_Queue;

import java.util.Stack;

public class T1_Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("1.크기 : "+stack.size());
		System.out.println("1.내용 : "+stack);
		System.out.println();
		
		// 자료 삽입(push)
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		stack.push(6);
		
		System.out.println("2.크기 : "+stack.size());
		System.out.println("2.내용 : "+stack);
		System.out.println();
		
		// 바로 아래 자료 쳐다보기 : peek()
		System.out.println("3.바로 아래 자료 : "+stack.peek());
		System.out.println("3.크기 : "+stack.size());
		System.out.println("3.내용 : "+stack);
		System.out.println();
		
		// 자료 검색하기 : search()
		System.out.println("4. 7: "+stack.search(7)+"번째 위치함"); // 위에서부터 봤을 때 7이 위치하는 순서: 2 (인덱스가 아니므로 1부터 시작)
		System.out.println("4. 3: "+stack.search(3)+"번째 위치함");
		System.out.println("4. 6: "+stack.search(6)+"번째 위치함");
		System.out.println("4. 10(없는 자료): "+stack.search(10)+"번째 위치함");
		System.out.println();
		
		// 자료 꺼내기(pop)
		System.out.println("5 : "+stack.pop());
		System.out.println("5 : "+stack.pop());
		System.out.println("5 : "+stack.pop());
		System.out.println("5 : "+stack.pop());
		System.out.println("5 : "+stack.pop());
		
		System.out.println("5.크기 : "+stack.size());
		System.out.println("5.내용 : "+stack);
		System.out.println();
		
		// 스택의 내용 공백 체크 : empty() --> type: boolean
		System.out.println("5. "+stack.empty());
		
	}
}
