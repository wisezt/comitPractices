package july11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicPlayer {

	List<Song> playlist;

	MusicPlayer() {

		playlist = new ArrayList<>();

	}

	public void displyMenu() {
		System.out.println("\n");
		System.out.println("********************");
		System.out.println("*                  *");
		System.out.println("*COMIT MUSIC PLAYER*");
		System.out.println("*                  *");
		System.out.println("********************");

		System.out.println("1- Show playlist");
		System.out.println("2- Play a song");
		System.out.println("3- Add a song");
		System.out.println("4- Quit");

		System.out.print("Please enter your selection:");
		Scanner scan = new Scanner(System.in);

	
			int chooseNum = 0;
			try {
			chooseNum = scan.nextInt();
		} catch(Exception e){
			System.out.println("Please input 1 ~ 4");
			displyMenu();
		}
			switch (chooseNum) {
			case 1:
				showPlaylist();
				break;
			case 2:
				play();
				break;
			case 3:
				add();
				break;

			case 4:
				System.out.print("******");
				System.out.print("Program ended");
				System.out.print("See you round");
				System.out.print("******");
				break;
			default:
				System.out.println("please choose 1- 4");
				displyMenu();
			}
		
	}

	public void showPlaylist() {
		System.out.println("\n");
		System.out.println("********************");
		System.out.println("*                  *");
		System.out.println("*     Playlist     *");
		System.out.println("*                  *");
		System.out.println("********************");

		if (playlist.size() == 0) {
			System.out.print("There is no song in the list. Add a new one?[Y/N]");
			Scanner scan = new Scanner(System.in);
			String input = "N";
			try{
			 input = scan.nextLine();
			}		 catch(Exception e){
				System.out.println("Please input Y or N!");
				showPlaylist();
			}
			
			
			if (input.equals("Y") || input.equals("y")) {
				this.add();

			} else if (input.equals("N") || input.equals("n")){
				displyMenu();

			}else {System.out.println("Please input Y or N");showPlaylist();};
		} else {
			System.out.println("Playlist:");
			for (int i = 0; i < playlist.size(); i++) {
				// showing index = real index +1
				System.out.println((i + 1) + ". " + playlist.get(i).toString());
			}
			play();
		}
	}

	public void play() {
		System.out.println("\n");
		System.out.println("********************");
		System.out.println("*                  *");
		System.out.println("*     Playing     *");
		System.out.println("*                  *");
		System.out.println("********************");

		System.out.print("Please enter your selection:");
		Scanner scanInt = new Scanner(System.in);
		int number;
		try{
			number = scanInt.nextInt();
	

		// real index = showing index -1
		System.out.println("Now playing " + playlist.get(number - 1));
		System.out.println("..........End!!!\n\n");
		} catch(Exception e){
			System.out.println("Please input 1~" + (playlist.size()));
			play();
		}
		displyMenu();

	}

	public void add() {
		System.out.println("\n");
		System.out.println("********************");
		System.out.println("*                  *");
		System.out.println("*   Adding Song    *");
		System.out.println("*                  *");
		System.out.println("********************");

		System.out.print("Enter the song's name:");
		Scanner scanString = new Scanner(System.in);
		String title = scanString.nextLine();
		System.out.print("Enter the author's name:");
		String author = scanString.nextLine();
		playlist.add(new Song(title, author));
		System.out.println();
		showPlaylist();

	}

}
