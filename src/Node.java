public class Node<D> {
    D data;
    Node next;
    public Node (){
        this.data = null;
    }
    public Node(D variable){
        data = variable;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public D getData(){
        if (data != null)
            return data;
        else{return null;}

    }
    public void setData(D data){
        this.data = data;
    }
}
