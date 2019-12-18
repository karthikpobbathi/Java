package com.cg.pl;

import java.util.Scanner;

import com.cg.bean.Book;
import com.cg.bean.CD;
import com.cg.bean.Item;
import com.cg.bean.Journal;
import com.cg.bean.Video;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item it;
		int idNo,copies;
		String title;
		int age,yearOfPublished;
		String director,genre;
		int year;
		String authorName,artist;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item ID\t:\t");
		idNo=sc.nextInt();
		System.out.println("Enter no of Copies of Items\t:\t");
		copies=sc.nextInt();
		System.out.println("Enter Item Title\t:\t");
		title=sc.next();
		
		System.out.println("Select any one option\t:\t");
		System.out.println("1.Book\t2.Journal\n3.Video\t4.CD");
		int ch=sc.nextInt();
		do {
			switch(ch)
			{
			case 1:
					System.out.println("Enter Author Name\t:\t");
					authorName=sc.next();
					System.out.println("Enter Age of Author\t:\t");
					age=sc.nextInt();
					it=new Book(idNo,title,copies,authorName,age);
					System.out.println(it);
					break;
			case 2:
				System.out.println("Enter Author Name\t:\t");
				authorName=sc.next();
				System.out.println("Enter Age of Author\t:\t");
				age=sc.nextInt();
				System.out.println("Enter published year\t:\t");
				yearOfPublished=sc.nextInt();
				it=new Journal(idNo,title,copies,authorName,age,yearOfPublished);
				System.out.println(it);
				break;
			case 3:
				System.out.println("Enter Director Name\t:\t");
				director=sc.next();
				System.out.println("Enter Genre of Movie/Video\t:\t");
				genre=sc.next();
				System.out.println("Enter Release year\t:\t");
				year=sc.nextInt();
				it = new Video(idNo,title,copies,director,genre,year);
				System.out.println(it);
				break;
			case 4:
				System.out.println("Enter Artist Name\t:\t");
				artist=sc.next();
				System.out.println("Enter Genre\t:\t");
				genre=sc.next();
				it=new CD(idNo,title,copies,artist,genre);
				System.out.println(it);
				break;
			default :
				System.out.println("Select valid option\t:\t");
				break;
			}
			System.out.println("1.Book\t2.Journal\n3.Video\t4.CD\n5.Exit");
			ch=sc.nextInt();
		}while(ch!=0);

	}

}
