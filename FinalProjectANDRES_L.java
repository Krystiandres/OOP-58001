import java.util.*;
public class FinalProjectANDRES_L {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String loop, loop3;
			String name;
			System.out.println("Welcome!");
			System.out.print("Enter nickname: ");
			name = input.next();
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Hello, " + name + "!");
			System.out.println(" ");
	
			do {
				
				int group = 00;
				String loop2;
				System.out.println("================================================================");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Please select number");
				System.out.println(" ");
				System.out.println("[1]-------> Printing");
				System.out.println("[2]-------> Data Types, Variable and Operators");
				System.out.println("[3]-------> Getting Data From Keyboard");
				System.out.println("[4]-------> Control Structure");
				System.out.println("[5]-------> Control Structure (Switch)");
				System.out.println("[6]-------> Repetition Control Structure");
				System.out.println("[7]-------> Quit");
				System.out.println(" ");
				System.out.print("Enter selected number: ");
				group = input.nextInt();
				
				System.out.println(" ");
				System.out.println("================================================================");
				


			
				switch(group) {
				case 1: 
					do{ //printing
					String options;
					System.out.println(" ");
					System.out.println("Please select letter");
					System.out.println(" ");
					System.out.println("[A]-------> Slumbook");
					System.out.println("[B]-------> FaceTime");
					System.out.println("[C]-------> DreamHouse");
					System.out.println("[D]-------> Return to other groups");
					System.out.print("Enter letter: ");
					options = input.next().toUpperCase();	
					switch(options){
					
					case "A":
						System.out.println(" ");
						System.out.println("Slumbook");
						System.out.println(" ");
						System.out.println(" ");
						System.out.println("ABOUT ME");
						System.out.println("First Name: Lance Krystian");
						System.out.println("Last Name: Andres");
						System.out.println("Middle Name: Descalzo");
						System.out.println("Age: 19");
						System.out.println("Birthday: November 12, 2002");
						System.out.println("Address: Maddela, Quirino");
						System.out.println("Contact Number: 09012345678");
						System.out.println("Motto: kung kaya ng iba, sila na gumawa");
						System.out.println("");
						System.out.println("FAVORITES");
						System.out.println("Food: Pancit Canton");
						System.out.println("Color: Blue");
						System.out.println("Song: 888 - Cavetown");
						System.out.println("Movie: Cars");
						System.out.println("Descrive yourself: Ako ay isang pilipino, Raiden main (310k dmg btw)");
											
					break;
					
					case "B":
						System.out.println(" ");
						System.out.println("FaceTime");
						System.out.println(" ");
						System.out.println(" ");
						
						System.out.println("          =======================================");
						System.out.println("          =======================================");
						System.out.println("          =======================================");
						System.out.println("          =======================================");
						System.out.println("================================================================");
						System.out.println("================================================================");
						System.out.println("================================================================");
						System.out.println("           000000000000000000000000000000000000");
						System.out.println("         0001111111000000000000000000001111111000             kumain kana ba? ");
						System.out.println("        00001     1000000000000000000001     10000");
						System.out.println("        00001     1000000000000000000001     10000");	
						System.out.println("        00001     1000000000000000000001     10000");
						System.out.println("        00001     1000000000000000000001     10000");
						System.out.println("        000011111110000000000000000000011111110000");
						System.out.println("        000000000000000000000000000000000000000000");
						System.out.println("        000000000000000000000000000000000000000000");
						System.out.println("        00000                               000000");
						System.out.println("        00000                               000000");
						System.out.println("        000000                             000000");
						System.out.println("         000000                           0000000          same haha");
						System.out.println("          0000000                       0000000");
						System.out.println("            0000000000              0000000000");
						System.out.println("               0000000000000000000000000000");
						System.out.println("                  000000000000000000000");
						System.out.println("                    0000000000000000");
						System.out.println("");
						System.out.println("");
						System.out.println("================================================================");
						
						break;
						
					case "C":
						
						System.out.println(" ");
						System.out.println("DreamHouse");
						System.out.println(" ");
						System.out.println(" ");
						System.out.println("° ˛ ° ˚* _Π_____*☽*˚ ˛⠀⠀⠀⠀");
						System.out.println("✩ ˚˛˚*/______/__＼。✩˚ ˚˛");
						System.out.println("˚ ˛˚˛˚｜ 田田｜門｜ ˚ ˚");
						System.out.println("´´ ̛ ̛ ´´ ´´ ´´ ̛ ̛ ´´ ´´ ´´ ̛ ̛ ´´ ´´");
						System.out.println(" ");
						break;
					case "D":
						
						break;
		
					default:
						System.out.println("Invalid");
					       break;
			
					}System.out.println("================================================================");
					
					System.out.println("do you want to leave in [Printing]? Y/N");
					System.out.println("Press Y to Leave");
					System.out.println("Press N to Stay");
					loop2 = input.next() .toUpperCase();
				}while(loop2.equals("N"));
					break;
					
				case 2: //Data Types
				do {
						String options;
						System.out.println("Data Types");
						System.out.println(" ");
						System.out.println("Please select letter");
						System.out.println(" ");
						System.out.println("[A]-------> AreaofATriangle");
						System.out.println("[B]-------> CelsiusToFahrenheit ");
						System.out.println("[C]-------> Grade Average");
						System.out.println("[D]-------> MultiplyToFifteen");
						System.out.println("[E]-------> Return to other groups");
						System.out.print("Enter selected letter: ");
						System.out.println(" ");
						options = input.next().toUpperCase();	
						switch(options){
						
						case "A":
							System.out.println(" ");
							System.out.println("AreaofATriangle");
							System.out.println(" ");
							System.out.println(" ");
							double base = 16.9;
							double height = 23.9;
							double quotient = 0.9;
							double product = base*height*quotient;
							
							System.out.println("Area of a Triangle is: " + product +"cm²"); 					
						break;
						case "B":
							System.out.println(" ");
							System.out.println("CelsiusToFahrenheit");
							System.out.println(" ");
							System.out.println(" ");
							double Celcius = 58.3;
							double Fahrenheit;
							double product1 = Celcius * 1.8 + 32;
							
							System.out.println("Fahrenheit = "+ product1 + "°F");
							break;
							
						case "C":
							System.out.println(" ");
							System.out.println("GradeAverage");
							System.out.println(" ");
							System.out.println(" ");
							double English = 87.5;
							double Math = 76.3;
							double Science = 82.7;
							double Filipino = 88.43;
							double History = 94.77;
							double sum = English + Math + Filipino + Science + History;
							double quotient1 =sum / 5;
							
							System.out.println("Student Average Grade= "+quotient1);
	
							break;
							
						case "D":
							System.out.println(" ");
							System.out.println("MultiplytoFifteen");
							System.out.println(" ");
							System.out.println(" ");
							int num1 = 1* 15;
							int num2 = 2* 15;
							int num3 = 3* 15;
							int num4 = 4* 15;
							int num5 = 5* 15;
							int num6 = 6* 15;
							int num7 = 7* 15;
							int num8 = 8* 15;
							int num9 = 9* 15;
							int num0 = 10* 15;
							
							System.out.println("1 times 15 = " + num1);
							System.out.println("2 times 15 = " + num2);
							System.out.println("3 times 15 = " + num3);
							System.out.println("4 times 15 = " + num4);
							System.out.println("5 times 15 = " + num5);
							System.out.println("6 times 15 = " + num6);
							System.out.println("7 times 15 = " + num7);
							System.out.println("8 times 15 = " + num8);
							System.out.println("9 times 15 = " + num9);
							System.out.println("10 times 15 = "+ num0);
							break;
							
						case "E":
						
						break;
						default:
							System.out.println("Invalid");
						       break;
						
						}System.out.println("================================================================");
						
						System.out.println("do you want to leave [Data Types, Variable and Operators]? Y/N");
						System.out.println("Press Y to Leave");
						System.out.println("Press N to Stay");
						loop2 = input.next() .toUpperCase();
					}while(loop2.equals("N"));
						break;
						
				case 3:
					do{//Getting Data From Keyboard
						
					String options3;
					System.out.println(" ");
					System.out.println("Getting Data From Keyboard ");
					System.out.println(" ");
					System.out.println("Please select letter");
					System.out.println(" ");
					System.out.println("[A]-------> Slumbook2");
					System.out.println("[B]-------> Arithmetic");
					System.out.println("[C]-------> Return to other groups");
					System.out.print("Enter letter: ");
					options3 = input.next().toUpperCase();	
					switch(options3){
					
					case "A":
						System.out.println(" ");
						System.out.println("Slumbook2");
						System.out.println(" ");
						System.out.println(" ");
						System.out.println("ABOUT ME");
						
						String FirstName;
						System.out.print("First Name: ");
						FirstName = input.next();
						
						String LastName;
						System.out.print("Last Name: ");
						LastName = input.next();
						
						String MiddleName;
						System.out.print("Middle Name: ");
						MiddleName = input.next();
						
						int Age;
						System.out.print("Age: ");
						Age = input.nextInt();
						
						String Birthday;
						System.out.print("Birthday: ");
						Birthday= input.next();
						
						String Address;
						System.out.print("Address: ");
						Address = input.next();
								
						int ContactNum;
						System.out.print("Contact Number: ");
						ContactNum = input.nextInt();
						
						String Motto;
						System.out.print("Motto: ");
						Motto = input.next();
						
						System.out.println("------------");
						System.out.println(" FAVORITES");
						System.out.println("-----------");
						
						String Food;
						System.out.print("Food: ");
						Food = input.next();
						
						String Color;
						System.out.print("Color: ");
						Color = input.next();
						
						String Song;
						System.out.print("Song: ");
						Song = input.next();
						
						String Movie;
						System.out.print("Movie: ");
						Movie = input.next();
						
						String Describe;
						System.out.print("Describe yourself: ");
						Describe = input.next();
					break;
					
					case "B":
						System.out.println(" ");
						System.out.println("Arithmetic");
						System.out.println(" ");
						System.out.println(" ");
						System.out.print("Enter First Number: ");
						int num1;
						num1 = input.nextInt();
						
						System.out.print("Enter Second Number: ");
						int num2;
						num2 = input.nextInt();
						
						int sum = num1 + num2;
						int difference = num1 - num2;
						int Product = num1 * num2;
						int Quotient = num1 / num2;
						int Modulo = num1 % num2;
						
						System.out.println("sum = " + sum);
						System.out.println("difference = " + difference);
						System.out.println("Product = " + Product);
						System.out.println("Quotient = " + Quotient);
						System.out.println("Modulo = " + Modulo);
					break;
					
					case "C":
						
						break;

					default:
						System.out.println("Invalid");
					     
					       break;
					}System.out.println("================================================================");
					
					System.out.println("do you want to leave [Getting Data From Keyboard]? Y/N");
					System.out.println("Press Y to Leave");
					System.out.println("Press N to Stay");
					loop2 = input.next() .toUpperCase();
				}while(loop2.equals("N"));
					
					break;
				case 4: // Control Structure
					do {
					
					String options4;
					System.out.println(" ");
					System.out.println("Control Structure");
					System.out.println(" ");
					System.out.println("Please select letter");
					System.out.println(" ");
					System.out.println("[A]-------> QuetelexIndex");
					System.out.println("[B]-------> HuttValleyEnergy");
					System.out.println("[C]-------> FuelPrice");
					System.out.println("[D]-------> Return to other groups");
					System.out.print("Enter letter: ");
					options4 = input.next().toUpperCase();	
					switch(options4){
					
					case "A":
						double kilos; //weight
						double height; //height
						System.out.println(" ");
						System.out.println("QuetelexIndex");
						System.out.println(" ");
						System.out.println(" ");
						System.out.print("Enter weight (kg): ");
							kilos =  input.nextDouble();
						
						System.out.print("Enter height (m): ");
							height = input.nextDouble();
							
						double bmi =  kilos / (height*height);
						System.out.println("Quetet Index: " + bmi );
						
						if (bmi <= 20){
							System.out.println("Remarks: Underweight");
						}
						else if (bmi >= 20 && bmi <= 25){
							System.out.println("Remarks: Healthy weight");
						}
						else if (bmi >= 25 && bmi <= 30){
							System.out.println("Remarks: Mildly Overweight");
						}
						else if (bmi >= 30 && bmi <= 40){
							System.out.println("Remarks: Very Overweight");
						}
						else if (bmi >= 40 ){
							System.out.println("Remarks: Extremely Overweight");
						} 
					break;
					
					case "B":
						double kilo;
						double totalCost = 0;
						System.out.println(" ");
						System.out.println("HuttValleyEnergy");
						System.out.println(" ");
						System.out.println(" ");
						System.out.print(" Enter meter reading: ");
						kilo = input.nextDouble();
						
						if (kilo >=0 && kilo <= 500){
							totalCost = 10;
							
						}
						else if (kilo >=501 && kilo <= 1000){
							totalCost =  10 + (kilo - 500) * 0.05;
						
						}
						else if (kilo >=1000) {
							totalCost =  35 + (kilo - 1000) * 0.03;
						}
						System.out.println("Total Charge/Cost is: " + totalCost);

						break;
						
					case "C":
						double liters;
						int selection;
						double cost = 0;
						System.out.println(" ");
						System.out.println("FeulPrice");
						System.out.println(" ");
						System.out.println(" ");
						System.out.println("[1] Super XCS");
						System.out.println("[2] Diesoline");
						System.out.println("[3] Diesel");
						System.out.println("[4] Regular XCS");
						System.out.println("[5] Gas XCS");
						
						
						System.out.print("Enter your selection: ");
						selection = input.nextInt();
						
						System.out.print("Enter number of liters: ");
						liters = input.nextDouble();
						
						if (selection == 1) {
							cost = 68.75 * liters;
							
						}
						else if (selection == 2) {
							cost = 87.25 * liters;
							
						}
						else if (selection == 3) {
							cost = 86.50 * liters;
							
						}
						else if (selection == 4) {
							cost = 65.50 * liters;
							
						}
						else if (selection == 5) {
							cost = 64.75 * liters;
							
						}
						System.out.println("    ");
						
						
						
						System.out.print("Total Cost: " + cost);
						
						break;
						
					case "D":
						
						break;

					default:
						System.out.println("Invalid");
				
					       break;
					}System.out.println("================================================================");
					
					System.out.println("do you want to leave [Control Structure]? Y/N");
					System.out.println("Press Y to Leave");
					System.out.println("Press N to Stay");
					loop2 = input.next() .toUpperCase();
				}while(loop2.equals("N"));
					
					break;
				case 5:
					do {
					String options5;
					System.out.println(" ");
					System.out.println("Control Structure (Switch)");
					System.out.println(" ");
					System.out.println("Please select letter");
					System.out.println(" ");
					System.out.println("[A]-------> ElectricBill");
					System.out.println("[B]-------> DressCode");
					System.out.println("[C]-------> CarRental");
					System.out.println("[D]-------> Rock");
					System.out.println("[E]-------> Return to other groups");
					System.out.print("Enter letter: ");
					options5 = input.next().toUpperCase();	
					switch(options5){
					
					case "A":
						double kilo;
						double prev = 0, pres = 0;
						int choice;
						double amount = 0;
						System.out.println(" ");
						System.out.println("ElectricBill");
						System.out.println(" ");
						System.out.println(" ");
						System.out.println("*Building Code*");
						System.out.println("<1> - Residental");		
						System.out.println("<2> - Commercial");		
						System.out.println("<3> - Industrial");
						System.out.print("Enter choice: ");
						choice = input.nextInt();
						
						System.out.println(" ");
						
						
						System.out.print("Enter present reading: ");
							pres = input.nextDouble();
						System.out.print("Enter previous reading: ");
							prev = input.nextDouble();
						
						kilo = pres - prev;
							
						switch (choice) {
						
						case 1:
							if (kilo >= 0 && kilo <=50){
								amount = 27;
							}
							else if (kilo >= 51 && kilo <= 100){
								amount = 27 + (kilo - 50) * 0.75;
							}
							else if (kilo >= 101 && kilo <= 150){
								amount = 27 + (kilo - 100) * 3.50;
							}
							else if (kilo > 150){
								amount = 27 + (kilo - 150) * 5.50;
							}
							break;
							
						case 2:
							if (kilo >= 0 && kilo <=50){
								amount = 35;
							}
							else if (kilo >= 51 && kilo <= 100){
								amount = 35 + (kilo - 50) * 0.75;
							}
							else if (kilo >= 101 && kilo <= 150){
								amount = 35 + (kilo - 100) * 3.50;
							}
							else if (kilo >= 150){
								amount = 35 + (kilo - 150) * 5.50;
							}	
							break;
							
						case 3:
							if (kilo >= 0 && kilo <=50){
								amount = 52;
							}
							else if (kilo >= 51 && kilo <= 100){
								amount = 52 + (kilo - 50) * 0.75;
							}
							else if (kilo >= 101 && kilo <= 150){
								amount = 52 + (kilo - 100) * 3.50;
							}
							else if (kilo >= 150){
								amount = 52 + (kilo - 150) * 5.50;
							}	
							break;
							}
						System.out.println(" ");
						System.out.println("Amount Due: " + amount);
						 
					break;
					
					case "B":
						System.out.println(" ");
						System.out.println("DressCode");
						System.out.println(" ");
						System.out.println(" ");
						int day;
						String dress;
						System.out.println("   choose the day    ");
						System.out.println("     <Monday> ");
						System.out.println("    <Tuesday>");
						System.out.println("    <Wednesday> ");
						System.out.println("    <Thursday> ");
						System.out.println("     <Friday> ");
						System.out.println("    <Saturday>");
						System.out.println("     <Sunday>");
						System.out.print("Enter Day: ");
						dress = input.next().toUpperCase();
						
						switch (dress){
						
						case ("Monday"):
							System.out.print("Dress Code: Uniform");
						break;
						case ("Tuesday"):
							System.out.print("Dress Code: Uniform");
						break;
						case ("Thursday"):
							System.out.print("Dress Code: Uniform");
						break;
					
						case ("Wednesday"):
							System.out.print("Dress Code: Dress Down");
						break;
						case ("Saturday"):
							System.out.print("Dress Code: Dress Down");
						break;
						case ("Friday"):
						System.out.print("Dress Code: recognized shirts");
						break;
						case ("Sunday"):
						System.out.print("not allowed inside the campus");
						break;
						
						default:
							System.out.print("invalid");
						
						}
			
						day = input.nextInt();
						

						break;
						
					case "C":
						
						int typeofCar;
						int numdays;
						int travelled;
						int insurance;
						double dailyCharge = 0;
						double mileageCharge = 0;
						double totalCost=0;
						double insuranceCost=0;
						
						System.out.println(" ");
						System.out.println("CarRental");
						System.out.println(" ");
						System.out.println(" ");
						System.out.print("Enter Type of Car: ");
						typeofCar = input.nextInt();
						System.out.print("Enter number of days: ");
						numdays = input.nextInt();
						System.out.print("Enter miles travelled: ");
						travelled = input.nextInt();
						System.out.print("Enter insurance type: ");
						insurance = input.nextInt();
								
						
						if (typeofCar == 1){
							dailyCharge =numdays*8;
							mileageCharge = travelled*0.06;
							
						}
						else if (typeofCar == 2){
							dailyCharge =numdays*10;
							mileageCharge = travelled*0.08;
						}
						else if (typeofCar == 3){
							dailyCharge =numdays*15;
							mileageCharge = travelled*0.12;
						}
						else {
							System.out.print("Car not available");
						}
						if (insurance == 1){
							insuranceCost = (dailyCharge + mileageCharge)*.20;
						}
						else if (insurance == 2){
							insuranceCost = numdays * 4 ;
						}
						else {
							System.out.print("not available");
						}
						totalCost= dailyCharge+mileageCharge+insuranceCost;
						System.out.print("Total Bill: " + totalCost);
					break;
					
					case "D":
						Random rndm = new Random ();
						String play;
						String pcPlay = null;
						int val;
						//0 = Rock
						//1 = Paper
						//2 = Scissors
						System.out.println(" ");
						System.out.println("Rock");
						System.out.println(" ");
						System.out.println(" ");
						System.out.print("Enter your play: R, P, S: ");
						play = input.next().toUpperCase();
						
						val = rndm.nextInt(3);
						switch (val){
						case 0:
							System.out.println("Computer play is: R");
							
							if (play.equals("R")){
								
								System.out.println("rock to rock. its a tie");
							}
							else if (play.equals("P")){
								System.out.println("paper covers rock. you won!");
							}
							else if (play.equals("S")){
								System.out.println(" rock beats scissors. you lose!");
							}		
										
						break;
						case 1:
							System.out.println("Computer play is: P");
							
							if (play.equals("R")){
								
								System.out.println(" paper covers rock. You lose!");
							}
							else if (play.equals("P")){
								System.out.println("paper to paper. its a tie!");
							}
							else if (play.equals("S")){
								System.out.println("scissor cuts paper. you won!");
							}		
										
						break;
						
						case 2:
							System.out.println("Computer play is: S");
							
							if (play.equals("R")){
								
								System.out.println("rock beats scissor. you won!");
							}
							else if (play.equals("P")){
								System.out.println("paper covers rock. you lost!");
							}
							else if (play.equals("S")){
								System.out.println("Scissor to scissor. its a tie!");
							}		
										
						break;
						
						
						}
						break;
						
					case "E":
						
						break;
						
					default:
						System.out.println("Invalid");
					       break;
					
					       
					}System.out.println("================================================================");
					
					System.out.println("do you want to leave [Control Structure (Switch)]? Y/N");
					System.out.println("Press Y to Leave");
					System.out.println("Press N to Stay");
					loop2 = input.next() .toUpperCase();
				}while(loop2.equals("N"));
					break;
			
					
				case 6:
					do { 
						String options6;
						System.out.println(" ");
						System.out.println("Repetition ");
						System.out.println(" ");
						System.out.println("Please select letter");
						System.out.println(" ");
						System.out.println("[A]-------> Loop1");
						System.out.println("[B]-------> Loop2");
						System.out.println("[C]-------> Loop3");
						System.out.println("[D]-------> Loop4");
						System.out.println("[E]-------> UlamSequence");
						System.out.println("[F]-------> NandM");
						System.out.println("[G]-------> Remainders");
						System.out.println("[H]-------> Stars");
						System.out.println("[I]-------> Return to other groups");
						System.out.print("Enter selected number: ");
						options6 = input.next(). toUpperCase();	
						switch(options6){
						
						case "A":
					
							int a;
							int b = 1;
							do {
								b =1;
								System.out.println(" ");
								System.out.println("Loop1");
								System.out.println(" ");
								System.out.println(" ");
								System.out.print("Enter Number: ");
								a = input.nextInt();	
								
							while( b <= a ){
								System.out.println(b);
								b++;
									
								}System.out.print("Try again? Y/N");
								loop = input.next() .toUpperCase();
								
							}while(loop.equals("Y"));
											
						break;
						
						case "B":
							int a1 = 0;
							
							
							do {	
								
								System.out.println(" ");
								System.out.println("Loop2");
								System.out.println(" ");
								System.out.println(" ");
								System.out.print("Enter Number: ");
								a1 = input.nextInt();	
							while(a1 > 0){
								System.out.println(a1);
								a1--;
								
								}System.out.print("Try again? Y/N");
								loop = input.next() .toUpperCase();
							}while(loop.equals("Y"));
							
							
							break;
							
						case "C":
							int a11;
							int b1 = 2;
							do {	
							
								b1 = 2;
								System.out.println(" ");
								System.out.println("Loop3");
								System.out.println(" ");
								System.out.println(" ");
								System.out.print("Enter Number: ");
								a11 = input.nextInt();	
						
								while( b1 <= a11 ){
									System.out.println(b1);
									b1++;
									b1+=1;

								}System.out.print("Try again? Y/N");
								loop = input.next() .toUpperCase();
							}while(loop.equals("Y"));

							break;
						
						case "D":
							int a3;
							int b3 = 1;
							do {	
							
								b3 = 1;
								System.out.println(" ");
								System.out.println("Loop4");
								System.out.println(" ");
								System.out.println(" ");
								System.out.print("Enter Number: ");
								a3 = input.nextInt();	
						
								while( b3 <= a3 ){
									System.out.println(b3);
									b3 = 2 + b3++;
								
								
								}System.out.print("Try again? Y/N");
								loop = input.next() .toUpperCase();
							}while(loop.equals("Y"));
							break;
						
						case "E":
							int n;
							System.out.println(" ");
							System.out.println("UlamSequence");
							System.out.println(" ");
							System.out.println(" ");
							
							do{
								
								System.out.print("Enter a positive integer: ");
								n = input.nextInt();
								
								while (n != 1){
									int even = n % 2;
									
									if (even == 0){
									n = n / 2;
									
									}
									else{
										
										n = 3*n +1;
									}
									
									System.out.println(n);
									
								}System.out.print("Try again? Y/N");
									loop = input.next() .toUpperCase();
								}while(loop.equals("Y"));
							break;
						
						case "F":
							int num1;
							int num2;
							int i;
				
							do{
								System.out.println(" ");
								System.out.println("NandM");
								System.out.println(" ");
								System.out.println(" ");
								System.out.print("Enter Start Number: ");
								num1 = input.nextInt();
								
								System.out.print("Enter End Number: ");
								num2 = input.nextInt();
								
								if (num2>num1){
								
									for(i = num1; i <= num2; i++ ){
										System.out.println(i);
									}
								}
									else if (num1 > num2){
										for(i = num1; i >= num2 ; i--){
											System.out.println(i);
										}
								}
							System.out.print("Try again? Y/N");
							loop = input.next() .toUpperCase();
							}while(loop.equals("Y"));
							break;
							
						case "G":
							System.out.println(" ");
							System.out.println("Remainders");
							System.out.println(" ");
							System.out.println(" ");
							do{
								
								int num11 = 1;
								int num21;
								
								System.out.print("Enter Positive Integer: ");
								num21 = input.nextInt();
								
								while (num11 <= num21){
									num11++;
									
									if(num11 % 3 == 1 && num11 % 4 == 2 && num11 % 5 == 3 && num11 % 6 == 4 )
										System.out.print("  " + num11);
									
								}	System.out.println("Try again? Y/N");
								loop = input.next() .toUpperCase();
								}while(loop.equals("Y"));
									
							break;
							
						case "H":
							System.out.println(" ");
							System.out.println("Stars");
							System.out.println(" ");
							System.out.println(" ");
							int xxx = 0 , y, raw = 4, row = 5, rew = 10;
							
							System.out.println("Star 1");
							for(xxx = 1 ; xxx <= raw ; xxx++){
							for(y = 1 ; y <= raw ; y++){
								System.out.print("**");
							}
							System.out.println();
							}
							
							System.out.println("Star 2");

							for(xxx = 0 ; xxx < row ; xxx++){
							for(y = 0 ; y <= xxx ; y++){
							System.out.print("*");
							}
							System.out.println();
								}
							
						//no.3	
							System.out.println("Star 3");	
							for(xxx = 0 ; xxx <= row ; xxx++){
							for(y = 1 * (row - xxx) ; y >= 0 ; y--){
							System.out.print (" ");
							}
							for(y = 0 ; y <= xxx; y++){
							System.out.print("*");
							}
							System.out.println();
								}
							
						//no.4
							System.out.println("Star 4");
							for(xxx = 1 ; xxx  <=  row ; xxx++){
							for(y = xxx; y < 5 ; y++){

							System.out.print (" ");
							}
							
							for(y = 1 ; y<(xxx*2); y++){
							System.out.print("*");
							}
							System.out.println();
							
								}					
							
							break;
							
						case "I":
							
							break;

						default:
							System.out.println("Invalid");
						
						       break;
						       
						       
						}System.out.println("================================================================");
						
						System.out.println("do you want to leave [Repition Control Structure]? Y/N");
						System.out.println("Press Y to Leave");
						System.out.println("Press N to Stay");
						loop2 = input.next() .toUpperCase();
					}while(loop2.equals("N"));
					break;
					
					
					
					
					
				case 7:
					
					System.out.println("Do you want to quit?");
					System.out.println("Press Y if Yes");
					System.out.println("Press N to Continue to other groups");
					loop = input.next().toUpperCase();
					if(loop.equals("Y")) {
						String exit;
						System.out.println("Are you sure do you want to quit?");
						System.out.println("Press Y to Quit");
						System.out.println("Press N to Continue to other groups");
						exit = input.next().toUpperCase();
						if(exit.equals("Y")) {
							System.out.print("Thank you, " + name);
							System.exit(0);
						}
						else if(exit.equals("N")) {
							System.out.println("You pressed Continue to other groups");
						}
					}
					else if(loop.equals("N")) {
						System.out.println("You pressed Continue to other groups");
					}
					else {
						System.out.println("Invalid");
					}
			
				break;
				
					}
				System.out.println("================================================================");
				System.out.println("do you want to Continue to other groups?");
				System.out.println("Press Y to Continue");
				System.out.println("Press N to Quit");
				loop = input.next() .toUpperCase();
				
			
				if(loop.equals("N")) {
					String exit;
					System.out.println("================================================================");
					System.out.print("Are you sure do you want to quit?");
					exit = input.next().toUpperCase();
					if(exit.equals("Y")) {
						System.out.print("Thank you, " + name);
						System.exit(0);
					}
					
				}
				
			}while(loop.equals("Y"));
			}
			
	}
