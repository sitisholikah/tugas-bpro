import java.util.Scanner;
public class Soal
	{
	public static void main (String[]args)
	{
	Scanner i = new Scanner (System.in);
	int a;
	int b;
	int c;
	int d;
	int j;
	int n;
	int no;
	d = 0;
	n = 0;
	no = 1;
	
	System.out.print("Masukkan jumlah soal yang diinginkan = ");
	
	c = i.nextInt();
	
	System.out.println(" ");
	
	while ( c > d )
		{
			a = (int) ((Math.random() + 0.1) * 10);
			b = (int) ((Math.random() + 0.1) * 10);
			System.out.print(no +") ");
			System.out.print(a + " + ");
			System.out.print(b + " = ");
			j = i.nextInt();
			if (j == a + b) 
				{
				n += 10;
				}
			d++;
			no++;
		}
	System.out.println("");
	System.out.print("Nilai anda = ");
	System.out.print(n);
	}
	}
