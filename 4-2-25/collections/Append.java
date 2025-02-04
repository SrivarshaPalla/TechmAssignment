package collections;
import java.util.LinkedList;
public class Append {
	
	
	public class AppendToLinkedList {
		 public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<>();
		 list.add("A");
	     list.add("B");
	     list.add("C");
	     list.add("k");
	     list.add("g");
	     
	     System.out.println("Original LinkedList: " + list);
	     list.add("m");
	     System.out.println("after appending "+ list);
	}
	}

}
