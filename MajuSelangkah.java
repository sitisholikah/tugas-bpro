import java.io.*;
class MajuSelangkah
{
	public static void main (String [] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		String ND;
		String NB;
		String Alamat;
		String Kota;
		int Usia;
		int BP;
		
		
			System.out.print("Masukkan Nama Depan:");
			ND = input.readLine();
			
			System.out.print("Masukkan Nama Belakang:");
			NB = input.readLine();
			
			System.out.print("Masukkan Alamat:");
			Alamat = input.readLine();
			
			System.out.print("Masukkan Kota Lahir:");
			Kota = input.readLine();
			
			System.out.print("Masukkan Usia (Tahun):");
			Usia = Integer.parseInt(input.readLine());
			
			System.out.print("Masukkan Biaya Pendaftaran (Rp.):");
			BP = Integer.parseInt(input.readLine());
			
				System.out.println("=====================================================");
				System.out.println("Nama Lengkap :" + ND + " " + NB);
				System.out.println("Email :" + ND + "@majuselangkah.com");
				System.out.println("Alamat :" + Alamat);
				System.out.println("Usia :" + Usia + " tahun");
				System.out.println("Biaya Pendaftaran :" + "Rp." + BP);
			
			
	}
}
