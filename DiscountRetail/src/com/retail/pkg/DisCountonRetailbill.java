package com.retail.pkg;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class DisCountonRetailbill extends OtherUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				double disamt;
				double [] hundarrvalue;
				DisCountonRetailbill drb=new DisCountonRetailbill();
				
				//if Employee can get 30% discount
				disamt=drb.Employeediscountdisplay(10000.0);
				System.out.println(" If Discount Price For Employee User Type To Amount 10000: "+disamt);
				assertEquals(7000.0, disamt,0.00);
				
				//2.if Affiliated can get 10% discount
				disamt=drb.Affliatediscountdisplay(10000.0);
				System.out.println(" If Discount Price For Affliated User Type To Amount 10000: "+disamt);
				assertEquals(9000.0, disamt,0.00);
				
				//if Customer over 2 years can get 5% discount
				drb.FileWriter();
				try {
					 disamt=drb.FileReader();
					 assertEquals(9500.0, disamt,0.00);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// if bill in $100s then $5 is discount
				hundarrvalue=drb.EveryHoundredonBill(drb.indivamt);
				assertArrayEquals(new double []{950.0,95.0,945.0,10.0},hundarrvalue,0.00);
				System.out.print("For Every $100 can get $5 on discount Amount");
				
				//if purchase groceries then no discount
				String iteam="Dairy";
				String discountMsg=drb.GoodsTypediscount(iteam);
				System.out.println(discountMsg);
				
				// if user can get only one of the percentage based discount on bill
				String usrmsg="Employee";
				discountMsg=drb.anyonePercentagediscount(usrmsg);
				System.out.println(discountMsg);

			}
	}

