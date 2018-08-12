package com.sean.unit17;

import java.util.Map;

import com.sean.unit17.SlowMap.Entry;

public class MapEntry<K,V> implements Map.Entry<K,V> {

	private K key;
	private V val;
	public MapEntry(K key,V val) {
		// TODO Auto-generated constructor stub
		this.key=key;
		this.val=val;
		
	}
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return val;
	}

	@Override
	public V setValue(V value) {
		// TODO Auto-generated method stub
		this.val=value;
		
		return this.val;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return key+"="+val;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (key==null ? 0: key.hashCode())^(val==null ? 0 : val.hashCode());
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof Entry)) 
			return false;
		Entry me=(Entry) obj;
		return (key == null ? me.getKey()==null : key.equals(me.getKey())) &&
				(val==null ? me.getValue()==null : val.equals(me.getValue()));
	}
}
