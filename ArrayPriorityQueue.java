import java.util.ArrayList;

public class ArrayPriorityQueue<T> {

    private ArrayList<T> _data;
    
    public ArrayPriorityQueue() {
	_data = new ArrayList<T>(10);
    }

    public void add( T x ) {
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

    public T peekMin() {
	return _data.get(0);
    }

    public T removeMin() {
	T tmp = _data.get(0);
	_data.remove(0);
	return tmp;
    }

    public static void main( String[] args ) {

    }
}
