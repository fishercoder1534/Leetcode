import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	public Queue<Integer> queue1;
	public Queue<Integer> queue2;
	public int flag;
	public int size;
	    public MyStack() {
	        queue1=new LinkedList<Integer>();
	        queue2=new LinkedList<Integer>();
	        flag=1;
	        size=0;
	    }
	    
	    public void push(int x) {
	        if(flag==1){
	        	queue1.offer(x);
	        }else{
	        	queue2.offer(x);
	        }
	        size++;
	    }
	    
	    public int pop() {
	    	int value;
	        if(flag==1){
	        	while(queue1.size()>1){
	        		queue2.offer(queue1.poll());
	        	}
	        	value=queue1.poll();
	        	flag=2;
	        }else{
	        	while(queue2.size()>1){
	        		queue1.offer(queue2.poll());
	        	}
	        	value=queue2.poll();
	        	flag=1;
	        }
	        size--;
	        return value;
	    }
	    
	    public int top() {
	    	if(flag==1){
	        	while(queue1.size()>1){
	        		queue2.offer(queue1.poll());
	        	}
	        	int value=queue1.poll();
	        	queue2.offer(value);
	        	flag=2;
	        	return value;
	        }else{
	        	while(queue2.size()>1){
	        		queue1.offer(queue2.poll());
	        	}
	        	int value=queue2.poll();
	        	queue1.offer(value);
	        	flag=1;
	        	return value;
	        }
	    }
	    
	    public boolean empty() {
	        return size==0?true:false;
	    }
}
