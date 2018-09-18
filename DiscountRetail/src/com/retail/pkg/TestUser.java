package com.retail.pkg;

import java.util.Date;

public class TestUser {

	   //declaration
	    public int customerID;
	    public String UsrName;
	    public double discount;
	    public double actualamount;
	    public double netpay=0.0;
	    double finalPrice;
	    public String[] UsrType = new String[] {"Employee", "Affliate", "Customer"};
	    public String[] goodsType= new String[] {"vegetables","Dairy","Cheese","Meat","snacks"};
	    public double[] indivamt= {1000.0,100.0,990.0,10.0};
	    public Date dateFrom = new Date();
	    public Date dateTo = new Date();
	  
	    public double Employeediscountdisplay(double atcamt)
	    {
	    	actualamount=atcamt;
	    	if(UsrType.length<=4)
	    	{
	        for(int i=0;i<UsrType.length;i++)
	  	    {
	  	    	if(UsrType[i]=="Employee")
	  	    	{
	  	    		int discount=30;
	  	    	    finalPrice = actualamount-(actualamount * discount) / 100;
	  	    	}
	  	    }
	    	}
	    	
	    	return finalPrice;
	    	
	    }
	    public double Affliatediscountdisplay(double atcamt)
	    {
	    	actualamount=atcamt;
	    	if(UsrType.length<=4)
	    	{
	        for(int i=0;i<UsrType.length;i++)
	  	    {
	  	    	if(UsrType[i]=="Affliate")
	  	    	{
	  	    		int discount=10;
	  	    	    finalPrice = actualamount-(actualamount * discount) / 100;
	  	    	}
	  	    	
	  	    }
	    	}
	    	return finalPrice;
	    }


}
