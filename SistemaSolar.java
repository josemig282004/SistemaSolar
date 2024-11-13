
package sistemasolar;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SistemaSolar extends JPanel{
@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Este es el sistema solar", 50, 20);
        
        // Dibuja el sol
        g.setColor(Color. YELLOW);
        g.fillOval(150, 100, 80, 80);

        // Dibuja planetas (ejemplos)
        g.setColor(Color.RED);
        g.fillOval(50, 200, 30, 30); // Marte
        g.setColor(Color.BLUE);
        g.fillOval(300, 150, 50, 50); // Tierra
    }

   
    public static void main(String[] args) {
         JFrame frame = new JFrame("Sistema Solar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new SistemaSolar());
        frame.setVisible(true);
        
    }
    
}
