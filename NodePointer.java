public class NodePointer {

    /* --------------Data Members------------- */

    private char data;
    private NodePointer next;

    /* --------------Constructors-------------- */
    public NodePointer() {}

    public NodePointer(char dt) {
        this.data = dt;
    }

    /* -----------Getters and Setters---------- */

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public NodePointer getNext() {
        return next;
    }

    public void setNext(NodePointer next) {
        this.next = next;
    }
}