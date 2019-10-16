package PublicLibrary;
import java.util.*;
public class BookLog 
{
	private int trascactionNumber;       // Unique #
	private String deweyDecimalNumber;   // Unique # for book object class
	private int branchNumber;            // Unique # for branch class
	private int customerNumber;          // Unique # for customer class
	private Date checkOutDate;           // date the customer takes phyisical item from branch
	private Date expectedReturnDate;     // caclulated date based on methods to be determine
	private String status;               // checkOut, returned to branch #, lost, return to branch late
	private String notes;                // addtional information based on status
	
	
	
	public BookLog() 
	{
		
	}


	public int getTrascactionNumber() {
		return trascactionNumber;
	}
	
	
	public void setTrascactionNumber(int trascactionNumber) {
		this.trascactionNumber = trascactionNumber;
	}
	
	public int getBranchNumber() {
		return branchNumber;
	}


	public void setBranchNumber(int branchNumber) {
		this.branchNumber = branchNumber;
	}


	public int getCustomerNumber() {
		return customerNumber;
	}


	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}


	public Date getCheckOutDate() {
		return checkOutDate;
	}


	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}


	public Date getExpectedReturnDate() {
		return expectedReturnDate;
	}


	public void setExpectedReturnDate(Date expectedReturnDate) {
		this.expectedReturnDate = expectedReturnDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public String getDeweyDecimalNumber()
	{
		return deweyDecimalNumber;
	}


	public void setDeweyDecimalNumber(String deweyDecimalNumber)
	{
		this.deweyDecimalNumber = deweyDecimalNumber;
	}
    
}
