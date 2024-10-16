import java.sql.SQLOutput;

public class Boat implements Vehicle{


    @Override
    public void Start() {
        System.out.println("Дернул шнур и поехал");

    }

    @Override
    public void Stop() {
        System.out.println("Сбросил кирпич на веревке и тормазнул");
    }
}
