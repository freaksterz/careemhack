/**
 * 
 */
package com.hacareem.enums;

/**
 * @author Saurabh Shashank
 *
 */
public enum Type {
	 	GARMENTS("garments"),
	    FRAGILE("fragile"),
	    TOXIC("toxic"),
	    DOCUMENTS("documents"),
	    ELECTRONICS("electronics");

	    private String type;

	    Type(String type) {
	        this.type = type;
	    }

	    public String type() {
	        return type;
	    }
}
