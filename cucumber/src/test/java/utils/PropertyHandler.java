package utils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyHandler {


	static String fileName = "config.properties";
	private static Properties properties;

	public PropertyHandler(){
	}

	public void finalize(){
	}

	public static String getProperty(String key){
		try{        

		//	String filePath = new File(fileName).getCanonicalPath();
			InputStream is = PropertyHandler.class.getResourceAsStream("/"+fileName);
		//	InputStream is =new FileInputStream(fileName);
			if(is==null)
			{
				throw new FileNotFoundException("invalid path");
			}
			properties=new Properties();
			properties.load(is);
		}catch(FileNotFoundException fnfe){

		}catch(IOException ie){

		}
		String value=properties.getProperty(key);
		if(value==null ){
			return null;
		}else{
			return value.trim();
		}
	}   
}
