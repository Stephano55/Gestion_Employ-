public class Nuit extends TempPartiel{
    public Nuit(){}
    public Nuit(String nom, int age, int annee, int h){
        this.nom = nom;
        this.age = age;
        this. annee = annee;
        this.h= h;
    }
    public void shift(){
        System.out.println("Je travaille tous les soirs de 19h30 à 7h");
    }
}
