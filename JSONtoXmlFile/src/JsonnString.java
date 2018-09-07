import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonnString 
{
	// private static final String FILENAME = "C:\\Users\\IBM_ADMIN\\Desktop\\writejson.txt";
   public static void main(String args[]) throws JSONException, FileNotFoundException,IOException
   {
	  /* ObjectMapper objectMapper = new ObjectMapper();

	   String strJson =
	       "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

	   try {
	       OutputString os = objectMapper.readValue(strJson, OutputString.class);

	      
	       
	       System.out.println("car brand = " + os.getBrand());
	       System.out.println("car doors = " + os.getDoors());
	   } catch (IOException e) {
	       e.printStackTrace();
	   }*/
	   //ObjectMapper mapper = new ObjectMapper();
      
	   //private static final String FILENAME = "C:\\Users\\IBM_ADMIN\\Desktop\\writejson.txt";
	   
	   /*BufferedWriter bw = null;
		FileWriter fw = null;*/
		 File writeFile=new File("C:\\Users\\IBM_ADMIN\\Desktop\\write1.txt");
	  String s = "{menu:{\"1\":\"sql\", \"2\":\"android\", \"3\":\"mvc\"}}";
	   JSONObject jObject  = new JSONObject(s);
	    JSONObject  menu = jObject.getJSONObject("menu");

	    FileWriter fw=null;
	    for(int i=1;i<=3;i++){
	    Iterator iter = menu.keys();
	    while(iter.hasNext()){
	        String key = (String)iter.next();
	        String value = menu.getString(key);
	    /* for(int i=1;i<=3;i++)
	     {
	       System.out.println(key);
	       String s1="<Name>"+key+"</Name>";
	       String s2="<Value>"+value+"</Value>";
	       fw=new FileWriter(writeFile);
	       fw.write(s1);
	       fw.write(s2);
	       System.out.println(fw);
	       System.out.println(value);
	       fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(s1);
			bw.write(s2);
	     } 
	    }*/
	        
	    BufferedWriter writer = null;
	    try
	    {
	    	String s1="<Name>"+key+"</Name>";
		       String s2="<Value>"+value+"</Value>";
	        writer = new BufferedWriter( new FileWriter("C:\\Users\\IBM_ADMIN\\Desktop\\write2.txt"));
	        writer.write(s1);
	        System.out.println("Ram"+s1);
	        writer.write(s2);
	        System.out.println("sita"+s2);        

	    }
	    catch ( IOException e)
	    {
	    }
	    finally
	    {
	        try
	        {
	            if ( writer != null)
	            	System.out.println(writer);
	            writer.close( );
	        }
	        catch ( IOException e)
	        {
	        }
	    }
	   
	        }
   }
   }
}
