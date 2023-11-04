package com.app.shotgun.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.data.AnnonceType;
import com.app.shotgun.repositories.AnnonceTypeRepository;

@Service
public class AnnonceTypeService {

    @Autowired
    private AnnonceTypeRepository annonceTypeRepository;

    public List<AnnonceType> getAllAnnonceTypes() {
        return (List<AnnonceType>) annonceTypeRepository.findAll();
    }

    public Optional<AnnonceType> getAnnonceTypeById(Integer id) {
        return annonceTypeRepository.findById(id);
    }

}
