public class Car implements Vehicle{
    @Override
    public void Start() {
        System.out.println("Повернул ключь и поехал");
    }
    @Override
    public void Stop() {
        System.out.println("Нажал тормоз, дрифтанул и остановился");
    }
}
