package com.bb.generics;

class Book {

}

class Phone {

}

public class IntroductionToGenerics1 {

	public static void main(String[] args) {
		Phone phone = new Phone();

		Parcel<Phone> parcel = new Parcel<Phone>();

		parcel.setObj(phone);

		System.out.println(parcel.getObj());

		Parcel<Book> parcelOfBook = new Parcel<Book>();
		Book book = new Book();

		parcelOfBook.setObj(book);

		System.out.println(parcelOfBook.getObj());

	}

}
