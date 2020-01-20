package com.trendnxt.java;
import java.io.*;

public class SerializationDemo {
	public static void main(String args[]){
		try {
			EmployeeDemo objEmployee= new EmployeeDemo("Konrad",390,48000);
			FileOutputStream objFileOp= new FileOutputStream("Object.dat");
			ObjectOutputStream objectOp =new ObjectOutputStream(objFileOp);
			objectOp.writeObject(objEmployee);
			System.out.print("Object Written to a File ");
			objectOp.flush();
			objectOp.close();
		}catch(Exception e){
			System.out.println("Error : " + e);
			System.exit(0);
		}try {
			EmployeeDemo objEmp;/* Code to Read the Object From the file */
			FileInputStream objFileIp = new FileInputStream("Object.dat");
			ObjectInputStream objectIp= new ObjectInputStream(objFileIp); 
			objEmp =(EmployeeDemo)objectIp.readObject();
			System.out.println("Contents Are : " + objEmp);
			objectIp.close();
		}catch(Exception e){
			System.out.println("Error : " + e);
			System.exit(0);
		}
	}
}
