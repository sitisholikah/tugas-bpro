import java.io.*;
class tiket
{
	public static void main(String[]args) throws IOException
	{
	BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		int usia,tiket;
		String depan,belakang,hari,tanggal;
		double diskon =0, bayar =0, totalbayar=0;
		
		System.out.println("==========================");
		System.out.println("Transaksi penjualan karcis");
		System.out.println("Bioskop");
		System.out.println("Kawan sejati");
		System.out.println("Jln. Tugu Tani 26, Jakarta");
		System.out.println("==========================");
		
		System.out.print("Nama Depan :");
		depan = input.readLine();
		System.out.print("Nama Belakang :");
		belakang = input.readLine();
		System.out.print("Usia Pembeli :");
		usia = Integer.parseInt(input.readLine());
		System.out.print("Hari Transaksi:");
		hari = input.readLine();
		System.out.print("Tanggal Transaksi:");
		tanggal = input.readLine();
		System.out.print("Jumlah Tiket yang Dibeli :");
		tiket = Integer.parseInt(input.readLine());
		
		if (hari.equals("senin"))
		{
			bayar = 20000*tiket;
		}
		else
		{
			bayar = 25000*tiket;
		}
		if (usia<15)
		{
			diskon = bayar*0.1;
		}
		
		
		System.out.println ("Hari/Tanggal transaksi:" + hari +"," + tanggal);
		System.out.println ("Nama Pembeli:" + depan + belakang);
		System.out.println ("harga sebelum diskon:" + bayar);
		System.out.println ("Diskon (10%):" + diskon);
		System.out.println ("Total Bayar :" + (bayar-diskon));
	}
}
