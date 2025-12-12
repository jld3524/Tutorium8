
package h2;

public class SimpleList {

    public Node head;

    public SimpleList() {
        head = new Node(Integer.MIN_VALUE); 
        head.next = null;
    }

    public Node getFirst() {
        return head.next; 
    }

    public Node getLast() {
        Node current = head.next;
        if (current == null) return null;

        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public void append(int newValue) {
        Node newNode = new Node(newValue);

        
        if (head.next == null) {
            head.next = newNode;
            return;
        }

        Node last = getLast();
        last.next = newNode;
    }

    public Node findFirst(int value) {
        Node current = head.next;
        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public boolean insertAfter(int preValue, int newValue) {
        Node pos = findFirst(preValue);
        if (pos == null) {
            return false; 
        }

        Node newNode = new Node(newValue);
        newNode.next = pos.next;
        pos.next = newNode;

        return true;
    }

    public boolean delete(int value) {
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }
}