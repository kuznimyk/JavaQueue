public class Queue {
    Node head;
    Node tail;

    public Queue(){
        head = null;
        tail = null;
    }

    public void  enqueue(Node n){
        if (tail != null){
            tail.next = n;
            tail = n;
        }
        else{
            head = n;
            tail = n;
        }
    }
    public Node dequeue(){
        if (head != null && head.next != null) {
            Node res = head;
            head = head.next;
            return res;
        }
        else if (head != null){
            Node res = head;
            head = tail = null;
            return res;
        }
        else{
            return new Node();
        }
    }
    public Node front(){
        if (head != null) {
            return head;
        }
        else{
            return new Node();
        }
    }
}
