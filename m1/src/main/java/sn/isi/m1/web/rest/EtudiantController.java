package sn.isi.m1.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.isi.m1.domain.Etudiant;
import sn.isi.m1.service.EtudiantService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService;
    @GetMapping("/etudiants")
    public List<Etudiant> getAllEtudiant(){
    return etudiantService.getAllEtudiant();
    }
}
