package com.stream_api;

import java.lang.foreign.Linker.Option;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
	public static void main(String[] args) {

		// count()
		Stream<Integer> res = Stream.of(10, 20, 30);
		System.out.println(res.count()); // 3

		// sorted()
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(50);
		l1.add(30);
		l1.add(20);
		l1.add(40);
		System.out.println(l1);

		// convert list into stream api
		Stream<Integer> res1 = l1.stream();
//	    Stream<Integer> res2 = res1.sorted();
//	    res2.forEach(x -> System.out.println(x));

		// descending to ascending order
		Stream<Integer> res3 = res1.sorted(Comparator.reverseOrder());
		res3.forEach(x -> System.out.println(x));

		// collect()
		Stream<Integer> res4 = Stream.of(10, 20, 30, 40);

		// convert into list
//	    List<Integer> res5 = res4.collect(Collectors.toList());
//	    System.out.println(res5);

		// convert into set
		Set<Integer> res6 = res4.collect(Collectors.toSet());
		System.out.println(res6);

		// filter()
		Stream<Integer> a1 = Stream.of(10, 20, 30, 40);
//	    a1.forEach(x -> System.out.println(x));
		Stream<Integer> a2 = a1.filter(x -> x > 10);
		a2.forEach(x -> System.out.println(x));

		System.out.println("----------");
		// map()
		Stream<Integer> b1 = Stream.of(10, 20, 30);
//	    b1.forEach(x -> System.out.println(x));
		Stream<Integer> b2 = b1.map(a -> a + 10);
		b2.forEach(x -> System.out.println(x));

		System.out.println("---------");
		// reduce()
		Stream<Integer> c1 = Stream.of(10, 20, 30);
//	    c1.forEach(x -> System.out.println(x));
		Optional<Integer> c2 = c1.reduce((a, b) -> a + b);
		System.out.println(c2);
		System.out.println(c2.get());

		// min() and max()
		System.out.println("-------------");
		Stream<Integer> d1 = Stream.of(5, 10, 15, 50, 100);
//	    d1.forEach(x -> System.out.println(x));
//	    Optional<Integer> e1 = d1.min((a,b) -> a.compareTo(b));
//	    System.out.println(e1);
//	    System.out.println(e1.get());

		Optional<Integer> f1 = d1.max((a, b) -> a.compareTo(b));
		System.out.println(f1);
		System.out.println(f1.get());

	}
}
