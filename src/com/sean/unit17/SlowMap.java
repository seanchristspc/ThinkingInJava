package com.sean.unit17;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SlowMap<K,V> extends AbstractMap<K, V> {
	
	private List<K> keys=new ArrayList<K>();
	private List<V> values=new ArrayList<V>();
	
	public V put(K key,V value){
		V oldValue=get(key);	//The old value or null
		if(!keys.contains(key)){
			keys.add(key);
			values.add(value);
		}else{
			values.set(keys.indexOf(key), value);
		}
		return oldValue;
		
	}
	public V get(Object key){
		//key is type Object,not K
		if(!keys.contains(key))
			return null;
		return values.get(keys.indexOf(key));
	}
	
	static class Entry<K,V> implements Map.Entry<K, V>{
		private K key;
		private V val;
		public Entry(K key,V val) {
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
	Set<java.util.Map.Entry<K, V>> set;
	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		set=new HashSet<Map.Entry<K,V>>();
		Iterator<K> ki=keys.iterator();
		Iterator<V> vi=values.iterator();
		while(ki.hasNext()){
			set.add(new Entry<K, V>(ki.next(),vi.next()));
		}
		return set;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlowMap<String, String> m=new SlowMap<String, String>();
		m.putAll(Countries.capitals(15));
		System.out.println(m);
		System.out.println(m.get("CAMEROON"));
		System.out.println(m.entrySet());

	}

}
