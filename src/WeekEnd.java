public class WeekEnd extends TempPartiel{
    public WeekEnd(){}
    public WeekEnd(String nom, int age, int annee, int h){
        this.nom = nom;
        this.age = age;
        this.annee = annee;
        this.h = h;
    }
    public void shift(){
        System.out.println("Je travaille tous les week-end de 8h à 17h");
    }
}
