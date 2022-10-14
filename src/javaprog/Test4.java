package javaprog;

import java.util.Stack;

public class Test4 {

	public static void main(String[] args) {
		Stack<Object> st= new Stack<Object>();
		st.push(20);
		st.push(10);//last in
		System.out.println(st.pop());//10
		System.out.println(st.pop());//20

	}

}
