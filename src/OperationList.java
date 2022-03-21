public class OperationList {
    private String history = "";

    public String getHistory(){
        return history;
    }

    public void addLine(String line){
        history += (line + "\n");
    }
}
