package br.com.rafaelmurata.jdbc.test;

import java.util.List;

import br.com.rafaelmurata.jdbc.dao.ContactDAO;
import br.com.rafaelmurata.jdbc.model.Contact;

public class TestList {

	public static void main(String[] args) {

		ContactDAO dao = new ContactDAO();
		List<Contact>  contacts = dao.getList();
		
		for (Contact contact : contacts) {
			System.out.println("contact Name: " + contact.getName());
			System.out.println("contact Email: " + contact.getEmail());
			System.out.println("contact Adress: " + contact.getAdress());
			System.out.println("contact DateOfBirth: " + contact.getDateOfBirth().getTime());

		}
	}

}
