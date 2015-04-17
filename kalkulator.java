import java.io.*;
class kalkulator
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Inputkan Bilangan 1 = ");
		int bilangan1 = Integer.parseInt(input.readLine());
		System.out.print("Inputkan Bilangan 2 = ");
		double bilangan2 = Double.parseDouble(input.readLine());
		
		System.out.println();
		System.out.println("Hasil Penjumlahan adalah = "+(bilangan1+bilangan2));
		System.out.println("Hasil Pengurangan adalah = "+(bilangan1-bilangan2));
		System.out.println("Hasil Perkalian adalah = "+(bilangan1*bilangan2));
		System.out.println("Hasil Pembagian adalah = "+(bilangan1/bilangan2));
	}
}	
