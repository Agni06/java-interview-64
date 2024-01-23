void IterativePreorder(Node node)
{
Stack<Integer> st = new Stack<>();
st.push(node.data);
while(!st.isEmpty())
  {
System.out.print(st.peek() + " " );
    st.pop();
    if (node.right != null) {
                st.push(node.right);
            }
    if(node.left!=null)
    {
st.push(node.left);
      
      
    }
  }

  
  }
