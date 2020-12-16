import java.util.*;

class BinaryTreeDemo {
  TreeNode root;
  Queue<TreeNode> q = new LinkedList<TreeNode>();
  public BinaryTreeDemo(int data) {
    root = new TreeNode(data);
    q.add(root);
  }

  public void add(int data) {
    TreeNode newNode = new TreeNode(data);
    TreeNode lastChild = q.peek();
    if(lastChild.left == null) {
      lastChild.left = newNode;
    }else {
      lastChild.right = newNode;
      q.poll();
    }
    q.add(newNode);
  }

  public void preOrderTraversalRecursive(TreeNode root) {
    if(root != null) {
      
      System.out.println(root.data);
      preOrderTraversalRecursive(root.left);
      preOrderTraversalRecursive(root.right);
    }
  }
   public void inOrderTraversalRecursive(TreeNode root) {
    if(root != null) {
      
      inOrderTraversalRecursive(root.left);
      System.out.println(root.data);
      inOrderTraversalRecursive(root.right);
    }
  }
   public void postOrderTraversalRecursive(TreeNode root) {
    if(root != null) {
      
      postOrderTraversalRecursive(root.left);
      postOrderTraversalRecursive(root.right);
      System.out.println(root.data);
    }
  }
}

class TreeNode {
  TreeNode left = null;
  TreeNode right = null;
  int data;
  public TreeNode(int data) {
    this.data = data;
  }
}