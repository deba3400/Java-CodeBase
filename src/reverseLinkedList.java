public class reverseLinkedList {
    Node head;
    // create a node
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    // add node at head
    public void addAtHead(int data){
        Node newNode=new Node(data);
        if( head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void printLL(){
        if(head == null){
            System.out.println("LL is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+ "-->");

            currNode=currNode.next;
        }
        System.out.print("NULL");

    }
    public void addAtTail(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;

        }
        currNode.next=newNode;

    }
    public boolean isEmpty(){
//          if(head==null){
//              System.out.println("the linledlist is empty");
//          }
//          else{
//              System.out.println("the linkedlist is not empty");
//          }
        return head==null;


    }
    public void addAtIndex(int data, int index){
        if(head==null && index!=1) return ;
        if(head==null){
            Node newNode=new Node(data);
            head=newNode;
            return;
        }
        if(index==1){
            addAtHead(data);
            return;
        }
        int i=1;
        Node prev=null;
        Node curr=head;
        while(i<index && curr!= null){
            i++;
            prev=curr;
            curr=curr.next;
        }
        if(i!=index) return ;
        Node newNode=new Node(data);
        prev.next=newNode;
        newNode.next=curr;

    }

    public void removeAtHead(){

        if(!isEmpty()){
            head=head.next;
            return ;

        }
        else{
            return;
        }

    }

    public void removeAtTail(){
        if(head==null) return ;
        if(head!=null && head.next==null){
            removeAtHead();
            return ;
        }
        Node prev=head;
        Node temp=head.next;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;

        }
        prev.next=null;

    }
    public void removeAtIndex(int index){
        if(head==null) return ;
        if(index==1){
            removeAtHead();
            return;
        }
        Node prev=null;
        Node temp=head;
        int i=1;
        while(i<index && temp.next!=null){
            i++;
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        temp.next=null;

    }

    public void reverse(){

        if(head==null || head.next==null) return ;
        Node prev=head;
        Node curr=head.next;
//        Node newNext=curr.next;
        while(curr!=null){
            Node newNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newNext;
        }
        head.next=null;
        head=prev;


    }

    public static void main(String[] args) {
        reverseLinkedList list=new reverseLinkedList();
        list.addAtHead(23);
        list.addAtHead(40);
        list.addAtTail(59);
        list.addAtTail(45);
        list.addAtIndex(30,2);
        list.addAtIndex(100,1);
        list.addAtIndex(200,7);
////        list.removeAtHead();
//        list.removeAtTail();
//        list.removeAtTail();
//        list.removeAtIndex(3);
//        list.removeAtIndex(4);
//        list.removeAtIndex(1);
        list.printLL();
        System.out.println();
        list.reverse();
        list.printLL();

    }
}
