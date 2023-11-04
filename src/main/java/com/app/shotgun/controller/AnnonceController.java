package com.app.shotgun.controller;

import com.app.data.Annonce;
import com.app.shotgun.services.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/annonces")
public class AnnonceController {

    @Autowired
    private AnnonceService annonceService;

    @GetMapping
    public ResponseEntity<List<Annonce>> getAllAnnonces() {
        List<Annonce> annonces = annonceService.getAllAnnonces();
        return new ResponseEntity<>(annonces, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Annonce> getAnnonceById(@PathVariable Integer id) {
         Optional<Annonce> annonce = annonceService.getAnnonceById(id);
        HttpStatus response = HttpStatus.OK;
        if (!annonce.isPresent()) {
            response = HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<>(annonce.orElse(null), response);
    }

    @PostMapping
    public ResponseEntity<Annonce> createAnnonce(@RequestBody Annonce Annonce) {
        Annonce createdAnnonce = annonceService.createAnnonce(Annonce);
        return new ResponseEntity<>(createdAnnonce, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Annonce> updateAnnonce(@PathVariable Integer id, @RequestBody Annonce Annonce) {
        Annonce updatedAnnonce = annonceService.updateAnnonce(id, Annonce);
        return new ResponseEntity<>(updatedAnnonce, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnnonce(@PathVariable Integer id) {
        annonceService.deleteAnnonce(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
