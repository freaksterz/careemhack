/**
 * 
 */
package com.haCareem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.haCareem.hack.dto.Quotation;

/**
 * @author Saurabh Shashank
 *
 */
@Service
public interface ICoreService {

	public List<Quotation> getQuotation(String source,String destination,String size,String type,float wight);
}
