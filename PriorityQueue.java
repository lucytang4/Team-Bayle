public interface PriorityQueue {

    public void add( Comparable x ); //adds an item to this priority queue

    public boolean isEmpty(); //returns true if stack is empty, otherwise returns false

    public Comparable peekMin(); //returns smallist item stored in this priority queue without removing it

    public Comparable removeMin(); //removes and returns the smallest item stored in this priority queue

    //smallest item == highest priority

}

	
