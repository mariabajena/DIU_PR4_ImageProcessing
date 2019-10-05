
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.net.URL;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class myJPanel extends javax.swing.JPanel {

    private BufferedImage img, img_copy, icon;
    private int[][] location;
    private final int size = 64;
    private final int offset = 10;
    private int alignment;
    private int rgb;
    
    public myJPanel() {
        alignment = 2;
        rgb = 0xFFFFFF;

        initComponents();
        try{
            img = ImageIO.read(new URL("https://www.dictando.com/wp-content/uploads/2018/07/dictado-mi-casa-A1.jpg"));
            icon = ImageIO.read(new URL("https://png.pngtree.com/element_our/sm/20180626/sm_5b321ca7a1ca4.png"));            
            img_copy = deepCopy(img);
            countAlignments();
            
        } catch (Exception e){
            System.out.print(e);
        }
    }

    static BufferedImage deepCopy(BufferedImage bi) {
        ColorModel cm = bi.getColorModel();
        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
        WritableRaster raster = bi.copyData(null);
        return new BufferedImage(cm, raster, isAlphaPremultiplied, null);
    }
    
    public void invertMode(boolean isSelected, boolean c_red, boolean c_green, boolean c_blue){
        int mask = 0x000000;
        
        if(!isSelected){
            c_red=!c_red;
            c_green=!c_green;
            c_blue=!c_blue;
        }
        
        if (c_red) mask = mask | 0xFF0000;
        if (c_green) mask = mask | 0x00FF00;
        if (c_blue) mask = mask | 0x0000FF;
        
        if (isSelected)
            mask = mask | rgb;
        else 
            mask = mask & rgb;
        
        this.rgb = mask;
        
        img_copy = deepCopy(img);
        for (int j=0;j<img.getHeight();j++){
            for (int i=0;i<img.getWidth();i++){
                img_copy.setRGB(i, j, mask & img.getRGB(i, j));
            }
        }
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img_copy, 0, 0, this);
        g.drawImage(icon,location[alignment][0],location[alignment][1],size,size, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void whichAlignment(int i) {
        this.alignment = i;
        System.out.println("index " + this.alignment);
    }

    private void countAlignments() {
        location = new int[][] {
            {offset, offset}, 
            {img_copy.getWidth() - offset - size, offset}, 
            {img_copy.getWidth() - offset - size, img_copy.getHeight() - offset - size}, 
            {offset, img_copy.getHeight() - offset - size}
        };
    }
    
    public boolean isOneChecked() {
        boolean isOneChecked = false;
        
        if (rgb == 0xFF0000 || rgb == 0x00FF00 || rgb == 0x0000FF) {
            isOneChecked = true;
        }
        return isOneChecked;
    }
    
     public boolean areAllChecked() {
        boolean areAllChecked = false;
        
        if (rgb == 0xFFFFFF) {
            areAllChecked = true;
        }
        return areAllChecked;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
