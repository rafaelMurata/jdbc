package br.com.rafaelmurata.jdbc.test;

import java.util.Calendar;

import br.com.rafaelmurata.jdbc.dao.ContactDAO;
import br.com.rafaelmurata.jdbc.model.Contact;

public class TestChange {

	public static void main(String[] args) {

		Contact c = new Contact();
		c.setId(Long.valueOf(1));
		c.setName("Rafael Murataaaaaaaa");
		c.setEmail("rafael.murata@gmail.com");
		c.setAdress("Av Luiz Carlos Berrini");
		c.setDateOfBirth(Calendar.getInstance());
		
		ContactDAO dao = new ContactDAO();
		dao.change(c);
		System.out.println("contact changed");
	}

}
