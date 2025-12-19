package com.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Method {
	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);

		// convert list into stream api
		Stream<Integer> res = l1.stream();
		System.out.println(res); // java.util.stream.ReferencePipeline$Head@65b3120a
		res.forEach(x -> System.out.println(x));

		List<String> l2 = Arrays.asList("a", "b", "c");
		Stream<String> res2 = l2.stream();
		System.out.println(res2); // java.util.stream.ReferencePipeline$Head@2dda6444
		res2.forEach(x -> System.out.println(x));

	}

}
