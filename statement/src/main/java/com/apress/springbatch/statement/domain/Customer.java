/**
 * 
 */
package com.apress.springbatch.statement.domain;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
public class Customer {
	
	private long id = -1l;
    private String firstName;
    private String lastName;
    private Address address;
    private Account account;
    private String taxId;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}
	/**
	 * @return the taxId
	 */
	public String getTaxId() {
		return taxId;
	}
	/**
	 * @param taxId the taxId to set
	 */
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
    
	 @Override
	    public String toString() {
	        String output = "Customer number " + id + ", " + firstName + " " + lastName;
	        if(address != null) {
	            output = output + " who lives in "
	                + address.getCity() + "," + address.getState();
	}
	        if(account != null && account.getTransactions() != null) {
	            output = output + " has "
	            		 + account.getTransactions().size() + " transactions.";
	        }
	        return output;
	}

}
