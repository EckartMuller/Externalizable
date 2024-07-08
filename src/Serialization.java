import java.io.*;


public class Serialization {
	public static void main(String[] args) {
		try
		{
			Calisan calisan1 = new Calisan("Berkant","Günel", 20000);
			FileOutputStream f1 = new FileOutputStream("C:\\Users\\MSI-NB\\OneDrive\\Masaüstü\\JavaWorks\\Giris Cıkıs Islemleri\\kitap\\sifreleme.txt");
			ObjectOutputStream o1 = new ObjectOutputStream(f1);
			o1.writeObject(calisan1);
			o1.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
