

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/

  
	public static void levelOrder(Node root) {
    Queue<Node> q=new LinkedList<Node>();
      q.add(root);
      while(q.isEmpty()!=true)
      {
      if(root.left!=null)
      {
        q.add(root.left);
      }
      if(root.right!=null)
      {
        q.add(root.right);
      }
      System.out.print((q.remove()).data+" ");
      root=q.peek();
      }
    }
