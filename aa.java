// import java.util.Stack;
// class StackWithMin extends Stack<Integer> {
//   Stack<Integer> minStack;
//   public StackWithMin() {
//     minStack = new Stack<Integer>();
//   }

//   public void push(int val) {
//     if(val <= min()) minStack.push(val);
//     super.push(val);
//   }
//   public Integer pop() {
//     int val = super.pop();
//     if(val == min()) minStack.pop();
//     return val;
//   }
//   public int min() {
//     if(minStack.isEmpty()) return Integer.MAX_VALUE;
//     else return minStack.peek();
//   }
// }

// class StackWithMinNode extends Stack<StackNodeWithMin> {
//   public void push(int val) {
//     super.push(new StackNodeWithMin(val,Math.min(val,min())));
//   }

//   public int min() {
//     if(super.isEmpty()) return Integer.MAX_VALUE;
//     else return super.peek().min;
//   }
// }

// class StackNodeWithMin {
//   public int val;
//   public int min;
//   public StackNodeWithMin(int val,int min) {
//     this.val = val;
//     this.min = min;
//   }
// }
