import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue{

    private ArrayList<Comparable> _data;
    
    public ArrayPriorityQueue() {
	_data = new ArrayList<Comparable>();
    }

    public void add( Comparable x ) {
	if( isEmpty() || _data.get(_data.size()-1).compareTo(x) < 0) {
	    _data.add(x);
	    return;
	}
	for( int i = 0; i < _data.size(); i++ ) {
	    if( _data.get(i).compareTo(x) > 0 ){
		_data.add( i,x );
		break;
	    }
	}
    }

    public boolean isEmpty() {
	return _data.size() == 0;
    }

    public Comparable peekMin() {
	return _data.get(0);
    }

    public Comparable removeMin() {
	Comparable tmp = _data.get(0);
	_data.remove(0);
	return tmp;
    }
    
    
    public String toString(){
        String s = "[";
        for (int i = 0; i < _data.size(); i++){
            s += _data.get(i) + ",";
        }
        return s + "]";
    }

    public static void main( String[] args ) {
        ArrayPriorityQueue bayle = new ArrayPriorityQueue();
	bayle.add(3);
	bayle.add(4);
	bayle.add(7);
	bayle.add(1);
	System.out.println("look at me!\n" + bayle);
	bayle.add(100);
	bayle.add(-34);
	bayle.add(3);
	System.out.println("look at me now!\n" + bayle);
	bayle.removeMin();
	bayle.removeMin();
	bayle.removeMin();
	System.out.println("I'm meltingggggggggg\n" + bayle);
	bayle.removeMin();
	bayle.removeMin();
	System.out.println("I'm meltingggggggggg:(\n" + bayle);
	bayle.removeMin();
	bayle.removeMin();
	bayle.removeMin();
	bayle.removeMin();
	System.out.println("I'm meltingggggggggg\n" + bayle);	    

    }
}
