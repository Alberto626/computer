package hw04;
import java.util.Scanner;
public class ComputerTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String menu = "************* Main Menu ************* \n"; // simple menu
		menu += "\t 1. Choose a Case \n";
		menu += "\t 2. Choose a Monitor \n";
		menu += "\t 3. Choose a CPU \n";
		menu += "\t 4. Choose a Video Card \n";
		menu += "\t 5. Choose a Hard Drive \n";
		menu += "\t 6. Choose a Memory \n";
		menu += "\t 7. Delete Current Computer \n";
		menu += "\t 8. Display Receipt \n";
		menu += "\t 9. Exit Program \n";
		menu += "************************************ \n";
		menu += "Please choose an option to build your computer:";
		
		Case CurrentCase; // These are the instances created and can be changed incase you want something else
		Monitor CurrentMonitor; // test when instance equals null
		CPU CurrentCPU;
		VideoCard CurrentVideoCard;
		HardDrive CurrentHardDrive;
		Memory CurrentMemory;

		while(true) {
			System.out.println(menu);
			int Userinput = input.nextInt();
			switch(Userinput) {
			case 1:
				CurrentCase = Case();
				break;
			case 2:
				CurrentMonitor = Monitor();
				break;
			case 3:
				CurrentCPU = CPU();
				break;
			case 4:
				CurrentVideoCard = VideoCard();
				break;
			case 5:
				CurrentHardDrive = HardDrive();
				break;
			case 6:
				CurrentMemory = Memory();
				break;
			case 7: // figure out how to replace computer class 
				
				break;
			case 8:
				DisplayReceipt();
				break;
			case 9:
				System.exit(0);
				break;
			}
		}
	}
	public static Case Case() { // here you are given options 
		Scanner input = new Scanner(System.in);
		Case case1 = new Case("Antec Twelve Hundred V3",10.5,22.6,3.4, "ATX Full Tower", 159.99);
		Case case2 = new Case("BitPhenix Phenom M Artic White", 20.5, 55.52, 75.7, "Micro Mini Tower", 89.99 );
		Case case3 = new Case("Corsair 250D",31.5,87,37.3,"MiniTX Tower", 100.99);
		System.out.println("\nPlease Choose a Case");
		System.out.println("1." + case1.toString());
		System.out.println("2." + case2.toString());
		System.out.println("3." + case3.toString());
		System.out.println("*************************************");
		int CaseNumber = input.nextInt();
		while(CaseNumber > 3 || CaseNumber < 1) {
			System.out.println("Error!\nPlease Choose a Valid Case");
			CaseNumber = input.nextInt();
		}
		switch(CaseNumber) {
			case 1:
				return case1;
			case 2:
				return case2;
			case 3:
				return case3;
		}
		return null;
	}
	public static Monitor Monitor() {
		Scanner input = new Scanner(System.in);
		Monitor Monitor1 = new Monitor("Asys PB278Q",27,549.99);
		Monitor Monitor2 = new Monitor("Dell U2412M", 24,263.99 );
		Monitor Monitor3 = new Monitor("Samsung S22C300H",24.5, 156.99);
		System.out.println("\nPlease Choose a Monitor");
		System.out.println("1." + Monitor1.toString());
		System.out.println("2." + Monitor2.toString());
		System.out.println("3." + Monitor3.toString());
		System.out.println("*************************************");
		int CaseNumber = input.nextInt();
		while(CaseNumber > 3 || CaseNumber < 1) {
			System.out.println("Error!\nPlease Choose a Valid Monitor");
			CaseNumber = input.nextInt();
		}
		switch(CaseNumber) {
			case 1:
				return Monitor1;
			case 2:
				return Monitor2;
			case 3:
				return Monitor3;
		}
		return null;
	}
	public static CPU CPU() {
		Scanner input = new Scanner(System.in);
		CPU CPU1 = new CPU("AMD FX-8350",4.0,188.99);
		CPU CPU2 = new CPU("Intel Core i5-3570k",3.4,179.99);
		CPU CPU3 = new CPU("Intel Core i7-3570k",3.5, 249.55);
		System.out.println("\nPlease Choose a CPU");
		System.out.println("1." + CPU1.toString());
		System.out.println("2." + CPU2.toString());
		System.out.println("3." + CPU3.toString());
		System.out.println("*************************************");
		int CaseNumber = input.nextInt();
		while(CaseNumber > 3 || CaseNumber < 1) {
			System.out.println("Error!\nPlease Choose a Valid Monitor");
			CaseNumber = input.nextInt();
		}
		switch(CaseNumber) {
			case 1:
				return CPU1;
			case 2:
				return CPU2;
			case 3:
				return CPU3;
		}
		return null;
	}
	public static VideoCard VideoCard() {
		
	}
	public static HardDrive HardDrive() {
		
	}
	public static Memory Memory() {
		
	}
	public static void DisplayReceipt() {
		
	}
}
