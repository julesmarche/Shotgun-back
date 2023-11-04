package com.app.shotgun.controller;

import com.app.data.AnnonceType;
import com.app.shotgun.services.AnnonceTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/annonceTypes")
public class AnnonceTypeController {

    @Autowired
    private AnnonceTypeService annonceTypeService;

    @GetMapping
    public ResponseEntity<List<AnnonceType>> getAllAnnonces() {
        List<AnnonceType> annoncesTypes = annonceTypeService.getAllAnnonceTypes();
        return new ResponseEntity<>(annoncesTypes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnnonceType> getAnnonceById(@PathVariable Integer id) {
        Optional<AnnonceType> annonceType = annonceTypeService.getAnnonceTypeById(id);
        HttpStatus response = HttpStatus.OK;
        if (!annonceType.isPresent()) {
            response = HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<>(annonceType.orElse(null), response);
    }
}
