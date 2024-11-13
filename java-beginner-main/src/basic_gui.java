import javax.swing.JOptionPane;


public class basic_gui {
    public static void main(String[] args) {

        String name= JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello " +name);

        int age= Integer.parseInt(JOptionPane.showInputDialog("what is your age?")); //converts returned string to int type.
        JOptionPane.showMessageDialog(null, "I am "+age+" years old");

        double weight= Double.parseDouble(JOptionPane.showInputDialog("what is your weight?"));
        JOptionPane.showMessageDialog(null, "My weight is " +weight+"  kg");




    }
}
