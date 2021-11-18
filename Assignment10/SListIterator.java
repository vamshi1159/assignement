package Assignments.Assignment10;

public class SListIterator<T> {
    Node<T> head;
    Node<T> tail;
    public SListIterator(SList sList) {
        this.head = sList.head;
        this.tail= sList.tail;
    }
    public boolean hasNext()
    {
        return this.head!=null;
    }
    public Object next()
    {
      Node temp=this.head;
      head=head.getNext();
      return  temp.getObject();
    }
    public void add(T data){
      System.out.println("added");
      Node newNode = new Node<T>(data);
      if(head==null){
        head = newNode;
        tail= newNode;
      }else {
        tail.next = newNode;
        tail = newNode;
      }
    }
    public void remove(int position){
      System.out.println("remove");
      if(head==null){
        return;
      }
      Node current = head;
      if(position==0){
        head = current.getNext();
      }
      for(int i=0;current!=null && (i<position-1);i++){
        current = current.getNext();
      }
      if(current==null || current.next==null){
        return;
      }
      Node temp = current.next.getNext();
      current.next = temp;
    }
  

}
