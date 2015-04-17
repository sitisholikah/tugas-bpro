import java.io.*;

class looping

{
	public static void main (String [] args) throws IOException
	{
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	int pilih;
	int angka1=0;
	int angka2=0;
	
	do
	
		{
			System.out.println("======================");
			System.out.println("	Kalkulator		");
			System.out.println("======================");
			System.out.println("1. Masukkan Angka ");
			System.out.println("2. Hasil Jumlah ");
			System.out.println("3. Hasil Kali ");
			System.out.println("4. Keluar ");
			System.out.println("======================");
			System.out.print("Masukkan Pilihan Anda : ");

		pilih = Integer.parseInt (br.readLine());
	
	switch (pilih)
			{
				case 1 :
					System.out.print("1. Masukkan Angka Pertama : ");
					angka1 = Integer.parseInt(br.readLine());
					System.out.print("1. Masukkan Angka Kedua : ");
					angka2 = Integer.parseInt(br.readLine());
				break;
				case 2 :
					System.out.println("Hasil Penjumlahan adalah : " + (angka1+angka2) );
					System.out.println("Hasil Pengurangan adalah : " + (angka1-angka2) );
				case 3 :
					System.out.println("Hasil Perkalian adalah : " + (angka1*angka2) );
					System.out.println("Hasil Pembagian adalah : " + (angka1/angka2) );
				break;
				case 4 :
					System.exit(0);
				break;
			}
	
		} while(true);

	}
}
