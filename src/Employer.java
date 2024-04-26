abstract class Employer {
    protected String nom;
    protected int age;
    protected int annee;
    protected int h; //heure de travail
    abstract void shift();
    abstract double calculSalaire();
    public String toString(){
        String str = "\t\temployé à "+getClass()+"\nnom: "+this.nom+"\nâge: "+this.age+"\nheure de travail:"+this.h+"H" +
                "\nslaire: "+this.calculSalaire();
        return str;
    }
}
