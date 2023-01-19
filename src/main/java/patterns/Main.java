package patterns;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int patternNumber = sc.nextInt();
		int n = sc.nextInt();
		switch (patternNumber) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
//			case 6: deleted some code by mistake , will have to redo
//				Pattern6(n);
//				break;
			//case 7:Pattern7(n);
			//break;
			case 8:
				Pattern8(n);
				break;
			case 9:
				Pattern9(n);
				break;
			case 10:Pattern10(n);
				break;
			case 11:
				Pattern11();
				break;
			case 12:Pattern12();
				break;
				case 13:Pattern13(n);
				 break;
			case 14:Pattern14(n);
				break;
			case 15:Pattern15(n);
				break;
			case 16:Pattern16(n);
				break;
			case 17:Pattern17(n);
				break;
			case 18:Pattern18(n);
				break;
			case 19:Pattern19(n);
				break;
			case 20:Pattern20(n);
				break;
		}
	}

//	public static void Pattern6(int n) {
//		int nstars = n / 2 + 1;
//		int nspaces = 1;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= nstars; j++) {
//				System.out.print("*\t");
//			}
//
//
//			}
//
//			for (int j = 1; j <= nstars; j++) {
//				System.out.print("*\t");
//			}
//
//			if (i <= n / 2) {
//				nspaces += 2;
//				nstars--;
//			} else {
//				nspaces -= 2;
//				nstars++;
//			}
//
//			System.out.println();
//		}
//	}

	public static void Pattern8(int n) {
		int nsp = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nsp; j++) {
				System.out.print("\t");
			}
			System.out.println("*");
			nsp--;
		}
	}

	public static void Pattern9(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j == n + 1 || i == j) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}

			System.out.println();
		}
	}

	public static void Pattern10(int n){
		int nos= n/2;
		int nis=-1;
		for(int i =1; i<=n; i++){
			for(int j=1; j<=nos;j++){
				System.out.print("\t");
			}
			System.out.print("*\t");
			for(int k=1; k<=nis; k++){
				System.out.print("\t");
			}
			if(i>1 && i<n){
				System.out.print("*\t");
			}
			if(i<=n/2){
				nos--;
				nis += 2;
			}else {
				nos++;
				nis-=2;
			}
			System.out.println();

		}

	}

	public static void Pattern11() {
		int count = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + "\t");
				count++;
			}
			System.out.println();
		}
	}

	public static void Pattern12() {
		int first = 0;
		int second = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(first + "\t");
				int num = first+second;
				first= second;
				second= num;
			}
			System.out.println();
		}
	}
	public static void Pattern13(int n) {
		for (int i = 0; i < n; i++) {
			int val = 1;
			for (int j = 0; j <= i; j++) {
					System.out.print(val + "\t");
					val = (val * (i - j)) / (j + 1);
			}
			System.out.println();
		}
	}

	public static void Pattern14(int n){
		for(int i=1; i<=10;i++){
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}

	public static void Pattern15(int n){
		int nst = 1;
		int nsp = 2;
		int count =1;
		for(int i=1;i<=n;i++){
			for(int j=1; j<=nsp; j++){
				System.out.print("\t");
			}
			int temp=count;
			for(int k=1; k<=nst;k++){
				System.out.print(temp + "\t");
				if(k<= nst/2){
					temp++;
				}
				else{
					temp--;
				}
			}
			if(i <= n/2){
				count++;
			} else{
				count--;
			}
			System.out.println();
			if(i<= n/2){
				nst +=2;
				nsp--;
			}
			else{
				nst -=2;
				nsp++;
			}
		}
	}

	public static void Pattern16(int n) {
		int nsp = 2 * n - 3;
		int nst = 1;
		for(int i = 1; i <= n; i++) {

			for (int j = 1; j <= nst; j++) {
				System.out.print(j + "\t");
			}

			for (int j = 1; j <= nsp; j++) {
				System.out.print("\t");
			}

			nst = i < n ? nst : nst - 1;
			for (int j = nst; j >=1; j--) {
				System.out.print(j + "\t");
			}

			nst++;
			nsp -= 2;

			System.out.println();
		}
	}

	public static void Pattern17(int n) {
	int nspaces = n / 2;
	int nstars = 1;
        for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= nspaces; j++) {
			if (i != n / 2 + 1) {
				System.out.print("\t");
			} else {
				System.out.print("*\t");
			}
		}

		for (int j = 1; j <= nstars; j++) {
			System.out.print("*\t");
		}

		if (i <= n / 2) {
			nstars++;
		} else {
			nstars--;
		}

		System.out.println();
	}
	}

	public static void Pattern18(int n) {
		int nst = n;
		int nsp = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nsp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= nst; j++) {
				if (i > 1 && i <= n / 2 && j > 1 && j < nst) {
					System.out.print("\t");
				} else {
					System.out.print("*\t");
				}
			}

			if (i <= n / 2) {
				nst -= 2;
				nsp++;
			} else {
				nst += 2;
				nsp--;
			}

			System.out.println();
		}
	}

	public static void Pattern19(int n) {
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				if(i == 1){
					if(j == n || j <= n / 2 + 1){
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				} else if (i <= n / 2){
					if(j == n || j == n / 2 + 1){
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				} else if (i == n / 2 + 1){
					System.out.print("*\t");
				} else if (i < n){
					if(j == 1 || j == n / 2 + 1){
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				} else {
					if(j == 1 || j >= n / 2 + 1){
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}
			}

			System.out.println();
		}
	}

//	        *				*
//			*				*
//			*		*		*
//			*	*		*	*
//			*				*

	public static void Pattern20(int n) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == n) {
						System.out.print("*\t");
					} else if (i > n / 2 && (i == j || i + j == n + 1)) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}
				System.out.println();
			}
		}
	}





