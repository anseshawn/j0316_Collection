package t6_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class T2_Queue {
	public static void main(String[] args) {
		/* 예외처리 미포함 */
		Queue<Integer> queue = new LinkedList<Integer>();
		
		System.out.println("1.크기 : "+queue.size());
		System.out.println("1.내용 : "+queue);
		System.out.println();
		
		// 자료의 삽입 : add()
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		System.out.println("2.크기 : "+queue.size());
		System.out.println("2.내용 : "+queue);
		System.out.println();
		
		// 바로 아래 자료 쳐다보기 : element()
		System.out.println("3.바로아래자료 : "+queue.element());
		System.out.println("3.크기 : "+queue.size());
		System.out.println("3.내용 : "+queue);
		System.out.println();
		
		// 꺼내기 : remove()
		System.out.println("4.꺼내기 : "+queue.remove());
		System.out.println("4.꺼내기 : "+queue.remove());
		System.out.println("4.꺼내기 : "+queue.remove());
		System.out.println("4.크기 : "+queue.size());
		System.out.println("4.내용 : "+queue);
		// System.out.println("4.꺼내기 : "+queue.remove()); // 예외 오류 발생
		System.out.println();
		
		/* 예외처리기능 포함 */
		Queue<Integer> queue2 = new LinkedList<Integer>();
		
		// 자료추가 : offer()
		queue2.offer(3);
		queue2.offer(4);
		queue2.offer(5);
		
		System.out.println("5.크기 : "+queue2.size());
		System.out.println("5.내용 : "+queue2);
		System.out.println();
		
		// 바로 아래 자료 쳐다보기
		System.out.println("6. "+queue2.peek());
		System.out.println("6.크기 : "+queue2.size());
		System.out.println("6.내용 : "+queue2);
		System.out.println();
		
		// 자료 꺼내기 : poll()
		System.out.println("7.꺼내기 : "+queue2.poll());
		System.out.println("7.꺼내기 : "+queue2.poll());
		System.out.println("7.꺼내기 : "+queue2.poll());
		System.out.println("7.꺼내기 : "+queue2.poll()); // remove에서 나던 오류를 예외 처리한 함수: poll()
		System.out.println("7.크기 : "+queue2.size());
		System.out.println("7.내용 : "+queue2);
		System.out.println();
	}
}
