package br.com.rafaelmurata.jdbc.test;

import java.util.Calendar;

import br.com.rafaelmurata.jdbc.dao.ContactDAO;
import br.com.rafaelmurata.jdbc.model.Contact;

public class TestAdd {

	public static void main(String[] args) {

		Contact c = new Contact();
		c.setName("Rafael Murata");
		c.setEmail("rafael.murata@gmail.com");
		c.setAdress("Av Luiz Carlos Berrini");
		c.setDateOfBirth(Calendar.getInstance());
		
		ContactDAO dao = new ContactDAO();
		dao.add(c);
		System.out.println("contact save");
	}

}
