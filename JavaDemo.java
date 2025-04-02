
import java.util.Scanner;
public class JavaDemo {

	public static void main(String[] args) {
//		void - empty - which returns nothing
//		String [] args - array - command line arguments
		// TODO Auto-generated method stub
		
//		conditional Statement
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to Order Pizza\n"
				+ "Press 2 to Order Burger\n"
				+ "Press 3 to Order Sandwich");
		int order = sc.nextInt();
		
		switch (order)
		{
//		case 1:System.out.println("Your Pizza is Ready");
//		       break;
//		case 2:System.out.println("Your Burger is Ready");
//		       break;
//		case 3:System.out.println("Your Sandwich is Ready");
//				break;
//		default:System.out.println("Invalid Order");
		
	case 1->System.out.println("Your Pizza is Ready");
	      
	case 2 ->System.out.println("Your Burger is Ready");
	       
	case 3->System.out.println("Your Sandwich is Ready");
		
	default->System.out.println("Invalid Order");
		}
//		after break, you will exit from switch block
		
	}

}
