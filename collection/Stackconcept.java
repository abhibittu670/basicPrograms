package collection;
import java.util.Stack;

public class Stackconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//three function we have push,peek and pop in stack
		
		Stack<String> animals = new Stack<>();
        
		animals.push("lion");
		animals.push("dog"); 
		animals.push("horse"); 
		animals.push("dear"); 
		System.out.println("Stack: " + animals);
		//peek is used to peek and display last element which was inserted
		System.out.println(animals.peek());
		//last element which was inserted is pop out
		System.out.println(animals.pop());
		System.out.println(animals.peek());
		System.out.println("Stack: " + animals);
	}

}
