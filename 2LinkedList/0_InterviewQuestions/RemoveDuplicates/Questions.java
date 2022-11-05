import java.util.HashSet;

public class Questions {
    void deleteDups(LinkedList ll) {
        // create a HashSet
        HashSet<Integer> hs = new HashSet<Integer>();
        // create a temperaty node which is pointing to head
        Node current = ll.head;
        // create a prev node whic is equal to null
        Node prev = null;
        // loop until current's next reference is not null
        while (current != null) {
            // save the value of current node to curval
            int curval = current.value;
            // check if curval is prsent in hashSet or not
            if (hs.contains(curval)) {
                // if present put next reference of prev to current's next
                prev.next = current.next;
                ll.size--;
            } else { // curval is not present then add it to hashSet
                hs.add(curval);
                // update the pointer if prev to current node
                prev = current;
            }
            // for proper looping update current -> current.next
            current = current.next;
        }
    }
}
