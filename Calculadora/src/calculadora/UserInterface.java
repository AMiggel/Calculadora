package calculadora;

public class UserInterface extends javax.swing.JFrame {

	public UserInterface() {
		initComponents();
	}

	private boolean operation = false;
	private String num1 = "", num2 = "", op = "";
	Operations operacion = new Operations();

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		print = new javax.swing.JTextField();
		uno = new javax.swing.JButton();
		cuatro = new javax.swing.JButton();
		siete = new javax.swing.JButton();
		dos = new javax.swing.JButton();
		cinco = new javax.swing.JButton();
		ocho = new javax.swing.JButton();
		tres = new javax.swing.JButton();
		seis = new javax.swing.JButton();
		nueve = new javax.swing.JButton();
		cero = new javax.swing.JButton();
		clean = new javax.swing.JButton();
		punto = new javax.swing.JButton();
		dividir = new javax.swing.JButton();
		suma = new javax.swing.JButton();
		resta = new javax.swing.JButton();
		por = new javax.swing.JButton();
		raiz = new javax.swing.JButton();
		seno = new javax.swing.JButton();
		coseno = new javax.swing.JButton();
		tangente = new javax.swing.JButton();
		log = new javax.swing.JButton();
		igual = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		print.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				printActionPerformed(evt);
			}
		});

		uno.setText("1");
		uno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		uno.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				unoActionPerformed(evt);
			}
		});

		cuatro.setText("4");
		cuatro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cuatroActionPerformed(evt);
			}
		});

		siete.setText("7");
		siete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sieteActionPerformed(evt);
			}
		});

		dos.setText("2");
		dos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dosActionPerformed(evt);
			}
		});

		cinco.setText("5");
		cinco.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cincoActionPerformed(evt);
			}
		});

		ocho.setText("8");
		ocho.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ochoActionPerformed(evt);
			}
		});

		tres.setText("3");
		tres.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tresActionPerformed(evt);
			}
		});

		seis.setText("6");
		seis.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				seisActionPerformed(evt);
			}
		});

		nueve.setText("9");
		nueve.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nueveActionPerformed(evt);
			}
		});

		cero.setText("0");
		cero.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ceroActionPerformed(evt);
			}
		});

		clean.setText("CE");
		clean.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cleanActionPerformed(evt);
			}
		});

		punto.setText(".");
		punto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				puntoActionPerformed(evt);
			}
		});

		dividir.setText("/");
		dividir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dividirActionPerformed(evt);
			}
		});

		suma.setText("+");
		suma.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sumaActionPerformed(evt);
			}
		});

		resta.setText("-");
		resta.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				restaActionPerformed(evt);
			}
		});

		por.setText("*");
		por.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				porActionPerformed(evt);
			}
		});

		raiz.setText("raiz");
		raiz.setEnabled(false);

		seno.setText("seno");
		seno.setEnabled(false);

		coseno.setText("coseno");
		coseno.setEnabled(false);

		tangente.setText("tang");
		tangente.setEnabled(false);

		log.setText("log");
		log.setEnabled(false);

		igual.setText("=");
		igual.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				igualActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(print)
						.addGroup(layout.createSequentialGroup().addComponent(raiz).addPreferredGap(
								javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(coseno)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										layout.createSequentialGroup().addComponent(tangente)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE,
														52, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(seno,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup().addGap(6, 6, 6).addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(siete, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(punto, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(cuatro, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup().addComponent(cero)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(clean))
														.addGroup(layout.createSequentialGroup().addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(ocho,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(dos, javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(cinco))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																		.addComponent(tres,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(nueve,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				45, Short.MAX_VALUE)
																		.addComponent(seis,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(suma,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(resta,
																		javax.swing.GroupLayout.DEFAULT_SIZE, 45,
																		Short.MAX_VALUE)
																.addComponent(por, javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE))
														.addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE,
																45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
								.addGap(0, 11, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(
										layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(layout.createSequentialGroup().addComponent(cuatro)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(siete))
														.addGroup(layout.createSequentialGroup()
																.addGroup(layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(dos).addComponent(uno,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				23,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(cinco)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(ocho)))
												.addGroup(layout.createSequentialGroup().addComponent(tres)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(seis)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(nueve)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(punto).addComponent(cero))
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(clean).addComponent(dividir))))
								.addGroup(layout.createSequentialGroup().addComponent(suma)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(resta)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(por)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(raiz).addComponent(coseno))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(igual).addGap(15, 15, 15)))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(tangente).addComponent(log).addComponent(seno))
						.addContainerGap(13, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void unoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_unoActionPerformed
		this.print.setText(this.print.getText() + "1");
		if (!this.operation) {
			this.num1 += "1";
		} else {
			this.num2 += "1";
		}
	}// GEN-LAST:event_unoActionPerformed

	private void printActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_printActionPerformed

	}// GEN-LAST:event_printActionPerformed

	private void dosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dosActionPerformed

		this.print.setText(this.print.getText() + "2");
		if (!this.operation) {
			this.num1 += "2";
		} else {
			this.num2 += "2";
		}
	}// GEN-LAST:event_dosActionPerformed

	private void tresActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tresActionPerformed

		this.print.setText(this.print.getText() + "3");
		if (!this.operation) {
			this.num1 += "3";
		} else {
			this.num2 += "3";
		}
	}// GEN-LAST:event_tresActionPerformed

	private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cuatroActionPerformed

		this.print.setText(this.print.getText() + "4");
		if (!this.operation) {
			this.num1 += "4";
		} else {
			this.num2 += "4";
		}
	}// GEN-LAST:event_cuatroActionPerformed

	private void cincoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cincoActionPerformed

		this.print.setText(this.print.getText() + "5");
		if (!this.operation) {
			this.num1 += "5";
		} else {
			this.num2 += "5";
		}
	}// GEN-LAST:event_cincoActionPerformed

	private void seisActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_seisActionPerformed

		this.print.setText(this.print.getText() + "6");
		if (!this.operation) {
			this.num1 += "6";
		} else {
			this.num2 += "6";
		}
	}// GEN-LAST:event_seisActionPerformed

	private void sieteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sieteActionPerformed

		this.print.setText(this.print.getText() + "7");
		if (!this.operation) {
			this.num1 += "7";
		} else {
			this.num2 += "7";
		}
	}// GEN-LAST:event_sieteActionPerformed

	private void ochoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ochoActionPerformed

		this.print.setText(this.print.getText() + "8");
		if (!this.operation) {
			this.num1 += "8";
		} else {
			this.num2 += "8";
		}
	}// GEN-LAST:event_ochoActionPerformed

	private void nueveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nueveActionPerformed

		this.print.setText(this.print.getText() + "9");
		if (!this.operation) {
			this.num1 += "9";
		} else {
			this.num2 += "9";
		}
	}// GEN-LAST:event_nueveActionPerformed

	private void ceroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ceroActionPerformed

		this.print.setText(this.print.getText() + "0");
		if (!this.operation) {
			this.num1 += "0";
		} else {
			this.num2 += "0";
		}
	}// GEN-LAST:event_ceroActionPerformed

	private void puntoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_puntoActionPerformed

		if (!this.print.getText().contains(".") & !this.print.getText().equals("")) {
			this.print.setText(this.print.getText() + ".");
			if (!this.operation) {
				this.num1 += ".";
			} else {
				this.num2 += ".";
			}
		}

	}// GEN-LAST:event_puntoActionPerformed

	private void cleanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cleanActionPerformed

		this.print.setText("");
		this.num1 = this.num2 = "";
	}// GEN-LAST:event_cleanActionPerformed

	private void sumaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sumaActionPerformed

		if (!this.operation) {
			this.op = "sum";
			this.print.setText(this.print.getText() + " + ");
			this.operation = true;
		}

	}// GEN-LAST:event_sumaActionPerformed

	private void igualActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_igualActionPerformed

		double resu = 0;
		switch (this.op) {
		case "sum":
			if (!this.num2.equals("") && !this.num1.equals("") && !this.op.equals("")) {

				resu = operacion.suma(Double.parseDouble(this.num1), Double.parseDouble(this.num2));
			}
			break;
		case "res":
			resu = operacion.resta(Double.parseDouble(this.num1) - Double.parseDouble(this.num2), resu);
			break;
		case "mult":
			resu = Double.parseDouble(this.num1) * Double.parseDouble(this.num2);
			break;
		case "div":
			resu = operacion.dividir(Double.parseDouble(this.num1), Double.parseDouble(this.num2));
			break;
		}
		this.num1 = String.valueOf(resu);
		this.num2 = "";
		this.operation = false;
		this.print.setText(this.num1);
	}// GEN-LAST:event_igualActionPerformed

	private void restaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_restaActionPerformed

		if (!this.operation) {
			this.op = "res";
			this.print.setText(this.print.getText() + " - ");
			this.operation = true;
		}
	}// GEN-LAST:event_restaActionPerformed

	private void porActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_porActionPerformed

		if (!this.operation) {
			this.op = "mult";
			this.print.setText(this.print.getText() + " * ");
			this.operation = true;
		}
	}// GEN-LAST:event_porActionPerformed

	private void dividirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dividirActionPerformed

		if (!this.operation) {
			this.op = "div";
			this.print.setText(this.print.getText() + " / ");
			this.operation = true;
		}
	}// GEN-LAST:event_dividirActionPerformed

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserInterface().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton cero;
	private javax.swing.JButton cinco;
	private javax.swing.JButton clean;
	private javax.swing.JButton coseno;
	private javax.swing.JButton cuatro;
	private javax.swing.JButton dividir;
	private javax.swing.JButton dos;
	private javax.swing.JButton igual;
	private javax.swing.JButton log;
	private javax.swing.JButton nueve;
	private javax.swing.JButton ocho;
	private javax.swing.JButton por;
	private javax.swing.JTextField print;
	private javax.swing.JButton punto;
	private javax.swing.JButton raiz;
	private javax.swing.JButton resta;
	private javax.swing.JButton seis;
	private javax.swing.JButton seno;
	private javax.swing.JButton siete;
	private javax.swing.JButton suma;
	private javax.swing.JButton tangente;
	private javax.swing.JButton tres;
	private javax.swing.JButton uno;
	// End of variables declaration//GEN-END:variables
}
