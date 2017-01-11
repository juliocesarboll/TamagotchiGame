package game.tamagotchi.forms;

import javax.swing.*;
public class Status extends JFrame {
    JLabel lb_name;
    JLabel lb_feeling;
    JLabel lb_age;
    JLabel lb_weight;
    JLabel lb_dirty;
    JLabel lb_money;
    JLabel lb_energy;
    JLabel lb_knowledge;
    JLabel lb_muscle;
    
    
    /*	
     * COMBO BOX E TEXT FIELD
     *
  	JTextField tf_renavan, tf_ano_fab, tf_ano_mod, tf_chassi, tf_preco, tf_modelo, tf_placa;
  	JComboBox cb_cor, cb_marca;
  	 *
  	 *
  	 */
    
    
    /*
     * BUTTONS
     * 
 	JButton bt_eat;
    JButton bt_sleep;
    JButton bt_study;
    JButton bt_shower;
    JButton bt_workout;
    JButton bt_work;
     * 
     * 
     */
    
    
    public Status(){
        setTitle("TamagotchiGame");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        lb_name         = new JLabel("Nome: ", SwingConstants.RIGHT);
        lb_feeling      = new JLabel("Sentindo: ", SwingConstants.RIGHT);
        lb_age          = new JLabel("Idade: ", SwingConstants.RIGHT);
        lb_weight       = new JLabel("Peso: ", SwingConstants.RIGHT);
        lb_money        = new JLabel("Dinheiro: ", SwingConstants.RIGHT);
        lb_dirty        = new JLabel("Sujeira: ", SwingConstants.RIGHT);
        lb_energy       = new JLabel("Energia: ", SwingConstants.RIGHT);
        lb_knowledge    = new JLabel("Inteligência: ", SwingConstants.RIGHT);
        lb_muscle       = new JLabel("Musculatura: ", SwingConstants.RIGHT);
        
        
        /*	
         * COMBO BOX E TEXT FIELD
         * 
        tf_renavan      = new JTextField("");        
        tf_ano_fab      = new JTextField("");
        tf_ano_mod      = new JTextField("");
        tf_chassi       = new JTextField("");
        tf_preco        = new JTextField("");
        tf_modelo       = new JTextField("");
        tf_placa        = new JTextField("");
        cb_cor          = new JComboBox();
        cb_marca        = new JComboBox();
        cb_cor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Selecione a Cor","Amarelo", "Azul", "Branco", "Cinza",
      "Grafite", "Prata", "Preto", "Verde", "Vermelho"}));
		  cb_marca.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Selecione a Marca","Ford", "Chevrolet", "Toyota", "Wolkswagem",
      "Fiat", "Honda"}));
      
        getContentPane().add(cb_cor);
        getContentPane().add(cb_marca);
        getContentPane().add(tf_ano_fab);
        getContentPane().add(tf_ano_mod);
        getContentPane().add(tf_chassi);        
        getContentPane().add(tf_preco);
        getContentPane().add(tf_placa);
        getContentPane().add(tf_renavan);
        getContentPane().add(tf_modelo);
         * 
         * 
         */
        
        
        /*
         * BUTTON
         * 
        bt_eat 			= new JButton("Comer");
        bt_sleep 		= new JButton("Comer");
        bt_study 		= new JButton("Comer");
        bt_shower 		= new JButton("Comer");
        bt_workout 		= new JButton("Comer");
        bt_work 		= new JButton("Comer");
        
        getContentPane().add(bt_eat);
        getContentPane().add(bt_sleep);
        getContentPane().add(bt_study);
        getContentPane().add(bt_shower);
        getContentPane().add(bt_workout);
        getContentPane().add(bt_work);
         * 
         * 
         */
        
        getContentPane().setLayout(null);
        getContentPane().add(lb_name);
        getContentPane().add(lb_feeling);
        getContentPane().add(lb_age);
        getContentPane().add(lb_weight);
        getContentPane().add(lb_money);        
        getContentPane().add(lb_dirty);
        getContentPane().add(lb_energy);
        getContentPane().add(lb_knowledge);
        getContentPane().add(lb_muscle);
        
//        lb_name         .setBounds(20, 20, 130, 15);
        lb_feeling      .setBounds(15, 20, 60, 15);
        lb_age          .setBounds(15, 40, 60, 15);
        lb_weight       .setBounds(15, 60, 60, 15);
        lb_money        .setBounds(15, 80, 60, 15);
        lb_dirty        .setBounds(270, 20, 80, 15);
        lb_energy       .setBounds(270, 40, 80, 15);
        lb_knowledge    .setBounds(270, 60, 80, 15);
        lb_muscle       .setBounds(270, 80, 80, 15);
        
    }
    public static void main(String args[]){
        new Status().setVisible(true);
    }
}