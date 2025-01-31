package stackandqueue.sortingstack;


public class Main {
    public static void main(String[] args) {
        StackSort stack=new StackSort();


        stack.recursive(20);
        stack.recursive(30);
        stack.recursive(10);
        stack.recursive(60);
        stack.recursive(90);


        stack.display();


    }
}
