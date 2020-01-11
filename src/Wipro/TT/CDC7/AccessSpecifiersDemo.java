package Wipro.TT.CDC7;

import Wipro.TT.ProjectZone.*;

public class AccessSpecifiersDemo extends AccessSpecifiers {
	void view(){
		/* Instance variable iDefNohas default(package) access in super class and accessible only withinthe package, but not accessible outside the package  */
			System.out.println(AccessSpecifiers.iDefNo);
			/* Instance variable iProNohas protected access in super class and accessible either within the package or within the sub class outside the package, but not accessible in a non sub class outside the package */
			//System.out.println(iProNo);/* Instance variable iPriNohas private access in  super class and not accessible outside the class */
			//System.out.println(iPriNo);/* Method with public access specifier can be accessed in all the classes with in the package and outside the package */
			display();
	}
	public static void main(String a[]){
		AccessSpecifiersDemo object = new AccessSpecifiersDemo();
		object.view();
	}
}
