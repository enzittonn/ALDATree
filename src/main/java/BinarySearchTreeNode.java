// Nyamgarig Naranbaatar nyna2000

/**
 * Detta är den enda av de tre klasserna ni ska göra några ändringar i. (Om ni
 * inte vill lägga till fler testfall.) Det är också den enda av klasserna ni
 * ska lämna in. Glöm inte att namn och användarnamn ska stå i en kommentar
 * högst upp, och att paketdeklarationen måste plockas bort vid inlämningen för
 * att koden ska gå igenom de automatiska testerna.
 * <p>
 * De ändringar som är tillåtna är begränsade av följande:
 * <ul>
 * <li>Ni får INTE byta namn på klassen.
 * <li>Ni får INTE lägga till några fler instansvariabler.
 * <li>Ni får INTE lägga till några statiska variabler.
 * <li>Ni får INTE använda några loopar någonstans. Detta gäller också alterntiv
 * till loopar, så som strömmar.
 * <li>Ni FÅR lägga till fler metoder, dessa ska då vara privata.
 *
 *
 *
 * <li>Ni får INTE låta NÅGON metod ta en parameter av typen
 * BinarySearchTreeNode. Enbart den generiska typen (T eller vad ni väljer att
 * kalla den), String, StringBuilder, StringBuffer, samt primitiva typer är
 * tillåtna.
 * </ul>
 *
 * @param <T>
 * @author henrikbe
 */


public class BinarySearchTreeNode<T extends Comparable<T>> {
    private T data;
    private BinarySearchTreeNode<T> left;
    private BinarySearchTreeNode<T> right;

    public BinarySearchTreeNode(T data) {
        this.data = data;
    }


    public boolean add(T data) {
        if (this.data.compareTo(data) < 0) {
            if (left == null) {
                left = new BinarySearchTreeNode<>(data);
                return true;
            } else
                return left.add(data);
        } else if (this.data.compareTo(data) > 0) {
            if (right == null) {
                right = new BinarySearchTreeNode<>(data);
                return true;
            } else return right.add(data);
        }
        return false;
    }


    public BinarySearchTreeNode<T> remove(T data) {
        if (data.compareTo(this.data) > 0) {
            if (left != null) {
                left = left.remove(data);
            }
        } else if (data.compareTo(this.data) < 0) {
            if (right != null) {
                right = right.remove(data);
            }
        } else {
            if (left != null && right != null) {
                this.data = this.right.findMin();
                this.right = this.right.remove(this.data);
            } else return (left != null) ? left : right;
        }
        return this;
    }

    private T findMin() {
        if (left != null)
            return left.findMin();
        return this.data;
    }


    public boolean contains(T data) {

        int element = data.compareTo(this.data);

        if (element == 0)
            return true;
        else if (element > 0 && left != null)
            return left.contains(data);
        else if (element > 0 && left == null)
            return false;
        else if (element < 0 && right != null)
            return right.contains(data);
        else if (element < 0 && right == null)
            return false;
        return false;
    }


    public int size() {
        int theSize = 1;

        if (left != null)
            theSize += left.size();
        if (right != null)
            theSize += right.size();

        return theSize;
    }


    public int depth() {
        int rightDepth = 0;
        int leftDepth = 0;

        if (left != null)
            leftDepth += left.depth() + 1;

        if (right != null)
            rightDepth += right.depth() + 1;

        return (leftDepth > rightDepth) ? leftDepth : rightDepth;
    }


    public String toString() {
        String string = "";

        if (right != null) {
            string += right.toString() + ", ";
        }
        string += this.data;

        if (left != null) {
            string += ", " + left.toString();
        }
        return string;
    }

}