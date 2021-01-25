package com.techlearn.devops.party.api.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartyController {

	@Autowired
	private PartyService partyService;
	
	@RequestMapping("/getpartydetails")
	public List<Party> getParty() {
		return partyService.getParty();
	}
	
	@RequestMapping(value="/party", method = RequestMethod.POST)
	public void addParty(@RequestBody Party party) {
		partyService.addParty(party);
	}
}
