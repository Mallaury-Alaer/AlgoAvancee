package tp6;

import java.util.Map;

public class HashCouple implements Map.Entry{
	public String key;
	public int value;
	
	public HashCouple(String key, int value){
		this.key=key;
		this.value=value;
	}
	
	@Override
	public String getKey() {
		return this.key;
	}

	@Override
	public Object getValue() {
		return this.value;
	}

	@Override
	public Object setValue(Object value) {
		this.value = (int)value;
		return this.value;
	}

}
