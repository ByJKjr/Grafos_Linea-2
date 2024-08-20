package pe.utp.grafos;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author grupo AED
 */
public class Vertice extends javax.swing.JPanel
        implements MouseListener, MouseMotionListener {

    private int pos = -1;
    
    //constructor
    public Vertice() {
        initComponents();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        setVisible(true);
    }

    public void dibuja(Graphics g) {
    Font fuenteV = getFont();
    Font nuevaFuente = new Font("Monospaced", Font.BOLD, 16);
    g.setColor(Color.blue);

    // Dimensiones más pequeñas para el círculo
    int diameter = 20; // diámetro del círculo más pequeño
    g.fillOval(5, 5, diameter, diameter); // rellena el círculo con el color actual

    g.setColor(Color.WHITE);
    g.setFont(nuevaFuente);

    if (Vista.c == Vista.maxN) {
        Vista.c = 0;
    }

    // Ajuste de las coordenadas para centrar el texto en el nuevo círculo
    g.drawString(Vista.nombreN[Vista.c], 10, 19);
    
    g.setFont(fuenteV);
    this.setName(Vista.nombreN[Vista.c]);
    pos = Vista.c;
    Vista.c++;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        Point p;
        if (Vista.L) {
            p = MouseInfo.getPointerInfo().getLocation();
            if (Vista.eligioP) {
                p = this.getLocation();
                Vista.x1 = p.x;
                Vista.y1 = p.y;
                Vista.eligioP = false;
                Vista.i = this.pos;
            } else {
                p = this.getLocation();
                Vista.x2 = p.x;
                Vista.y2 = p.y;
                Vista.linea(Vista.x1, Vista.y1,
                        Vista.x2, Vista.y2);
                Vista.eligioP = true;
                Vista.j = this.pos;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
