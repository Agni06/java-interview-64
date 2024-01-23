int CalcLeafCount(Node node)
{
  if(node == null)
{
  return 0;
  
}
if (node.left == null && node.right == null)
{
  return 1;
  
}
return CalcLeafCount(root.left) + CalcLeafCount(root.right);

  }
