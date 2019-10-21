package fr.parisnanterre.miage.procs.sam.server;

import java.util.Map;
import java.util.HashMap;

import fr.parisnanterre.miage.procs.sam.core.Personne;
import fr.parisnanterre.miage.procs.sam.core.Voiture;
import fr.parisnanterre.miage.procs.sam.core.Amende;

class DAO {

  private Map<Integer, Personne> personnes;
  private Map<String, Voiture> voitures;
  private Map<Integer, Amende> amendes;

  DAO() {
    personnes = new HashMap<>();
    voitures = new HashMap<>();
    amendes = new HashMap<>();
    //
    Personne p;
    int p1, p2;
    p = new Personne("Sponge", "Bob");
    p1 = p.getNumero();
    personnes.put(p1, p);
    p = new Personne("Haddock", "Capitaine");
    p2 = p.getNumero();
    personnes.put(p2, p);
    //
    Voiture v = new Voiture("AB 123 CD", "Clio 3");
    v.setProprietaire(p);
    voitures.put(v.getImmatriculation(), v);
    v = new Voiture("AB 124 CD", "Punto");
    v.setProprietaire(p);
    voitures.put(v.getImmatriculation(), v);
  }

  public Map<Integer,Amende> getAmendes() { return amendes; }
  public Map<Integer,Personne> getPersonnes() { return personnes; }
  public Map<String,Voiture> getVoitures() { return voitures; }

  public Amende getAmende(int id) { return amendes.get(id); }
  public Voiture getVoiture(String immatriculation) { return voitures.get(immatriculation); }
  public Personne getPersonne(int id) { return personnes.get(id); }

  public void deleteAmende(int id) { amendes.remove(id); }
  public void deleteVoiture(String immatriculation) {
    Voiture v = voitures.get(immatriculation);
    if (v != null) {
      voitures.remove(immatriculation);
    }
  }
  public void deletePersonne(int id) {
    Personne p = personnes.get(id);
    if (p != null) {
      voitures.values().stream()
        .filter(x->x.getProprietaire().equals(p))
        .forEach(x->x.setProprietaire(null));
      personnes.remove(id); 
    }
  }

  public void createPersonne(String nom, String prenom) {
    Personne p = new Personne(nom, prenom);
    personnes.put(p.getNumero(), p);
  }
  public void createVoiture(String immatriculation, String modele) {
    Voiture v = new Voiture(immatriculation, modele);
    voitures.put(v.getImmatriculation(), v);
  }

}