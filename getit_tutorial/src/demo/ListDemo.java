package demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		
		List<String> mylist=new ArrayList<String>();
		
		mylist.add("my");
		mylist.add(" name");
		mylist.add(" is");
		mylist.add(" pravendra");
		
		
		System.out.println(mylist);
		System.out.println(mylist.size());
		
		
		System.out.println(mylist.get(3));
		
		
		for(String temp : mylist){
			System.out.println(temp);
		}
		
		
	}
}
