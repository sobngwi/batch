/**
 * 
 */
package com.apress.springbatch.statement.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
@Embeddable
public class Address {
	
	    private String address1;
	    private String city;
	    private String state;
	    private String zip;
		/**
		 * @return the address1
		 */
	    @Column(name = "address1")
		public String getAddress1() {
			return address1;
		}
		/**
		 * @param address1 the address1 to set
		 */
		public void setAddress1(String address1) {
			this.address1 = address1;
		}
		/**
		 * @return the city
		 */
		@Column(name = "city")
		public String getCity() {
			return city;
		}
		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}
		/**
		 * @return the state
		 */
		@Column(name = "state")
		public String getState() {
			return state;
		}
		/**
		 * @param state the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}
		/**
		 * @return the zip
		 */
		@Column(name = "zip")
		public String getZip() {
			return zip;
		}
		/**
		 * @param zip the zip to set
		 */
		public void setZip(String zip) {
			this.zip = zip;
		}
	    
	    

}
