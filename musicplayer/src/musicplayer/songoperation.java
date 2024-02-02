package musicplayer;
import java.util.Scanner;
import java.util.ArrayList;
public class songoperation {
	static songs s = new songs();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<songs> a = new ArrayList<songs>();

    public static void playAll() {
        System.out.println("----Playing All the Songs----");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

    public static void shuffle() {
        System.out.println("**--Playing Songs in Shuffle Mode--**");
        for (int i = 0; i < a.size(); i++) {
            int random = (int) (Math.random() * 10);

            if (random <= a.size()) {
                System.out.println("Now Playing The Song :" + a.get(random));
            }

        }
    }

    public static void repeat() {
        System.out.println("Enter a song number to repeat");
        int choice = sc.nextInt();
        System.out.println("How many times do you want to repeat the song?");
        int choice2 = sc.nextInt();

        for (int i = 1; i <= choice2; i++) {
            System.out.println(a.get(choice - 1));
        }
        System.out.println("**==Repeat Completed ==**");
    }

    public static void add() {
        System.out.println("Enter number in sequence");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter The SongName");
        String n = sc.next();
        System.out.println("Enter The Song Duration");
        String d = sc.next();
        System.out.println("Enter The SingerName");
        String sn = sc.next();
        System.out.println("Enter Lyrics");
        String ly = sc.next();
        System.out.println("Enter Album Name");
        String al = sc.next();
        songs s = new songs(num, n, d, sn, ly, al);
        a.add(s);
        System.out.println("*---Song Added Successfully---*");
    }

    public static void remove() {
        System.out.println("Enter Song number to remove it");
        int songnum = sc.nextInt();
        a.remove(songnum - 1);
        System.out.println("Song Removed Successfully");
    }

    public static void view() {
        System.out.println(a);
    }

    public static void edit() {
        System.out.println("Enter the song number to edit the details");
        int choice2=sc.nextInt();
        System.out.println("Enter number in sequence");
        int num = sc.nextInt();
        sc.next();
        System.out.println("Enter The Song Name");
        String n = sc.next();
        System.out.println("Enter The Song Duration");
        String d = sc.next();
        System.out.println("Enter The Singer Name");
        String sn = sc.nextLine();
        System.out.println("Enter Lyrics");
        String ly = sc.next();
        System.out.println("Enter The Album Name");
        String al = sc.next();
        a.get(choice2-1).setid(num);
        a.get(choice2-1).setName(n);
        a.get(choice2-1).setDuration(d);
        a.get(choice2-1).setSinger(sn);
        a.get(choice2-1).setLyrics(ly);
        a.get(choice2-1).setAlbum(al);
        System.out.println("Song Edited Successfully");

    }

}
