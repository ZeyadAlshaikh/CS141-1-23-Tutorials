

public class OrderedPair <K,V> implements Pair<K,V>{

    private K key; 
    private V value;
    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "OrderedPair [key=" + key + ", value=" + value + "]";
    } 

    
    
    
}
