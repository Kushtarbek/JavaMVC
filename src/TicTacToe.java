import controller.Controller;
import model.Model;
import view.View;

public class TicTacToe {
    public static void main(String[] args) {
        Controller c = new Controller();
        View v = new View();
        Model m = new Model();

        // Use aggregation to put the components together
        m.registerView(v);
        c.setModel(m);
        v.setActionListener(c);
    }
}
