package examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stack_Max_Element_Test {
	Stack_Max_Element stackMax = new Stack_Max_Element();
	
	@Test
	public void push() {
		stackMax.push(10);
		stackMax.push(1);
		stackMax.push(20);
		stackMax.push(70);
		stackMax.push(30);
		assertEquals(70,stackMax.maxNumber());
		stackMax.pop();//30
		assertEquals(70,stackMax.maxNumber());
		stackMax.pop();//10
		assertEquals(20,stackMax.maxNumber());
		stackMax.pop();//20
		assertEquals(10,stackMax.maxNumber());
		stackMax.pop();//1
		assertEquals(10,stackMax.maxNumber());
	}

}
