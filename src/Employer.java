abstract class Employer {
    protected String nom;
    protected int age;
    protected int annee;
    protected int h; //heure de travail
    abstract void shift();
    abstract double calculSalaire();
    public String toString(){
        String str = "Je suis un employé qui travaille à "+this.getClass()+"\nJe m'appelle "+this.nom;
        return str;
    }
}
