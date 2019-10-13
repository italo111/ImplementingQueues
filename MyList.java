/************************************************************** 
            Purpose/Description: <This program has the objective of making 
            programs more efficient, by reducing its time complexity.
	    its purpose is to implement a queue with an additional method 
	    called myPush(num). this method will push numbers from the front
	    instead of the back> 
            Author’s Panther ID: <5660995>           
            Certification:  
            I hereby certify that this work is my own and none of it is
            the work of any other person.  
        **************************************************************/
package central;

/**
 *
 * @author OWNER
 */
public class MyList {
    private Node front,rear;
    private int size;
    private class Node {
        Object key;
        Node next;
    }
    public MyList(){
        front = null;
        rear = null;
        size = 0;
    }
    public Object myPop(){
        Object temp = front.key;
        front = front.next;
        if(isEmpty()){
            rear = null;
        }
        size--;
        return temp;
    }
    public void myInject(Object item){
        Node oldRear = rear;
        rear = new Node();
        rear.key = item;
        rear.next = null;
        if(isEmpty()){
            front = rear;
        }
        else{
            oldRear.next = rear;
            
        }
        size++;
    }
    public void myPush(Object num){
        Node frontOld = front;
        front = new Node();
        front.key = num;
        if(isEmpty()){
            front.next = null;
            rear = front;
        }
        else{
            front.next = frontOld;
            
        }
    }
    public boolean isEmpty(){
        return(size==0);
    }
    
}
