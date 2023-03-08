import java.util.ArrayList;
import java.util.List;

public class Controller
{
    private Blackboard blackboard;
    private List<DataAnalyzer> analyzers = new ArrayList<>();

    public Controller(Blackboard blackboard)
    {
        this.blackboard = blackboard;
    }
    public void addAnalyzer(DataAnalyzer analyzer){
        analyzers.add(analyzer);
    }
    public void execute(){
        for(DataAnalyzer analyzer:analyzers){
            analyzer.analyze(blackboard);
        }
    }
}
