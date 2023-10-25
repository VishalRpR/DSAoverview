import java.util.*;
public class priorityQbasic{

	public static void main(String[] args) {
		Queue<Double> queue= new PriorityQueue<>(Collections.reverseOrder());
		
		queue.offer(4.6);

		queue.offer(4.5);
		queue.offer(3.5);
		queue.offer(4.1);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		

	}

}

