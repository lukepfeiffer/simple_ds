
/*
 * Simple HashMap class to help me understand how they work.
 * Contains most of the default HashMap functions
 */
public class HashMap<V> {
	private V [] values;
	
	@SuppressWarnings("unchecked")
	public HashMap(int size){
		values = (V[])new Object[size];;
	}
	
	@SuppressWarnings("unchecked")
	public HashMap(){
		values = (V[])new Object[20];;
	}
	
	
	/*
	 * Add key value pair to hashMap
	 */
	public void put(String key, V value) {
		int hash = key.hashCode();
		int index = hash%values.length;
		
		//Check for collisions
		if( values[index] == null) {
			values[index] =  value;
		} else {
			//If collision, double size of array and copy contents
			int length = values.length*2;
			@SuppressWarnings("unchecked")
			V [] array = (V[])new Object[length];
			copyContents(array);
			this.values = array;
			hash = key.hashCode();
			index = hash%values.length;
			values[index] =  value;
		}
	}
	
	//Check if key exists in HashMap
	public boolean hasKey(String key) {
		int hash = key.hashCode();
		int index = hash%values.length;
		if(values[index] != null) {
			return true;
		}
		
		return false;
	}
	
	//Copy contents of HashMap into a new array, used to double size.
	private void copyContents( V [] array ) {
		for(int i = 0; i < array.length; ++i) {
			array[i] = values[i];
		}
	}
	
	//Return the value of a given key.
	public V get(String key) {
		int hash = key.hashCode();
		int index = hash%values.length;
		return values[index];
	}
	
	//Check if hashMap is empty.
	public boolean isEmpty() {
		for(int i = 0; i < values.length; ++i) {
			if( values[i] != null) {
				return false;
			}
		}
		
		return true;
	}
}