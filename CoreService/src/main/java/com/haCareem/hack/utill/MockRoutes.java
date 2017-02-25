package com.haCareem.hack.utill;

import java.util.ArrayList;
import java.util.List;

import com.haCareem.hack.dto.Quotation;

public class MockRoutes {
	static public List<Quotation> mockQuotations(String source, String destination, String size, String type, float wight) {
		List<Quotation> quotations=new ArrayList<>();
		for(int i = 0; i <=10;i++){
			Quotation quotation= new Quotation();
			quotation.setPrice(i);
			quotations.add(quotation);
		}
		return quotations;
	}
}
