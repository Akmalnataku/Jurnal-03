import java.util.Scanner;

public class Soal01{
	public static void main(String[] args) {
		int n, hasil;
		
		System.out.println("Masukkan angka yang ingin dikuadratkan.");
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		hasil = n*n;
		
		System.out.println("Hasil kuadratnya adalah " + hasil);
	}
}	