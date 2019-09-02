class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;
    private class Node{
        private Object data;
        private Node next;
        public Node(Object input){
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }
    public void addFirst (Object input) {
        Node newNode = new Node(input);

        newNode.next = head;

        head = newNode;

        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast (Object input) {
        Node newNode = new Node(input);

        if(size == 0){
            addFirst(input);
        } else{
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    public String toString() {
        if(head == null){
            return "[]";
        }
        Node temp = head;
        String str = "[";
        while(temp.next != null){
            str += temp.data + ",";
            temp = temp.next;
        }
        str += temp.data;
        return str+"]";
    }
}
