package h2;

public class H2_main {

    public static void main(String[] args) {

        SimpleList myList = new SimpleList();

        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);

        System.out.println("Liste nach append:");
        printList(myList);

        myList.insertAfter(45, 4);
        System.out.println("Liste nach insertAfter(45,4):");
        printList(myList);

        Node found = myList.findFirst(45);
        System.out.println("findFirst(45) liefert Node mit Wert: " +
                (found != null ? found.value : "null"));

        myList.delete(45);
        System.out.println("Liste nach delete(45):");
        printList(myList);
    }

    public static void printList(SimpleList list) {
        Node current = list.head.next;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) System.out.print(", ");
            current = current.next;
        }
        System.out.println();
    }
}