package JavaCreatorMain;

import java.util.TreeMap;

public class JavaCreatorApp {

	public static void main(String[] args) {
		
		TreeMap<String, String> varType = new TreeMap<String, String>();
		
		varType.put("class", "name:TestCreatorApp;access:public;implements:;extends:;");
		varType.put("method", "name:main;access:public;static:yes;return:no;returnVar:;parm:String[] args;");
		varType.put("variable", "class:TestCreatorApp;method:main;name:test;type:String;intilize:;access:public;static:;final:;");
		varType.put("comment", "method:main;default;");

	}

}


