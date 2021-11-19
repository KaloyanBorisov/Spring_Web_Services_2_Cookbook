
package com.packtpub.liverestaurant.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("foodItem")
public class FoodItem
{
    private FoodItemType type;
    private String name;
    private Double quantity;

    /** 
     * Get the 'type' element value.
     * 
     * @return value
     */
    public FoodItemType getType() {
        return type;
    }

    /** 
     * Set the 'type' element value.
     * 
     * @param type
     */
    public void setType(FoodItemType type) {
        this.type = type;
    }

    /** 
     * Get the 'name' element value.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'quantity' element value.
     * 
     * @return value
     */
    public Double getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'quantity' element value.
     * 
     * @param quantity
     */
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
