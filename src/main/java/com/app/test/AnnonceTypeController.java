package com.app.test;

import com.app.data.Annonce;
import com.app.test.AnnonceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/annoncesType")
public class AnnonceTypeController {

    @Autowired
    private AnnonceTypeRepository annonceTypeRepository;

    @PostMapping("/")
    public ResponseEntity<AnnonceType> createAnnonce(@RequestBody AnnonceType annonceType) {
        AnnonceType createdAnnonce = annonceTypeRepository.save(annonceType);
        return new ResponseEntity<>(createdAnnonce, HttpStatus.CREATED);
    }

    

}
