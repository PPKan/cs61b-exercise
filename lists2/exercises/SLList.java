package exercises;
/**
 * An SLList is a list of integers, which hides the terrible truth 
 * of the nakedness within.
 */
public class SLList {

    private static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /** The first item (if it exists) is at sentinel.next */
    private IntNode sentinel;
    private int size;
    private int last;

    public SLList() {
        sentinel = new IntNode(64, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(64, null);
        sentinel.next = new IntNode(x, null);
        last = x;
        size += 1;
    }

    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        IntNode p = sentinel;
        last = x;
        size += 1;

        /** Move p until it reaches the end of the list. */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** return the first item of the list */
    public int getFirst() {
        return sentinel.next.item;
    }

    public int getLast() {
        return last;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.size());
        System.out.println(L.getFirst());
        System.out.println(L.getLast());

    }
    
}