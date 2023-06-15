package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	
	Properties property;
	public void confipath(String path)
	{
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(path);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		property=new Properties();
		try {
			property.load(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public String fetchproperty(String key)
	{
		return property.getProperty(key);
	}

}
