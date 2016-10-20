package tp5;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class BinarySearchTree<K extends Comparable <K>,V> implements Map<K,V>{
	
	TreeNode<K,V> node;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		if(node == null){
			node = new TreeNode<K, V>(key, value);
			return value;
		}
		return put(node, key, value);
	}
	
	private V put(TreeNode<K,V> node, K key, V value){
		if(key.compareTo(node.getKey()) == 1){
			if(node.right == null){
				node.right = new TreeNode<K, V>(key,value);
				return value;
			}
			return put(new TreeNode<K, V>(node.right.key,node.right.value), key, value);
		}else if(key.compareTo(node.getKey()) == -1){
			if(node.left == null){
				node.left = new TreeNode<K,V>(key,value);
				return value;
			}
			return put(new TreeNode<K,V>(node.left.key, node.left.value), key, value);
		}else{
			V save = node.value;
			node.value=value;
			return save;
		}
	}

	@Override
	public V remove(Object key) {
		if(node == null){
			return null;
		}else if((int)key < (int)node.getKey()){
			
		}
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
