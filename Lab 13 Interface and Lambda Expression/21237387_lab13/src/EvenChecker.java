public class EvenChecker implements NumChecker{
    @Override
    public boolean check(int n) {
        return n %2 == 0;
    }
}
