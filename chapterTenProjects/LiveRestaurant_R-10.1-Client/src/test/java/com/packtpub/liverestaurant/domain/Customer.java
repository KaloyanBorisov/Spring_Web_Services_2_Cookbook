
package com.packtpub.liverestaurant.domain;

import java.io.Serializable;


public class Customer implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8257167617394855933L;
	private Address addressPrimary;
    private Address addressSecondary;
    private Name name;

    /** 
     * Get the 'addressPrimary' element value.
     * 
     * @return value
     */
    public Address getAddressPrimary() {
        return addressPrimary;
    }

    /** 
     * Set the 'addressPrimary' element value.
     * 
     * @param addressPrimary
     */
    public void setAddressPrimary(Address addressPrimary) {
        this.addressPrimary = addressPrimary;
    }

    /** 
     * Get the 'addressSecondary' element value.
     * 
     * @return value
     */
    public Address getAddressSecondary() {
        return addressSecondary;
    }

    /** 
     * Set the 'addressSecondary' element value.
     * 
     * @param addressSecondary
     */
    public void setAddressSecondary(Address addressSecondary) {
        this.addressSecondary = addressSecondary;
    }

    /** 
     * Get the 'name' element value.
     * 
     * @return value
     */
    public Name getName() {
        return name;
    }

    /** 
     * Set the 'name' element value.
     * 
     * @param name
     */
    public void setName(Name name) {
        this.name = name;
    }
}
