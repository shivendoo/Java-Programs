import java.util.Scanner;

public class ScannerExample {

	
	public static void main(String[] args) {
		
		System.out.println("Enter an Input");
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()) {
		System.out.println("Hi -->"+sc.next());	
		//System.out.println("HI nextint -->"+sc.nextInt());
	 //   System.out.println("Hi next line-->"+sc.nextLine());
		}
	    sc.close();
	}
}
