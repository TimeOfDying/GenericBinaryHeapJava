package genericbinaryheap;

public class TestBinaryTree
{

    public static void main(String[] args) {

        String[] array = { "b", "a", "s", "e", "f"};
        BinaryHeap<String> bt = new BinaryHeap<>(array);

        System.out.println(bt.length());
        System.out.println(bt.peek());
        System.out.println(bt);
        System.out.println(bt.remove("s"));
        System.out.println(bt);
        System.out.println(bt.peek());

        while (!bt.isEmpty())
            System.out.println(bt.remove());
        System.out.println(bt.length());


    }
}