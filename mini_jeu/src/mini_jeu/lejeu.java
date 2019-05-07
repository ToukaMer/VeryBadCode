package mini_jeu;

import java.util.Scanner;

public class lejeu {
	
	static int pe = 1;
	static int vi = 0;
	static int pi = 2;
	static int t1 = 3;
	static int[][] g = new int[10][15];
	static int v = 5;
	static int t2 = 0;
	static int p1 = 0;
	static int p2 = 0;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			for(int j=0;j<15;j++) {
				g[i][j] = vi;
			}
		}
		g[p1][p2] = pe;
		for(int i=0;i<15;i++) {
			int n = (int)(Math.random() * 9)+1;
			int m = (int)(Math.random() * 14)+1;
			g[n][m] = pi;
		}
		for(int i=0;i<10;i++) {
			int n = (int)(Math.random() * 9)+1;
			int m = (int)(Math.random() * 14)+1;
			g[n][m] = t1;
		}
		while((v!=0) && (t2<5)) {
			System.out.println("vie="+v+" trésors="+t2);
			System.out.println("z=haut   q=gauche    s=bas    d=droite");
			for(int i=0;i<10;i++) {
				System.out.print("|");
				for(int j=0;j<15;j++) {
					System.out.print(g[i][j]);
					System.out.print("|");
				}
				System.out.println("\n");
			}
			String  line;
			Scanner sc = new Scanner(System.in);
			line = sc.nextLine();
			if(line.equals("d")) {
				if(p2==14) {
					System.out.println("Action impossible");
				}
				else {
					g[p1][p2]=0;
					p2++;
					if(g[p1][p2]==2) {
						v--;
					}
					if(g[p1][p2]==3) {
						t2++;
					}
					g[p1][p2]=1;
				}
			}
			if(line.equals("q")) {
				if(p2==0) {
					System.out.println("Action impossible");
				}
				else {
					g[p1][p2]=0;
					p2--;
					if(g[p1][p2]==2) {
						v--;
					}
					if(g[p1][p2]==3) {
						t2++;
					}
					g[p1][p2]=1;
				}
			}
			if(line.equals("z")) {
				if(p1==0) {
					System.out.println("Action impossible");
				}
				else {
					g[p1][p2]=0;
					p1--;
					if(g[p1][p2]==2) {
						v--;
					}
					if(g[p1][p2]==3) {
						t2++;
					}
					g[p1][p2]=1;
				}
			}
			if(line.equals("s")) {
				if(p1==9) {
					System.out.println("Action impossible");
				}
				else {
					g[p1][p2]=0;
					p1++;
					if(g[p1][p2]==2) {
						v--;
					}
					if(g[p1][p2]==3) {
						t2++;
					}
					g[p1][p2]=1;
				}
			}
			System.out.println("\n\n");
		}
		
		System.out.println("vie="+v+" trésors="+t2);
		
		if(v==0) {
			System.out.println("Vous avez perdu");
		}
		
		if(t2==5) {
			System.out.println("Vous avez gagné");
		}
		
		

	}

}
