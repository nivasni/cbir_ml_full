/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cbirmld;

import ij.process.ColorProcessor;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.imageio.ImageIO;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation ;


/**
 *
 * @author admin
 */
public class TestFrame extends javax.swing.JFrame {

    /**
     * Creates new form TestFrame
     */
    String feat1="";
    String feat2="";
    double testFeat[];
    public TestFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 102));
        jLabel1.setText("Multi-Label Dictionary Learning - Testing Stage");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jTabbedPane1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel2.setText("Select Image");

        jTextField1.setEditable(false);

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel5.setText("Extract Features Color, Texture");

        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton3.setText("Extract");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton3)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addComponent(jButton3)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        jTabbedPane1.addTab("Test Image", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton4.setText("Annotation");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel6.setText("Color, SIFT Feature");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(407, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(352, 352, 352))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Features", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try
        {
            JFileChooser fc = new JFileChooser();
            fc.setCurrentDirectory(new File("."));
            fc.setFileFilter(new FileFilter()
            {
                public boolean accept(File f)
                {
                    String name=f.getName().toLowerCase();
                    return name.endsWith(".jpg") ||name.endsWith(".JPG") || f.isDirectory();
                }

                public String getDescription()
                {
                    return   "Test Image ";
                }
            });
            int ch=fc.showOpenDialog(this);
            if(ch==JFileChooser.APPROVE_OPTION)
            {
                String path=fc.getSelectedFile().getAbsolutePath();
                jTextField1.setText(path);
                
               BufferedImage bi1=ImageIO.read(new File(path));
                BufferedImage bi2=resize(bi1,200,200);
                jLabel3.setIcon(new ImageIcon(bi2));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try
        {
            String path=jTextField1.getText().trim();
            if(path.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Select Test Image");
            }
            else
            {
                File fe=new File(path);
                String name=fe.getName();
                // Extract Features
                    BufferedImage bi=ImageIO.read(fe);
                    ColorProcessor cp=new ColorProcessor(bi);
                    ColorExtraction ce=new ColorExtraction(cp);
                    ce.extract();
                    double[] colors=ce.getColorFeature();
                    
                    CannyEdgeDetector ced=new CannyEdgeDetector();
                    ced.setSourceImage(bi);
                    ced.process();
                    BufferedImage edge=ced.getEdgesImage();
                    int bin[][]=  rgb2bin(edge);
                
                    int height=bi.getHeight();
                    int width=bi.getWidth();
                    TextureExtraction te=new TextureExtraction(bin, height, width);
                    te.extract();
                    double[] textures=te.getCoocFeatures(); 
                    
                    DecimalFormat df=new DecimalFormat("#.###");
                    String ft1="";
                    for(int i=0;i<colors.length;i++)
                    {
                        if(Double.isNaN(colors[i]))
                            ft1=ft1+"0#";
                        else
                            ft1=ft1+df.format(colors[i])+"#";
                    }
                    feat1=ft1;
                    
                     String ft2="";
                    for(int i=0;i<textures.length;i++)
                    {
                        if(Double.isNaN(textures[i]))
                            ft2=ft2+"0#";
                        else
                            ft2=ft2+df.format(textures[i])+"#";
                    }
                    
                    feat2=ft2;
                    jTextArea2.setText(ft1+"\n\n"+ft2);
                    String fg=feat1+feat2;
                    String tt[]=fg.split("#");
                    testFeat=new double[tt.length-1];
                    for(int i=0;i<tt.length-1;i++)
                        testFeat[i]=Double.parseDouble(tt[i]);
                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
        {
            String path=jTextField1.getText().trim();
            String feat=jTextArea2.getText().trim();
            if(path.equals("")||feat.equals(""))
                JOptionPane.showMessageDialog(this, "Select Image & Extract Features");
            else
            {
                DBConnection db=new DBConnection();
                Statement st=db.stt;
            
                ResultSet rs=st.executeQuery("select * from imglabels");
            
                ArrayList at1=new ArrayList();
                ArrayList lab=new ArrayList();
            
                while(rs.next())
                {
                    String nm=rs.getString(1);
                    String l1=rs.getString(2);
                    at1.add(nm+"@"+l1);
                    String g1[]=l1.split("#");
                    for(int i=0;i<g1.length;i++)
                    {
                        if(!lab.contains(g1[i].trim()))
                        {
                            lab.add(g1[i].trim());                        
                        }
                    }
                }
                String sg1[][]=new String[lab.size()][2];
                double max=0;
                    String ant="";
                 ArrayList res=new ArrayList();
                for(int i=0;i<lab.size();i++)
                {
                    String g1=lab.get(i).toString();
                    ArrayList at=new ArrayList();
                    for(int j=0;j<at1.size();j++)
                    {
                        String g2[]=at1.get(j).toString().split("@");
                        if(g2[1].contains(g1))
                        {
                            at.add(g2[0]);
                            //System.out.print(g2[0]+" ");
                        }
                    }
                    //double sum=0;
                   
                    for(int j=0;j<at.size();j++)
                    {
                        String nm=at.get(j).toString().trim();
                        ResultSet rs2=st.executeQuery("select * from imgfeature where ImgName='"+nm+"'");
                        String ft="";
                        if(rs2.next())
                        {
                            ft=rs2.getString(2)+rs2.getString(3);
                        }
                        
                        ResultSet rs3=st.executeQuery("select * from imglabels where ImgName='"+nm+"'");
                        String sh="";
                        if(rs3.next())
                            sh=rs3.getString(2);
                       // System.out.println(ft);
                        String tt[]=ft.split("#");
                        double trFeat[]=new double[tt.length-1];
                        for(int ik=0;ik<tt.length-1;ik++)
                            trFeat[ik]=Double.parseDouble(tt[ik]);
                        
                        PearsonsCorrelation pc=new PearsonsCorrelation();
                        double cr=pc.correlation(trFeat, testFeat);
                        //sum=sum+cr;
                        if(max<cr)
                        {
                            max=cr;
                            ant=sh;
                        }
                        
                    }
                   /* double c1=sum/(double)at.size();
                    System.out.println(g1+" : "+c1);
                    sg1[i][0]=g1;
                    sg1[i][1]=String.valueOf(c1);*/
                }
                
              /*  for(int i=0;i<sg1.length;i++)
                {
                    for(int j=i+1;j<sg1.length;j++)
                    {
                        if(Double.parseDouble(sg1[i][1])<Double.parseDouble(sg1[j][1]))
                        {
                            String t1=sg1[i][0];
                            sg1[i][0]=sg1[j][0];
                            sg1[j][0]=t1;
                            
                            String t2=sg1[i][1];
                            sg1[i][1]=sg1[j][1];
                            sg1[j][1]=t2;
                        }
                    }
                }
                for(int i=0;i<5;i++)
                    System.out.println("==== "+sg1[i][0]+" : "+sg1[i][1]);*/
                
                jLabel4.setText(ant.replace("#", " , "));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

      public static int[][] rgb2bin(BufferedImage in){
    	int h=in.getHeight();
    	int w=in.getWidth();
    	
    	int[][] out=new int[h][w];
    	long rgb;
    	int r,g,b;
    	ColorProcessor cp=new ColorProcessor(in);
    	for (int i=0;i<h;i++){
    		for (int j=0;j<w;j++){
    			rgb=cp.getPixel(i, j);
    	        r   = (int)(rgb % 0x1000000 / 0x10000);  
    	        g = (int)(rgb % 0x10000 / 0x100);  
    	        b = (int)(rgb % 0x100);  
    	        if (r==0 && g==0 && b==0){
    	        	out[i][j]=0;
    	        }
    	        else{
    	        	out[i][j]=1;
    	        }
    		}
    	}
    	
    	return out;
    	
    }
    
    public BufferedImage resize(BufferedImage image, int width, int height) 
    {
	BufferedImage resizedImage = new BufferedImage(width, height,
	BufferedImage.TYPE_INT_RGB);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(image, 0, 0, width, height, null);
	g.dispose();
	return resizedImage;
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
