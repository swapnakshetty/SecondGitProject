package examples;

import java.util.Stack;

public class Stack_Max_Element {
   Stack<Integer> mainStack = new Stack<Integer>();
   Stack<Integer> sideStack = new Stack<Integer>();
   
   public void push(int number){
	   if(mainStack.isEmpty())
	   {
		   mainStack.push(number);
		   sideStack.push(number);
	   } else{  
	   mainStack.push(number);
	   if(sideStack.peek() >= number){
		   sideStack.push(sideStack.peek());
	   } else {
		   sideStack.push(number);
	   }
	   }
    }
   
   public void pop(){
	  mainStack.pop();
	  sideStack.pop();
    }
   
	public int maxNumber(){
		return sideStack.peek();
	}
	
	
}
