package FolderNames;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.*;
import org.xml.sax.InputSource;
import org.w3c.dom.*;


public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
        List<String> result = new ArrayList<>();

	    try {
	        DocumentBuilderFactory dbf =
	            DocumentBuilderFactory.newInstance();
	        DocumentBuilder db = dbf.newDocumentBuilder();
	        InputSource is = new InputSource();
	        is.setCharacterStream(new StringReader(xml));

	        Document doc = db.parse(is);
	        NodeList nodes = doc.getElementsByTagName("folder");

	        for (int i = 0; i < nodes.getLength(); i++) {
	           Element element = (Element) nodes.item(i);
	           
	           NamedNodeMap attr = element.getAttributes();
	           
	           if(attr != null) { 
	        	   String n = attr.getNamedItem("name").getNodeValue();
	        	   if(n != null && n.toCharArray()[0] == startingLetter) {
	        		   result.add(n);
	        	   }
	           }
	        }
	    }
	    catch (Exception e) {
	        throw new Exception(e);
	    }

        	  
        return result;
    }
    
    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<folder name=\"c\">" +
                    "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                    "</folder>" +
                    "<folder name=\"users\" />" +
                "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}
