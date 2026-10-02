class MyLinkedList {

    private static class ListNode{
        public int val;
        public ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    private ListNode dummy;
    private int size;

    public MyLinkedList() {
        dummy = new ListNode(-1);
        size = 0;
    }
    
    public int get(int index) {
       if (index < 0 || index >= size) return -1;
       int i = 0;
       ListNode cur = dummy.next;
       while (cur != null && i <= index){
        if (i == index){
            return cur.val;
        }
        else{
            cur = cur.next;
            i++;
        }
       }
       return -1;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        int i = 0;
        ListNode cur = dummy;
        ListNode newNode = new ListNode(val);

        while (i < index){
            cur = cur.next;
            i++;
        }
        newNode.next = cur.next;
        cur.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        int i = 0;
        ListNode cur = dummy;
        while (i < index){
            cur = cur.next;
            i++;
        }
        cur.next = cur.next.next;
        size--;
    }
}