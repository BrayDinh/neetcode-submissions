class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class LinkedList {

    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        head = new ListNode(-1);
        tail = head;
    }

    public int get(int index) {
        ListNode curr = head.next; // since using dummy node
        int i = 0;
        while(curr != null){
            if (i == index)return curr.val;

            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        if (newNode.next == null){
            tail = newNode;
        } 
    }

    public void insertTail(int val) {
        ListNode newNode = new ListNode(val);
        tail.next = newNode;
        tail = newNode;
    }

    public boolean remove(int index) {
        int i = 0;
        ListNode cur = head;
        while (i < index && cur != null){
            i++;
            cur = cur.next;
        }
        
        if (cur != null && cur.next != null){
            if (cur.next == tail){ // if the next node is the tail, remove it by making the current node tail
                tail = cur;
            }
            cur.next = cur.next.next; // remove the final node from the list, making tail.next point to null
            return true;
        }
        return false; // failed to remove the note at given index
    }

    public ArrayList<Integer> getValues() {

        ArrayList<Integer> arr = new ArrayList<>();
        ListNode cur = head.next;
        while (cur != null){
            arr.add(cur.val);
            cur = cur.next;
        }
        return arr;
    }
}
