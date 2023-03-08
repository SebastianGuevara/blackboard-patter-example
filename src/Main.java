public class Main {
    public static void main(String[] args) {
        Blackboard blackboard = new Blackboard();
        blackboard.setData("Juanito");
        Controller controller = new Controller(blackboard);
        controller.addAnalyzer(new LengthAnalyzer());
        controller.addAnalyzer(new VowelAnalyzer());
        controller.execute();
    }
}