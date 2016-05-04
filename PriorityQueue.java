public interface PriorityQueue {

    public void add( Object x ); //adds an item to this priority queue

    public boolean isEmpty(); //returns true if stack is empty, otherwise returns false

    public Object peekMin(); //returns smallist item stored in this priority queue without removing it

    public Object removeMin(); //removes and returns the smallest item stored in this priority queue

    //smallest item == highest priority

}

	
