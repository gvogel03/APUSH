import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class APUSHwords {
	private static int lastguess;
	public static void main(String[]args){
		Scanner console = new Scanner(System.in);
		String[][] terms = new String[24][3];
		terms[1][0] = "When was Jamestown Founded?";
		terms[1][1] = "1607";
		terms[1][2] = "Jamestown was the first permanent English settlement in North America";
		terms[2][0] = "When was the Declaration of Independence written?";
		terms[2][1] = "1776";
		terms[2][2] = "Revolutionary War has been going on for one year -- Jefferson writes";
		terms[3][0] = "When Did the American Revolution End?";
		terms[3][1] = "1783";
		terms[3][2] = "The Treaty of Paris provided recognition for United States as a new nation";
		terms[4][0] = "When was the United States Constitution Written?";
		terms[4][2] = "New government established as the Articles of Confederation fail";
		terms[4][1] = "1788";
		terms[5][0] = "When was the Bill of Rights Written?";
		terms[5][1] = "1791";
		terms[5][2] = "First 10 Amendments to the Constitution guarantee individual liberties";
		terms[6][0] = "When was the Lousiana Purchase?"; 
		terms[6][1] = "1803";
		terms[6][2] = "U.S. is doubled in size as expansion fever begins";
		terms[7][0] = "When was the War with Mexico?";
		terms[7][1] = "1846";
		terms[7][2] = "Culmination of Manifest Destiny with southwest land added";
		terms[8][0] = "When did the Civil War Begin?";
		terms[8][1] = "1861";
		terms[8][2] = "Sectional strife finally leads to 4-year war -- slavery is just one issue";
		terms[9][0] = "When was the 12th Amendment added to the constitution?";
		terms[9][1] = "1868";
		terms[9][2] = "Guarantees equal protection of the laws -- used frequently today";
		terms[10][0] = "When was the 1st Transcontinential Railroad Created(In the US)?";
		terms[10][1] = "1869";
		terms[10][2] = "Nation's size become more practical and Asia becomes more important";
		terms[11][0] = "When was the Plessy Vs Ferguson Trial?";
		terms[11][1] = "1896";
		terms[11][2] = "Supreme Court approves segregation with the “separate but equal” doctrine";
		terms[12][0] = "When was the Spanish-American War?";
		terms[12][1] = "1898";
		terms[12][2] = "U.S Becomes an imperialist power";
		terms[13][0] = "When did The United States enter World War One?";
		terms[13][1] = "1917";
		terms[13][2] = "War began in 1914 & attempts at neutrality fail -- but we weren't really neutral";
		terms[14][0] = "When was the 19th Amendent added to the constitution?";
		terms[14][1] = "1920";
		terms[14][2] = "Women finally gain the right to vote";
		terms[15][0] = "When was the Stock Market Crash?";
		terms[15][1] = "1929";
		terms[15][2] = "A symptom of problems leading to the Great Deprression";
		terms[16][0] = "When did the New Deal Begin?";
		terms[16][1] = "1933";
		terms[16][2] = "FFDR's response to the problems of the depression changes the country forever";
		terms[17][0] = "When did the US enter World War Two?";
		terms[17][1] = "1941";
		terms[17][2] = "Attack on Pearl Harbor ends US isolationist in war that began in 1939";
		terms[18][0] = "When was the UN Formed?";
		terms[18][1] = "1945";
		terms[18][2] = "U.S. central figure in 2nd attempt at world peace-keeping organization";
		terms[19][0] = "When was the Brown vs. Board of Education court case?";
		terms[19][1] = "1954";
		terms[19][2] = "Court case that sparks a modern civil rights movement";
		terms[20][0] = "When was the Tankin Gulf Resolution?";
		terms[20][1] = "1964";
		terms[20][2] = "United States begins major escalation of involvement in Vietnam";
		terms[21][0] = "When did Nixon Resign?";
		terms[21][1] = "1974";
		terms[21][2] = "Watergate affair leads to resignation to avoid impeachment";
		terms[22][0] = "When did the Cold War end?";
		terms[22][1] = "1991";
		terms[22][2] = "“Victory” for the U.S. with the collapse of the Soviet Union";
		terms[23][0] = "When was the World Trade Center bombed?";
		terms[23][1] = "2001";
		terms[23][2] = "The bombing of the World Trade Center Led to security challenges both home and abroad";
		System.out.println("Welcome to APUSH Summer Study Guide");
		System.out.println("I will give you an event, and you must type in the corresponding date. Press Enter when you are ready to start");
		console.nextLine();
		for(int i = 0; i < 23; i ++){
			int rand = (int) (Math.random() * 23) + 1;
			System.out.println(terms[rand][0]);
			String input = console.nextLine();
			lastguess = rand;
			if(input.equals(terms[rand][1])){
				System.out.println("Correct! Would you like to learn more information?");
				String yn = console.nextLine();
				if(yn.equals("yes") || yn.equals("y")){
					System.out.println(terms[rand][2]);
					System.out.println("Do you want another question?");
					String cont = console.nextLine();
					if(cont.equals("yes") || cont.equals("y")){
						continue;
					}
					else{
						break;
					}
				}
				else{
					continue;
				}
			}
			else{ 
				System.out.println("Wrong, would you like to try again?");
				String yn2 = console.nextLine();
				if(yn2.equals("yes") || yn2.equals("y")){
					System.out.println("Guess Again:");
					String guess2 = console.nextLine();
					if(guess2.equals(terms[rand][1]))
						System.out.println("Correct! Would you like to learn more information?");
						String yn = console.nextLine();
						if(yn == "yes" || yn == "y"){
							System.out.println(terms[rand][2]);
						}
						else{
							System.out.println("Would you like another question?");
							String cont1 = console.nextLine();
							if(cont1.equals("yes") || cont1.equals("y")){
								continue;
							}
							else{
								break;
							}
						}
					}
					else{
						System.out.println("Incorrect, the correct answer is: " + terms[rand][1]);			
					}
				}
			}
		System.out.println("Thanks for Playing!");
	}
}

