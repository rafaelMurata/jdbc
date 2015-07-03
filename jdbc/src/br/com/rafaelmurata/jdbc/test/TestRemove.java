package br.com.rafaelmurata.jdbc.test;

import br.com.rafaelmurata.jdbc.dao.ContactDAO;
import br.com.rafaelmurata.jdbc.model.Contact;

public class TestRemove {

	public static void main(String[] args) {
		Contact c = new Contact();
		c.setId(Long.valueOf(1));
		
		ContactDAO dao = new ContactDAO();
		dao.remove(c);
		System.out.println("contact removed");

	}

}
