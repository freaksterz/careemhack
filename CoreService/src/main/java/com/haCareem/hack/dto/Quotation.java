/**
 * 
 */
package com.haCareem.hack.dto;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author Saurabh Shashank
 *
 */
public class Quotation {
	float price;
	Timestamp ETA;
	List<Quotation> partQuotations;
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Timestamp getETA() {
		return ETA;
	}
	public void setETA(Timestamp eTA) {
		ETA = eTA;
	}
	public List<Quotation> getPartQuotations() {
		return partQuotations;
	}
	public void setPartQuotations(List<Quotation> partQuotations) {
		this.partQuotations = partQuotations;
	}

}
