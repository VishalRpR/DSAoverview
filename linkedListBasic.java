import java.util.*;
public class linkedListBasic {

	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<>();
		
//		linkedList.push("a");
//		linkedList.push("b");
//		linkedList.push("c");
//		linkedList.push("d");
//		linkedList.push("e");
//		linkedList.pop();

//      linkedList.offer("a");
//      linkedList.offer("b");
//      linkedList.offer("c");
//      linkedList.offer("d");
//      linkedList.offer("e");
//      linkedList.poll();


   linkedList.add("a");
   linkedList.add("b");
   linkedList.add("c");
   linkedList.add("d");
   linkedList.add("e");
   linkedList.remove(3);
   
   linkedList.add(2,"m");
   
   System.out.println(linkedList.peekFirst());
   System.out.println(linkedList.peekLast());
   
		
		System.out.println(linkedList);
		

	}

}
