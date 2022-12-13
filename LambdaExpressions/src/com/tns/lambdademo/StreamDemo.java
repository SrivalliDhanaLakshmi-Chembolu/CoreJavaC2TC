package com.tns.lambdademo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> ll = new ArrayList<Item>();
		ll.add(new Item(1,"Samsung",53000));
		ll.add(new Item(2,"Sansui",35000));
		ll.add(new Item(3,"LG",56000));
		ll.add(new Item(4,"Whirlpool",45000));
		ll.add(new Item(5,"haeir",75000));
	ArrayList<Double> ip=(ArrayList<Double>)ll.stream().filter((Item) -> Item.getPrice()>= 53000).map((Item)-> Item.getPrice()).collect(Collectors.toList());
      ip.forEach((price) -> System.out.println(price));
      
      
	}

}
