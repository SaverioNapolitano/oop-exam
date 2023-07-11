package com.saverionapolitano.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {
	public static Map<String, Integer> wordFrequency(String filename) throws IOException {
		Map<String, Integer> map = new HashMap<>();
		for (String word : lineToWords(getLines(filename).toString())) {
			if(!map.containsKey(word)){
				map.put(word, 1);
			} else {
				map.put(word, map.get(word) + 1);
			}
		}
		return map;
	}

	public static List<String> getLines(String filename) throws IOException {
		return Files.readAllLines(Path.of(filename));
	}

	public static List<String> lineToWords(String line) {
		return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
	}
}
