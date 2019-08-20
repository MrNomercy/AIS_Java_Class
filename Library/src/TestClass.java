import java.util.ArrayList; //Import array list to make the list for the items 
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		ArrayList<Books> b=new ArrayList<Books>(); //Use the array list to store the objects of books
		ArrayList<DVDs> c=new ArrayList<DVDs>();
		ArrayList<Videos> d=new ArrayList<Videos>();
		ArrayList<Lecturer> e= new ArrayList<Lecturer>();
		ArrayList<Graduatestudent> f= new ArrayList<Graduatestudent>();
		ArrayList<Undergraduatestudent> g= new ArrayList<Undergraduatestudent>();
		ArrayList<Loan> h=new ArrayList<Loan>();
		
	    Scanner myObj = new Scanner(System.in);
	    
	    char choice8='y';  //char is use for the character
	    while(choice8=='y')// use the while loop so it can continue asking the question 
	    {
	    	System.out.println("Choose a option: ");
			System.out.println("1 Add a Library Item ");
			System.out.println("2 Add a Patron: ");
			System.out.println("3 Add a Loan Item: ");
			int choice = myObj.nextInt(); //nextInt will print the next line, choice will ask user to choose the number he wants to go to 
		switch(choice)//switch is use so the user can choose the number he want to go and it will switch to that option
		{
			case 1:
				System.out.println("Choose One Library Item: ");
				System.out.println("1 Add a Books");
				System.out.println("2 Add a DVDs ");
				System.out.println("3 Add a Viseos ");
				Scanner myObj2 = new Scanner(System.in);
			    int choice2 = myObj2.nextInt();
			    switch(choice2)
			    {
			    case 1:
			    	Books obj=new Books();//will create the object
			    	obj.addBook();
			    	b.add(obj);//b will called the method to add the book
			    	System.out.println("#Books added#");
			    	System.out.println(b);
			    	break;
			    case 2:
			    	DVDs obj2=new DVDs();
			    	obj2.addDVDs();
			    	c.add(obj2);
			    	System.out.println("#DVDs added#");
			    	break;
			    case 3:
			    	Videos video=new Videos();
			    	video.addVideos();
			    	d.add(video);
			    	System.out.println("#Videos added#");
			    	break;
			    default:
			    }
				
				break;
			
			case 2:
				System.out.println("Choose One Patron:");
				System.out.println("1 Add a Lecturer ");
				System.out.println("2 Add a Graduate ");
				System.out.println("3 Add an Under Graduate ");
				Scanner author= new Scanner (System.in);
				int choice3= author.nextInt();
				switch(choice3)
				{
				case 1:
					Lecturer lecturer=new Lecturer();
					lecturer.addLecturer();
					e.add(lecturer);
					System.out.println("#Lecturer added#");
					break;
				case 2:
					Graduatestudent graduatestudent= new Graduatestudent();
					graduatestudent.addGraduatestudent();
					f.add(graduatestudent);
					System.out.println("#Graduate Student added#");
					break;
				case 3:
					Undergraduatestudent undergrade= new Undergraduatestudent();
					undergrade.addUndergraduatestudent();
					g.add(undergrade);
					System.out.println("#Undergraduate Student added#");
					break;
				default:
				}
				break;
			
			case 3:
					Loan loan=new Loan();
					loan.addLoan();
					h.add(loan);
					System.out.println("#Loan added#");
					break;
			default:
				System.out.print("You have entered a wrong number");
				break;
				
		}
		System.out.println("Do you want to continue?");//will ask the user if he wants to continue adding the files
		choice8=myObj.next().charAt(0);// character 0 is y, so it will repeat the questions
	    }
	}

}
