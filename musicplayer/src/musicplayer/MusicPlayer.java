package musicplayer;
import java.util.*;
public class MusicPlayer {
	static int choice;
	static Scanner s1=new Scanner(System.in);
	static boolean loop=true;
	public static void musicPlayer() {
		System.out.println("*=======MusicPlayer======*\n"+"---Menu---\n"
				+ "1.Play Songs\n"
				+ "2.Add or Remove a song\n"
				+ "3.Edit Details\n"
				+ "4.View Song List\n"
				+ "5.Exit\n");
		

		choice = s1.nextInt();

		while (loop) {

			switch (choice) {
				case 1: {

					System.out.println("1.Play All Songs\n"
							+ "2.Shuffle\n"
							+ "3.Repeat\n"
							+ "4.Go back\n");

					choice = s1.nextInt();

					switch (choice) {
						case 1: {
							songoperation.playAll();
							break;
						}
						case 2: {
							songoperation.shuffle();
							break;
						}
						case 3: {
							songoperation.repeat();
							break;
						}
						case 4: {
							System.out.println();
							musicPlayer();
							break;
						}

						default: {
							System.out.println("Invalid value: " + choice + "\n");
						}
					}
					break;
				}

				case 2: {

					System.out.println("1.Add a song\n"
							+ "2.Remove a song\n"
							+ "3.Go back\n");

					choice = s1.nextInt();

					switch (choice) {
						case 1: {
							songoperation.add();
							break;
						}
						case 2: {
							songoperation.remove();
							break;
						}
						case 3: {
							musicPlayer();
							break;
						}
						default: {
							System.out.println("Invalid value: " + choice + " Please try again\n");
							break;
						}
					}
					break;
				}

				case 3: {

					System.out.println("1.Edit Details\n" + "2.Go Back\n");

					choice = s1.nextInt();

					switch (choice) {
						case 1: {
							songoperation.edit();
						}
						break;

						case 2: {
							System.out.println();
							musicPlayer();
							break;
						}
					}
					break;
				}

				case 4: {
					System.out.println();
					songoperation.view();
					choice = 1;
					break;
				}
				case 5: {
					System.out.println();
					System.out.println("Thank you for using MusicPlayer....");
					loop = false;
					break;
				}
				default: {
					System.out.println("Invalid value: " + choice + " Please try again\n");
					musicPlayer();
					break;
				}
			}
		}
	}
		



	public static void main(String[] args) {

		musicPlayer();
	}

}
