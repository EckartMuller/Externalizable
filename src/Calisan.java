import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Calisan implements Externalizable{
	private String ad , soyad;
	private int maas;
	
	public Calisan(String ad ,String soyad, int maas)
	{
		this.ad = ad;
		this.soyad = soyad;
		this.maas = maas;
	}
	
	public Calisan()
	{
		
	}
	public String getAd()
	{
		return ad;
	}
	public String getSoyad()
	{
		return soyad;
	}
	public int getMaas()
	{
		return maas;
	}
	public void writeExternal(ObjectOutput yazdir)
	{
		try
		{
			yazdir.writeObject(this.ad);
			yazdir.writeObject(this.soyad);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void readExternal(ObjectInput oku)
	{
		try
		{
			this.ad = (String)oku.readObject();
			this.soyad = (String)oku.readObject();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
