import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import org.example.Application;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main extends Application {
    public static void main(String[] args) {
            FlatMacDarkLaf.setup();
            JFrame Cine = new JFrame("Demo");
            Cine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Cine.setLayout(new BorderLayout());

            Application app = new Application();
            Cine.setPreferredSize(new Dimension(1280,720));
            JPanel header = app.header();
            Cine.add(header, BorderLayout.NORTH);
            JPanel centro = app.centro();
            Cine.add(centro, BorderLayout.CENTER);
            JPanel derecha = app.derecha();
            Cine.add(derecha, BorderLayout.EAST);
            JPanel izquierda = app.selectEdad();
            Cine.add(izquierda, BorderLayout.WEST);

            Cine.pack();
            Cine.setVisible(true);
    }
}

