import java.util.Scanner;

public class Soal02{
	public static void main(String[] args) {
	//Variabel
	String nama;
	int jam;
	int tambah;
	
	System.out.println("Mata kuliah kesukaanmu apa?");
	System.out.println("Berapa jam per minggu?");
	
	Scanner scan = new Scanner(System.in);
	nama = scan.nextLine();
	jam = scan.nextInt();
	
	tambah = 2 * jam;
	System.out.println("Aku suka kuliah " +nama + ".");
	System.out.println("Kuliah " +jam + " jam per minggu sepertinya kurang.");
	System.out.println("Bagaimana kalau ditambah jadi " + tambah + " jam per minggu?");
	}
}	