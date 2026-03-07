package arquitectura.capasBD;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaTipoProducto extends javax.swing.JFrame {

    private NegocioTipoProducto negocio;

    public VentanaTipoProducto() {
        initComponents();
        negocio = new NegocioTipoProducto();
    }

    private void limpiar() {
        jTextField1.setText("");
        jTextField2.setText("");
    }

    private void listar() {
        String[][] datos = negocio.listar();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (String[] fila : datos) {
            if (fila[0] != null) {
                model.addRow(fila);
            }
        }
    }

    private void guardar() {
        String descripcion = jTextField2.getText();
        int id = negocio.guardar(descripcion);
        if (id > 0) {
            jTextField1.setText(String.valueOf(id));
            JOptionPane.showMessageDialog(this, "Guardado con ID: " + id);
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar");
        }
    }

    private void eliminar() {
        try {
            int id = Integer.parseInt(jTextField1.getText());
            negocio.eliminar(id);
            limpiar();
            listar();
            JOptionPane.showMessageDialog(this, "Eliminado");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido");
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID:");
        jLabel2.setText("Descripción:");
        jButton1.setText("Guardar");
        jButton1.addActionListener(e -> guardar());
        jButton2.setText("Limpiar");
        jButton2.addActionListener(e -> limpiar());
        jButton3.setText("Eliminar");
        jButton3.addActionListener(e -> eliminar());

        jTable1.setModel(new DefaultTableModel(
            new Object[][]{{null, null}},
            new String[]{"ID", "Descripción"}
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, 200, 200, 200)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, 100, 100, 100)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(10)
                        .addComponent(jButton1)
                        .addGap(10)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, 400, 400, 400))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addComponent(jTextField1, 30, 30, 30)
                .addGap(10)
                .addComponent(jLabel2)
                .addComponent(jTextField2, 30, 30, 30)
                .addGap(20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(20)
                .addComponent(jScrollPane1, 200, 200, 200))
        );

        pack();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new VentanaTipoProducto().setVisible(true));
    }

    private javax.swing.JButton jButton1, jButton2, jButton3;
    private javax.swing.JLabel jLabel1, jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1, jTextField2;
}
