public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        head = null;
    }

    // Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar
    // nodos a la lista.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void printValues() {
        Node runner = head;
        while (runner != null) {
            System.out.println("[" + runner.value + "]--->");
            runner = runner.next;
        }
    }

    public void remove() {
        Node runner = head;
        while (runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null;
    }

    public int find(int value) {
        Node runner = head;
        while (runner.value != value) {
            runner = runner.next;
        }
        return runner.value;
    }

    public void removeAt(int n) {
        Node runner = head;
        if (n == 0) {
            head = runner.next;
        } else {
            for (int i = 0; i < (n - 1); i++) {
                runner = runner.next;
            }
            runner.next = runner.next.next;
        }
    }
}