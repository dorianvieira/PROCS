package fr.parisnanterre.miage.procs.sam.core;

public class Personne {
  private static int numero_ = 0;
  private int numero;
  private String nom;
  private String prenom;

  public Personne() { super(); }

  public Personne(String nom, String prenom) {
    numero_++;
    this.numero = numero_;
    this.nom = nom;
    this.prenom = prenom;
  }

  public int getNumero() { return numero; }
  public String getNom() { return nom; }
  public String getPrenom() { return prenom; }

  public void setNumero(int numero) { this.numero = numero; }
  public void setNom(String nom) { this.nom = nom; }
  public void setPrenom(String prenom) { this.prenom = prenom; }

  @Override
  public String toString() { return numero + "" + nom + " " + prenom; }
}