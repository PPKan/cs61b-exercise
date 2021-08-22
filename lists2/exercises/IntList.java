public class IntList {
    
    public int item;
    public IntList rest;

    public IntList(int i, IntList r) {
        item = i;
        rest = r;
    }

    public static void main(String[] args) {
        IntList k = new IntList(1, null);
        k.rest = new IntList(2, null);

        System.out.println(k.item);
        System.out.println(k.rest.item);
    }
}