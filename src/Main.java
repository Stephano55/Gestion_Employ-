//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeekEnd weekEnd = new WeekEnd("Stephano",  20, 2, 48);
        System.out.println(weekEnd.toString());
        TempPlein tempPlein = new TempPlein("Kevin", 20, 3, 110);
        System.out.println(tempPlein.toString());
    }
}