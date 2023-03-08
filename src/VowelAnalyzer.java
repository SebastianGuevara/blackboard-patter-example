public class VowelAnalyzer implements DataAnalyzer
{

    @Override
    public void analyze(Blackboard blackboard) {
        String data = blackboard.getData();
        int count = 0;
        for (char c: data.toLowerCase().toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        System.out.println("El número de vocales es: "+count);
    }
}
