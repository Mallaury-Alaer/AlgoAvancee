package tp5;

import java.util.Map;

public class TreeNode<K,V> implements Map.Entry<K,V> {
	
	K key;
	V value;
	TreeNode<K, V> left, right;
	
	TreeNode(K key, V value){
		this.key=key;
		this.value=value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public V setValue(V value) {
		// TODO Auto-generated method stub
		this.value=value;
		return value;
	}

}
