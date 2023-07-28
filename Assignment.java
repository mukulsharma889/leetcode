import java.util.*;

class Assignment
{
int p;
char name1;

void queues()
{
LinkedList<String> ll=new LinkedList<>();

do{

System.out.println("1.Add\n2.Display\n3.Remove\n4.Exit\n");
System.out.print("Enter your choice:");

Scanner s=new Scanner(System.in);
int choice=s.nextInt();

Scanner s1=new Scanner(System.in);

	switch(choice)
	{
	case 1:System.out.println("\tAdding Records:");
	System.out.print("Enter name:");
	String name=s1.nextLine();
	System.out.println("\n\t1.Front\n\t2.Rear\n3.Main menu\n");
	choice=s.nextInt();
	
		switch(choice)
		{
		case 1:ll.addFirst(name);
		break;

		case 2:ll.addLast(name);
		break;

		case 3:name1='y';
		continue;

		default:System.out.println("Invalid choice");
		break;
		}
	break;
	
	case 2:System.out.println("\tRecords are:");
	Iterator it=ll.iterator();
	while(it.hasNext())
	System.out.println(it.next());
	break;

	case 3:System.out.println("\tRemoving Record");
	System.out.print("Enter removing name:");
	name=s1.nextLine();
	try{
	ll.remove(name);
	}catch(Exception ee){System.out.println("Record not found");}
	break;

	case 4:System.out.println("\tExited");
	System.exit(0);
	break;

	default:System.out.println("Invalid choice");
	break;
	}
System.out.println("want to perform again? if yes press 'y'");
name1=s1.nextLine().charAt(0);
}while(name1=='y');
}

public static void main(String...a11)
{
new Assignment().queues();
}
}
