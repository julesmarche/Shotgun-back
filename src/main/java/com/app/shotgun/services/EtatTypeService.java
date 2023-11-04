package com.app.shotgun.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.data.EtatType;
import com.app.shotgun.repositories.EtatTypeRepository;

@Service
public class EtatTypeService {

    @Autowired
    private EtatTypeRepository etatTypeRepository;

    public List<EtatType> getAllEtatTypes() {
        return (List<EtatType>) etatTypeRepository.findAll();
    }

    public Optional<EtatType> getEtatTypeById(Integer id) {
        return etatTypeRepository.findById(id);
    }

}
