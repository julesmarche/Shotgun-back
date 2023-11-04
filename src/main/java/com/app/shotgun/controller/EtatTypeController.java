package com.app.shotgun.controller;

import com.app.data.EtatType;
import com.app.shotgun.services.EtatTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/etatTypes")
public class EtatTypeController {

    @Autowired
    private EtatTypeService etatTypeService;

    @GetMapping
    public ResponseEntity<List<EtatType>> getAllEtatTypes() {
        List<EtatType> etatTypes = etatTypeService.getAllEtatTypes();
        return new ResponseEntity<>(etatTypes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EtatType> getEtatTypeById(@PathVariable Integer id) {
        Optional<EtatType> etatType = etatTypeService.getEtatTypeById(id);
        HttpStatus response = HttpStatus.OK;
        if (!etatType.isPresent()) {
            response = HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<>(etatType.orElse(null), response);
    }
}
