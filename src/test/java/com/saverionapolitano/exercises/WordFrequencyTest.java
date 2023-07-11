package com.saverionapolitano.exercises;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {

	final String filename2 = "/Users/saverionapolitano/IdeaProjects/exam/src/main/resources/file.txt";
	final String filename = "/Users/saverionapolitano/IdeaProjects/exam/src/main/resources/james-joyce-ulysses.txt";

	@Test
	void wordFrequency() {
		try {
			assertEquals(Map.of("item", 1, "word", 2, "wor", 1), WordFrequency.wordFrequency(filename));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}