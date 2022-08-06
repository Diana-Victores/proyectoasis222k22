/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asignacion.vista;

import asignacion.datos.BitacoraDAO;
import asignacion.datos.usuarios;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.UnknownHostException;

/**
 *
 * @author jonat
 */
public class MDISistemas extends javax.swing.JFrame {
    usuarios mod;
    private Bitacora Bitacora;
    private RegistoCatedratico RegistoCatedratico;

    private Listadoalumnoscurso Listadoalumnoscurso;
    private Pensum Pensum;
    private Listadoalumnoscarreraporcarrera Listadoalumnoscarreraporcarrera;
    private CursosCatedraticos CursosCatedraticos;
    private Listadoalumnoscarreraporcarrera ListadoAlumnoCarrera;
    private Listadoalumnoscurso Listaalumnoscurso;
    private AsignacionDeCursos AsignacionDeCursos;
    private CertificacionCursos CertificacionCursos;
    private Login Login;

    /**
     * Creates new form MDISistemas
     */
    public MDISistemas() {
        initComponents();
        

//          this.setTitle("Usuario: " + "[" + Login.usuarioComercial + "]" + " \t" + "IP: [" + mdi_Components.getIp() + "]");
//        permisos.getPermisos(modulo_nombre, Login.usuarioComercial);
    

    }
    
    public MDISistemas (usuarios mod) {
        this.mod = mod;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        itemLogin = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        itemRegistroCatedratico = new javax.swing.JMenuItem();
        itemCursohabilitadoAlumno = new javax.swing.JMenuItem();
        itemCursohabilitadoAlumno1 = new javax.swing.JMenuItem();
        itemListadoAlumnoCursoCatedratico = new javax.swing.JMenuItem();
        itemListado_Alumno_Carrera = new javax.swing.JMenuItem();
        itemListado_Alumno_Curso = new javax.swing.JMenuItem();
        itemListado_Alumno_Seccion = new javax.swing.JMenuItem();
        itemListadoCarreraAlumno = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        itemBoletaAsignacionCurso = new javax.swing.JMenuItem();
        itemAsignacion_Cursos = new javax.swing.JMenuItem();
        itemPensum = new javax.swing.JMenuItem();
        itemCertificacion_Curso = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        btnBitacora = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        jMenu3.setText("Login");

        itemLogin.setText("Login");
        itemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginActionPerformed(evt);
            }
        });
        jMenu3.add(itemLogin);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Mantenimientos");

        jMenu5.setText("Mantenimientos");

        itemRegistroCatedratico.setText("RegistroCatedratico");
        itemRegistroCatedratico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistroCatedraticoActionPerformed(evt);
            }
        });
        jMenu5.add(itemRegistroCatedratico);

        itemCursohabilitadoAlumno.setText("Curso_Habilitado_Alumno");
        itemCursohabilitadoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCursohabilitadoAlumnoActionPerformed(evt);
            }
        });
        jMenu5.add(itemCursohabilitadoAlumno);

        itemCursohabilitadoAlumno1.setText("Cursos_Catedratico");
        itemCursohabilitadoAlumno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCursohabilitadoAlumno1ActionPerformed(evt);
            }
        });
        jMenu5.add(itemCursohabilitadoAlumno1);

        itemListadoAlumnoCursoCatedratico.setText("Listado_Alumno_Curso_Catedratico");
        itemListadoAlumnoCursoCatedratico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListadoAlumnoCursoCatedraticoActionPerformed(evt);
            }
        });
        jMenu5.add(itemListadoAlumnoCursoCatedratico);

        itemListado_Alumno_Carrera.setText("Listado_Alumno_Carrera");
        itemListado_Alumno_Carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListado_Alumno_CarreraActionPerformed(evt);
            }
        });
        jMenu5.add(itemListado_Alumno_Carrera);

        itemListado_Alumno_Curso.setText("Listado_Alumno_Curso");
        itemListado_Alumno_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListado_Alumno_CursoActionPerformed(evt);
            }
        });
        jMenu5.add(itemListado_Alumno_Curso);

        itemListado_Alumno_Seccion.setText("Listado_Alumno_Seccion");
        itemListado_Alumno_Seccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListado_Alumno_SeccionActionPerformed(evt);
            }
        });
        jMenu5.add(itemListado_Alumno_Seccion);

        itemListadoCarreraAlumno.setText("Listado Alumno_Carrera");
        itemListadoCarreraAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListadoCarreraAlumnoActionPerformed(evt);
            }
        });
        jMenu5.add(itemListadoCarreraAlumno);

        jMenu4.add(jMenu5);

        jMenu11.setText("Procesos");

        itemBoletaAsignacionCurso.setText("BoletaAsignacionCurso");
        itemBoletaAsignacionCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBoletaAsignacionCursoActionPerformed(evt);
            }
        });
        jMenu11.add(itemBoletaAsignacionCurso);

        itemAsignacion_Cursos.setText("Asignacion_Cursos");
        itemAsignacion_Cursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAsignacion_CursosActionPerformed(evt);
            }
        });
        jMenu11.add(itemAsignacion_Cursos);

        itemPensum.setText("Pensum");
        itemPensum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPensumActionPerformed(evt);
            }
        });
        jMenu11.add(itemPensum);

        itemCertificacion_Curso.setText("Certificacion_Curso");
        itemCertificacion_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCertificacion_CursoActionPerformed(evt);
            }
        });
        jMenu11.add(itemCertificacion_Curso);

        jMenu4.add(jMenu11);

        jMenuBar2.add(jMenu4);

        jMenu12.setText("Informe");

        jMenu13.setText("Bitacora");

        btnBitacora.setText("Bitacora");
        btnBitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBitacoraActionPerformed(evt);
            }
        });
        jMenu13.add(btnBitacora);

        jMenu12.add(jMenu13);

        jMenuBar2.add(jMenu12);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBitacoraActionPerformed
        // TODO add your handling code here:
        Bitacora form = new Bitacora();
        form.setVisible(true);
        this.dispose();

        Bitacora = new Bitacora();
        this.add(Bitacora);
        Bitacora.setVisible(true);
        
        BitacoraDAO BitacoraDAO = new BitacoraDAO();
        Bitacora Insertar = new Bitacora();
        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //    Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBitacoraActionPerformed

    private void itemListado_Alumno_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListado_Alumno_CursoActionPerformed
        // TODO add your handling code here:
        Listadoalumnoscurso = new Listadoalumnoscurso();
        Listadoalumnoscurso.show();
        Listadoalumnoscurso.setVisible(true);
        BitacoraDAO BitacoraDAO = new BitacoraDAO();
        Bitacora Insertar = new Bitacora();
        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemListado_Alumno_CursoActionPerformed

    private void itemCursohabilitadoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCursohabilitadoAlumnoActionPerformed
        // TODO add your handling code here:
//       RegistoCatedratico = new RegistoCatedratico();

        RegistoCatedratico.show();

        RegistoCatedratico.setVisible(true);

        BitacoraDAO BitacoraDAO = new BitacoraDAO();

        Bitacora Insertar = new Bitacora();
        //  Insertar.setId_Usuario(Login.usuarioComercial);
        //     Insertar.setAccion("Acceso ");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_itemCursohabilitadoAlumnoActionPerformed

    private void itemListado_Alumno_SeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListado_Alumno_SeccionActionPerformed
        // TODO add your handling code here:
        Listaalumnoscurso = new Listadoalumnoscurso();
        Listaalumnoscurso.show();
        Listaalumnoscurso.setVisible(true);
        
        BitacoraDAO BitacoraDAO = new BitacoraDAO();   
        Bitacora Insertar = new Bitacora();
        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemListado_Alumno_SeccionActionPerformed

    private void itemRegistroCatedraticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistroCatedraticoActionPerformed
       RegistoCatedratico = new RegistoCatedratico();

        RegistoCatedratico.show();

        RegistoCatedratico.setVisible(true);

        BitacoraDAO BitacoraDAO = new BitacoraDAO();

        Bitacora Insertar = new Bitacora();
        //  Insertar.setId_Usuario(Login.usuarioComercial);
        //     Insertar.setAccion("Acceso ");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemRegistroCatedraticoActionPerformed

    private void itemPensumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPensumActionPerformed
        // TODO add your handling code here:
        Pensum = new Pensum();
        Pensum.show();
        Pensum.setVisible(true);

        BitacoraDAO BitacoraDAO = new BitacoraDAO();

        Bitacora Insertar = new Bitacora();
        //  Insertar.setId_Usuario(Login.usuarioComercial);
        //     Insertar.setAccion("Acceso ");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemPensumActionPerformed

    private void itemListadoCarreraAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListadoCarreraAlumnoActionPerformed
        // TODO add your handling code here:
        Listadoalumnoscarreraporcarrera form = new Listadoalumnoscarreraporcarrera();
        form.setVisible(true);
        this.dispose();
        ListadoAlumnoCarrera.show();

        ListadoAlumnoCarrera.setVisible(true);
        Bitacora = new Bitacora();

        Bitacora.setVisible(true);

        BitacoraDAO BitacoraDAO = new BitacoraDAO();

        Bitacora Insertar = new Bitacora();
        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //    Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_itemListadoCarreraAlumnoActionPerformed

    private void itemListadoAlumnoCursoCatedraticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListadoAlumnoCursoCatedraticoActionPerformed
        // TODO add your handling code here:
        CursosCatedraticos = new CursosCatedraticos();

        CursosCatedraticos.show();

        CursosCatedraticos.setVisible(true);

        BitacoraDAO BitacoraDAO = new BitacoraDAO();

        Bitacora Insertar = new Bitacora();
        //  Insertar.setId_Usuario(Login.usuarioComercial);
        //     Insertar.setAccion("Acceso ");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemListadoAlumnoCursoCatedraticoActionPerformed

    private void itemListado_Alumno_CarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListado_Alumno_CarreraActionPerformed
        // TODO add your handling code here:
        Listadoalumnoscarreraporcarrera = new Listadoalumnoscarreraporcarrera();

        Listadoalumnoscarreraporcarrera.show();

        Listadoalumnoscarreraporcarrera.setVisible(true);

        BitacoraDAO BitacoraDAO = new BitacoraDAO();

        Bitacora Insertar = new Bitacora();
        //  Insertar.setId_Usuario(Login.usuarioComercial);
        //     Insertar.setAccion("Acceso ");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_itemListado_Alumno_CarreraActionPerformed

    private void itemBoletaAsignacionCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBoletaAsignacionCursoActionPerformed
        // TODO add your handling code here:
        AsignacionDeCursos = new AsignacionDeCursos();

        AsignacionDeCursos.show();

        AsignacionDeCursos.setVisible(true);

        BitacoraDAO BitacoraDAO = new BitacoraDAO();

        Bitacora Insertar = new Bitacora();
        //  Insertar.setId_Usuario(Login.usuarioComercial);
        //     Insertar.setAccion("Acceso ");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemBoletaAsignacionCursoActionPerformed

    private void itemAsignacion_CursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAsignacion_CursosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_itemAsignacion_CursosActionPerformed

    private void itemCertificacion_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCertificacion_CursoActionPerformed
        // TODO add your handling code here:
        CertificacionCursos = new CertificacionCursos();

        CertificacionCursos.show();

        CertificacionCursos.setVisible(true);

        BitacoraDAO BitacoraDAO = new BitacoraDAO();

        Bitacora Insertar = new Bitacora();
        //  Insertar.setId_Usuario(Login.usuarioComercial);
        //     Insertar.setAccion("Acceso ");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemCertificacion_CursoActionPerformed

    private void itemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoginActionPerformed
        // TODO add your handling code here:
        Login = new Login();

        Login.show();

        Login.setVisible(true);

        BitacoraDAO BitacoraDAO = new BitacoraDAO();

        Bitacora Insertar = new Bitacora();
        //  Insertar.setId_Usuario(Login.usuarioComercial);
        //     Insertar.setAccion("Acceso ");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemLoginActionPerformed

    private void itemCursohabilitadoAlumno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCursohabilitadoAlumno1ActionPerformed
        // TODO add your handling code here:
        CursosCatedraticos = new CursosCatedraticos();

        CursosCatedraticos.show();

        CursosCatedraticos.setVisible(true);

        BitacoraDAO BitacoraDAO = new BitacoraDAO();

        Bitacora Insertar = new Bitacora();
        //  Insertar.setId_Usuario(Login.usuarioComercial);
        //     Insertar.setAccion("Acceso ");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            //Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemCursohabilitadoAlumno1ActionPerformed

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
            java.util.logging.Logger.getLogger(MDISistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDISistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDISistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDISistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDISistemas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnBitacora;
    private javax.swing.JMenuItem itemAsignacion_Cursos;
    private javax.swing.JMenuItem itemBoletaAsignacionCurso;
    private javax.swing.JMenuItem itemCertificacion_Curso;
    private javax.swing.JMenuItem itemCursohabilitadoAlumno;
    private javax.swing.JMenuItem itemCursohabilitadoAlumno1;
    private javax.swing.JMenuItem itemListadoAlumnoCursoCatedratico;
    private javax.swing.JMenuItem itemListadoCarreraAlumno;
    private javax.swing.JMenuItem itemListado_Alumno_Carrera;
    private javax.swing.JMenuItem itemListado_Alumno_Curso;
    private javax.swing.JMenuItem itemListado_Alumno_Seccion;
    private javax.swing.JMenuItem itemLogin;
    private javax.swing.JMenuItem itemPensum;
    private javax.swing.JMenuItem itemRegistroCatedratico;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
