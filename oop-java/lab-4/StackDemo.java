
import java.util.ArrayList;            

class Stack {
    private ArrayList<Integer> items = new ArrayList<>(); 

    void push(int x) {                  
        items.add(x);                   
    }

    int pop() {                         
        return items.remove(items.size() - 1); 
    }

    int peek() {                        

        return items.get(items.size() - 1);
    }

    boolean isEmpty() {                 
        return items.isEmpty();
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();          
        s.push(10);                     
        s.push(20);                     
        System.out.println(s.pop());    
        System.out.println(s.peek());   
    }
}
