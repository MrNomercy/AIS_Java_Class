package ais_library;

import java.awt.List;
import java.util.ArrayList;

public class Mylibrary_func {
	//List<String> Books = new ArrayList<String>();
	String Books[] = {};
	String Videos[] = {};
	String DVDs[] = {};
	String Lecturer[] = {};
	String GraduateStudent[] = {};
	String UnderGraduateStudent[] = {};
	
	private String add_new_book(String tittle,String author,String publisher,String ISBN,String edition) 
	{
		Books.add(tittle);
		Books.add(author);
		Books.add(publisher);
		Books.add(ISBN);
		Books.add(edition);
	}

}
