package panCTD;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadFile {
	  public static void main(String[] args)

	  {

	     try

	     {

	        /*

	         * Get a connection to the URL and start up

	         * a buffered reader.

	         */

	        long startTime = System.currentTimeMillis();

	  

	        System.out.println("Connecting to web site...\n");

	  

	        /*URL url = new URL("http://www.getmura.com/currentversion/");*/
	        /* URL url = new URL("http://iweb.dl.sourceforge.net/project/sevenzip/7-Zip/9.20/7z920.exe");*/
	        URL url = new URL("http://originaldll.com/file/mscoree.dll/22913.html");
	        	
	        

	        url.openConnection();

	        InputStream reader = url.openStream();

	  

	        /*

	         * Setup a buffered file writer to write

	         * out what we read from the website.

	         */

	        /*FileOutputStream writer = new FileOutputStream("C:/Users/kathy/test/7z920.exe");*/
	        FileOutputStream writer = new FileOutputStream("C:/Users/kathy/test/mscoree.dll");

	        byte[] buffer = new byte[153600];

	        int totalBytesRead = 0;

	        int bytesRead = 0;

	  

	        System.out.println("Reading file 150KB blocks at a time.\n");

	  

	        while ((bytesRead = reader.read(buffer)) > 0)

	        {  

	           writer.write(buffer, 0, bytesRead);

	           buffer = new byte[153600];

	           totalBytesRead += bytesRead;

	        }

	  

	        long endTime = System.currentTimeMillis();

	  

	        System.out.println("Done. " + (new Integer(totalBytesRead).toString()) + " bytes read (" + (new Long(endTime - startTime).toString()) + " millseconds).\n");

	        writer.close();

	        reader.close();

	     }

	     catch (MalformedURLException e)

	     {

	        e.printStackTrace();

	     }

	     catch (IOException e)

	     {

	        e.printStackTrace();

	     }

	  

	  }

	  
	

}
