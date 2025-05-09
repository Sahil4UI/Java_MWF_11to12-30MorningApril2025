class BankAccount{
	String bankName = "HDFC BANK";
	String ifsc = "HDFCK0001";
	String cust_name;
	int blc;	

	void deposit(int amt) {
		blc += amt;
		System.out.println("Updated balance is : "+blc);
	}
	
	void withdraw(int amt) {
		if (amt<blc)
		{System.out.println("Cash Withdrawl : "+amt);
		System.out.println("Remaining balance is : "+blc);}
		else {
			System.out.println("Insufficient Balance ");
		}
	}
	
	void display() {
		System.out.println("Bank Name : "+bankName);
		System.out.println("IFSC Code : "+ifsc);
		System.out.println("Customer Name : "+cust_name);
	}

}

class SavingAccount extends BankAccount{
	
	SavingAccount(String cust_name,int blc){
		this.cust_name = cust_name;
		this.blc = blc;
	}
	
	void roi() {
		System.out.println("ROI is 5.8% pa");
	}
	
	void doorToDoor() {
		System.out.println("Door to Door Facility is available");
	}
	

}

class CurrentAccount extends BankAccount{
	
	CurrentAccount(String cust_name,int blc){
		this.cust_name = cust_name;
		this.blc = blc;
	}
	
	void roi() {
		System.out.println("ROI is Chargeable 9.8% pa");
	}
	
	void ODLimit() {
		System.out.println("OD Limit is 50000");
	}
	
	
	
}






public class BankDemo {
	
	static void CommonCaller(BankAccount obj) {
		
		if (obj instanceof SavingAccount) {
			SavingAccount ob = (SavingAccount)obj;
			ob.display();
			ob.roi();
			ob.doorToDoor();
		}
		else {
			CurrentAccount ob = (CurrentAccount)obj;
			ob.display();
			ob.roi();
			ob.ODLimit();
			
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		upcasting - yha pe hamne Saving Account ko bank account me cast krdiya
		CommonCaller(new SavingAccount("Ravi",9800));
		
		
//		SavingAccount obj =  new SavingAccount("Ravi",10000);
//		obj.display();
//		obj.roi();
//		obj.doorToDoor();
//		obj.deposit(5000);
//		
//		System.out.println("******************************************");
//		CurrentAccount obj1 =  new CurrentAccount("Ankit",45000);
//		obj1.display();
//		obj1.roi();
//		obj1.ODLimit();
//		obj.deposit(5000);
        
	}

}
