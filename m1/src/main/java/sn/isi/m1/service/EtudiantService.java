package sn.isi.m1.service;

import org.springframework.stereotype.Service;
import sn.isi.m1.domain.Etudiant;

import java.util.ArrayList;
import java.util.List;
@Service
public class EtudiantService  {

    public List<Etudiant> getAllEtudiant(){
        Etudiant et = new Etudiant(1,"biteye","bassirou","m2gl");
        Etudiant et1 = new Etudiant(1,"sarr","mamadou","m2gl");
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(et);
        etudiants.add(et1);
         return etudiants;
    }

}
