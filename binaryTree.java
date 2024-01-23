class Node
  {

    int data;
    Node left;
    Node right;
    void Node(int data)
    {
this.data = data;
      this.left = null;
      this.right = null;
      
      
    }
  }
main()
  {
Node n = new Node(10);
  n.left = new Node(8);
  n.right = new Node(11);
  
  
  }
