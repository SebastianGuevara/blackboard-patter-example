public class LengthAnalyzer implements DataAnalyzer
{
    @Override
    public void analyze(Blackboard blackboard) {
        String data = blackboard.getData();
        int length = data.length();
        System.out.println("La longitud es: "+length);
        blackboard.setData("longitud=" + length);
    }
}
