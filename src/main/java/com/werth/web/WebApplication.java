package com.werth.web;

import generics.Book;
import generics.Library;
import generics.Media;
import generics.MediaType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		Library<Media> library = new Library();
		Book aFables = new Book("Aesop’s Fables", MediaType.BOOK, "A cock was once strutting up and down the farmyard\n" +
				"among the hens when suddenly he espied something shinning amid the straw. ‘Ho! ho!’ quoth he, ‘that’s for me,’ and\n" +
				"soon rooted it out from beneath the straw. What did it turn\n" +
				"out to be but a Pearl that by some chance had been lost in\n" +
				"the yard? ‘You may be a treasure,’ quoth Master Cock, ‘to\n" +
				"men that prize you, but for me I would rather have a single\n" +
				"barley-corn than a peck of pearls.’\n" +
				"Precious things are for those that can prize them.");


		library.addToBookshelf(aFables);

		if(library.getBookshelf().contains(aFables)); //// TODO: 12/26/20 add book methods through interface and get data through to React. 
		
	}


}
