package com.capgemini.capstore.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capstore.beans.Merchant;
import com.capgemini.capstore.services.MerchantServices;

@RestController
public class MerchantActionController {


	private MerchantServices mservices;

	@RequestMapping(value="/addMerchant", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addMerchant(@RequestBody Merchant merchant) {
		mservices.addMerchant(merchant);
		return new ResponseEntity<>("Merchant added Successfully!",HttpStatus.OK);
	}

}
