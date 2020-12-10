package com.UIR.SiteEcomerce.Membre;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembreService {

	@Autowired
	private MembreRepository membreRepository;
	
	public Optional<Membre> getMembre(int id)
	{
		return membreRepository.findById(id);
	}
	
	public List<Membre> getAllMembres(){
		List<Membre> membres = new ArrayList<>();
		membreRepository.findAll().forEach(membres::add);
		return membres;
	}
	
	public void addMembre(Membre membre){
		
		membreRepository.save(membre);
	}

}
