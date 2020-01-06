package com.trendnxt.java;

public class BookDemo {
	Book objBooks[] ;BookDemo() {objBooks = new Book[12];}
	void createBooks(){objBooks[0] = new Book();objBooks[0].setName("Gone with the wind");objBooks[0].setPrice(500);/*Create the second book objectand set itsAttributes */objBooks[1] = new Book();objBooks[1].setName("Java Programming");objBooks[1].setPrice(300);}
	void showBooks(){for(int iIndex=0;iIndex< 2;iIndex++) {System.out.println(objBooks[iIndex].getName());System.out.println(objBooks[iIndex].getPrice());}}
	public static void main(String a[]){BookDemo objBookDemo= new BookDemo();objBookDemo.createBooks();objBookDemo.showBooks();}
}
