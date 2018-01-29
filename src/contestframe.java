import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;


public class contestframe extends javax.swing.JFrame {
	
	static String dbname="jdbc:mysql://localhost/contest";
	Connection connection = null; 
	Statement statement = null; 
	ResultSet resultset = null;
	public String name;
	public String roll;
	public String dept;
	public String score;

    public contestframe() {
        initComponents();
    }
                        
    private void initComponents() {

        contestpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        g16rtf = new javax.swing.JTextField();
        g17rtf = new javax.swing.JTextField();
        g18rtf = new javax.swing.JTextField();
        g19rtf = new javax.swing.JTextField();
        g110rtf = new javax.swing.JTextField();
        g11rtf = new javax.swing.JTextField();
        g12rtf = new javax.swing.JTextField();
        g13rtf = new javax.swing.JTextField();
        g14rtf = new javax.swing.JTextField();
        g15rtf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        g11stf = new javax.swing.JTextField();
        g12stf = new javax.swing.JTextField();
        g13stf = new javax.swing.JTextField();
        g14stf = new javax.swing.JTextField();
        g15stf = new javax.swing.JTextField();
        g16stf = new javax.swing.JTextField();
        g17stf = new javax.swing.JTextField();
        g18stf = new javax.swing.JTextField();
        g19stf = new javax.swing.JTextField();
        g110stf = new javax.swing.JTextField();
        g2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        g21rtf = new javax.swing.JTextField();
        g22rtf = new javax.swing.JTextField();
        g23rtf = new javax.swing.JTextField();
        g24rtf = new javax.swing.JTextField();
        g25rtf = new javax.swing.JTextField();
        g26rtf = new javax.swing.JTextField();
        g27rtf = new javax.swing.JTextField();
        g28rtf = new javax.swing.JTextField();
        g29rtf = new javax.swing.JTextField();
        g210rtf = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        g21stf = new javax.swing.JTextField();
        g22stf = new javax.swing.JTextField();
        g23stf = new javax.swing.JTextField();
        g24stf = new javax.swing.JTextField();
        g25stf = new javax.swing.JTextField();
        g26stf = new javax.swing.JTextField();
        g27stf = new javax.swing.JTextField();
        g28stf = new javax.swing.JTextField();
        g29stf = new javax.swing.JTextField();
        g210stf = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        regnametf = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        regrolltf = new javax.swing.JTextField();
        regok = new javax.swing.JButton();
        checkrolltf = new javax.swing.JTextField();
        check = new javax.swing.JButton();
        game1rtf = new javax.swing.JTextField();
        game1stf = new javax.swing.JTextField();
        game2rtf = new javax.swing.JTextField();
        game2stf = new javax.swing.JTextField();
        bhe = new javax.swing.JButton();
        mce = new javax.swing.JButton();
        update = new javax.swing.JButton();
        photopanel = new javax.swing.JPanel();
        picset = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        regdepttf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        contestpanel.setBackground(new java.awt.Color(0, 51, 51));
        contestpanel.setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 204));
        jLabel1.setText("STUDIO GOLLACHUT");

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 204));
        jLabel2.setText("GAMING CONTEST 2014");

        g1.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        g1.setForeground(new java.awt.Color(255, 153, 0));
        g1.setText("BOX HERO");

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 0));
        jLabel4.setText("PLACE");

        jLabel5.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 204));
        jLabel5.setText("1.");

        jLabel6.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 204));
        jLabel6.setText("2.");

        jLabel7.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 204));
        jLabel7.setText("3.");

        jLabel8.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 204));
        jLabel8.setText("4.");

        jLabel9.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 204));
        jLabel9.setText("5.");

        jLabel10.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 204));
        jLabel10.setText("6.");

        jLabel11.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 204));
        jLabel11.setText("7.");

        jLabel12.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 204));
        jLabel12.setText("8.");

        jLabel13.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 255, 204));
        jLabel13.setText("9.");

        jLabel14.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 255, 204));
        jLabel14.setText("10.");

        jLabel15.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 255, 0));
        jLabel15.setText("ROLL");

        g16rtf.setBackground(new java.awt.Color(204, 255, 255));
        g16rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g16rtf.setEditable(false);
        
        g17rtf.setBackground(new java.awt.Color(204, 255, 255));
        g17rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g17rtf.setEditable(false);
        
        g18rtf.setBackground(new java.awt.Color(204, 255, 255));
        g18rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g18rtf.setEditable(false);
        
        g19rtf.setBackground(new java.awt.Color(204, 255, 255));
        g19rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g19rtf.setEditable(false);
        
        g110rtf.setBackground(new java.awt.Color(204, 255, 255));
        g110rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g110rtf.setEditable(false);
        
        g11rtf.setBackground(new java.awt.Color(204, 255, 255));
        g11rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g11rtf.setEditable(false);

        g12rtf.setBackground(new java.awt.Color(204, 255, 255));
        g12rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g12rtf.setEditable(false);
        
        g13rtf.setBackground(new java.awt.Color(204, 255, 255));
        g13rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g13rtf.setEditable(false);
        
        g14rtf.setBackground(new java.awt.Color(204, 255, 255));
        g14rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g14rtf.setEditable(false);
        
        g15rtf.setBackground(new java.awt.Color(204, 255, 255));
        g15rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g15rtf.setEditable(false);
        
        jLabel16.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 255, 0));
        jLabel16.setText("SCORE");

        g11stf.setBackground(new java.awt.Color(204, 255, 255));
        g11stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g11stf.setEditable(false);

        g12stf.setBackground(new java.awt.Color(204, 255, 255));
        g12stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g12stf.setEditable(false);
         
        g13stf.setBackground(new java.awt.Color(204, 255, 255));
        g13stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g13stf.setEditable(false);
        
        g14stf.setBackground(new java.awt.Color(204, 255, 255));
        g14stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g14stf.setEditable(false);
        
        g15stf.setBackground(new java.awt.Color(204, 255, 255));
        g15stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g15stf.setEditable(false);
        
        g16stf.setBackground(new java.awt.Color(204, 255, 255));
        g16stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g16stf.setEditable(false);
        
        g17stf.setBackground(new java.awt.Color(204, 255, 255));
        g17stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g17stf.setEditable(false);
        
        g18stf.setBackground(new java.awt.Color(204, 255, 255));
        g18stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g18stf.setEditable(false);
        
        g19stf.setBackground(new java.awt.Color(204, 255, 255));
        g19stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g19stf.setEditable(false);
        
        g110stf.setBackground(new java.awt.Color(204, 255, 255));
        g110stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g110stf.setEditable(false);
        
        g2.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        g2.setForeground(new java.awt.Color(255, 153, 0));
        g2.setText("MONKEY CLIMBER");

        jLabel18.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 255, 0));
        jLabel18.setText("PLACE");

        jLabel19.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 255, 204));
        jLabel19.setText("1.");

        jLabel20.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 255, 204));
        jLabel20.setText("2.");

        jLabel21.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 255, 204));
        jLabel21.setText("3.");

        jLabel22.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 255, 204));
        jLabel22.setText("4.");

        jLabel23.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 255, 204));
        jLabel23.setText("5.");

        jLabel24.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 255, 204));
        jLabel24.setText("6.");

        jLabel25.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 255, 204));
        jLabel25.setText("7.");

        jLabel26.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 255, 204));
        jLabel26.setText("8.");

        jLabel27.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 255, 204));
        jLabel27.setText("9.");

        jLabel28.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 255, 204));
        jLabel28.setText("10.");

        jLabel29.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 255, 0));
        jLabel29.setText("ROLL");

        g21rtf.setBackground(new java.awt.Color(204, 255, 255));
        g21rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g21rtf.setEditable(false);

        g22rtf.setBackground(new java.awt.Color(204, 255, 255));
        g22rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g22rtf.setEditable(false);
        
        g23rtf.setBackground(new java.awt.Color(204, 255, 255));
        g23rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g23rtf.setEditable(false);
        
        g24rtf.setBackground(new java.awt.Color(204, 255, 255));
        g24rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g24rtf.setEditable(false);
        
        g25rtf.setBackground(new java.awt.Color(204, 255, 255));
        g25rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g25rtf.setEditable(false);
        
        g26rtf.setBackground(new java.awt.Color(204, 255, 255));
        g26rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g26rtf.setEditable(false);
        
        g27rtf.setBackground(new java.awt.Color(204, 255, 255));
        g27rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g27rtf.setEditable(false);
        
        g28rtf.setBackground(new java.awt.Color(204, 255, 255));
        g28rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g28rtf.setEditable(false);
        
        g29rtf.setBackground(new java.awt.Color(204, 255, 255));
        g29rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g29rtf.setEditable(false);
        
        g210rtf.setBackground(new java.awt.Color(204, 255, 255));
        g210rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g210rtf.setEditable(false);
        
        jLabel30.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 255, 0));
        jLabel30.setText("SCORE");

        g21stf.setBackground(new java.awt.Color(204, 255, 255));
        g21stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g21stf.setEditable(false);
        
        g22stf.setBackground(new java.awt.Color(204, 255, 255));
        g22stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g22stf.setEditable(false);
        
        g23stf.setBackground(new java.awt.Color(204, 255, 255));
        g23stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g23stf.setEditable(false);
        
        g24stf.setBackground(new java.awt.Color(204, 255, 255));
        g24stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g24stf.setEditable(false);
        
        g25stf.setBackground(new java.awt.Color(204, 255, 255));
        g25stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g25stf.setEditable(false);
        
        g26stf.setBackground(new java.awt.Color(204, 255, 255));
        g26stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g26stf.setEditable(false);
        
        g27stf.setBackground(new java.awt.Color(204, 255, 255));
        g27stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g27stf.setEditable(false);
        
        g28stf.setBackground(new java.awt.Color(204, 255, 255));
        g28stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g28stf.setEditable(false);
        
        g29stf.setBackground(new java.awt.Color(204, 255, 255));
        g29stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g29stf.setEditable(false);
        
        g210stf.setBackground(new java.awt.Color(204, 255, 255));
        g210stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        g210stf.setEditable(false);
        
        jLabel31.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 255, 0));
        jLabel31.setText("REGISTRATION");

        jLabel32.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 255, 0));
        jLabel32.setText("NAME");

        regnametf.setBackground(new java.awt.Color(204, 255, 255));
        regnametf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 255, 0));
        jLabel33.setText("ROLL");

        regrolltf.setBackground(new java.awt.Color(204, 255, 255));
        regrolltf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N

        regok.setBackground(new java.awt.Color(0, 102, 102));
        regok.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        regok.setForeground(new java.awt.Color(51, 51, 0));
        regok.setText("OK");
        regok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					regokActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        checkrolltf.setBackground(new java.awt.Color(204, 255, 255));
        checkrolltf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        checkrolltf.setText(" ROLL");

        check.setBackground(new java.awt.Color(0, 102, 102));
        check.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        check.setForeground(new java.awt.Color(51, 51, 0));
        check.setText("CHECK");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					checkActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        game1rtf.setBackground(new java.awt.Color(204, 255, 255));
        game1rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        game1rtf.setText("     ROLL           ");

        game1stf.setBackground(new java.awt.Color(204, 255, 255));
        game1stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        game1stf.setText("  SCORE   ");

        game2rtf.setBackground(new java.awt.Color(204, 255, 255));
        game2rtf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        game2rtf.setText("     ROLL           ");

        game2stf.setBackground(new java.awt.Color(204, 255, 255));
        game2stf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        game2stf.setText("  SCORE    ");

        bhe.setBackground(new java.awt.Color(0, 102, 102));
        bhe.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        bhe.setForeground(new java.awt.Color(51, 51, 0));
        bhe.setText("BOX HERO");
        bhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					bheActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        mce.setBackground(new java.awt.Color(0, 102, 102));
        mce.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        mce.setForeground(new java.awt.Color(51, 51, 0));
        mce.setText("MONKEY CL.");
        mce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					mceActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        update.setBackground(new java.awt.Color(0, 102, 102));
        update.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        update.setForeground(new java.awt.Color(51, 51, 0));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					updateActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        photopanel.setBackground(new java.awt.Color(0, 51, 51));

        picset.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout photopanelLayout = new javax.swing.GroupLayout(photopanel);
        photopanel.setLayout(photopanelLayout);
        photopanelLayout.setHorizontalGroup(
            photopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );
        photopanelLayout.setVerticalGroup(
            photopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picset, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 0));
        jLabel3.setText("DEPT");

        regdepttf.setBackground(new java.awt.Color(204, 255, 255));
        regdepttf.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N

        javax.swing.GroupLayout contestpanelLayout = new javax.swing.GroupLayout(contestpanel);
        contestpanel.setLayout(contestpanelLayout);
        contestpanelLayout.setHorizontalGroup(
            contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contestpanelLayout.createSequentialGroup()
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contestpanelLayout.createSequentialGroup()
                        .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contestpanelLayout.createSequentialGroup()
                                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contestpanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4))
                                    .addGroup(contestpanelLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(30, 30, 30)
                                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15)
                                    .addComponent(g19rtf, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(g18rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g17rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g16rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g15rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g14rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g13rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g12rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g110rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g11rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16)
                                    .addComponent(g19stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g18stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g17stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g16stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g15stf, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(g14stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g13stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g12stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g110stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g11stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(contestpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(g1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(81, 81, 81)
                        .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contestpanelLayout.createSequentialGroup()
                                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))
                                .addGap(37, 37, 37)
                                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel29)
                                    .addComponent(g29rtf, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(g28rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g27rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g26rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g25rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g24rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g23rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g22rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g21rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g210rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel30)
                                    .addComponent(g29stf, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(g28stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g27stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g26stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g25stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g24stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g23stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g22stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g21stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(g210stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addComponent(g2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(contestpanelLayout.createSequentialGroup()
                        .addGap(0, 229, Short.MAX_VALUE)
                        .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)))
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contestpanelLayout.createSequentialGroup()
                        .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contestpanelLayout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addGroup(contestpanelLayout.createSequentialGroup()
                                        .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel32)
                                            .addComponent(jLabel33))
                                        .addGap(28, 28, 28)
                                        .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(regnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(contestpanelLayout.createSequentialGroup()
                                                .addComponent(regrolltf, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(regdepttf))
                                            .addComponent(regok)
                                            .addGroup(contestpanelLayout.createSequentialGroup()
                                                .addComponent(checkrolltf, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(check)
                                                    .addComponent(mce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(update)
                                                    .addComponent(bhe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                            .addGroup(contestpanelLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(game2rtf)
                                    .addComponent(game1rtf))
                                .addGap(18, 18, 18)
                                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(game1stf)
                                    .addComponent(game2stf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                        .addContainerGap(127, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contestpanelLayout.createSequentialGroup()
                        .addComponent(photopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        contestpanelLayout.setVerticalGroup(
            contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contestpanelLayout.createSequentialGroup()
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contestpanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)))
                    .addGroup(contestpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(photopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g11rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g11stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(g21rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g21stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g12rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g12stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(g22rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g22stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(g13rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(g13stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(g23rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(g23stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(regnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(g14rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g14stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(g24rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g24stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(regrolltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(regdepttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(g15rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g15stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(g25rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g25stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regok))
                .addGap(21, 21, 21)
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(g16rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g16stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(g26rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g26stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkrolltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check))
                .addGap(21, 21, 21)
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(g17rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g17stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(g27rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g27stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(game1rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(game1stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bhe))
                .addGap(19, 19, 19)
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(g18rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g18stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(g28rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g28stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(game2rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(game2stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mce))
                .addGap(18, 18, 18)
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(g19rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g19stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(g29rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g29stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(g110rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g110stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(g210rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g210stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(contestpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1430, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contestpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void regokActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                      
        name=regnametf.getText();
        roll=regrolltf.getText();
        dept=regdepttf.getText();
    	if(connection==null)
		connection=(Connection)DriverManager.getConnection(dbname, "root", "");
		 statement=(Statement)connection.createStatement();
        statement.execute("INSERT INTO contester VALUES('"+name+"','"+roll+"','"+dept+"')");
    }                                     

    private void checkActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                      
        roll=checkrolltf.getText();
        if(connection==null)
		connection=(Connection)DriverManager.getConnection(dbname,"root","");
        statement=(Statement)connection.createStatement();
        resultset=statement.executeQuery("SELECT * FROM checkandentry WHERE Roll='"+roll+"'");
        if(resultset.next()){
        	JOptionPane.showMessageDialog(null,"DATA ALREADY ENTERED.", "ERROR", JOptionPane.ERROR_MESSAGE);
        	
        }	
        else{
        	statement=(Statement)connection.createStatement();
        	statement.execute("INSERT INTO checkandentry VALUES('"+roll+"')");
        	JOptionPane.showMessageDialog(null,"NEW DATA ENTERED",null,JOptionPane.PLAIN_MESSAGE);
        }
        checkrolltf.setText("");
    }                                     

    private void bheActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                    
       roll=game1rtf.getText();
       score=game1stf.getText();
       if(connection==null)
   	   connection=(Connection)DriverManager.getConnection(dbname, "root", "");
   	   statement=(Statement)connection.createStatement();
       statement.execute("INSERT INTO boxhero VALUES('"+roll+"','"+score+"')");
       game1rtf.setText("");
       game1stf.setText("");
    }                                   

    private void mceActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                    
    	 roll=game2rtf.getText();
         score=game2stf.getText();
         if(connection==null)
     	 connection=(Connection)DriverManager.getConnection(dbname, "root", "");
     	 statement=(Statement)connection.createStatement();
         statement.execute("INSERT INTO monkeyclimber VALUES('"+roll+"','"+score+"')");
         game2rtf.setText("");
         game2stf.setText("");
    }                                   

    private void updateActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {  
    	if(connection==null)
    	connection=(Connection)DriverManager.getConnection(dbname,"root","");
    	statement=(Statement)connection.createStatement();
    	resultset=statement.executeQuery("SELECT * FROM boxhero ORDER BY Score DESC");
    	if(resultset.next()){
    		g11rtf.setText(resultset.getString("Roll"));
    		g11stf.setText(resultset.getString("Score"));
    	}
    	if(resultset.next()){
    		g12rtf.setText(resultset.getString("Roll"));
    		g12stf.setText(resultset.getString("Score"));
    	}
    	if(resultset.next()){
    		g13rtf.setText(resultset.getString("Roll"));
    		g13stf.setText(resultset.getString("Score"));
    	}
    	if(resultset.next()){
    		g14rtf.setText(resultset.getString("Roll"));
    		g14stf.setText(resultset.getString("Score"));
    	}
    	if(resultset.next()){
    		g15rtf.setText(resultset.getString("Roll"));
    		g15stf.setText(resultset.getString("Score"));
    	}
    	if(resultset.next()){
    		g16rtf.setText(resultset.getString("Roll"));
    		g16stf.setText(resultset.getString("Score"));
    	}
    	if(resultset.next()){
    		g17rtf.setText(resultset.getString("Roll"));
    		g17stf.setText(resultset.getString("Score"));
    	}
    	if(resultset.next()){
    		g18rtf.setText(resultset.getString("Roll"));
    		g18stf.setText(resultset.getString("Score"));
    	}
    	if(resultset.next()){
    		g19rtf.setText(resultset.getString("Roll"));
    		g19stf.setText(resultset.getString("Score"));
    	}
    	if(resultset.next()){
    		g110rtf.setText(resultset.getString("Roll"));
    		g110stf.setText(resultset.getString("Score"));
    	}
    	
    	
    	statement=(Statement)connection.createStatement();
    	resultset=statement.executeQuery("SELECT * FROM monkeyclimber ORDER BY Score DESC");
        if(resultset.next()){
        	g21rtf.setText(resultset.getString("Roll"));
        	g21stf.setText(resultset.getString("Score"));
        }
        if(resultset.next()){
        	g22rtf.setText(resultset.getString("Roll"));
        	g22stf.setText(resultset.getString("Score"));
        }
        if(resultset.next()){
        	g23rtf.setText(resultset.getString("Roll"));
        	g23stf.setText(resultset.getString("Score"));
        }
        if(resultset.next()){
        	g24rtf.setText(resultset.getString("Roll"));
        	g24stf.setText(resultset.getString("Score"));
        }
        if(resultset.next()){
        	g25rtf.setText(resultset.getString("Roll"));
        	g25stf.setText(resultset.getString("Score"));
        }
        if(resultset.next()){
        	g26rtf.setText(resultset.getString("Roll"));
        	g26stf.setText(resultset.getString("Score"));
        }
        if(resultset.next()){
        	g27rtf.setText(resultset.getString("Roll"));
        	g27stf.setText(resultset.getString("Score"));
        }
        if(resultset.next()){
        	g28rtf.setText(resultset.getString("Roll"));
        	g28stf.setText(resultset.getString("Score"));
        }
        if(resultset.next()){
        	g29rtf.setText(resultset.getString("Roll"));
        	g29stf.setText(resultset.getString("Score"));
        }
        if(resultset.next()){
        	g210rtf.setText(resultset.getString("Roll"));
        	g210stf.setText(resultset.getString("Score"));
        }
    }
    
    private javax.swing.JButton bhe;
    private javax.swing.JButton check;
    private javax.swing.JTextField checkrolltf;
    private javax.swing.JPanel contestpanel;
    private javax.swing.JLabel g1;
    private javax.swing.JTextField g110rtf;
    private javax.swing.JTextField g110stf;
    private javax.swing.JTextField g11rtf;
    private javax.swing.JTextField g11stf;
    private javax.swing.JTextField g12rtf;
    private javax.swing.JTextField g12stf;
    private javax.swing.JTextField g13rtf;
    private javax.swing.JTextField g13stf;
    private javax.swing.JTextField g14rtf;
    private javax.swing.JTextField g14stf;
    private javax.swing.JTextField g15rtf;
    private javax.swing.JTextField g15stf;
    private javax.swing.JTextField g16rtf;
    private javax.swing.JTextField g16stf;
    private javax.swing.JTextField g17rtf;
    private javax.swing.JTextField g17stf;
    private javax.swing.JTextField g18rtf;
    private javax.swing.JTextField g18stf;
    private javax.swing.JTextField g19rtf;
    private javax.swing.JTextField g19stf;
    private javax.swing.JLabel g2;
    private javax.swing.JTextField g210rtf;
    private javax.swing.JTextField g210stf;
    private javax.swing.JTextField g21rtf;
    private javax.swing.JTextField g21stf;
    private javax.swing.JTextField g22rtf;
    private javax.swing.JTextField g22stf;
    private javax.swing.JTextField g23rtf;
    private javax.swing.JTextField g23stf;
    private javax.swing.JTextField g24rtf;
    private javax.swing.JTextField g24stf;
    private javax.swing.JTextField g25rtf;
    private javax.swing.JTextField g25stf;
    private javax.swing.JTextField g26rtf;
    private javax.swing.JTextField g26stf;
    private javax.swing.JTextField g27rtf;
    private javax.swing.JTextField g27stf;
    private javax.swing.JTextField g28rtf;
    private javax.swing.JTextField g28stf;
    private javax.swing.JTextField g29rtf;
    private javax.swing.JTextField g29stf;
    private javax.swing.JTextField game1rtf;
    private javax.swing.JTextField game1stf;
    private javax.swing.JTextField game2rtf;
    private javax.swing.JTextField game2stf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton mce;
    private javax.swing.JPanel photopanel;
    private javax.swing.JLabel picset;
    private javax.swing.JTextField regdepttf;
    private javax.swing.JTextField regnametf;
    private javax.swing.JButton regok;
    private javax.swing.JTextField regrolltf;
    private javax.swing.JButton update;
                       
}
