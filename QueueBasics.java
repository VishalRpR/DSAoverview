import java.util.*;

public class QueueBasics {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<>();
		
		queue.offer("karen");
		queue.offer("chad");
		queue.offer("kumar");
		queue.offer("harold");
		
		queue.poll(); 
//		
//		System.out.println(queue.isEmpty());
//		System.out.println(queue.size());
		System.out.println(queue.contains("harold"));
		System.out.println(queue.peek());
		
		System.out.println(queue);

	}

}
