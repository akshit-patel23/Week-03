package linkedlist.singlylinkedlist.studentrecordmanagement;

public class Student {
    static class Node{
        int RollNo;
        String Name;
        int age;
        char grade;

        Node next;
        public Node(int RollNo, String Name, int age,char grade){
            this.RollNo=RollNo;
            this.Name=Name;
            this.age=age;
            this.next=null;
        }

    }
    Node head= null;
    Node tail=null;

    public  void addNode(int RollNo, String Name, int age,char grade){
        Node newNode =new Node(RollNo, Name,  age, grade);

        if(head==null){
            head=newNode;
            tail=newNode;

        }
        else{
            tail.next=newNode;
            tail=newNode;
        }


    }
    public void show(){
        Node t=head;
        while(t!=null){
            System.out.println(t.Name);

            t=t.next;
        }
    }

    public void deletenode(int roll){

       if(head.RollNo==roll){
           head=head.next;
       }
        Node prev= head;
       Node temp=head.next;
       while (temp!=null){

           if(temp.RollNo==roll){
               prev.next=temp.next;
           }

           prev=temp;
           temp=temp.next;
       }

    }

    public void insertAtHead(int RollNo, String Name, int age,char grade){
        Node newHead=new Node(RollNo, Name, age, grade);

        newHead.next=head;
        head=newHead;
    }
    public void insertAtTail(int RollNo, String Name, int age,char grade){
        Node newTail = new Node(RollNo, Name, age, grade);

        Node t=head;
        while(t.next!=null){

            t=t.next;
        }
        t.next=newTail;
        newTail.next=null;
    }
    public void insertAtPos(int Pos,int RollNo, String Name, int age,char grade){
        Node newNode= new Node(RollNo, Name,  age, grade);
        Node t=head;
        Node temp=head;
        while(Pos>1){
            temp=t;
            t=t.next;
            Pos--;
        }
        temp.next=newNode;
        newNode.next=t;
    }
}
