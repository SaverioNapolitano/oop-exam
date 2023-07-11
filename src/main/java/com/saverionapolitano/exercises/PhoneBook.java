package com.saverionapolitano.exercises;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PhoneBook {

	public static class Person {
		String name;
		String lastname;
		String phone;

		public Person(String name, String lastname, String phone) {
			this.name = name;
			this.lastname = lastname;
			this.phone = phone;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Person person = (Person) o;
			return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(phone, person.phone);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, lastname, phone);
		}
	}

	List<Person> phoneBook;

	public PhoneBook(List<Person> phoneBook) {
		this.phoneBook = phoneBook;
	}

	public Optional<Person> searchByLastname(String lastname){
		return phoneBook
				.stream()
				.filter(person -> person.getLastname().contentEquals(lastname))
				.findFirst();
	}
	public Optional<Person> searchByNameAndLastname(String name, String lastname){
		return phoneBook
				.stream()
				.filter(person -> person.getLastname().contentEquals(lastname) && person.getName().contentEquals(name))
				.findFirst();
	}
}
