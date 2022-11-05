public class Question {
    //Question-2-> NthToLast
    Node nthToLast(LinkedList ll, int n){
        Node p1 = ll.head;
        Node p2 = ll.head;

        for (int i = 0; i < n; i++) {
            if (p2 == null) return null;
            p2 = p2.next;
        }
        while(p2 != null){
            p2 = p2.next;
            p1 = p1.next;
        }
        return p1;
    }
}