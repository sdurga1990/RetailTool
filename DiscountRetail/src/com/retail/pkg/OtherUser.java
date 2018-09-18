package com.retail.pkg;

public class OtherUser extends UserAsCustomer {

	public double[] EveryHoundredonBill(double[] indiamt)
	{	
		double hundramt;
		double remindamt;
		int n=(int)indiamt.length;
		double[] retunamt=new double[5];
		for(int i=0;i<n;i++)
		{
			hundramt=indiamt[i]/100;
			remindamt=hundramt % 100;
			int roundvalue=(int)(hundramt);
		    	if(remindamt==1 || remindamt>1 )
		    	{
		    		int discount=5;
		    		indiamt[i] = indiamt[i]-(roundvalue * discount);
		    		retunamt=indiamt;
		    	}
		    	else
		    	{
		    		indiamt[i]=indiamt[i];
		    		retunamt=indiamt;
		    	}
			
		}
		return  retunamt;
		
	}
	 public String GoodsTypediscount(String posGoodtypeValue)
	    {
	    	String dismsg="";
	        for(int i=0;i<goodsType.length;i++)
		  	    {
	        			dismsg="";
	        			if(goodsType[i].equals(posGoodtypeValue))
	        			{
			  	    		dismsg="\n You have Purchese"+ posGoodtypeValue+"- Its Groceries Items so Discount is Not Applicable";
	        			break;
	        			}
			  	    	else
			  	    		dismsg="\n You have Purchese Non Groceries Items so Discount is Applicable so need not to pay Full NetAmount";
		  	    }
	    	return dismsg;
	    }
	 public String anyonePercentagediscount(String getusrtype)
	 {
		 String Msg="";
		 for(int i=0;i<UsrType.length;i++)
	  	    {
			 Msg="";
	  	    	if(UsrType[i].equals(getusrtype))
	  	    	{
	  	    		Msg="\n This User Type is "+ getusrtype+"  so can get Discount based on bill";
	  	    		break;
	  	    	}
	  	    	else
	  	    		Msg="This UserType is"+ getusrtype+" so Canot get Discount based on bill because this User not Coming under Disount rules";
	  	    	
	  	    }
		 return Msg;
	 }


}
