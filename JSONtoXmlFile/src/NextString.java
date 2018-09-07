import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;

public class NextString 
{
	 public static void main(String args[]) throws JSONException, FileNotFoundException,IOException
	   {
		  
			 //File writeFile=new File("C:\\Users\\IBM_ADMIN\\Desktop\\write1.txt");
		  String s = "{menu:{\"1\":\"sql\", \"2\":\"android\", \"3\":\"mvc\"}}";
		   JSONObject jObject  = new JSONObject(s);
		    JSONObject  menu = jObject.getJSONObject("menu");

		    
		    File newTextFile = new File("C:\\Users\\IBM_ADMIN\\Desktop\\write200.xml");
		    
		    FileWriter fw = new FileWriter(newTextFile);
		    BufferedWriter bufferedWriter = new BufferedWriter(fw);
		    Iterator iter = menu.keys();
		    while(iter.hasNext()){
		        String key = (String)iter.next();
		        String value = menu.getString(key);
				   
		    
		        String stag1="<Details>";
		        String stag2="</Details>";
		        String s1="<Name>"+key+"</Name>";
			       String s2="<Value>"+value+"</Value>";
		        
			       
			           // String str = "SomeMoreTextIsHere";
			            /*File newTextFile = new File("C:\\Users\\IBM_ADMIN\\Desktop\\write12.txt");*/
			       
			       bufferedWriter.newLine();
			       bufferedWriter.write(stag1);
			       bufferedWriter.newLine();
			       bufferedWriter.write(s1);
			       bufferedWriter.newLine();
			       bufferedWriter.write(s2);
			       bufferedWriter.newLine();
			       bufferedWriter.write(stag2);
			      
			       
			            //fw.write(stag1+"\n"+s1+"\n"+s2+"\n"+stag2);
			          //  System.out.println(stag1+'\n'+s1+'\n'+s2+'\n'+stag2);
			       
			     
		    
	}
		    bufferedWriter.toString().trim();
		    bufferedWriter.close();
	   }
}
