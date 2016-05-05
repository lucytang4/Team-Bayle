import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue{

    private ArrayList<Comparable> _data;
    
    public ArrayPriorityQueue() {
	_data = new ArrayList<Comparable>();
    }

    public void add( Comparable x ) {
	if( isEmpty() ) {
	    _data.add(x);
	    return;
	}

	for( int i = 0; i < _data.size(); i++ ) {
	    if( _data.get(i).compareTo(x) > 0 ) 
		_data.add( i,x );
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

    }
}
