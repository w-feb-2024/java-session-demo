package mybeans;
public class Account {
	private int accNo;
	private String accName;
	
	public Account() {}
	
	public Account(int accNo, String accName) {
		super();
		this.accNo = accNo;
		this.accName = accName;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + "]";
	}
	
}
