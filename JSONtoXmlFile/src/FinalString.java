import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class FinalString 
{
  public static void main(String args[]) throws JSONException
  {
	  
	  File readFile=new File("C:\\Task\\NewFolderFinal2\\wsdls\\ABRGenerate.wsdl");
	  File writeFile=new File("C:\\Task\\ram786.xml");
	  FileReader fr=null;
	  FileWriter fw=null;
	  try
	  {
		  fr=new FileReader(readFile);
		  fw=new FileWriter(writeFile);
		  int ch;
		  while((ch=fr.read())!=-1)
		  {
			  fw.write(ch);
		  }
	  }
	  catch(Exception e)
	  {
		  
	  }
	  finally
	  {
		  
	  }
	  try
	  {
		  fr.close();
		  fw.close();
	  }
	  catch(Exception e1)
	  {
		  
	  }
	  
	  String s = "{menu:{\"1\":\"sql\", \"2\":\"android\", \"3\":\"mvc\"}}";
	   JSONObject jObject  = new JSONObject(s);
	    JSONObject  menu = jObject.getJSONObject("menu");

	    Map<String,String> map = new HashMap<String,String>();
	    Iterator iter = menu.keys();
	    while(iter.hasNext()){
	        String key = (String)iter.next();
	        String value = menu.getString(key);
	       System.out.println(key);
	       System.out.println(value);
	    }
	  
	  
	  /*JSONArray jsonArray = "[{id:\"1\", name:\"sql\"},{id:\"2\",name:\"android\"},{id:\"3\",name:\"mvc\"}]";
	  JSON newJson = new JSON();

	  for (each json in jsonArray) {
	      String id = json.get("id");
	      String name = json.get("name");

	      newJson.put(id, name);
	  }

	  return newJson;*/
  }
}
