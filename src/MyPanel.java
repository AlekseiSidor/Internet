import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel(){
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(190,10,600,600);
    }
}
