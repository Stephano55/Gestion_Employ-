abstract class TempPartiel extends Employer{
    @Override
    public double calculSalaire(){
        double sal = 4000*this.h;
        return sal;
    }
}
