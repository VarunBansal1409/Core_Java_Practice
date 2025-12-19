package com.stream_api;

import java.util.stream.Stream;

public class StreamOf_Method {
	public static void main(String[] args) {

		// create a stream api using Stream.of()

		Stream<Integer> res = Stream.of(10, 20, 30, 40, 50, null);
		System.out.println(res); // java.util.stream.ReferencePipeline$Head@65b3120a
		res.forEach(x -> System.out.println(x));

		Stream<String> res1 = Stream.of("a", "b", "C");
		System.out.println(res1); // java.util.stream.ReferencePipeline$Head@2dda6444
		res1.forEach(x -> System.out.println(x));

	}
}
