package Assignments.Assignment10;

public class Main {
    public static void main(String[] args) {
        SList<Integer> sList=new SList<>();
        SListIterator sListIterator= sList.iterator();
        sListIterator.add(1);
        sListIterator.add(2);
        sListIterator.add(4);
        sListIterator.remove(1);
        System.out.println(sList);
    }
}
