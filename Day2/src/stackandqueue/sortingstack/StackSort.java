package stackandqueue.sortingstack;


import java.util.Stack;


public class StackSort{
    Stack <Integer> stack1=new Stack<>();
    public void recursive(int n){
        if(stack1.isEmpty()||stack1.peek()>=n){
            stack1.push(n);
        }else {
            int k = stack1.pop();
            recursive(n);
            stack1.push(k);
        }


    }
    public  void display(){
        while(!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }
    }
}
