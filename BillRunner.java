class BillRunner{
	
	public static void main(String []bills){
		
		System.out.println("--The Bill Reference Id Numbers are---- : ");

		Bill ref = new Bill();
		int billReferenceId = ref.billReferenceId;
	    System.out.println(billReferenceId);
	   
	   billReferenceId = 123450;
		System.out.println(billReferenceId);
	   
	   billReferenceId = 123451;
		System.out.println(billReferenceId);

	   billReferenceId = 123452;	
		System.out.println(billReferenceId);

	   billReferenceId = 123453;
		System.out.println(billReferenceId);

	   billReferenceId = 123454;
		System.out.println(billReferenceId);

	   billReferenceId = 123455;
		System.out.println(billReferenceId);

	   billReferenceId = 123456;
		System.out.println(billReferenceId);

	   billReferenceId = 123457;
		System.out.println(billReferenceId);

	   billReferenceId = 123458;	
		System.out.println(billReferenceId);

	   billReferenceId = 505029;
		System.out.println(billReferenceId);

	System.out.println("--The Bill Sequence  Numbers are ----  :");

		Bill ref1 = new Bill();
	int billSequenceNo = ref1.billSequenceNo;
	   System.out.println(billSequenceNo);   
	   
	   billSequenceNo = 1001;
		System.out.println(billSequenceNo);

		billSequenceNo = 1002;
		System.out.println(billSequenceNo);

		billSequenceNo = 1003;
		System.out.println(billSequenceNo);

		billSequenceNo = 1004;
		System.out.println(billSequenceNo);

		billSequenceNo = 1005;
		System.out.println(billSequenceNo);

		billSequenceNo = 1006;
		System.out.println(billSequenceNo);

		billSequenceNo = 1007;
		System.out.println(billSequenceNo);

		billSequenceNo = 1008;
		System.out.println(billSequenceNo);

		billSequenceNo = 109;
		System.out.println(billSequenceNo);

		billSequenceNo = 110;
		System.out.println(billSequenceNo);

		System.out.println("--The Bill Issue dates are ----  :");

		Bill ref2 = new Bill();
		String billIssueDate = ref2.billIssueDate;
	   System.out.println(billIssueDate);  
	   
	 billIssueDate = "1/6/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "2/6/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "3/6/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "4/6/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "5/6/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "6/6/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "7/6/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "8/6/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "9/6/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "10/6/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "11/6/2024";
	 System.out.println(billIssueDate);

  System.out.println("--The Bill Due dates are ----  :");

		Bill ref3 = new Bill();
	String billDueDate = ref3.billDueDate;
	   System.out.println(billDueDate); 
	   
	   billDueDate = "4/7/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "5/7/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "6/7/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "7/7/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "8/7/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "9/7/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "10/7/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "11/7/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "12/7/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "13/7/2024";
	   System.out.println(billDueDate);
	   
	   System.out.println("--If The Bill is Paid or Not ----  :");

		Bill ref4 = new Bill();
	boolean isBillPaid = ref4.isBillPaid;
	   System.out.println(isBillPaid); 
	   
	   isBillPaid = true;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = true;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = false;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = true;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = false;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = false;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = true;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = true;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = false;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = true;
	   System.out.println(isBillPaid);
	   
	   System.out.println("--The Bill Is Latest one ----  :");

		Bill ref5 = new Bill();
	boolean isLatestBill = ref5.isLatestBill;
	   System.out.println(isLatestBill);  
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = false;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = false;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = false;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   System.out.println("--The Final Bills Are  ----  :");
	   
	   Bill ref6 = new Bill();
	boolean isFinalBill = ref6.isFinalBill;
	   System.out.println(isFinalBill);  
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = false;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = false;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	    System.out.println("--The Bill Amouts Are  ----  :");
	   
	   Bill ref7 = new Bill();
	double billAmount = ref7.billAmount;
	   System.out.println(billAmount);  
	   
	   billAmount = 20999.00d;
	   System.out.println(billAmount);
	   
	    billAmount = 25999.00d;
	   System.out.println(billAmount);
	   
	    billAmount = 36990.00d;
	   System.out.println(billAmount);
	   
	    billAmount = 39899.85d;
	   System.out.println(billAmount);
	   
	    billAmount = 120900.00d;
	   System.out.println(billAmount);
	   
	    billAmount = 150999.50d;
	   System.out.println(billAmount);
	   
	    billAmount = 180998.50d;
	   System.out.println(billAmount);
	   
	    billAmount = 200999.00d;
	   System.out.println(billAmount);
	   
	    billAmount = 210900.05d;
	   System.out.println(billAmount);
	   
	    billAmount = 220999.50d;
	   System.out.println(billAmount);
	   
	   
	   System.out.println("--The Tax Inclusive Bills Are  ----  :");
	   
	   Bill ref8 = new Bill();
	boolean taxInclusiveBill = ref8.taxInclusiveBill;
	   System.out.println(taxInclusiveBill);  
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = false;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = false;
	   System.out.println(taxInclusiveBill);
	   
	   
	   
	   
	   

}
}