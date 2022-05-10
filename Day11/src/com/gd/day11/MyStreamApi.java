package com.gd.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface test
{
  public void print(int a);
  //public void printb();
  
}

//Lambda Expression
//Stream APi --it is container that take the data and filter or update it
public class MyStreamApi {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(4);
		ls.add(-2);
		ls.add(5);
		ls.add(8);
		ls.add(-10);
		ls.add(11);
		// this is stream class object
		// we can iterate the steam
		//it will retrun of object stream
		//Employee e=new Employee();
	//	Stream<Integer> st=new Stream<Integer>();
		
		Stream<Integer> st = ls.stream();
		// it need the lamnda
		ls.stream().forEach((num) -> {
			//System.out.println(num);
		});
  //		System.out.println(st.max(null));
	//	st.

		test e= (a)-> {
				// TODO Auto-generated method stub
				System.err.println("hello java");
			};
		
		e.print(10);
		
		//
		// Exception in thread "main" java.lang.IllegalStateException: stream has
		// already been operated upon or closed
		// forEach--it will iterate the value one by one and you can print it
		ls.stream().forEach((num) -> {
			//System.out.println(num);
		});

		// taking new stream
		// filter of value
		// filter --it will take lambda extressiona and filter it
		// you can remove the datatype of variable also
		// you can remove the if in filter block becuasseit is exprression
        //it will take any opeator 		
		
		//map--it is used update the value
		List<Integer> newlist=ls.stream().filter(num -> num > 0)
		           .map(num->num*num)
		           .sorted(Collections.reverseOrder())
                   .collect(Collectors.toList());
         //it will collect the data and return it
		//collectors.toist--it will make the list of daya and collect will return
        //System.out.println(newlist);           
		 newlist.forEach(e1->System.out.println(e1));
		// once stream is iterated you cannot run the stream again
		// .stream() --each time it will give the new stream only

		// 1,2,3,7,9,10
		// filter
		// sort
		// update the data
		//List 
		for (Integer num : ls) {
			// printing the positive number
			//System.out.println(onlypostivienumber(num));
		}
	}

	public static int onlypostivienumber(int num) {
		if (num > 0) {
			return num;
		}
		return 0;
	}
}
