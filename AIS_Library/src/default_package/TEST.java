package default_package;

import java.util.ArrayList;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList test_book = new ArrayList();
		ArrayList test_dvd = new ArrayList();
		ArrayList test_video = new ArrayList();
		ArrayList test_lecturer = new ArrayList();
		ArrayList test_grad = new ArrayList();
		ArrayList test_undergrad = new ArrayList();
		ArrayList test_loan = new ArrayList();
		
		Scanner testreader = new Scanner(System.in);
		
		char option = 'y';
		while(option=='y') 
		{
			System.out.println("Please choose an option:");
			System.out.println("1 for add library item");
			System.out.println("2 for add Patron");
			System.out.println("3 for add Loan");
			System.out.println("4 for add display information");
			int minioption = testreader.nextInt();
			switch(minioption) 
			{
			case 1: //minioption case 1 add library item;
				System.out.println("Please choose library item:");
				System.out.println("1 for add book");
				System.out.println("2 for add DVD");
				System.out.println("3 for add video");
				int liboption = testreader.nextInt();
				// library option
				switch(liboption) 
				{
				case 1:
					BOOK mybook = new BOOK();
					mybook.add_new_book();
					test_book.add(mybook.books);
					//System.out.println(testbook);
					break;
				case 2:
					DVD mydvd = new DVD();
					mydvd.add_new_dvd();
					test_dvd.add(mydvd.dvds);
					break;
				case 3:
					VIDEO myvideo = new VIDEO();
					myvideo.add_new_video();
					test_video.add(myvideo.videos);
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}
				break;
			
			case 2: //minioption case 2 add Patron;
				System.out.println("Please choose patron type:");
				System.out.println("1 for add lecturer");
				System.out.println("2 for add graduate student");
				System.out.println("3 for add undergraduate student");
				int patoption = testreader.nextInt();
				// patrons option
				switch(patoption) 
				{
				case 1:
					LECTURER mylecturer = new LECTURER();
					mylecturer.add_new_lecturer();
					test_lecturer.add(mylecturer.lecturers);
					break;
				case 2:
					GRAD mygrad = new GRAD();
					mygrad.add_new_grad();
					test_grad.add(mygrad.grads);
					break;
				case 3:
					UNDERGRAD myundergrad = new UNDERGRAD();
					myundergrad.add_new_undergrad();
					test_undergrad.add(myundergrad.undergrads);
					break;
				default:
					System.out.println("Invalid Input");
					break;
					
				}
				break;
				
			case 3: //minioption case 3 add Loan;
				LOAN myloan = new LOAN();
				myloan.add_new_loan();
				test_loan.add(myloan.loans);
				break;
				
			case 4: //minioption case 4 display info;
				System.out.println("Please choose information you want to display:");
				System.out.println("1 for display book information");
				System.out.println("2 for display DVD information");
				System.out.println("3 for display video information");
				System.out.println("4 for display lecturer information");
				System.out.println("5 for display graduate student information");
				System.out.println("6 for display undergraduate student information");
				System.out.println("7 for display loan infomation");
				int infodisplay = testreader.nextInt();
				switch(infodisplay) 
				{
				case 1:
					System.out.println("BookID, Title, Author, Publisher, ISBN, Edition");
					for(int i=0;i<test_book.size();i++) 
					{
						System.out.println(test_book.get(i));
					}
					System.out.println();
					break;	
				case 2:
					System.out.println("DVDID, Title, ReleaseDate, Actor");
					for(int i=0;i<test_dvd.size();i++) 
					{
						System.out.println(test_dvd.get(i));
					}
					System.out.println();
					break;
				case 3:
					System.out.println("VideoID, Title, Producer, Lifetime, Length");
					for(int i=0;i<test_video.size();i++) 
					{
						System.out.println(test_video.get(i));
					}
					System.out.println();
					break;
				case 4:
					System.out.println("LecturerID, Name, Address, Telephone, Email");
					for(int i=0;i<test_lecturer.size();i++) 
					{
						System.out.println(test_lecturer.get(i));
					}
					System.out.println();
					break;
				case 5:
					System.out.println("GraduateID, Name, Address, Telephone, Email");
					for(int i=0;i<test_grad.size();i++) 
					{
						System.out.println(test_grad.get(i));
					}
					System.out.println();
					break;
				case 6:
					System.out.println("UndergraduateID, Name, Address, Telephone, Email");
					for(int i=0;i<test_undergrad.size();i++) 
					{
						System.out.println(test_undergrad.get(i));
					}
					System.out.println();
					break;
				case 7:
					System.out.println("LoanID, Title, PatronName, BorrowDate, DueDate");
					for(int i=0;i<test_loan.size();i++) 
					{
						System.out.println(test_loan.get(i));
					}
					System.out.println();
					break;
				default:
					System.out.println("invalid input");
					break;
				}
				break;
			default:
				System.out.println("invalid input");
				break;
				
			}
			
			
			System.out.println("Do you want to continue? (y or n)");
			option=testreader.next().charAt(0);
		}
		//end of while loop;
		

	}

}
