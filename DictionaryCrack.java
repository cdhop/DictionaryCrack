import java.security.MessageDigest;
import java.io.*;

public class DictionaryCrack
{
	MessageDigest md;
	File dictionary;

	public DictionaryCrack() throws Exception
	{
		md = MessageDigest.getInstance("MD5");
		dictionary = new File("default.txt");
	}
	
	public String crack(String hash)
	{
		try
		{
			boolean done = false;
			FileReader fileReader = new FileReader(dictionary);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String guess;
			
			while(((guess = bufferedReader.readLine()) != null) && !done)
			{
			
			}
			fileReader.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e);
		}
		
		return guess;
	}
	
	public static void main(String[] args)
	{
	
	}
}