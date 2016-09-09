import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Stack<Integer> stack=new Stack<>();
		stack.push(22);
		stack.push(77);
		stack.push(22);
		stack.push(88);
		stack.push(66);
		stack.push(99);
		stack.push(55);
		stack.push(44);
		Stack<Integer> s=sort(stack);
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
		



	}
	
	//Sort a stack, biggest items on top
	//at most one additional stack could be used, no other data structures
	
	public static Stack<Integer> sort(Stack<Integer> stack){
		Stack<Integer> s=new Stack<>();
		while(!stack.isEmpty()){
			int temp=stack.pop();
			while(!s.isEmpty() && s.peek()>temp){
				stack.push(s.pop());
			}
			s.push(temp);
			
		}
		return s;
	}
	public static Stack<Integer> sort2(Stack<Integer> stack){
		Stack<Integer> s=new Stack<>();
		while(!stack.isEmpty()){
			if(s.isEmpty()) s.push(stack.pop());
			int temp=stack.pop();
			while(!s.isEmpty()){
				if(temp<s.peek()){//it cannot be <= if there are two same numbers, unlimited loops
					stack.push(s.pop());
				}else{
					s.push(temp);
					break;
				}
			}
			if(s.isEmpty()) s.push(temp);
		}
		return s;
		
	}
	

}
