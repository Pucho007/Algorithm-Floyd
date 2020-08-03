
package Frame;

import model.Lugar;
import algorithm.Floyd;
import static algorithm.Floyd.cad;
import static algorithm.Floyd.l;
import javax.swing.JOptionPane;

public class Callao extends javax.swing.JFrame {
    public static int tamano=25;
    public static  int c[][]=new int[tamano][tamano];
    Floyd f;
    public Callao() {
        initComponents();
        llenarMatriz();
        llenarArray();
        f=new Floyd();
    }
    
    public void llenarArray(){
        Lugar l0=new Lugar("Urb Juan Pablo",0);
        Lugar l1=new Lugar("Renovadora Palomino",1);
        Lugar l2=new Lugar("Los Pilares",2);
        Lugar l3=new Lugar("Las Malvas",3);
        Lugar l4=new Lugar("Urb Stella Maris",4);
        Lugar l5=new Lugar("Confecciones Militares",5);
        Lugar l6=new Lugar("Comisaria Ciudad del Pescador",6);
        Lugar l7=new Lugar("Santa Marina Sur",7);
        Lugar l8=new Lugar("Meliton Carvajal",8);
        Lugar l9=new Lugar("UNAC",9);
        Lugar l10=new Lugar("Urb Sector 4",10);
        Lugar l11=new Lugar("Sima",11);
        Lugar l12=new Lugar("Urb San Miguel",12);
        Lugar l13=new Lugar("Astete",13);
        Lugar l14=new Lugar("Casa de la juventud",14);
        Lugar l15=new Lugar("Estadio Carvajo",15);
        Lugar l16=new Lugar("Urb Angamos",16);
        Lugar l17=new Lugar("Hospital Carrion",17);
        Lugar l18=new Lugar("Urb La Huaca",18);
        Lugar l19=new Lugar("Urb Nelly Chavez",19);
        Lugar l20=new Lugar("Ruggia",20);
        Lugar l21=new Lugar("Barrio Magisterial",21);
        Lugar l22=new Lugar("UV Jose Olaya",22);
        Lugar l23=new Lugar("Urb Perla Baja",23);
        Lugar l24=new Lugar("UV La Perla",24);     
        
        l.add(l0);
        l.add(l1);
        l.add(l2);
        l.add(l3);
        l.add(l4);
        l.add(l5);
        l.add(l6);
        l.add(l7);
        l.add(l8);
        l.add(l9);
        l.add(l10);
        l.add(l11);
        l.add(l12);
        l.add(l13);
        l.add(l14);
        l.add(l15);
        l.add(l16);
        l.add(l17);
        l.add(l18);
        l.add(l19);
        l.add(l20);
        l.add(l21);
        l.add(l22);
        l.add(l23);
        l.add(l24);
    }
    
    public void llenarMatriz(){
        for(int i=0;i<tamano;i++){
            for(int j=0;j<tamano;j++){
                if(i==j){
                    c[i][j]=0;
                }else{
                    c[i][j]=9999;
                }
            }
        }
        c[0][1]=1000;
        c[1][2]=950;
        c[1][3]=700;
        c[1][4]=1300;
        c[2][0]=750;
        c[2][6]=1100;
        c[3][4]=1300;
        c[3][8]=900;
        c[4][5]=1200;
        c[4][9]=650;
        c[5][6]=1200;
        c[6][4]=1900;
        c[6][12]=130;
        c[6][13]=130;
        c[7][14]=1300;
        c[7][3]=1400;
        c[8][7]=850;
        c[8][14]=700;
        c[8][16]=550;
        c[9][8]=1600;
        c[9][10]=550;
        c[10][11]=1100;
        c[10][12]=1300;
        c[10][18]=750;
        c[12][5]=1100;
        c[12][13]=550;
        c[13][6]=1300;
        c[13][19]=2100;
        c[14][15]=450;
        c[14][20]=550;
        c[15][16]=800;
        c[16][17]=650;
        c[17][9]=900;
        c[17][18]=600;
        c[18][19]=400;
        c[18][24]=550;
        c[19][11]=1200;
        c[20][21]=300;
        c[21][22]=750;
        c[21][23]=550;
        c[22][17]=1300;
        c[22][18]=850;
        c[22][20]=750;
        c[22][23]=550;
        c[23][24]=750;
        c[24][19]=600;
        c[24][22]=900;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP = new javax.swing.JButton();
        LP = new javax.swing.JButton();
        MC = new javax.swing.JButton();
        RP = new javax.swing.JButton();
        CM = new javax.swing.JButton();
        CMP = new javax.swing.JButton();
        UNA = new javax.swing.JButton();
        LM = new javax.swing.JButton();
        ULC = new javax.swing.JButton();
        SMS = new javax.swing.JButton();
        RUG = new javax.swing.JButton();
        UAN = new javax.swing.JButton();
        UJO = new javax.swing.JButton();
        UPB = new javax.swing.JButton();
        BM = new javax.swing.JButton();
        ULP = new javax.swing.JButton();
        SM = new javax.swing.JButton();
        HC = new javax.swing.JButton();
        CDLJ = new javax.swing.JButton();
        UNAC = new javax.swing.JButton();
        US4 = new javax.swing.JButton();
        UNC = new javax.swing.JButton();
        USM = new javax.swing.JButton();
        SIM = new javax.swing.JButton();
        AST = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        JP.setText("Urb Juan Pablo");
        JP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPActionPerformed(evt);
            }
        });
        getContentPane().add(JP, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, 40));

        LP.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LP.setText("Los Pilares");
        LP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LPActionPerformed(evt);
            }
        });
        getContentPane().add(LP, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, -1, -1));

        MC.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        MC.setText("Meliton Carvajal");
        MC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCActionPerformed(evt);
            }
        });
        getContentPane().add(MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 140, 50));

        RP.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        RP.setText("Renovadora Palomino");
        RP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPActionPerformed(evt);
            }
        });
        getContentPane().add(RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 170, 40));

        CM.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        CM.setText("Confecciones Militares");
        CM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMActionPerformed(evt);
            }
        });
        getContentPane().add(CM, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 170, 40));

        CMP.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        CMP.setText("Comisaria Ciudad del Pescador");
        CMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMPActionPerformed(evt);
            }
        });
        getContentPane().add(CMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 200, 40));

        UNA.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        UNA.setText("UNAC");
        UNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNAActionPerformed(evt);
            }
        });
        getContentPane().add(UNA, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 150, 40));

        LM.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LM.setText("Las Malvas");
        LM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LMActionPerformed(evt);
            }
        });
        getContentPane().add(LM, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 289, 140, 30));

        ULC.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        ULC.setText("Urb La Huaca");
        ULC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ULCActionPerformed(evt);
            }
        });
        getContentPane().add(ULC, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, 150, 30));

        SMS.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        SMS.setText("Santa Marina Sur");
        SMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMSActionPerformed(evt);
            }
        });
        getContentPane().add(SMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 140, 40));

        RUG.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        RUG.setText("Ruggia");
        RUG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUGActionPerformed(evt);
            }
        });
        getContentPane().add(RUG, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 100, 40));

        UAN.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        UAN.setText("Urb Angamos");
        UAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UANActionPerformed(evt);
            }
        });
        getContentPane().add(UAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 140, 30));

        UJO.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        UJO.setText("UV Jose Olaya");
        UJO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UJOActionPerformed(evt);
            }
        });
        getContentPane().add(UJO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 120, 40));

        UPB.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        UPB.setText("Urb Perla Baja");
        UPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPBActionPerformed(evt);
            }
        });
        getContentPane().add(UPB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 720, 120, 40));

        BM.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        BM.setText("Barrio Magisterial");
        BM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMActionPerformed(evt);
            }
        });
        getContentPane().add(BM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 140, 40));

        ULP.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        ULP.setText("UV La Perla");
        ULP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ULPActionPerformed(evt);
            }
        });
        getContentPane().add(ULP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 690, 130, 30));

        SM.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        SM.setText("Urb Stella Maris");
        SM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMActionPerformed(evt);
            }
        });
        getContentPane().add(SM, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, 40));

        HC.setText("Hospital Carrion");
        HC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HCActionPerformed(evt);
            }
        });
        getContentPane().add(HC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 120, 40));

        CDLJ.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        CDLJ.setText("Casa de la juventud");
        CDLJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDLJActionPerformed(evt);
            }
        });
        getContentPane().add(CDLJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 180, 30));

        UNAC.setText("Estadio Carvajo");
        UNAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNACActionPerformed(evt);
            }
        });
        getContentPane().add(UNAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 120, 40));

        US4.setText("Urb Sector 4");
        US4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                US4ActionPerformed(evt);
            }
        });
        getContentPane().add(US4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 120, 30));

        UNC.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        UNC.setText("Urb Nelly Chavez");
        UNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNCActionPerformed(evt);
            }
        });
        getContentPane().add(UNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 700, 140, 40));

        USM.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        USM.setText("Urb San Miguel");
        USM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USMActionPerformed(evt);
            }
        });
        getContentPane().add(USM, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, 140, 60));

        SIM.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        SIM.setText("Sima");
        SIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIMActionPerformed(evt);
            }
        });
        getContentPane().add(SIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 70, -1));

        AST.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        AST.setText("Astete");
        AST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASTActionPerformed(evt);
            }
        });
        getContentPane().add(AST, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 640, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de Pantalla 2019-06-19 a la(s) 00.56.40.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1200, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("¿DONDE TE ENCUENTRAS?");

        jButton1.setText("CERRAR SESION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+JP.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

       if(i!=2){
        int in=f.PosPorInfo(JP.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
            cad="";
        }
        }
    }//GEN-LAST:event_JPActionPerformed

    private void RPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+RP.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(6-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        
        if(i!=2){
        int in=f.PosPorInfo(RP.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
            cad="";
        }
        }

    }//GEN-LAST:event_RPActionPerformed

    private void UANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UANActionPerformed
       JOptionPane.showMessageDialog(null, "Usted se encuentra en "+UAN.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        if(i!=2){
        int in=f.PosPorInfo(UAN.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
            cad="";
        }
        }
    }//GEN-LAST:event_UANActionPerformed

    private void UNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNAActionPerformed
       JOptionPane.showMessageDialog(null, "Usted se encuentra en "+UNA.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        if(i!=2){
        int in=f.PosPorInfo(UNA.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
            cad="";
        }
        }
    }//GEN-LAST:event_UNAActionPerformed

    private void HCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HCActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+HC.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        if(i!=2){
        int in=f.PosPorInfo(HC.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
            cad="";
        }
        }
    }//GEN-LAST:event_HCActionPerformed

    private void UNACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNACActionPerformed
       JOptionPane.showMessageDialog(null, "Usted se encuentra en "+UNAC.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        if(i!=2){
        int in=f.PosPorInfo(UNAC.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
            cad="";
        }
        }
    }//GEN-LAST:event_UNACActionPerformed

    private void UNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNCActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+UNC.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        if(i!=2){
        int in=f.PosPorInfo(UNC.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
            cad="";
        }
        }
    }//GEN-LAST:event_UNCActionPerformed

    private void US4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_US4ActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+US4.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

           if(i!=2){
        int in=f.PosPorInfo(US4.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
            cad="";
        }
        }
    }//GEN-LAST:event_US4ActionPerformed

    private void ASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASTActionPerformed
       JOptionPane.showMessageDialog(null, "Usted se encuentra en "+AST.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        if(i!=2){
        int in=f.PosPorInfo(AST.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
            cad="";
        }
        }
    }//GEN-LAST:event_ASTActionPerformed

    private void LPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LPActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+LP.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

       if(i!=2){
        int in=f.PosPorInfo(LP.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
            cad="";
        }
        }
    }//GEN-LAST:event_LPActionPerformed

    private void LMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LMActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+LM.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        if(i!=2){
        int in=f.PosPorInfo(LM.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
            cad="";
        }
        }
    }//GEN-LAST:event_LMActionPerformed

    private void SMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+SM.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(SM.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_SMActionPerformed

    private void CMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+CM.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(CM.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
       if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_CMActionPerformed

    private void CMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMPActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+CMP.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(CMP.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_CMPActionPerformed

    private void SMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMSActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+SMS.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(SMS.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_SMSActionPerformed

    private void MCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCActionPerformed
       JOptionPane.showMessageDialog(null, "Usted se encuentra en "+MC.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(MC.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
       if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_MCActionPerformed

    private void ULCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ULCActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+ULC.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(ULC.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
       if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_ULCActionPerformed

    private void SIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIMActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+SIM.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(SIM.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_SIMActionPerformed

    private void USMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USMActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+USM.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(USM.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_USMActionPerformed

    private void CDLJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDLJActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+CDLJ.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(CDLJ.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_CDLJActionPerformed

    private void RUGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RUGActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+RUG.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(RUG.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
       if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_RUGActionPerformed

    private void BMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+BM.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(BM.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_BMActionPerformed

    private void UPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPBActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+UPB.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(UPB.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_UPBActionPerformed

    private void ULPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ULPActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+ULP.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(ULP.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_ULPActionPerformed

    private void UJOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UJOActionPerformed
        JOptionPane.showMessageDialog(null, "Usted se encuentra en "+UJO.getActionCommand());
        int i=0;
        int valorEntero=0;
        do{
            valorEntero = (int) Math.floor(Math.random()*(tamano-0+1)+0);
            i=JOptionPane.showConfirmDialog(null, "Tienes un viaje para "+l.get(valorEntero).getNombre()+"\n¿Aceptas?");
            if(i==2){
                break;
            }
        }while(i!=0);
        

        int in=f.PosPorInfo(UJO.getActionCommand());
        int fi=f.PosPorInfo(l.get(valorEntero).getNombre());
        System.out.println("-------------------------------");
        if(f.cminimo(in, fi)==9999){
            JOptionPane.showMessageDialog(null,"NO HAY CAMINO DISPONIBLE ");
        }else{
            Resultados re=new Resultados();
            re.setVisible(true);
            re.resul(f.cminimo(in, fi),"\t\t RECORRIDO\n" +(l.get(in).getNombre())+"\n"+f.ruta(in, fi)+(l.get(fi).getNombre()));
        }
    }//GEN-LAST:event_UJOActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LOGIN log=new LOGIN();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(Callao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Callao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Callao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Callao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Callao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AST;
    private javax.swing.JButton BM;
    private javax.swing.JButton CDLJ;
    private javax.swing.JButton CM;
    private javax.swing.JButton CMP;
    private javax.swing.JButton HC;
    private javax.swing.JButton JP;
    private javax.swing.JButton LM;
    private javax.swing.JButton LP;
    private javax.swing.JButton MC;
    private javax.swing.JButton RP;
    private javax.swing.JButton RUG;
    private javax.swing.JButton SIM;
    private javax.swing.JButton SM;
    private javax.swing.JButton SMS;
    private javax.swing.JButton UAN;
    private javax.swing.JButton UJO;
    private javax.swing.JButton ULC;
    private javax.swing.JButton ULP;
    private javax.swing.JButton UNA;
    private javax.swing.JButton UNAC;
    private javax.swing.JButton UNC;
    private javax.swing.JButton UPB;
    private javax.swing.JButton US4;
    private javax.swing.JButton USM;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
