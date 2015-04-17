import java.util.*;
public class Menu
	{
	 public static void main(String[]args)
	 {
	  Scanner br=new Scanner(System.in);
	  int menu=0;  
	  int pilihan;  
	  int porsi;  
	  int subtotal=0;
	  int harga;
	  int keluar=0;
	  int total=0;
		
	  do{
	  
	   System.out.println("======================");
	   System.out.println("Warung Makan Sederhana");
	   System.out.println("   Jalan Semolowaru   ");
	   System.out.println("======================");
	   System.out.println("MENU MAKANAN");
	   System.out.println("------------");
	   System.out.println("1. Nasi Goreng");
	   System.out.println("2. Mie Goreng");
	   System.out.println("3. Soto Ayam Kampung");
	   System.out.println("4. Es Teh"); 
	   System.out.println("5. Jus Strawberry");
	   System.out.println("____________________________________________");
	   System.out.print("Silakan Pilih Menu Yang Anda Inginkan [1-5] : ");
	   pilihan=br.nextInt();  
		
	   switch(pilihan) {
		case 1: menu=12000;
		break;
		case 2: menu=12000;
		break;
		case 3: menu=14000;
		break;
		case 4: menu=3000;
		break;
		case 5: menu=4000;
		break;
		default:
		  subtotal=0;
		  System.out.println("Maaf, Menu Yang Anda Pilih Tidak Tersedia");
	   }
			
	   if (pilihan<=5){
		System.out.print("Masukkan jumlah porsi : ");
		porsi=br.nextInt(); 
		subtotal= menu * porsi;
		System.out.println("Subtotal : "+subtotal);
	 
		}      
		System.out.print("Anda Ingin Memesan Lagi? [1 = YA , 0 = TIDAK] : ");
		keluar=br.nextInt();
		total=total+subtotal;
	   
	  }
	  while(keluar==1);{
	   
	   System.out.print("Total : " + total);
	  }
	 }
	}
