import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;

public class APUSHwords {
	private static int lastguess = -1;
	static int correctscore = 0;
	static int incorrectscore = 0;
	public static void main(String[]args){
		JFrame frame = new JFrame();
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
		terms[5][2] = "The Bill of Rights consisted of the first 10 Amendments to the Constitution and guaranteed numerous individual liberties";
		terms[6][0] = "When was the Lousiana Purchase?"; 
		terms[6][1] = "1803";
		terms[6][2] = "The Lousiana Purchase doubled the size of the United States as expansion fever began";
		terms[7][0] = "When was the War with Mexico?";
		terms[7][1] = "1846";
		terms[7][2] = "The War with Mexico was a Culmination of Manifest Destiny and conquering of SouthWestern Land";
		terms[8][0] = "When did the Civil War Begin?";
		terms[8][1] = "1861";
		terms[8][2] = "Sectional strife in the U.S leads to the civil war -- slavery is just one issue, along with state's rights that contributed to the start of this 4 year war";
		terms[9][0] = "When was the 12th Amendment added to the constitution?";
		terms[9][1] = "1868";
		terms[9][2] = "The 12th amendment Guaranteed equal protection of the laws -- used frequently today";
		terms[10][0] = "When was the 1st Transcontinential Railroad Created(In the US)?";
		terms[10][1] = "1869";
		terms[10][2] = "The Nation's size became more practical and Asia became more influential in world politics";
		terms[11][0] = "When was the Plessy Vs Ferguson Trial?";
		terms[11][1] = "1896";
		terms[11][2] = "The Plessy vs Ferguson trial had the Supreme Court approve segregation with a “separate but equal” doctrine";
		terms[12][0] = "When was the Spanish-American War?";
		terms[12][1] = "1898";
		terms[12][2] = "The Spanish-American war was when the U.S became an imperialist power";
		terms[13][0] = "When did The United States enter World War One?";
		terms[13][1] = "1917";
		terms[13][2] = "World War One began in 1914 & in 1917 attempts at neutrality failed -- although we weren't really neutral";
		terms[14][0] = "When was the 19th Amendent added to the constitution?";
		terms[14][1] = "1920";
		terms[14][2] = "The 19th amendment finally granted Women the right to vote";
		terms[15][0] = "When was the Stock Market Crash?";
		terms[15][1] = "1929";
		terms[15][2] = "The stock market crash was one of many problems that led to the Great Deprression";
		terms[16][0] = "When did the New Deal Begin?";
		terms[16][1] = "1933";
		terms[16][2] = "The new deal was FDR's response to the problems of the depression. The new deal changes the country forever and implemented (((Socialist))) policies";
		terms[17][0] = "When did the US enter World War Two?";
		terms[17][1] = "1941";
		terms[17][2] = "The Attack on Pearl Harbor ended US isolationism that began in 1939";
		terms[18][0] = "When was the UN Formed?";
		terms[18][1] = "1945";
		terms[18][2] = "The UN was the Western World's 2nd attempt at a worldwide peace-keeping organization";
		terms[19][0] = "When was the Brown vs. Board of Education court case?";
		terms[19][1] = "1954";
		terms[19][2] = "The Brown vs Board of education case was a Court case that sparked a modern civil rights movement";
		terms[20][0] = "When was the Tankin Gulf Resolution?";
		terms[20][1] = "1964";
		terms[20][2] = "The Gulf Resoluction began a major escalation of U.S involvement in Vietnam";
		terms[21][0] = "When did Nixon Resign?";
		terms[21][1] = "1974";
		terms[21][2] = "The Watergate affair led to Nixon's resignation to avoid impeachment";
		terms[22][0] = "When did the Cold War end?";
		terms[22][1] = "1991";
		terms[22][2] = "The cold war was a“Victory” for the U.S. as the Soviet Union collapsed";
		terms[23][0] = "When was the World Trade Center bombed?";
		terms[23][1] = "2001";
		terms[23][2] = "The bombing of the World Trade Center Led to security challenges both home and abroad";
		System.out.println("Welcome to APUSH Summer Study Guide");
		System.out.println("I will give you an event, and you must type in the corresponding date. Press Enter when you are ready to start");
		console.nextLine();
		for(int i = 0; i < 23; i ++){
			int rand = (int) (Math.random() * 23) + 1;
			while(rand == lastguess){
				rand = (int) (Math.random() * 23) + 1;;
			}
			System.out.println(terms[rand][0]);
			String input = console.nextLine();
			lastguess = rand;
			if(input.equals(terms[rand][1])){
				System.out.println("Correct! Would you like to learn more information?");
				String yn = console.nextLine();
				correctscore++;
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
				incorrectscore++;
				String yn2 = console.nextLine();
				if(yn2.equalsIgnoreCase("no")){
					System.out.println("The correct answer is: " + terms[rand][1]);
					System.out.println("Would you like to learn more information?");
					String yn = console.nextLine();
					if(yn.equals("yes") || yn.equals("yes")){
						System.out.println(terms[rand][2]);
					}
						System.out.println("Would you like another question?");
						String cont1 = console.nextLine();
						if(cont1.equals("yes") || cont1.equals("y")){
							continue;
						}
						else{
							break;
						}
				}
				if(yn2.equals("yes") || yn2.equals("y")){
					System.out.println("Guess Again:");
					String guess2 = console.nextLine();
					if(guess2.equals(terms[rand][1])){
						System.out.println("Correct! Would you like to learn more information?");
						String yn = console.nextLine();
						correctscore++;
						if(yn.equals("yes") || yn.equals("y")){
							System.out.println(terms[rand][2]);
						}
							System.out.println("Would you like another question?");
							String cont1 = console.nextLine();
							if(cont1.equals("yes") || cont1.equals("y")){
								continue;
							}
							else{
								break;
							}
					}
					else{
						System.out.println("Incorrect, the correct answer is: " + terms[rand][1]);
						incorrectscore++;
						System.out.println("Would you like to learn more information?");
						String yn = console.nextLine();
						if(yn.equals("yes") || yn.equals("yes")){
							System.out.println(terms[rand][2]);
						}
							System.out.println("Would you like another question? Type quit if you are done, and enter to have another question");
							String cont1 = console.nextLine();
							if(cont1.equals("yes") || cont1.equals("y")){
								continue;
							}
							else{
								break;
							}
					}
					}
				}
			}
		System.out.println("Thanks for Playing!");
		System.out.println("You got " + ((double)correctscore/(correctscore + incorrectscore)) * 100 + "% of the questions right");
	}
}

