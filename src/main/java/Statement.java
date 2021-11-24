import javax.swing.*;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Statement {

    static List<String> statementList = new ArrayList<>();
    List<String> listaGuardada;

    public void statementTitle(PrintStream printer){
        String title = "|   Date   | Credit  |  Debit   |  Balance   |";
        printer.println(title);
    }

    public List<String> returnStatementlist() {
        return this.statementList;
    }

    public void addStatementLine(String line){
        this.statementList.add(line);
    }

    public static void printLines(){
        for(int i = statementList.size()-1; i>=0; i--) {
            System.out.println(statementList.get(i));
        }
    }

}