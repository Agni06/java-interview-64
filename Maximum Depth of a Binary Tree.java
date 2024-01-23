int CalcMaxDepth(Node node)
{
  int left  = CalcMaxDepth(node.left);
int right = CalcMaxDepth(node.right);
if(left>right)
{
return left+=1;
}
else
{
return right+=1;
  
  
}
  }
