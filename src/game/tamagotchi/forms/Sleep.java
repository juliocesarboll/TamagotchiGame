package game.tamagotchi.forms;

public class Sleep extends javax.swing.JFrame {
	// Variables declaration - do not modify
	private javax.swing.JPanel bot;
	private javax.swing.JButton bt_action;
	private javax.swing.JButton bt_go_to;
	private javax.swing.JLabel lb__age;
	private javax.swing.JLabel lb__dirty;
	private javax.swing.JLabel lb__energy;
	private javax.swing.JLabel lb__feel;
	private javax.swing.JLabel lb__knowledge;
	private javax.swing.JLabel lb__money;
	private javax.swing.JLabel lb__muscle;
	private javax.swing.JLabel lb__weight;
	private javax.swing.JLabel lb_age;
	private javax.swing.JLabel lb_dirty;
	private javax.swing.JLabel lb_energy;
	private javax.swing.JLabel lb_feel;
	private javax.swing.JLabel lb_knowledge;
	private javax.swing.JLabel lb_money;
	private javax.swing.JLabel lb_muscle;
	private javax.swing.JLabel lb_tamagotchi_body;
	private javax.swing.JLabel lb_weight;
	private javax.swing.JPanel mid;
	private javax.swing.JPanel top1;
	private javax.swing.JPanel top2;
	// End of variables declaration

	public Sleep() {
		initComponents();
	}

	private void initComponents() {
		top2 = new javax.swing.JPanel();
		lb__dirty = new javax.swing.JLabel();
		lb_dirty = new javax.swing.JLabel();
		lb_energy = new javax.swing.JLabel();
		lb_knowledge = new javax.swing.JLabel();
		lb_muscle = new javax.swing.JLabel();
		lb__energy = new javax.swing.JLabel();
		lb__knowledge = new javax.swing.JLabel();
		lb__muscle = new javax.swing.JLabel();
		mid = new javax.swing.JPanel();
		lb_tamagotchi_body = new javax.swing.JLabel();
		bot = new javax.swing.JPanel();
		bt_action = new javax.swing.JButton();
		bt_go_to = new javax.swing.JButton();
		top1 = new javax.swing.JPanel();
		lb_money = new javax.swing.JLabel();
		lb_age = new javax.swing.JLabel();
		lb_feel = new javax.swing.JLabel();
		lb__feel = new javax.swing.JLabel();
		lb__age = new javax.swing.JLabel();
		lb__weight = new javax.swing.JLabel();
		lb__money = new javax.swing.JLabel();
		lb_weight = new javax.swing.JLabel();

		lb_money.setText("Dinheiro:");
		lb_age.setText("Idade:");
		lb_feel.setText("Sentindo:");
		lb__feel.setText("_feel");
		lb__age.setText("_age");
		lb__weight.setText("_weight");
		lb__money.setText("_money");
		lb_weight.setText("Peso:");
		lb__dirty.setText("_dirty");
		lb_dirty.setText("Sujeira:");
		lb_energy.setText("Energia:");
		lb_knowledge.setText("Inteligência:");
		lb_muscle.setText("Musculatura:");
		lb__energy.setText("_energy");
		lb__knowledge.setText("_knowledge");
		lb__muscle.setText("_muscle");
		lb_tamagotchi_body.setText("Tamagotchi");
		bt_action.setText("Ação");
		bt_go_to.setText("Ir para");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		javax.swing.GroupLayout top2Layout = new javax.swing.GroupLayout(top2);
		top2.setLayout(top2Layout);
		top2Layout
				.setHorizontalGroup(top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(top2Layout.createSequentialGroup().addContainerGap().addGroup(top2Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(top2Layout
										.createSequentialGroup()
										.addGroup(top2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(top2Layout.createSequentialGroup().addGroup(top2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lb_dirty, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lb_energy, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
												.addGroup(top2Layout.createSequentialGroup()
														.addComponent(lb_knowledge,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGap(16, 16, 16)))
										.addGroup(top2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(lb__energy, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lb__dirty, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lb__knowledge, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(top2Layout.createSequentialGroup()
										.addComponent(lb_muscle, javax.swing.GroupLayout.PREFERRED_SIZE, 109,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(17, 17, 17).addComponent(lb__muscle,
												javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
								.addContainerGap()));

		top2Layout.setVerticalGroup(top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(top2Layout.createSequentialGroup().addContainerGap()
						.addGroup(top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lb_dirty).addComponent(lb__dirty))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lb__energy, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lb_energy))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lb__knowledge).addComponent(lb_knowledge))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lb_muscle).addComponent(lb__muscle))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout midLayout = new javax.swing.GroupLayout(mid);
		mid.setLayout(midLayout);
		midLayout.setHorizontalGroup(midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(lb_tamagotchi_body, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		midLayout
				.setVerticalGroup(midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								midLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(
										lb_tamagotchi_body, javax.swing.GroupLayout.PREFERRED_SIZE, 304,
										javax.swing.GroupLayout.PREFERRED_SIZE)));

		javax.swing.GroupLayout botLayout = new javax.swing.GroupLayout(bot);
		bot.setLayout(botLayout);
		botLayout.setHorizontalGroup(botLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(botLayout.createSequentialGroup().addGap(64, 64, 64)
						.addComponent(bt_go_to, javax.swing.GroupLayout.PREFERRED_SIZE, 94,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(bt_action, javax.swing.GroupLayout.PREFERRED_SIZE, 94,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(61, 61, 61)));
		botLayout.setVerticalGroup(botLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				botLayout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(botLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(bt_go_to, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(bt_action, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)));

		javax.swing.GroupLayout top1Layout = new javax.swing.GroupLayout(top1);
		top1.setLayout(top1Layout);
		top1Layout.setHorizontalGroup(
				top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(top1Layout
						.createSequentialGroup().addGroup(top1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(top1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
												top1Layout.createSequentialGroup().addContainerGap().addComponent(
														lb_weight, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
												top1Layout.createSequentialGroup().addContainerGap().addComponent(
														lb_age, javax.swing.GroupLayout.DEFAULT_SIZE, 89,
														Short.MAX_VALUE)))
								.addGroup(top1Layout.createSequentialGroup().addContainerGap()
										.addGroup(top1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lb_money).addComponent(lb_feel))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lb__age, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lb__weight, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
								.addComponent(lb__money, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lb__feel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		top1Layout.setVerticalGroup(top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(top1Layout.createSequentialGroup().addContainerGap()
						.addGroup(top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lb_age).addComponent(lb__age))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lb_weight).addComponent(lb__weight))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lb_money).addComponent(lb__money))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lb_feel).addComponent(lb__feel))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(mid, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(top2,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addComponent(bot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE))
				.addContainerGap()));

		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(top2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(top1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE))
				.addGap(53, 53, 53)
				.addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(bot,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}

	public static void main(String[] args) {
		new Sleep().setVisible(true);
	}
}