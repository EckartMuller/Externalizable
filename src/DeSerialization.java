import java.io.*;
public class DeSerialization {
	public static void main(String[] args) {
		try
		{
			Calisan calisan1;
			FileInputStream f2=new FileInputStream("C:\\\\Users\\\\MSI-NB\\\\OneDrive\\\\Masaüstü\\\\JavaWorks\\\\Giris Cıkıs Islemleri\\\\kitap\\\\sifreleme.txt");
			ObjectInputStream oku = new ObjectInputStream(f2);
			calisan1 = (Calisan) oku.readObject();
			System.out.println(calisan1.getAd());
			System.out.println(calisan1.getSoyad());
			System.out.println(calisan1.getMaas());
			System.out.println(calisan1.getClass());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
