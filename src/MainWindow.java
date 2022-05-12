import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private int HEIGHT = 670, WIDTH = 800;
    MyPanel panel;
    public MainWindow(){
        super();
        panel = new MyPanel();
        setTitle("кошки и собаки");
        setDefaultCloseOperation(3);
        setResizable(false);
        setLocation(100,100);
        addWidjets();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        getContentPane().add(panel);
        pack();
    }

    private void addWidjets() {
        panel.setLayout(null);

        JTextField command = new JTextField();
        command.setBounds(10,650,350,20);
        panel.add(command);

        JLabel str = new JLabel("Командная строка:");
        str.setBounds(10,620,150,20);
        panel.add(str);

        JLabel cat = new JLabel("Создать кошечку");
        cat.setBounds(50,50,150,20);
        panel.add(cat);

        JLabel dog = new JLabel("Создать собачку");
        dog.setBounds(50,250,150,20);
        panel.add(dog);

        JButton cats = new JButton("Кошечка");
        cats.setBounds(50,100,100,30);
        panel.add(cats);

        JButton dogs = new JButton("Собачка");
        dogs.setBounds(50,300,100,30);
        panel.add(dogs);
    }

    public void run(){
        setVisible(true);
    }
}
