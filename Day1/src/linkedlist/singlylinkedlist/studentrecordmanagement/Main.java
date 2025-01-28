package linkedlist.singlylinkedlist.studentrecordmanagement;

public class Main {
    public static void main(String[] args) {
        Student s= new Student();
        s.addNode(1,"Akshit",23,'A');
        s.addNode(2,"Deepak",22,'F');
        s.addNode(3,"Ujjwal",22,'F');
        s.addNode(4,"Viraj",22,'F');
        s.show();

        s.deletenode(4);
        System.out.println("After Deletion ------------------- ");
        s.show();

        s.insertAtHead(7,"Rishi",23,'B');
        System.out.println("After Insertion--------------------");
        s.show();

        s.insertAtTail(8,"Elvish Yadav",23,'C');
        System.out.println("After Insertion--------------------");
        s.show();

        s.insertAtPos(4,10,"Dhruv Rathee",32,'F');
        System.out.println("After Insertion--------------------");
        s.show();

    }
}

