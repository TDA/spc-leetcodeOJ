/**
* Created by schandramouli on 4/24/16.
*/
class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public Node() {
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
public class LinkedList {

    Node head;
    int counter = 0;
    Node end;

    LinkedList(){
        head = null;
        end = null;
    }


    public void add(int valToAdd){
        Node n = new Node(valToAdd);
        if(head == null){
            head = n;
            end = head;
        }
        else{
            end.next = n;
            end = end.next;
        }
        counter++;
    }

    public void printList(){
        Node nn = head;
        while(nn != null){
            System.out.print(nn.data+" ");
            nn = nn.next;
        }
        System.out.println("");
    }

    public void remove(int pos){
        if(pos>counter||pos<1){
            System.out.println("Position out of bounds "+pos);
            return;
        }
        if(pos == 1){
            head = head.next;
            counter--;
            return;
        }
        Node n = head;
        for(int i =0;i<pos-2;i++){
            n = n.next;
        }
        Node temp = n.next;
        n.next = temp.next;
        counter--;
    }

    public void insert(int DataToBeAdded, int pos){
        if(pos>counter||pos<1){
            System.out.println("Position out of bounds "+pos);
            return;
        }
        if(pos == 1){
            Node n = new Node(DataToBeAdded);
            n.next = head;
            head = n;
            counter++;
            return;
        }
        Node n = head;
        for(int i =0;i<pos-2;i++){
            n = n.next;
        }
        Node nn = new Node(DataToBeAdded);
        nn.next = n.next;
        n.next = nn;
        counter++;
    }

    public void reverse(){
        Node lastNode = head;
        Node current = new Node();
        //	current.next = lastNode;
        Node n = head;
        Node temp = null;
        for(int i = 0; i < counter; i++){
            current.data = n.data;
            current.next = temp;
            temp = current;
            // reset current
            current = new Node();
            n = n.next;

        }
        Node nn = temp;
        while(nn != null){
            System.out.print(nn.data+" ");
            nn = nn.next;
        }
        System.out.println();
        this.head = temp;
        this.end = lastNode;
    }

    @Override
    public String toString() {
        String s = "";
        Node n = this.head;
        while (n != null){
            s +=  " --> " + n.data;
            n = n.next;
        }
        return s;
    }

    public static void main(String args[]){
        LinkedList newList = new LinkedList();
        newList.add(5);
        newList.add(6);
        newList.add(7);
        newList.add(8);
        newList.add(9);
        newList.add(10);
        newList.add(11);
        newList.insert(20, 1);
        newList.insert(40, 20);
        newList.printList();
        System.out.println(newList);
        newList.reverse();
        System.out.println(newList);
    }
}

