import java.util.*;
import java.lang.*;
import java.io.*;
class Main
 {
	public static void main (String[] args)
	 {    
    //  int[] arr = {1,2,3,5,6,7};
   
       // int subsets = numofsubset(arr,6);
	       // System.out.println(subsets);

         //System.out.println("ARR LEN-->" + arr.length);

      //  StackWithMin st = new StackWithMin();
      //  st.push(10);
      //  st.push(5);
      //  st.push(39);
      //  st.push(1);
      //  //System.out.println(st.min());
      //  StackWithMin st2 = new StackWithMin();
      //  st2.push(10);
      //  st2.push(5);
      //  st2.push(39);
      //  st2.push(1);
      //  st2.pop();
      //  System.out.println(st2.min());
      // Stack<Integer> stack = new Stack<Integer>();
      // stack.push(2);
      // stack.push(5);
      // stack.push(1);
      // stack.push(10);
      // stack.push(12);
      // Stack<Integer> stack1 = sortStack(stack);
      // while(!stack1.isEmpty()) {
      //   System.out.println(stack1.pop());
      // }
      BinaryTreeDemo bTree = new BinaryTreeDemo(1);
      bTree.add(2);
      bTree.add(3);
      bTree.add(4);
      bTree.add(5);
      bTree.add(6);
      bTree.preOrderTraversalRecursive(bTree.root);
      System.out.println("---------------");
      bTree.inOrderTraversalRecursive(bTree.root);
      System.out.println("---------------");
      bTree.postOrderTraversalRecursive(bTree.root);
	 }
		 public static int numofsubset(int[] arr,int n) {
	     Arrays.sort(arr);
	     int count = 1;
	     for(int i=0; i<n-1;i++) {
	         while(arr[i]+1 == arr[i+1]) {
	             continue;
	         }
	         count++;
	     }
	     return count;
	 }

public static Stack<Integer> sortStack(Stack<Integer> s) {
  Stack<Integer> s2 = new Stack<Integer>();
  while(!s.isEmpty()) {
    int el = s.pop();
    while(!s2.isEmpty() && s2.peek() > el) {
      int el2 = s2.pop();
      s.push(el2);
    }
    s2.push(el);
  }

  while(!s2.isEmpty()){
    s.push(s2.pop());
  }
  return s;
}
   
}