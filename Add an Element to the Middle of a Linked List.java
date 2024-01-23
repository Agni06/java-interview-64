void Insert(LinkedList.Node insertPos, LinkedList.Node newNode)
{
LinkedList old = insertPos.next;
  insertPos.next = newNode;
  newNode.next = old;
  
  
}
