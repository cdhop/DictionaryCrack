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
        String result = null;
        
		try
		{
			boolean done = false;
			FileReader fileReader = new FileReader(dictionary);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String guess = null;
            String guess_hash;
			
			while(((guess = bufferedReader.readLine()) != null) && !done)
			{
                md.reset();
                md.update(guess.getBytes());
                guess_hash = hashToString(md.digest());
                
                if(guess_hash.equals(hash))
                {
                    result = new String(guess);
                    done = true;
                }
			}
			fileReader.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e);
		}
		
		return result;
	}
	
    protected String hashToString(byte[] hash)
	{
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < hash.length; i++)
		{
			sb.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}
    
	public static void main(String[] args)
	{
        try
        {
            if(args.length > 0)
            {
                DictionaryCrack dc = new DictionaryCrack();
                System.out.println("Password is: " + dc.crack(args[0]));
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception: " + e);
        }
        
	}
}