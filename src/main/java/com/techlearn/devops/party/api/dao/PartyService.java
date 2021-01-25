package com.techlearn.devops.party.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PartyService {

	@Autowired
	private PartyRepository partyRepository;
	

	public List<Party> getParty() {
		List<Party> party = new ArrayList<>();
		partyRepository.findAll().forEach(party::add);
		return party;
	}


	public void addParty(Party party) {
		partyRepository.save(party);
	}
	

}
