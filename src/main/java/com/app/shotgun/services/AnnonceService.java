package com.app.shotgun.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.data.Annonce;
import com.app.shotgun.repositories.AnnonceRepository;

@Service
public class AnnonceService {

    @Autowired
    private AnnonceRepository annonceRepository;

    public List<Annonce> getAllAnnonces() {
        return (List<Annonce>) annonceRepository.findAll();
    }

    public Optional<Annonce> getAnnonceById(Integer id) {
        return annonceRepository.findById(id);
    }

    public Annonce createAnnonce(Annonce annonce) {
        return annonceRepository.save(annonce);
    }

    public Annonce updateAnnonce(Integer id, Annonce annonce) {
        Optional<Annonce> optionalAnnonce= annonceRepository.findById(id);
        if(!optionalAnnonce.isPresent()){
            return null;
        }

        Annonce existingAnnonce = optionalAnnonce.get();
        existingAnnonce.setNom(annonce.getNom());
        existingAnnonce.setDescription(annonce.getDescription());
        existingAnnonce.setPrix(annonce.getPrix());
        existingAnnonce.setLocalisation(annonce.getLocalisation());
        existingAnnonce.setDate(annonce.getDate());
        existingAnnonce.setCreatorUserId(annonce.getCreatorUserId());
        existingAnnonce.setEtatTypeId(annonce.getEtatTypeId());
        existingAnnonce.setShotgunerUserId(annonce.getCreatorUserId());
        return annonceRepository.save(existingAnnonce);
    }

    public void deleteAnnonce(Integer id) {
        annonceRepository.deleteById(id);
    }
}
