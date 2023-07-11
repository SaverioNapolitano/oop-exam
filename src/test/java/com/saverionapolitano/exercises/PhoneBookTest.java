package com.saverionapolitano.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
	PhoneBook phoneBook;
	@BeforeEach
	void setUp(){
		phoneBook = new PhoneBook(List.of(
				new PhoneBook.Person("Mario", "Rossi", "1234567890"),
				new PhoneBook.Person("Luigi", "Rossi", "0987654321"),
				new PhoneBook.Person("Marco", "Bianchi", "1234509876")
				));
	}

	@Test
	void searchByLastname() {
		assertEquals(Optional.of(new PhoneBook.Person("Mario", "Rossi", "1234567890")),
				phoneBook.searchByLastname("Rossi"));

	}

	@Test
	void searchByNameAndLastname() {
		assertEquals(Optional.of(new PhoneBook.Person("Luigi", "Rossi", "0987654321")),
				phoneBook.searchByNameAndLastname("Luigi", "Rossi"));
	}
}