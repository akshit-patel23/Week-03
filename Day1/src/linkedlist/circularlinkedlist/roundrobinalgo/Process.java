package linkedlist.circularlinkedlist.roundrobinalgo;

public class Process {
    static class Node{
        int id;
        int bursttime;
        int priority;
        Node next;
        static int size;

        int qt=3;
        int arrival=0;
        int currtime=0;
        public Node(int id, int bursttime, int priority){
            this.id=id;
            this.bursttime=bursttime;
            this.priority=priority;
            this.next=null;
            size=size+1;
        }
    }
    private Node head;
    private Node tail;
    private Node current;
    private int size;

    public void addAttail(int id, int bursttime, int priority){
        Node newNode= new Node(id,bursttime,priority);
        size++;
        if(tail==null){
            head=tail=newNode;

            tail.next=head;

        }
        else{
            tail.next=newNode;
            tail=newNode;
            newNode.next=head;
        }

    }
    public void execution(){
        Node temp;
        temp=head;
        do{
            System.out.println("Process id :"+temp.id+" Burst time : "+temp.bursttime+" priority : "+ temp.priority);
            int time= temp.bursttime-temp.qt;
            temp.bursttime=time;
            if(temp.bursttime<=0){
                int id=temp.id;
                deleteProcess(id);
                System.out.println("Task with id "+id+" ended");
            }
            temp=temp.next;
        }
        while(size>0);
    }
    public void show(){
        if(head==null){
            System.out.println("No processes");
        }
        else{
            Node temp=head;
            do{
                System.out.println("Process id -"+temp.id +" Burst Time :"+temp.bursttime+" priority "+temp.priority);
                System.out.println("Size: "+size);
                temp=temp.next;

            }
            while(temp!=head);
        }
    }
    public void deleteProcess(int id){


        if(head.next==null){
            head=null;
        }
        else{
            Node temp=head.next;
            while(true){
                Node temp1=temp.next;
                  int processid=temp1.id;
                if(processid==id){
                    temp.next=temp1.next;
                    size--;
                    break;
                }
                temp=temp.next;
            }
        }


    }
}
