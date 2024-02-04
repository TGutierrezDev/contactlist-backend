package com.guti.contactlist;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;

	Contact(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Contact))
			return false;
		Contact contact = (Contact) o;
		return Objects.equals(this.id, contact.id) && Objects.equals(this.name, contact.name)
			       && Objects.equals(this.email, contact.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name, this.email);
	}

	@Override
	public String toString() {
		return "Contact{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.email + '\'' + '}';
	}
}
