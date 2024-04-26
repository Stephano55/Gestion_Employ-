 class TempPlein extends Employer {
    public TempPlein(){

    }
    public TempPlein(String nom, int age, int annee, int h){
        this.nom = nom;
        this.age = age;
        this.annee = annee;
        this.h = h;
    }
    public void shift(){
        System.out.println("Je travaille du Lundi au Vendredi de 8h30 à 17h ");
    }
    public double calculSalaire(){
        double sal = 3000*this.h;
        return sal;
    }
}
