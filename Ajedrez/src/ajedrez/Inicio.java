/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author MARTÍN
 */
public class Inicio extends javax.swing.JFrame {

    Ajedrez ajedrez;
    
    public Inicio() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        jugadorBlancasTexto = new javax.swing.JLabel();
        jugadorNegrasTexto = new javax.swing.JLabel();
        jugadorBlancasEntrada = new javax.swing.JTextField();
        jugadorNegrasEntrada = new javax.swing.JTextField();
        saludo = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        botonJugar = new javax.swing.JButton();
        autorApp = new javax.swing.JLabel();
        autorImagenes = new javax.swing.JLabel();
        ano = new javax.swing.JLabel();
        caballo = new javax.swing.JLabel();
        rey = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        panelContenedor.setBackground(new java.awt.Color(0, 0, 0));
        panelContenedor.setMaximumSize(new java.awt.Dimension(800, 600));
        panelContenedor.setMinimumSize(new java.awt.Dimension(800, 600));
        panelContenedor.setPreferredSize(new java.awt.Dimension(800, 600));

        jugadorBlancasTexto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jugadorBlancasTexto.setForeground(new java.awt.Color(255, 255, 255));
        jugadorBlancasTexto.setText("Jugador 1 (piezas blancas):");

        jugadorNegrasTexto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jugadorNegrasTexto.setForeground(new java.awt.Color(255, 255, 255));
        jugadorNegrasTexto.setText("Jugador 2 (piezas negras):");

        jugadorBlancasEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jugadorNegrasEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        saludo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        saludo.setForeground(new java.awt.Color(255, 255, 255));
        saludo.setText("¡Bienvenidos! Introducid vuestros nombres para jugar");

        tiempo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiempo.setForeground(new java.awt.Color(255, 255, 255));
        tiempo.setText("Tiempo de juego:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 minuto", "3 minutos", "5 minutos" }));

        botonJugar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        botonJugar.setText("JUGAR");
        botonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarActionPerformed(evt);
            }
        });

        autorApp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        autorApp.setForeground(new java.awt.Color(255, 255, 255));
        autorApp.setText("Autor: Martín Mato Búa");

        autorImagenes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        autorImagenes.setForeground(new java.awt.Color(255, 255, 255));
        autorImagenes.setText("Imágenes: Colin M. L. Burnett");

        ano.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ano.setForeground(new java.awt.Color(255, 255, 255));
        ano.setText("2021");

        caballo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Ajedrez\\fotos\\caballo_intro.png")); // NOI18N

        rey.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Ajedrez\\fotos\\rey_intro.png")); // NOI18N

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(caballo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tiempo)
                            .addComponent(jugadorNegrasEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jugadorNegrasTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jugadorBlancasEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jugadorBlancasTexto)
                            .addComponent(autorImagenes))
                        .addGap(40, 40, 40)
                        .addComponent(rey, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(saludo))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(autorApp))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(ano)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(saludo)
                .addGap(18, 18, 18)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rey)
                            .addComponent(caballo))
                        .addGap(48, 48, 48))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addComponent(jugadorBlancasTexto)
                        .addGap(18, 18, 18)
                        .addComponent(jugadorBlancasEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jugadorNegrasTexto)
                        .addGap(18, 18, 18)
                        .addComponent(jugadorNegrasEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tiempo)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(botonJugar)
                        .addGap(30, 30, 30)))
                .addComponent(autorApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(autorImagenes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarActionPerformed
        
        /*   
        String nombreBlancas = jugadorBlancasEntrada.getText();
        String nombreNegras = jugadorNegrasEntrada.getText();
        
        int opcion = listaTiempo.getSelectedIndex();
     */
     
        String nombreBlancas = "Ron Weasley";
        String nombreNegras = "Minerva McGonagall";
        int opcion = 1;
     
        ajedrez = new Ajedrez(nombreBlancas,nombreNegras, opcion);
        this.dispose();
        
    }//GEN-LAST:event_botonJugarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ano;
    private javax.swing.JLabel autorApp;
    private javax.swing.JLabel autorImagenes;
    private javax.swing.JButton botonJugar;
    private javax.swing.JLabel caballo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jugadorBlancasEntrada;
    private javax.swing.JLabel jugadorBlancasTexto;
    private javax.swing.JTextField jugadorNegrasEntrada;
    private javax.swing.JLabel jugadorNegrasTexto;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JLabel rey;
    private javax.swing.JLabel saludo;
    private javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
}
