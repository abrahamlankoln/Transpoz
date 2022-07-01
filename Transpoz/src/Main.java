import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sat, sut;
		Scanner deger = new Scanner(System.in);
		System.out.print("Satir sayisini giriniz: ");
		sat = deger.nextInt();
		System.out.print("Sutun sayisini giriniz: ");
		sut = deger.nextInt();

		int[][] A = new int[sat][sut];
		int[][] B = new int[sut][sat];
		for (int i = 0; i < sat; i++) {
			for (int j = 0; j < sut; j++) {
				System.out.print("lutfen " + i + j + " i giriniz: ");
				A[i][j] = deger.nextInt();
			}
		}
		for (int i = 0; i < sat; i++) {
			for (int j = 0; j < sut; j++) {
				B[j][i] = A[i][j];
			}
		}
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j]+" ");
			}
		System.out.println("");
		}
	}

}
