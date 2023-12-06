public class  doublyLinkedList{
    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=null;
        Node head =a;
        Node tail =f;
        displayDoublyLinkedList(head);
        reverseDisplyDoublyLinkedList(tail);
        
    }
    private static void displayDoublyLinkedList(doublyLinkedList.Node head) {
        Node currentNode = head;
        while (currentNode!=null) {
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }
    private static void reverseDisplyDoublyLinkedList(doublyLinkedList.Node tail){
        System.out.println();
        Node currentNode = tail;
        while (currentNode!=null) {
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.prev;
            
        }
    }
}