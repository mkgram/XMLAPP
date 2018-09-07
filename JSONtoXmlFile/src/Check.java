import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
 
public class Check {
	public static void main(String[] args) throws IOException, JSONException {
		
		
		String jsonStr = "{\"Customer\": {" +
							    "\"address\": {" +
							        "\"street\": \"NANTERRE CT\"," +
							        "\"postcode\": 77471" +
							    "}," + 
							    "\"name\": \"Mary\"," +
							    "\"age\": 37" +
							"}}";
		
		JSONObject json = new JSONObject(jsonStr);
		String xml = XML.toString(json);
		
		System.out.println(xml);
		
		
		
		}
	}
