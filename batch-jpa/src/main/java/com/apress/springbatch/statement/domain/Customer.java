/**
 * 
 */
package com.apress.springbatch.statement.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
@Entity
@Table(name = "customer")
public class Customer {
	

	private long id = -1l;
    private String firstName;
    private String lastName;
    private String ssn ;
    private String taxId;
    
    
   
    private Account account ;
   
    
    @Embedded
    private Address address;
    

        @Id
        @GeneratedValue(strategy =  IDENTITY)
        @Column(name = "customer_id")
	    public long getId() {return id;}
        public void setId( long id) {this.id = id;}
	
	    @Column(name = "firstname")
	    public String getFirstName() {
		return firstName;}
	    public void setFirstName(String firstName) {
		this.firstName = firstName;}
	
	    @Column(name = "lastname")
	    public String getLastName() {
		return lastName;}
	    public void setLastName(String lastName) {
		this.lastName = lastName;}
	    
	    @Column(name = "taxid")
		public String getTaxId() {return taxId;}
		public void setTaxId(String taxId) {this.taxId = taxId;}
		
		@Column(name = "ssn")
		public String getSsn() {return ssn ;}
		public void setSsn(String ssn) {this.ssn = ssn;}
	
	    public Address getAddress() {return address;}
	    public void setAddress(Address address) {this.address = address ;}
	    
	/*   @OneToOne(fetch=FetchType.LAZY, mappedBy="cust") 
		public Account getAccount() {return account;}
	    public void setAccount(Account account) {this.account = account;}
	    */
	   @Override
	    public String toString() {
		  String output = "Customer number " + id + ", " + firstName + " "
				+ lastName;
		  if (address != null) {
			  output = output + " who lives in " + address.getCity() + ","
			  		+ address.getState();
		  }
		  if (account != null && account.getTransactions() != null) {
			output = output + " has " + account.getTransactions().size()
					+ " transactions.";
		   }
	        return output;
	      }
	
	  
}
