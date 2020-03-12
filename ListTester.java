public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.printValues();
        sll.remove();
        sll.remove();
        System.out.println("Elimin\u00e9 los \u00faltimos dos, por tanto, los imprimo de nuevo:");
        sll.printValues();
        System.out.println("Encuentra el primer nodo con el valor 10:");
        System.out.println(sll.find(10));
        sll.removeAt(2);
        System.out.println("Elimin\u00e9 el tercer nodo, por tanto, los imprimo de nuevo:");
        sll.printValues();
    }
}