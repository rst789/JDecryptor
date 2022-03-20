public class LinkedList {

    /* ---------------Data Member-------------- */

    private NodePointer head;

    /* --------------Constructors-------------- */

    public LinkedList() {
        this.head = null;
    }

    /* -----------Getters and Setters---------- */

    public NodePointer getHead() {
        return head;
    }

    public void setHead(NodePointer head) {
        this.head = head;
    }

    /* ----------------------------------------- */

    public void addToFront(NodePointer newNode) {
        NodePointer temptr = head;
        if(head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        //System.out.println(head.getData() + " has been added to the beginning of the List.");
        //System.out.println("The list now: " + newNode);
    }

    public void addToTail(NodePointer newNode) {
        NodePointer temptr = head;
        if(head == null) {
            head = newNode;
        } else {
            while(temptr.getNext() != null) {
                temptr = temptr.getNext();
            }
            temptr.setNext(newNode);
            //System.out.println(newNode.getData() + " has been added to the end of the List.");
        }
    }

    public String toString(){
        NodePointer temptr = head;
        String str = new String();
        while(temptr != null){
            str = str + temptr.getData();
            temptr = temptr.getNext();
        }
        return str;
    }

}

