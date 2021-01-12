package com.test.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		StreamObj obj1 = new StreamObj(1, "obj1");
		StreamObj obj2 = new StreamObj(2, "obj2");
		StreamObj obj3 = new StreamObj(3, "obj1");
		StreamObj obj4 = new StreamObj(4, "obj2");
		StreamObj obj5 = new StreamObj(5, "obj1");
		
		List<StreamObj> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		
		
		Map<String, List<StreamObj>> set=new HashMap<>();
		
		list.stream().filter(t->
		{
			if(set.containsKey(t.getName()))
			{
				List<StreamObj> list2 = set.get(t.getName());
				list2.add(t);
				return true;
			}
			else 
			{ 
				List<StreamObj> list2 =new ArrayList<>();
				list2.add(t);
				set.put(t.getName(),list2);
				return true;}
			}).collect(Collectors.toList());
		for(Entry<String, List<StreamObj>> s: set.entrySet())
		{
			System.out.println("--------------"+s.getKey());
			s.getValue().forEach(t->System.out.println(t.getNum()+" "));
		}
		
		List<String> str = new ArrayList<>();
		str.add("a");
		str.add("b");
		
		String collect = str.stream().map(String::valueOf).collect(Collectors.joining("','"));
		System.out.println(collect);
	}
}
