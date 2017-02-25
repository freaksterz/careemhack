package com.haCareem.service;

import java.util.List;

import com.haCareem.hack.dto.Quotation;
import com.haCareem.hack.utill.MockRoutes;


public class CoreService implements ICoreService{

	@Override
	public List<Quotation> getQuotation(String source, String destination, String size, String type, float wight) {
		
		return MockRoutes.mockQuotations(source, destination, size, type, wight);
	}

}
