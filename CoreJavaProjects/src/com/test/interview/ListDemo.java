package com.test.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.stream.Collectors;

class Per {
	public String curr;
	public String col;
	public Double total;
	
	public Per(String curr, String col, Double total) {
		super();
		this.col = col;
		this.curr = curr;
		this.total = total;
	}
	public String getCurr() {
		return curr;
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getCol() {
		return col;
	}
	public void setCol(String col) {
		this.col = col;
	}
}

public class ListDemo {
	public static void main(String[] args) {
		/*List<Integer> subList = new ArrayList<Integer>();
		List<Integer> subList1 = new ArrayList<Integer>();
		subList.add(1);
		subList.add(2);
		subList.add(3);
		subList.add(4);
		
		subList1 = subList.subList(1, 4);
		subList1.remove(2);
		
		System.out.println(subList1);*/
		Per per1 = new Per("XXX", "NONE", null);
		Per per2 = new Per("AUD", "CB", 22.0);
		Per per3 = new Per("CNY", "AX", 10.0);
		Per per4 = new Per("SGD", "AZ", 15.0);
		Per per5 = new Per("CNY", "AX", 11.0);
		Per per6 = new Per("SGD", "GH", 2.0);
		
		List<Per> subList = new ArrayList<>();
		subList.add(per1);
		subList.add(per2);
		subList.add(per3);
		subList.add(per4);
		subList.add(per5);
		subList.add(per6);
		
		Map<String, Double> collect = subList.stream().filter(x -> x.getTotal()!=null).collect(Collectors.groupingBy(Per::getCurr,
		        Collectors.summingDouble(Per::getTotal)));
		System.out.println(collect);
		
		/*Map<String, Map<String, Double>> collect2 = subList.stream().collect(Collectors.groupingBy(Per::getCurr, Collectors.groupingBy(Per::getCol,
		        Collectors.summingDouble(Per::getTotal))));*/
		Map<String, Map<String, Double>> collect2 = subList.stream().filter(x -> x.getTotal()!=null).collect(Collectors.groupingBy(Per::getCurr, Collectors.groupingBy(Per::getCol,
		        Collectors.summingDouble(Per::getTotal))));
		System.out.println(collect2);
		Map<String, Double> map = collect2.get("AUD");
		map.put("QQQ", 11.2);
		System.out.println(collect2);
		
	}

}
