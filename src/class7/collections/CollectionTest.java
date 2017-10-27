package class7.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class CollectionTest {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("siva");
		c.add("kumar");

		System.out.println(c);

		Stack<String> stack = new Stack<String>();// LIFO
		stack.add("a");
		stack.add("b");
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
	}

}
