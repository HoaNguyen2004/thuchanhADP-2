package chenvaxoa;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu can chen: ");
		int n = sc.nextInt();
		int a[] = new int[100];
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print("a["+i+"] = "+ a[i]);
		}
		System.out.println();
		System.out.print("Nhap vi tri can chen: ");
		int vt = sc.nextInt();
		System.out.println();
		System.out.print("Nhap phan tu can chen: ");
		int x = sc.nextInt();
		for(int i = n - 1; i >= vt; i--) {
			a[i + 1] = a[i];
		}
		a[vt] = x;
		n++;
		
		for(int i = 0; i < n; i++) {
			System.out.print("a["+i+"] = "+ a[i]+ " ");
		}
	}

}
