// /*
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
//  */
// package crunion;

// /**
//  *
//  * @author joses
//  */
// public class CRUnion extends javax.swing.JFrame {

//     /**
//      * Creates new form CRUnion
//      */
//     public CRUnion() {
//         initComponents();
//     }

// @SuppressWarnings("unchecked")
//     // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//     private void initComponents() {

//         mainTabPanel = new javax.swing.JTabbedPane();
//         panelConfiguracion = new javax.swing.JPanel();
//         jLabel10 = new javax.swing.JLabel();
//         nombreMonedaAgregar = new javax.swing.JTextField();
//         descripcionCantidadMoneda1 = new javax.swing.JLabel();
//         precioCompraMonedaAgregar = new javax.swing.JTextField();
//         jLabel11 = new javax.swing.JLabel();
//         precioVentaMonedaAgregar = new javax.swing.JTextField();
//         buttonAgregarMoneda = new javax.swing.JButton();
//         seleccionMonedaActualizar = new javax.swing.JComboBox<>();
//         descripcionCantidadMoneda2 = new javax.swing.JLabel();
//         precioCompraMonedaActualizar = new javax.swing.JTextField();
//         jLabel12 = new javax.swing.JLabel();
//         precioVentaMonedaActualizar = new javax.swing.JTextField();
//         jLabel13 = new javax.swing.JLabel();
//         buttonActualizarMoneda = new javax.swing.JButton();
//         informacionActualizarMoneda = new javax.swing.JTextField();
//         informacionAgregarMoneda = new javax.swing.JTextField();
//         panelConversiones = new javax.swing.JPanel();
//         textoCantidadMoneda = new javax.swing.JTextField();
//         descripcionCantidadMoneda = new javax.swing.JLabel();
//         seleccionMonedaOrigen = new javax.swing.JComboBox<>();
//         seleccionMonedaDestino = new javax.swing.JComboBox<>();
//         descripcionMonedaOrigen = new javax.swing.JLabel();
//         descripcionMonedaDestino = new javax.swing.JLabel();
//         buttonConvertir = new javax.swing.JButton();
//         jScrollPane1 = new javax.swing.JScrollPane();
//         transaccionesHistorial = new javax.swing.JTextArea();
//         jScrollPane2 = new javax.swing.JScrollPane();
//         transaccionReciente = new javax.swing.JTextArea();
//         jLabel1 = new javax.swing.JLabel();
//         jLabel2 = new javax.swing.JLabel();
//         jLabel3 = new javax.swing.JLabel();
//         jLabel4 = new javax.swing.JLabel();
//         jLabel5 = new javax.swing.JLabel();
//         jLabel6 = new javax.swing.JLabel();
//         jLabel7 = new javax.swing.JLabel();
//         jLabel8 = new javax.swing.JLabel();
//         jLabel9 = new javax.swing.JLabel();

//         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

//         jLabel10.setText("Precio de compra de moneda a agregar");

//         descripcionCantidadMoneda1.setText("Nombre de moneda a agregar");

//         jLabel11.setText("Precio de venta de moneda a agregar");

//         buttonAgregarMoneda.setText("Agregar");
//         buttonAgregarMoneda.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 buttonAgregarMonedaActionPerformed(evt);
//             }
//         });

//         descripcionCantidadMoneda2.setText("Nombre de moneda a actualizar");

//         jLabel12.setText("Nuevo precio de compra");

//         jLabel13.setText("Nuevo precio de venta");

//         buttonActualizarMoneda.setText("Actualizar");
//         buttonActualizarMoneda.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 buttonActualizarMonedaActionPerformed(evt);
//             }
//         });

//         informacionActualizarMoneda.setEditable(false);

//         informacionAgregarMoneda.setEditable(false);

//         javax.swing.GroupLayout panelConfiguracionLayout = new javax.swing.GroupLayout(panelConfiguracion);
//         panelConfiguracion.setLayout(panelConfiguracionLayout);
//         panelConfiguracionLayout.setHorizontalGroup(
//             panelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(panelConfiguracionLayout.createSequentialGroup()
//                 .addGap(36, 36, 36)
//                 .addGroup(panelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addGroup(panelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                         .addComponent(descripcionCantidadMoneda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                         .addComponent(nombreMonedaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
//                     .addComponent(buttonAgregarMoneda)
//                     .addComponent(jLabel11)
//                     .addComponent(precioVentaMonedaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
//                     .addComponent(jLabel10)
//                     .addComponent(precioCompraMonedaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
//                     .addComponent(informacionAgregarMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
//                 .addGap(106, 106, 106)
//                 .addGroup(panelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addComponent(descripcionCantidadMoneda2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                     .addGroup(panelConfiguracionLayout.createSequentialGroup()
//                         .addGroup(panelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                             .addComponent(jLabel13)
//                             .addComponent(precioVentaMonedaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
//                             .addComponent(jLabel12)
//                             .addComponent(precioCompraMonedaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
//                             .addComponent(buttonActualizarMoneda)
//                             .addComponent(informacionActualizarMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
//                         .addGap(0, 203, Short.MAX_VALUE))
//                     .addGroup(panelConfiguracionLayout.createSequentialGroup()
//                         .addComponent(seleccionMonedaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
//                         .addGap(0, 0, Short.MAX_VALUE)))
//                 .addContainerGap())
//         );
//         panelConfiguracionLayout.setVerticalGroup(
//             panelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(panelConfiguracionLayout.createSequentialGroup()
//                 .addGap(76, 76, 76)
//                 .addGroup(panelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                     .addComponent(nombreMonedaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                     .addComponent(seleccionMonedaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                 .addGap(8, 8, 8)
//                 .addGroup(panelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                     .addComponent(descripcionCantidadMoneda1)
//                     .addComponent(descripcionCantidadMoneda2))
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addGroup(panelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addGroup(panelConfiguracionLayout.createSequentialGroup()
//                         .addComponent(precioCompraMonedaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addComponent(jLabel10)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                         .addComponent(precioVentaMonedaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addComponent(jLabel11))
//                     .addGroup(panelConfiguracionLayout.createSequentialGroup()
//                         .addComponent(precioCompraMonedaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addComponent(jLabel12)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                         .addComponent(precioVentaMonedaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addComponent(jLabel13)))
//                 .addGap(18, 18, 18)
//                 .addGroup(panelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addComponent(buttonAgregarMoneda)
//                     .addComponent(buttonActualizarMoneda))
//                 .addGap(18, 18, 18)
//                 .addGroup(panelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addComponent(informacionActualizarMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                     .addComponent(informacionAgregarMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                 .addContainerGap(315, Short.MAX_VALUE))
//         );

//         mainTabPanel.addTab("Configuracion", panelConfiguracion);

//         descripcionCantidadMoneda.setText("Cantidad a convertir");

//         actualizarComboBoxes();

//         descripcionMonedaOrigen.setText("Moneda Origen");

//         descripcionMonedaDestino.setText("Moneda Origen");

//         buttonConvertir.setText("Convertir");
//         buttonConvertir.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 buttonConvertirActionPerformed(evt);
//             }
//         });

//         transaccionesHistorial.setEditable(false);
//         transaccionesHistorial.setColumns(20);
//         transaccionesHistorial.setRows(5);
//         jScrollPane1.setViewportView(transaccionesHistorial);

//         transaccionReciente.setEditable(false);
//         transaccionReciente.setColumns(20);
//         transaccionReciente.setRows(5);
//         transaccionReciente.setAutoscrolls(false);
//         jScrollPane2.setViewportView(transaccionReciente);

//         jLabel1.setText("Ventas entre 3000 y 6000 impuesto de 1%");

//         jLabel2.setText("Ventas entre 6000 y 9000 impuesto de 2%");

//         jLabel3.setText("Compras entre 3000 y 6000:");

//         jLabel4.setText("Ventas mayores a 9000 impuesto de 3%");

//         jLabel5.setText(" precioCompra = precioCompra + 0.15*diferenciaVentaCompra");

//         jLabel6.setText("Compras entre 6000 y 9000:");

//         jLabel7.setText(" precioCompra = precioCompra + 0.25*diferenciaVentaCompra");

//         jLabel8.setText("Compras mayores a 9000:");

//         jLabel9.setText(" precioCompra = precioCompra + 0.35*diferenciaVentaCompra");

//         javax.swing.GroupLayout panelConversionesLayout = new javax.swing.GroupLayout(panelConversiones);
//         panelConversiones.setLayout(panelConversionesLayout);
//         panelConversionesLayout.setHorizontalGroup(
//             panelConversionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(panelConversionesLayout.createSequentialGroup()
//                 .addGroup(panelConversionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addGroup(panelConversionesLayout.createSequentialGroup()
//                         .addGap(25, 25, 25)
//                         .addGroup(panelConversionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                             .addComponent(buttonConvertir)
//                             .addComponent(descripcionMonedaDestino)
//                             .addGroup(panelConversionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                 .addComponent(descripcionMonedaOrigen)
//                                 .addComponent(descripcionCantidadMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                 .addComponent(textoCantidadMoneda))
//                             .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
//                             .addGroup(panelConversionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
//                                 .addComponent(seleccionMonedaDestino, javax.swing.GroupLayout.Alignment.LEADING, 0, 157, Short.MAX_VALUE)
//                                 .addComponent(seleccionMonedaOrigen, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
//                     .addGroup(panelConversionesLayout.createSequentialGroup()
//                         .addGap(12, 12, 12)
//                         .addGroup(panelConversionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                             .addComponent(jLabel2)
//                             .addComponent(jLabel1)
//                             .addComponent(jLabel4)
//                             .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
//                             .addComponent(jLabel6)
//                             .addComponent(jLabel3)))
//                     .addGroup(panelConversionesLayout.createSequentialGroup()
//                         .addGap(33, 33, 33)
//                         .addComponent(jLabel5))
//                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversionesLayout.createSequentialGroup()
//                         .addContainerGap()
//                         .addGroup(panelConversionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                             .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
//                             .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
//                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addContainerGap())
//         );
//         panelConversionesLayout.setVerticalGroup(
//             panelConversionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(panelConversionesLayout.createSequentialGroup()
//                 .addComponent(jScrollPane1)
//                 .addContainerGap())
//             .addGroup(panelConversionesLayout.createSequentialGroup()
//                 .addGap(68, 68, 68)
//                 .addComponent(textoCantidadMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(8, 8, 8)
//                 .addComponent(descripcionCantidadMoneda)
//                 .addGap(27, 27, 27)
//                 .addComponent(seleccionMonedaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(descripcionMonedaOrigen)
//                 .addGap(25, 25, 25)
//                 .addComponent(seleccionMonedaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(descripcionMonedaDestino)
//                 .addGap(47, 47, 47)
//                 .addComponent(buttonConvertir)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(jLabel1)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(jLabel2)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(jLabel4)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(jLabel3)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(jLabel5)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(jLabel6)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(jLabel7)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(jLabel8)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(jLabel9)
//                 .addContainerGap(64, Short.MAX_VALUE))
//         );

//         descripcionMonedaDestino.getAccessibleContext().setAccessibleName("Moneda Destino");

//         mainTabPanel.addTab("Conversiones", panelConversiones);

//         getContentPane().add(mainTabPanel, java.awt.BorderLayout.CENTER);

//         pack();
//     }                                            

//     private void buttonAgregarMonedaActionPerformed(java.awt.event.ActionEvent evt) {

//         nuevaMoneda = nombreMonedaAgregar.getText();

//         try {
//             nuevaMonedaCompra = Float.parseFloat(precioCompraMonedaAgregar.getText());
//             nuevaMonedaVenta = Float.parseFloat(precioVentaMonedaAgregar.getText());

//             if (nuevaMonedaCompra > 0 && nuevaMonedaVenta > 0) {
//                 if (EquivalenciasNuevas.agregarNuevaMoneda(nuevaMoneda, nuevaMonedaVenta, nuevaMonedaCompra)) {
//                     informacionAgregarMoneda.setText(String.format("Moneda \"%s\" agredada Compra: %.2f | Venta: %.2f ", nuevaMoneda, nuevaMonedaCompra, nuevaMonedaVenta));
//                     actualizarComboBoxes();
//                 }
//             } else {
//                 informacionAgregarMoneda.setText(String.format("Ni el precio de venta o el de compra pueden ser iguales o menores a cero"));
//             }

//         } catch (java.lang.NumberFormatException ex) {
//             informacionAgregarMoneda.setText(String.format("Alguno de los valores es una cantidad ilegal (deben ser numeros). Compra:\"%s\" Venta:\"%s\"", precioCompraMonedaAgregar.getText(), precioVentaMonedaAgregar.getText()));
//         } 
//         precioCompraMonedaAgregar.setText("");
//         precioVentaMonedaAgregar.setText("");
//         nombreMonedaAgregar.setText("");                                             
        
//     }                                                   

//     private void buttonActualizarMonedaActionPerformed(java.awt.event.ActionEvent evt) {                                                       
//         String nombreMoneda = seleccionMonedaActualizar.getSelectedItem().toString().toLowerCase();
//         try {
//             monedaActualizarCompra = Float.parseFloat(precioCompraMonedaActualizar.getText());
//             monedaActualizarVenta = Float.parseFloat(precioVentaMonedaActualizar.getText());

//             if (monedaActualizarCompra > 0 && monedaActualizarVenta > 0) {
//                 if (EquivalenciasNuevas.actualizarEquivalencia(nombreMoneda, monedaActualizarVenta, monedaActualizarCompra)) {
//                     informacionActualizarMoneda.setText(String.format("Nuevos valores de moneda \"%s\". Compra: %.2f | Venta: %.2f ", nombreMoneda, monedaActualizarCompra, monedaActualizarVenta));
//                 } else {
//                     informacionActualizarMoneda.setText(String.format("La moneda con el nombre \"%s\" no existe", nombreMoneda));    
//                 }
//             } else
//             {
//                 informacionActualizarMoneda.setText(String.format("Ni el precio de venta o el de compra pueden ser iguales o menores a cero"));
//             }

//         } catch (java.lang.NumberFormatException ex) {
//             informacionActualizarMoneda.setText(String.format("Alguno de los valores es una cantidad ilegal (deben ser numeros). Compra:\"%s\" Venta:\"%s\"", precioCompraMonedaActualizar.getText(), precioVentaMonedaActualizar.getText()));
//         }

//         precioCompraMonedaActualizar.setText("");
//         precioVentaMonedaActualizar.setText("");
//     }                                                      

//     private void buttonConvertirActionPerformed(java.awt.event.ActionEvent evt) {                                                
//         monedaOrigen = seleccionMonedaOrigen.getSelectedItem().toString().toLowerCase();
//         monedaDestino = seleccionMonedaDestino.getSelectedItem().toString().toLowerCase();

//         //Variable usada para guardar temporalmente el string procesado
//         transaccionStringTmp = "";

//         /**
//          Este Try statement maneja la logica principal de GUI  y a su vez realiza el checkeo de la cantidad introducida
//          Maneja las excepciones dependiendo de si la cantidad es un float, si es negativa o en el caso de ser 0 no realiza ningun calculo adicional y solo imprime 0 = 0
//          */
//         try {
//             cantidadMonedaInicial = Float.parseFloat(textoCantidadMoneda.getText());

//             if (cantidadMonedaInicial == 0) {
//                 // Escenario cuando cantidadMonedaIncial = 0
//                 transaccionStringTmp = String.format("%.2f %s equivalen a 0.00 %s", cantidadMonedaInicial, monedaOrigen, monedaDestino);
//                 transaccionReciente.setText(transaccionStringTmp);
//                 transaccionesHistorial.append(transaccionStringTmp + NEWLINE);

//             } else if (cantidadMonedaInicial < 0) {
//                 // Escenario cuando cantidad de moneda incial es negativa
//                 transaccionReciente.setText(String.format("%.2f es una cantidad ilegal (no se admiten numeros negativos)", cantidadMonedaInicial));

//             } else {
//                 /**
//                  Escenario cuando la cantidad es valida y diferente de 0.
//                  Imprime el calculo en la pantalla de la transaccion actual y tambien imprime la transaccion al historial de transaciones para visibilidad
//                  */
//                 cantidadMonedaFinal = ConversionesNuevas.ConversionMonedas(cantidadMonedaInicial, monedaOrigen, monedaDestino);
//                 transaccionStringTmp = String.format("%.2f %s equivalen a %.2f %s", cantidadMonedaInicial, monedaOrigen, cantidadMonedaFinal, monedaDestino);
//                 transaccionReciente.setText(transaccionStringTmp);
//                 transaccionesHistorial.append(transaccionStringTmp + NEWLINE);

//             }
//         } catch (java.lang.NumberFormatException ex) {
//             /**
//              Atrapa la excepcion en casos donde cantidadMonedaInicial no puede ser parseado como un float
//              Imprime la excepcion a la consola usando el logger y tambien muestra un mensaje al usuario
//              */
//             transaccionReciente.setText(String.format("\"%s\" es una cantidad ilegal", textoCantidadMoneda.getText()));
//             java.util.logging.Logger.getLogger(CRUnion.class.getName()).log(java.util.logging.Level.WARNING, null, ex);

//         }
//         // Reinicia el cuadro de texto de input
//         textoCantidadMoneda.setText("");
//     }                                               

//     /**
//      * @param args the command line arguments
//      */
//     public static void main(String args[]) {
//         /* Set the Nimbus look and feel */
//         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//         /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//          * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//          */
//         Equivalencias.getInstance(25);
//         try {
//             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException ex) {
//             java.util.logging.Logger.getLogger(CRUnion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (InstantiationException ex) {
//             java.util.logging.Logger.getLogger(CRUnion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (IllegalAccessException ex) {
//             java.util.logging.Logger.getLogger(CRUnion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(CRUnion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }
//         //</editor-fold>

//         /* Create and display the form */
//         java.awt.EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 new CRUnion().setVisible(true);
//             }
//         });
//     }

//     private void actualizarComboBoxes() {
//         seleccionMonedaOrigen.setModel(new javax.swing.DefaultComboBoxModel(Equivalencias.getInstance().getDescripcionesMonedasValidas()));
//         seleccionMonedaDestino.setModel(new javax.swing.DefaultComboBoxModel(Equivalencias.getInstance().getDescripcionesMonedasValidas()));
//         seleccionMonedaActualizar.setModel(new javax.swing.DefaultComboBoxModel(Equivalencias.getInstance().getDescripcionesMonedasValidas()));

//     }

//     // Variables declaration - do not modify                     
//     private javax.swing.JButton buttonActualizarMoneda;
//     private javax.swing.JButton buttonAgregarMoneda;
//     private javax.swing.JButton buttonConvertir;
//     private javax.swing.JLabel descripcionCantidadMoneda;
//     private javax.swing.JLabel descripcionCantidadMoneda1;
//     private javax.swing.JLabel descripcionCantidadMoneda2;
//     private javax.swing.JLabel descripcionMonedaDestino;
//     private javax.swing.JLabel descripcionMonedaOrigen;
//     private javax.swing.JTextField informacionActualizarMoneda;
//     private javax.swing.JTextField informacionAgregarMoneda;
//     private javax.swing.JLabel jLabel1;
//     private javax.swing.JLabel jLabel10;
//     private javax.swing.JLabel jLabel11;
//     private javax.swing.JLabel jLabel12;
//     private javax.swing.JLabel jLabel13;
//     private javax.swing.JLabel jLabel2;
//     private javax.swing.JLabel jLabel3;
//     private javax.swing.JLabel jLabel4;
//     private javax.swing.JLabel jLabel5;
//     private javax.swing.JLabel jLabel6;
//     private javax.swing.JLabel jLabel7;
//     private javax.swing.JLabel jLabel8;
//     private javax.swing.JLabel jLabel9;
//     private javax.swing.JScrollPane jScrollPane1;
//     private javax.swing.JScrollPane jScrollPane2;
//     private javax.swing.JTabbedPane mainTabPanel;
//     private javax.swing.JTextField nombreMonedaAgregar;
//     private javax.swing.JPanel panelConfiguracion;
//     private javax.swing.JPanel panelConversiones;
//     private javax.swing.JTextField precioCompraMonedaActualizar;
//     private javax.swing.JTextField precioCompraMonedaAgregar;
//     private javax.swing.JTextField precioVentaMonedaActualizar;
//     private javax.swing.JTextField precioVentaMonedaAgregar;
//     private javax.swing.JComboBox<String> seleccionMonedaActualizar;
//     private javax.swing.JComboBox<String> seleccionMonedaDestino;
//     private javax.swing.JComboBox<String> seleccionMonedaOrigen;
//     private javax.swing.JTextField textoCantidadMoneda;
//     private javax.swing.JTextArea transaccionReciente;
//     private javax.swing.JTextArea transaccionesHistorial;
//     private String transaccionStringTmp;
//     private String monedaOrigen;
//     private String monedaDestino;
//     private String nuevaMoneda;
//     private float nuevaMonedaCompra;
//     private float nuevaMonedaVenta;
//     private float monedaActualizarCompra;
//     private float monedaActualizarVenta;
//     private float cantidadMonedaFinal;
//     private float cantidadMonedaInicial;
//     private final static String NEWLINE = "\n";
//     // End of variables declaration                   
// }
