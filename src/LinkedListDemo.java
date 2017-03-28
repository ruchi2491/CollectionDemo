import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> list=new LinkedList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add(null);
		//System.out.println(list);
		list.remove(0);
		list.add(null);
		//System.out.println(list);

		List<String> list1=new LinkedList<String>();
		list1.add("one");
		list1.add("two");
		list1.add("three");

		list.addAll(list1);
		//System.out.println(list);
		
		//System.out.println("Get a particular element"+list.get(3));
		
			
		
		System.out.println("using for loop...");
		//List traversal using Method-1(for loop)
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i)+" ");
		}
		
		System.out.println("Using Iterator...");	
		//List traversal using Method-2(Iterator)
		ListIterator<String> iterator=list.listIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		System.out.println("Linkedlist contains the elememt or not....");
		System.out.println(list.contains("3"));
		
		
		System.out.println();
		
		list.clear();
		System.out.println("list is cleared "+list);
		
		
	
		}
}

