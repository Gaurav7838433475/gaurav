package javaprog;

import java.util.TreeMap;

public class TreeMapProg {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(10,"hi");
		map.put(20,"hello");
		map.put(20,"hello");
		map.put(5,"bye");
		map.put(3,"hello");
		map.put(4,null);//allowed
		map.put(2,null);//allowed
		System.out.println(map);
	}
	//data structure used in treemap is RED BLACK TREE
}
