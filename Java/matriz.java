import java.util.Random;

public class matriz{
	public static void main(String[] args) {
		final int linha=3;
		final int coluna=5;
		int[][] numeros=new int[linha][coluna];
		
		for(int l=0;l<linha;l++){
		    for(int c=0;c<coluna;c++){
		       numeros[l][c]=new Random().nextInt(100);
		    }
		}
		for(int l=0;l<linha;l++){
		    for(int c=0;c<coluna;c++){
		       System.out.printf(" [ " + numeros[l][c] + " ] ");
		    }
		System.out.printf("%n");
		}
	}
}