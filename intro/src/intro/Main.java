package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//camelCase
		//Don't repeat yourself
		
		String internetSubeButonu = "�nternet �ubesi";
		
		double dolarDun = 1.18;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		
		//System.out.println("Hello world");
		System.out.println(internetSubeButonu + "\n");
		
		
/*		
		if(dolarBugun<dolarDun)
		{
			System.out.println("Dolar d��t� resmi");
		}
		else if(dolarBugun>dolarDun)
		{
			System.out.println("Dolar y�kseldi resmi");
		}
		else
		{
			System.out.println("Dolar e�ittir resmi");
		}
*/		
		
/*		
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "�ift�i Kredisi";
		String kredi3 = "Ta��t Kredisi";
		String kredi4 = "Konut Kredisi";
		String kredi5 = "Emekli Kredisi";
		String kredi6 = "MEB Kredisi";
			
		System.out.println(kredi1);	
		System.out.println(kredi2);	
		System.out.println(kredi3);	
		System.out.println(kredi4);	
		System.out.println(kredi5);	
		System.out.println(kredi6);	
*/		
		
		
		String[] krediler = {
			"H�zl� Kredi",
			"�ift�i Kredisi",
			"Ta��t Kredisi",
			"Konut Kredisi",
			"Emekli Kredisi",
			"MEB Kredisi",
			"D���n Kredisi"};
		
		//for each
		for(String kredi : krediler)
		{
			System.out.println(kredi);
		}
	
		System.out.println("");
		
		for(int i = 0; i<krediler.length; i++)
		{
			System.out.println(krediler[i]);
		}
		
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi1;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
		
		
	}

}
