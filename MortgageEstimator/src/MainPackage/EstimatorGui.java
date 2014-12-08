package MainPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstimatorGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JButton button;
	private JComboBox comboBox;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstimatorGui frame = new EstimatorGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EstimatorGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTotalGrossIncome = new JLabel("Total Gross Income");
		lblTotalGrossIncome.setBounds(10, 11, 136, 14);
		contentPane.add(lblTotalGrossIncome);
		
		JLabel lblTotalMonthlyDebt = new JLabel("Total Monthly Debt");
		lblTotalMonthlyDebt.setBounds(10, 36, 136, 14);
		contentPane.add(lblTotalMonthlyDebt);
		
		JLabel lblMortgageInterestRate = new JLabel("Mortgage Interest Rate");
		lblMortgageInterestRate.setBounds(10, 61, 152, 14);
		contentPane.add(lblMortgageInterestRate);
		
		JLabel lblTerm = new JLabel("Term");
		lblTerm.setBounds(10, 86, 65, 14);
		contentPane.add(lblTerm);
		
		JLabel lblDownPayment = new JLabel("Down payment");
		lblDownPayment.setBounds(10, 111, 121, 14);
		contentPane.add(lblDownPayment);
		
		JLabel lblHousingPayment = new JLabel("Housing Payment 18");
		lblHousingPayment.setBounds(10, 136, 121, 14);
		contentPane.add(lblHousingPayment);
		
		JLabel lblHousingPayment_1 = new JLabel("Housing Payment 36");
		lblHousingPayment_1.setBounds(10, 161, 130, 14);
		contentPane.add(lblHousingPayment_1);
		
		JLabel lblMaximum = new JLabel("Maximum");
		lblMaximum.setBounds(10, 186, 86, 14);
		contentPane.add(lblMaximum);
		
		JLabel lblMortgage = new JLabel("Mortgage");
		lblMortgage.setBounds(10, 211, 86, 14);
		contentPane.add(lblMortgage);
		
		textField = new JTextField();
		textField.setBounds(157, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(157, 33, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(157, 58, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(157, 108, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(157, 133, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(157, 158, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(157, 183, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(157, 208, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		Integer[] years = { 5, 10,  15,  20, 25,  30};
		comboBox= new JComboBox<>(years);
		comboBox.setBounds(157, 83, 55, 20);
		contentPane.add(comboBox);
		
		button = new JButton();
		button.setBounds(300, 208, 106, 30);
		button.setText("Calculate");
		button.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						String income = textField.getText();
						double income2 = Double.parseDouble(income);
						String debt = textField_1.getText();
						double debt2 = Double.parseDouble(debt);
						String interest = textField_2.getText();
						double interest2 = Double.parseDouble(interest);
						int term = (int)comboBox.getSelectedItem();
						
					}
				}
		);
		contentPane.add(button);
	}
}
