package com.retail.pkg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class UserAsCustomer extends TestUser{

	String line;
    String[] cusdetails,yeardetails= {};
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);
	int oldYear=year-2;
	BufferedReader br = null;
	double atcamt=10000.0;
	double amtretun;
	public double discountCaluate(double atcamt)
	{
		System.out.println("Discount Calculatd");
		actualamount=atcamt;
        for(int i=0;i<UsrType.length;i++)
  	    {
  	    	if(UsrType[i]=="Customer") 
  	    	{
  	    		int discount=5;
  	    	    finalPrice = actualamount-(actualamount * discount) / 100;
  	    	}
  	    	
  	    }
    	return finalPrice;
	}
	public void FileWriter()
	{
          try
          { 
            FileWriter fw=new FileWriter("D:\\CustDetails.txt");    
            fw.write("Cutomer ID:111-DOJ:2015");
            fw.write(System.lineSeparator());
            fw.write("Cutomer ID:112-DOJ:2015");
            fw.write(System.lineSeparator());
            fw.write("Cutomer ID:113-DOJ:2017");
            fw.write(System.lineSeparator());
            fw.write("Cutomer ID:114-DOJ:"+year);
            fw.write(System.lineSeparator());
            fw.close();    
           }
          catch(Exception e){System.out.println(e);}    
           System.out.println("Success...");    
	}
	public double FileReader() throws IOException
	{
   	 try
   	 {
		br = new BufferedReader(new FileReader("D:\\CustDetails.txt"));
		 while ((line =br.readLine())!= null)
         {
	       	  if (line.startsWith("Cutomer ID:111"))
	       	  {
	             cusdetails = line.split("-");
	       	     yeardetails = cusdetails[1].split(":");
	       	  }
         }
        String number = yeardetails[1].toString();
     	int result = Integer.parseInt(number);
     	if(result<oldYear || oldYear==result)
         {
       	  amtretun=discountCaluate(atcamt);
       	  System.out.println(" If Discount Price For Customer Over 2 years User Type 5% of discount For net pay  Amount 10000 : "+amtretun);
         } 
     	else
     	{
     		amtretun=atcamt;
     		System.out.println("This User is not in 2 years old Customer List "+amtretun);
     	}
        br.close(); 
   	} 
   	 	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
   	 		e.printStackTrace();
   	 	}
   	return amtretun;
	}
	


}
