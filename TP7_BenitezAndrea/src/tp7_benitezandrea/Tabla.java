/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp7_benitezandrea;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrea
 */
public class Tabla extends javax.swing.JFrame {

    /**
     * Creates new form Tabla
     */
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Tabla() {
        initComponents();
        init();
        
    }
    private void init(){
        modelo.addColumn("Id");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre/s");
        modelo.addColumn("DNI");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Celular");
        modelo.addColumn("E-mail"); 
        tabla_datos.setModel(modelo);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelinfo = new javax.swing.JPanel();
        boton_nuevo = new javax.swing.JButton();
        boton_actualizar = new javax.swing.JButton();
        boton_eliminar = new javax.swing.JButton();
        entrada_email = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();
        label_celular = new javax.swing.JLabel();
        label_domicilio = new javax.swing.JLabel();
        label_dni = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_id = new javax.swing.JLabel();
        label_nombres = new javax.swing.JLabel();
        entrada_dni = new javax.swing.JTextField();
        entrada_nom = new javax.swing.JTextField();
        entrada_ape = new javax.swing.JTextField();
        entrada_id = new javax.swing.JTextField();
        entrada_domicilio = new javax.swing.JTextField();
        entrada_celular = new javax.swing.JTextField();
        panelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelinfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrainsMono NF", 0, 12))); // NOI18N

        boton_nuevo.setText("Nuevo");
        boton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nuevoActionPerformed(evt);
            }
        });

        boton_actualizar.setText("Actualizar");

        boton_eliminar.setText("Eliminar");

        label_email.setFont(new java.awt.Font("JetBrainsMono NFM", 0, 14)); // NOI18N
        label_email.setText("E-mail");

        label_celular.setFont(new java.awt.Font("JetBrainsMono NFM", 0, 14)); // NOI18N
        label_celular.setText("Celular");

        label_domicilio.setFont(new java.awt.Font("JetBrainsMono NFM", 0, 14)); // NOI18N
        label_domicilio.setText("Domicilio");

        label_dni.setFont(new java.awt.Font("JetBrainsMono NFM", 0, 14)); // NOI18N
        label_dni.setText("DNI");

        label_apellido.setFont(new java.awt.Font("JetBrainsMono NFM", 0, 14)); // NOI18N
        label_apellido.setText("Apellido");

        label_id.setFont(new java.awt.Font("JetBrainsMono NFM", 0, 14)); // NOI18N
        label_id.setText("Id");

        label_nombres.setFont(new java.awt.Font("JetBrainsMono NFM", 0, 14)); // NOI18N
        label_nombres.setText("Nombre/s");

        javax.swing.GroupLayout panelinfoLayout = new javax.swing.GroupLayout(panelinfo);
        panelinfo.setLayout(panelinfoLayout);
        panelinfoLayout.setHorizontalGroup(
            panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinfoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(boton_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_eliminar)
                .addGap(25, 25, 25))
            .addGroup(panelinfoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_celular)
                    .addComponent(label_email)
                    .addComponent(label_nombres)
                    .addComponent(label_dni)
                    .addComponent(label_apellido)
                    .addComponent(label_id)
                    .addComponent(label_domicilio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entrada_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrada_email, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrada_domicilio)
                    .addComponent(entrada_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrada_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrada_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrada_id, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        panelinfoLayout.setVerticalGroup(
            panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinfoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id)
                    .addComponent(entrada_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_apellido)
                    .addComponent(entrada_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nombres)
                    .addComponent(entrada_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_dni)
                    .addComponent(entrada_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_domicilio)
                    .addComponent(entrada_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_celular)
                    .addComponent(entrada_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_email)
                    .addComponent(entrada_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(boton_nuevo)
                    .addComponent(boton_actualizar)
                    .addComponent(boton_eliminar))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        panelLista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrainsMono NF", 0, 12))); // NOI18N

        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "Apellido", "Nombres", "DNI", "Domicilio", "Celular", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_datos);

        javax.swing.GroupLayout panelListaLayout = new javax.swing.GroupLayout(panelLista);
        panelLista.setLayout(panelListaLayout);
        panelListaLayout.setHorizontalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListaLayout.setVerticalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nuevoActionPerformed
        Cliente cl = new Cliente();
        
        //int id, String apellido, String nombre, String domicilio, 
        //String celular,String email, int dni
        cl.setApellido(entrada_ape.getText());
        cl.setNombre(entrada_nom.getText());
        cl.setDomicilio(entrada_domicilio.getText());
        cl.setCelular(entrada_celular.getText());
        cl.setEmail(entrada_email.getText());
        cl.setDni(entrada_dni.getText());
        
        
    }//GEN-LAST:event_boton_nuevoActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JButton boton_nuevo;
    private javax.swing.JTextField entrada_ape;
    private javax.swing.JTextField entrada_celular;
    private javax.swing.JTextField entrada_dni;
    private javax.swing.JTextField entrada_domicilio;
    private javax.swing.JTextField entrada_email;
    private javax.swing.JTextField entrada_id;
    private javax.swing.JTextField entrada_nom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_celular;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_domicilio;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_nombres;
    private javax.swing.JPanel panelLista;
    private javax.swing.JPanel panelinfo;
    private javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables
}