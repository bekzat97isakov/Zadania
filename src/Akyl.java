import java.util.Scanner;

public class Akyl extends People{

    public Akyl(long id, String firstName, String lastName, int age, String email, String sity) {
        super(id, firstName, lastName, age, email, sity);
    }

    @Override
    public void work() {
        System.out.println(getLastName()+ "Кайсы жумушта иштейт.");
    }

    @Override
    public void ToRelax() {
        System.out.println("Жылына кайсы жерде жана канча жолу эс улуу жасайт.");
    }

    @Override
    public void comunications() {
        System.out.println("Адамдар менен тил табышуусу канчалык денгээлде.");
    }

    @Override
    public void timetable() {
        Scanner scanner = new Scanner(System.in);
        String aty = scanner.nextLine();
        int kyndor = scanner.nextInt();

        System.out.println("Бир жумалык графиги.");
    }
}
