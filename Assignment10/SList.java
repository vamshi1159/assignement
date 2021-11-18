package Assignments.Assignment10;

public class SList<T> {
     Node<T> head;
     Node<T> tail;
    SListIterator sListIterator;

    public SList() {
       this.head=null;
       this.tail=null;
       sListIterator=new SListIterator(this);
    }

    public SListIterator iterator()
    {
        System.out.println("iterator");
        return sListIterator;
    }


    @Override
    public String toString() {
        SListIterator iterator=this.iterator();
        StringBuilder sb=new StringBuilder("[");
        while(iterator.hasNext())
        {
            sb.append(iterator.next().toString());
            if(iterator.hasNext())
            {
                sb.append(",");
            }

        }
        sb.append("]");
        return sb.toString();
    }
}
