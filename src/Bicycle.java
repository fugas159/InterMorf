public class Bicycle implements Vehicle{
    @Override
    public void Start() {
        System.out.println("Топнул по кикстартеру и поехал");
    }

    @Override
    public void Stop() {
        System.out.println("Нажал тормоз ногои и остановился");

    }
}
