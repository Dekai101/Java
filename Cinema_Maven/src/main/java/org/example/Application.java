package org.example;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Application implements ActionListener{
    //defino precios de entradas
    final int MAXBUTACAS = 16;
    public int entradaGeneral = 10;
    public int entradaJove = 6;
    public int entradaJubilat = 7;
    public int filas = 15;
    public int columnas = 10;
    public int edad;    //booleano, si es 1 joven, 2 adulto, 3 jubilado. para saber que iconitos poner en las butacas ;)



    public JPanel header() {
        //añado imagen de header
        FlowLayout Header = new FlowLayout(FlowLayout.LEFT);
        JPanel Arriba = new JPanel(Header);
        //ajusto el tamaño de la imagen
        ImageIcon header = new ImageIcon("header.jpg");
        Image imgHeader = header.getImage();
        Image headerAA = imgHeader.getScaledInstance(1350,100, 0);
        header = new ImageIcon(headerAA);
        //color de fondo
        Color gris = new Color(36, 43, 43);
        Arriba.setBackground(gris);
        //añado header
        JLabel banner = new JLabel(header);
        banner.setIcon(header);
        banner.setPreferredSize(new Dimension(1350, 100));
        banner.setIcon(header);
        Arriba.add(banner);
        return Arriba;
    }

    public JPanel centro() {
        int primerLoop = 0;
        //creo zona de butacas, asignando color de fondo y tal
        FlowLayout Centro = new FlowLayout(FlowLayout.CENTER);
        JPanel sillas = new JPanel(Centro);
        Color grisClarito = new Color(0x4B4B51);
        sillas.setBackground(grisClarito);
        ImageIcon silla = new ImageIcon("silla.png");

        //creo las butacas---------------------------------------------------------------------------------------------
        for(int i = 0; i < columnas; i++) {
            if (primerLoop == 1) {
                for(int x = 0; x < (MAXBUTACAS - filas); x++){
                    JLabel vacio = new JLabel();
                    vacio.setPreferredSize(new Dimension(50, 50));
                    vacio.setBackground(grisClarito);
                    sillas.add(vacio);
                }
            }
            for (int j = 0; j < filas; j++) {
                primerLoop = 1;
                JLabel Jsilla = new JLabel(silla);
                Jsilla.setIcon(silla);
                sillas.add(Jsilla);
            }
        }
        for(int x = 0; x < (MAXBUTACAS - filas); x++){
            JLabel vacio = new JLabel();
            vacio.setPreferredSize(new Dimension(50, 50));
            vacio.setBackground(grisClarito);
            sillas.add(vacio);
        }
        return sillas;
    }

    public JPanel derecha() {
        // Creo el panel de la derecha
        JPanel derecha = new JPanel();
        derecha.setLayout(new FlowLayout(FlowLayout.LEFT));
        Color gris = new Color(36, 43, 43);
        derecha.setBackground(gris);

        // Llamo al método CamposTexto para crear el panel con los campos de texto
        JPanel camposTextoPanel = CamposTexto();
        derecha.add(camposTextoPanel);

        return derecha;
    }
    public JPanel CamposTexto() {
        // Creo un panel para introducir nombre, DNI y donde se verán las butacas reservadas por edades
        JPanel derechaCentro = new JPanel();
        derechaCentro.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        Color grisClarito = new Color(0x4B4B51);
        derechaCentro.setBackground(grisClarito);
        derechaCentro.setPreferredSize(new Dimension(300, 750));

        // Creo campos de texto
        JTextField nombre = new JTextField(22);
        JTextField dni = new JTextField(22);
        JTextArea butacasSelect = new JTextArea(10, 25);

        JLabel nombreL = new JLabel("Nombre:");
        JLabel dniL = new JLabel("DNI:");
        JLabel butacasSelectL = new JLabel("Reservas hechas:");


        // Pongo las cosas dentro del panel
        derechaCentro.add(nombreL);
        derechaCentro.add(nombre);
        derechaCentro.add(dniL);
        derechaCentro.add(dni);
        derechaCentro.add(butacasSelectL);
        derechaCentro.add(butacasSelect);

        return derechaCentro;
    }

    public JPanel selectEdad(){
        //Botones para seleccionar edades
        JPanel botonesEdades = new JPanel();
        botonesEdades.setLayout(new BoxLayout(botonesEdades, BoxLayout.Y_AXIS));

        Color gris = new Color(36, 43, 43);
        botonesEdades.setBackground(gris);

        JButton joven = new JButton();
        ImageIcon iconoJoven = new ImageIcon("IconoJoven.png");
        joven.setIcon(iconoJoven);

        JButton general = new JButton();
        ImageIcon iconoGeneral = new ImageIcon("IconoGeneral.png");
        general.setIcon(iconoGeneral);

        JButton jubilado = new JButton();
        ImageIcon iconoJubilado = new ImageIcon("IconoJubilado.png");
        jubilado.setIcon(iconoJubilado);
        botonesEdades.add(joven);
        botonesEdades.add(general);
        botonesEdades.add(jubilado);

        return botonesEdades;
    }

}