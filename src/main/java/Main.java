import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();


        // TODO Setup
        System.out.println(tree.add(5));
        System.out.println(tree.add(4));
        System.out.println(tree.add(2));
        System.out.println(tree.add(3));
        System.out.println(tree.add(6));
        System.out.println(tree.add(1));


        // TODO AddUnique
        System.out.println("\n Unique");
        for (int n = 1; n <= 6; n++) {
            System.out.println((tree.contains(n)));
        }

        // TODO RandomAddRemove
        Random rnd = new Random();

        SortedSet<Integer> oracle = new TreeSet<Integer>();
        for (int n = 1; n <= 6; n++)
            oracle.add(n);

        for (int n = 0; n < 1000; n++) {
            int toAdd = rnd.nextInt(10);
            assertEquals(oracle.add(toAdd), tree.add(toAdd));
            int toRemove = rnd.nextInt(10);
            assertEquals(oracle.remove(toRemove), tree.remove(toRemove));
            int checkExists = rnd.nextInt(10);
            assertEquals(oracle.contains(checkExists), tree.contains(checkExists));
            assertEquals(oracle.size(), tree.size());
            assertEquals(oracle.toString(), tree.toString());
        }*/


        BinarySearchTree<String> stringTree = new BinarySearchTree<String>();
        stringTree.add("D");
        stringTree.add("A");
        stringTree.add("C");
        stringTree.add("A");
        stringTree.add("B");
        System.out.println(stringTree);
        System.out.println("Size: 4, " + stringTree.size());
        System.out.println("true " + stringTree.contains("C"));

    }
}
