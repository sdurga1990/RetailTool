package com.retail.pkg;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class employeediscount {

	public void employeediscount()
	{
		//if Employee can get 30% discounts
		TestUser tu=new TestUser();
		double empreuslt=tu.Employeediscountdisplay(10000.0);
		assertEquals(7000.0, empreuslt,0.00);
		System.out.println("Completed First");
		
		//2.if Affiliated can get 10%
		double affreuslt=tu.Affliatediscountdisplay(20000.0);
		assertEquals(18000.0, affreuslt,0.00);
		System.out.println("Completed Second");
		
		//if Customer over 2 years can get 5% discount
		UserAsCustomer uac=new UserAsCustomer();
		uac.FileWriter();
		try {
			double custdiscount=uac.FileReader();
			assertEquals(9500.0, custdiscount,0.00);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed Third");
		// if bill in $100s then $5 is discount
		OtherUser ou=new OtherUser();
		double[] hundarrvalue=ou.EveryHoundredonBill(tu.indivamt);
		assertArrayEquals(new double []{950.0,95.0,945.0,10.0},hundarrvalue,0.00);
		System.out.println("Completed Fourth");
		
		//if purchase groceries then no discount
		String iteam="Dairy";
		String discountMsg=ou.GoodsTypediscount(iteam);
		System.out.println(discountMsg);
		System.out.println("Completed Fifth");
		
		// if user can get only one of the percentage based discount on bill
		String usrmsg="Employee";
		String dimsg=ou.anyonePercentagediscount(usrmsg);
		System.out.println(dimsg);
		System.out.println("Completed Sixth");
		
	}

}
