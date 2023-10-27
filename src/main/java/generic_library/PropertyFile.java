package generic_library;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {

	public String getPropertydata(String key) throws Throwable{
		Properties p= new Properties();
		FileInputStream fis=new FileInputStream(IPathConstant.propertyFilePath);
		p.load(fis);
		return p.getProperty(key);
	}
}

