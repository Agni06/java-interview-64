boolean ContainsLoop(LinkedList linkedList)
{
  LinkedList node = linkedList.head;

Set<LinkedList.node> nodeVisitSet = new HashSet<>();
while(node != null)
  {
if(nodeVisitSet.contains(node))
{return true;
}
    nodeVisitSet.add(node);
    node  = node.next;
    
    
    
  }
return false;

  
  }
