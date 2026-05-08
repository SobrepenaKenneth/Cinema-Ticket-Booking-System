package com.Sobrepena;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.JMenuItem;

public class TicketSystem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// Tabs
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

	// Menu
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnNewMenu = new JMenu("BOOKING");

	// Panel
	private final JPanel bookingPanel = new JPanel();
	private final JPanel summaryPanel = new JPanel();
	private final JPanel headerPanel = new JPanel();
	private final JLabel lblHeader = new JLabel("Cinema Ticket Management System");
	private final JPanel customerInformationPanel = new JPanel();
	private final JPanel ticketAmountPanel = new JPanel();
	private final JLabel lblCustomerName = new JLabel("Customer Name:");
	private final JTextField txtName = new JTextField();
	private final JLabel lblSelectMovie = new JLabel("Select Movie:");
	private final JComboBox<String> cmbMovie = new JComboBox<>();
	private final JPanel seatPanel = new JPanel();
	private final JRadioButton rdbtnRegular = new JRadioButton("Regular");
	private final JRadioButton rdbtnVip = new JRadioButton("VIP");
	private final JLabel lblRegularPrice = new JLabel("₱ 200");
	private final JLabel lblVipPrice = new JLabel("₱ 400");
	private final JSeparator separator = new JSeparator();
	private final JSeparator separator_1 = new JSeparator();
	private final JPanel addOnsPanel = new JPanel();
	private final JCheckBox chkPopcorn = new JCheckBox("Popcorn");
	private final JCheckBox chkDrinks = new JCheckBox("Drinks");
	private final JSeparator separator_2 = new JSeparator();
	private final JSeparator separator_2_1 = new JSeparator();
	private final JLabel lblRegularPrice_1 = new JLabel("₱ 100");
	private final JLabel lblRegularPrice_1_1 = new JLabel("₱ 50");
	private final JPanel footerPanel = new JPanel();
	// Total cost will update automatically based on your selections.
	private final JLabel lblFooter = new JLabel("Select your movie, seat type, number of tickets, and add-ons.");
	private final JLabel lblFooter_1 = new JLabel("Total cost will update automatically based on your selections.");
	private final JButton btnNewButton = new JButton("Book Ticket");
	private final JPanel totalCostPanel = new JPanel();
	private final JPanel borderPanel = new JPanel();
	private final JLabel lblTotalCost = new JLabel("0");
	private final JLabel lbltotalInfo = new JLabel("(Total will update automatically)");
	private final JLabel lblBookingSummary = new JLabel("Booking Summary");
	private final JLabel lblLineBorder = new JLabel("►------------------------◄");
	private final JPanel bookingSummaryPanel = new JPanel();
	private final JLabel lblCustomerName_1 = new JLabel("Customer Name                :");
	private final JLabel lblCustomerName_2_1 = new JLabel("Selected Movie                  :");
	private final JLabel lblCustomerName_2_1_1 = new JLabel("Seat Type (Per Ticket)       :");
	private final JLabel lblCustomerName_2_1_1_1 = new JLabel("Number Of Ticket             :");
	private final JLabel lblCustomerNameSummary = new JLabel("Name");
	private final JLabel lblMovieTypeSummary = new JLabel("Movie");
	private final JLabel lblSeatTypeSummary = new JLabel("Seat");
	private final JLabel lblTicketSummary = new JLabel("0");
	private final JPanel addOnsSummaryPanel = new JPanel();
	private final JPanel addTotalCostSummaryPanel = new JPanel();
	private final JLabel lblCustomerName_1_1 = new JLabel("Add-Ons  :");
	private final JLabel lblCustomerName_1_1_1 = new JLabel("Total Cost  :");
	private final JLabel lblTotalSummary = new JLabel("₱ 0");
	private final JLabel lblCustomerName_2_1_1_1_1 = new JLabel("Popcorn");
	private final JLabel lblCustomerName_2_1_1_1_1_1 = new JLabel("Drinks");
	private final JLabel lblPopcornYoN = new JLabel("No");
	private final JLabel lblDrinksYoN = new JLabel("No");
	private final JSeparator separator_3 = new JSeparator();
	private final JSeparator separator_3_1 = new JSeparator();
	private final JLabel lblCustomerName_2_1_1_1_2 = new JLabel("Thank you! your booking has been confirmed.");
	private final JLabel lblCustomerName_2_1_1_1_2_1 = new JLabel("We hope you enjoy the movie!");
	private final JButton btnNewBooking = new JButton("New Booking");
	private final JLabel lblCustomerName_2_1_1_1_2_1_1 = new JLabel("Click to make a new booking, And return to the");
	private final JLabel lblCustomerName_2_1_1_1_2_1_1_1 = new JLabel("Booking tab");
	private JSpinner spinnerTickets;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	private int added = 0;
	private int totalVal = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketSystem frame = new TicketSystem();

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
	public TicketSystem() {
		// Keep in mind my code generation is different -ken

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		tabbedPane.setBounds(0, 75, 641, 436);

		// TabbedPane
		tabbedPane.addTab("1. Booking", null, bookingPanel, null);
		bookingPanel.setLayout(null);
		customerInformationPanel.setBorder(new LineBorder(new Color(100, 149, 237), 5));
		customerInformationPanel.setBounds(0, 0, 360, 346);

		bookingPanel.add(customerInformationPanel);
		customerInformationPanel.setLayout(null);
		lblCustomerName.setBounds(21, 14, 116, 21);
		lblCustomerName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));

		customerInformationPanel.add(lblCustomerName);
		txtName.setBounds(164, 11, 185, 27);
		txtName.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtName.setColumns(10);

		customerInformationPanel.add(txtName);
		lblSelectMovie.setBounds(21, 48, 92, 21);
		lblSelectMovie.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));

		spinnerTickets = new JSpinner();
		spinnerTickets
				.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		spinnerTickets.setBounds(201, 18, 128, 20);
		ticketAmountPanel.add(spinnerTickets);
		spinnerTickets.addChangeListener(e -> calculateTotalCost());

		customerInformationPanel.add(lblSelectMovie);
		cmbMovie.addActionListener(e -> selectMovie());
		cmbMovie.setBounds(164, 48, 185, 27);
		cmbMovie.addItem("LOTR - \u20B1 900");
		cmbMovie.addItem("Avengers - \u20B1 500");
		cmbMovie.addItem("Avatar - \u20B1 600");
		customerInformationPanel.add(cmbMovie);
		seatPanel.setBorder(new TitledBorder(new LineBorder(new Color(100, 149, 237), 2), " Seat Type (Per Ticket) ",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
		seatPanel.setBounds(9, 80, 340, 99);

		customerInformationPanel.add(seatPanel);
		seatPanel.setLayout(null);
		buttonGroup.add(rdbtnRegular);
		rdbtnRegular.addItemListener(getSelected);
		rdbtnRegular.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnRegular.setBounds(25, 21, 84, 26);

		seatPanel.add(rdbtnRegular);
		buttonGroup.add(rdbtnVip);
		rdbtnVip.addItemListener(getSelected);
		rdbtnVip.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnVip.setBounds(25, 55, 53, 20);

		seatPanel.add(rdbtnVip);
		lblRegularPrice.setForeground(new Color(34, 139, 34));
		lblRegularPrice.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblRegularPrice.setBounds(238, 22, 92, 21);

		seatPanel.add(lblRegularPrice);
		lblVipPrice.setForeground(new Color(34, 139, 34));
		lblVipPrice.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblVipPrice.setBounds(238, 53, 92, 21);

		seatPanel.add(lblVipPrice);
		separator.setBounds(104, 36, 124, 6);

		seatPanel.add(separator);
		separator_1.setBounds(78, 67, 150, 6);

		seatPanel.add(separator_1);
		addOnsPanel.setBorder(new TitledBorder(new LineBorder(new Color(100, 149, 237), 2), " Add-Ons ",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
		addOnsPanel.setBounds(10, 179, 339, 104);

		customerInformationPanel.add(addOnsPanel);
		addOnsPanel.setLayout(null);
		chkPopcorn.addItemListener(getSelected);
		chkPopcorn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		chkPopcorn.setBounds(27, 25, 93, 21);

		addOnsPanel.add(chkPopcorn);
		chkDrinks.addItemListener(getSelected);
		chkDrinks.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		chkDrinks.setBounds(27, 60, 93, 21);

		addOnsPanel.add(chkDrinks);
		separator_2.setBounds(117, 40, 110, 2);

		addOnsPanel.add(separator_2);
		separator_2_1.setBounds(101, 73, 126, 2);

		addOnsPanel.add(separator_2_1);
		lblRegularPrice_1.setForeground(new Color(34, 139, 34));
		lblRegularPrice_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblRegularPrice_1.setBounds(237, 23, 92, 21);

		addOnsPanel.add(lblRegularPrice_1);
		lblRegularPrice_1_1.setForeground(new Color(34, 139, 34));
		lblRegularPrice_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblRegularPrice_1_1.setBounds(237, 60, 92, 21);

		addOnsPanel.add(lblRegularPrice_1_1);
		ticketAmountPanel.setLayout(null);
		ticketAmountPanel.setBorder(new TitledBorder(new LineBorder(new Color(100, 149, 237), 2),
				" Ticket Order Quantity ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
		ticketAmountPanel.setBounds(9, 286, 339, 49);

		customerInformationPanel.add(ticketAmountPanel);

		btnNewButton.addActionListener(e -> bookTicket());
		btnNewButton.setBackground(new Color(60, 179, 113));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton.setBounds(0, 356, 360, 35);

		bookingPanel.add(btnNewButton);
		totalCostPanel.setBorder(new TitledBorder(new LineBorder(new Color(100, 149, 237), 2, true), " Total Cost ",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
		totalCostPanel.setBounds(370, 88, 256, 193);

		bookingPanel.add(totalCostPanel);
		totalCostPanel.setLayout(null);
		borderPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		borderPanel.setBackground(new Color(255, 222, 173));
		borderPanel.setBounds(10, 38, 236, 127);

		totalCostPanel.add(borderPanel);
		borderPanel.setLayout(null);
		lblTotalCost.setBounds(67, 21, 140, 47);
		lblTotalCost.setForeground(new Color(34, 139, 34));
		lblTotalCost.setFont(new Font("Segoe UI", Font.BOLD, 40));

		borderPanel.add(lblTotalCost);
		lbltotalInfo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lbltotalInfo.setBounds(32, 78, 175, 21);

		borderPanel.add(lbltotalInfo);

		JLabel lblPeso = new JLabel("₱");
		lblPeso.setForeground(new Color(34, 139, 34));
		lblPeso.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblPeso.setBounds(32, 21, 34, 47);
		borderPanel.add(lblPeso);
		tabbedPane.addTab("2. Summary", null, summaryPanel, null);
		summaryPanel.setLayout(null);
		lblBookingSummary.setForeground(new Color(30, 144, 255));
		lblBookingSummary.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblBookingSummary.setBounds(173, 10, 277, 41);

		summaryPanel.add(lblBookingSummary);
		lblLineBorder.setForeground(new Color(30, 144, 255));
		lblLineBorder.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblLineBorder.setBounds(141, 40, 377, 24);

		summaryPanel.add(lblLineBorder);
		bookingSummaryPanel.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		bookingSummaryPanel.setBounds(10, 81, 602, 230);

		summaryPanel.add(bookingSummaryPanel);
		bookingSummaryPanel.setLayout(null);
		lblCustomerName_1.setBounds(92, 24, 186, 21);
		lblCustomerName_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));

		bookingSummaryPanel.add(lblCustomerName_1);
		lblCustomerName_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblCustomerName_2_1.setBounds(92, 55, 186, 21);

		bookingSummaryPanel.add(lblCustomerName_2_1);
		lblCustomerName_2_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblCustomerName_2_1_1.setBounds(92, 86, 186, 21);

		bookingSummaryPanel.add(lblCustomerName_2_1_1);
		lblCustomerName_2_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblCustomerName_2_1_1_1.setBounds(92, 114, 186, 21);

		bookingSummaryPanel.add(lblCustomerName_2_1_1_1);
		lblCustomerNameSummary.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblCustomerNameSummary.setBounds(333, 24, 186, 21);

		bookingSummaryPanel.add(lblCustomerNameSummary);
		lblMovieTypeSummary.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblMovieTypeSummary.setBounds(333, 55, 186, 21);

		bookingSummaryPanel.add(lblMovieTypeSummary);
		lblSeatTypeSummary.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblSeatTypeSummary.setBounds(333, 86, 186, 21);

		bookingSummaryPanel.add(lblSeatTypeSummary);
		lblTicketSummary.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblTicketSummary.setBounds(333, 121, 186, 21);

		bookingSummaryPanel.add(lblTicketSummary);
		addOnsSummaryPanel.setBorder(new LineBorder(new Color(211, 211, 211), 2));
		addOnsSummaryPanel.setBackground(new Color(240, 255, 240));
		addOnsSummaryPanel.setBounds(20, 155, 275, 65);

		bookingSummaryPanel.add(addOnsSummaryPanel);
		addOnsSummaryPanel.setLayout(null);
		lblCustomerName_1_1.setForeground(new Color(34, 139, 34));
		lblCustomerName_1_1.setBackground(new Color(34, 139, 34));
		lblCustomerName_1_1.setBounds(10, 20, 89, 21);
		lblCustomerName_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));

		addOnsSummaryPanel.add(lblCustomerName_1_1);
		lblCustomerName_2_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblCustomerName_2_1_1_1_1.setBounds(109, 10, 60, 21);

		addOnsSummaryPanel.add(lblCustomerName_2_1_1_1_1);
		lblCustomerName_2_1_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblCustomerName_2_1_1_1_1_1.setBounds(109, 34, 100, 21);

		addOnsSummaryPanel.add(lblCustomerName_2_1_1_1_1_1);
		lblPopcornYoN.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblPopcornYoN.setBounds(212, 10, 53, 21);

		addOnsSummaryPanel.add(lblPopcornYoN);
		lblDrinksYoN.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblDrinksYoN.setBounds(212, 35, 52, 21);

		addOnsSummaryPanel.add(lblDrinksYoN);
		separator_3.setBounds(169, 22, 37, 5);

		addOnsSummaryPanel.add(separator_3);
		separator_3_1.setBounds(162, 44, 45, 6);

		addOnsSummaryPanel.add(separator_3_1);
		addTotalCostSummaryPanel.setBorder(new LineBorder(new Color(211, 211, 211), 2));
		addTotalCostSummaryPanel.setBackground(new Color(240, 255, 255));
		addTotalCostSummaryPanel.setBounds(305, 154, 271, 66);

		bookingSummaryPanel.add(addTotalCostSummaryPanel);
		addTotalCostSummaryPanel.setLayout(null);
		lblCustomerName_1_1_1.setBounds(10, 23, 83, 21);
		lblCustomerName_1_1_1.setForeground(new Color(0, 0, 255));
		lblCustomerName_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblCustomerName_1_1_1.setBackground(new Color(34, 139, 34));

		addTotalCostSummaryPanel.add(lblCustomerName_1_1_1);
		lblTotalSummary.setForeground(new Color(34, 139, 34));
		lblTotalSummary.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblTotalSummary.setBounds(103, 10, 145, 47);

		addTotalCostSummaryPanel.add(lblTotalSummary);
		lblCustomerName_2_1_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblCustomerName_2_1_1_1_2.setBounds(10, 328, 324, 21);

		summaryPanel.add(lblCustomerName_2_1_1_1_2);
		lblCustomerName_2_1_1_1_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblCustomerName_2_1_1_1_2_1.setBounds(10, 352, 324, 21);

		summaryPanel.add(lblCustomerName_2_1_1_1_2_1);
		btnNewBooking.addActionListener(e -> newBooking());
		btnNewBooking.setForeground(Color.WHITE);
		btnNewBooking.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewBooking.setBackground(new Color(60, 179, 113));
		btnNewBooking.setBounds(374, 321, 238, 35);

		summaryPanel.add(btnNewBooking);
		lblCustomerName_2_1_1_1_2_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblCustomerName_2_1_1_1_2_1_1.setBounds(376, 356, 234, 21);

		summaryPanel.add(lblCustomerName_2_1_1_1_2_1_1);
		lblCustomerName_2_1_1_1_2_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblCustomerName_2_1_1_1_2_1_1_1.setBounds(464, 370, 65, 21);

		summaryPanel.add(lblCustomerName_2_1_1_1_2_1_1_1);
		menuBar.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));

		// MenuBar
		menuBar.add(mnNewMenu);
		mBook.addActionListener(e -> newBooking());

		mnNewMenu.add(mBook);

		JMenuItem mCLEAR = new JMenuItem("CLEAR");
		mCLEAR.addActionListener(e -> clearInputs());
		mnNewMenu.add(mCLEAR);

		JSeparator separator_4 = new JSeparator();
		mnNewMenu.add(separator_4);
		mEXIT.addActionListener(e -> System.exit(0));

		mnNewMenu.add(mEXIT);
		menuBar.setBounds(0, 0, 641, 21);

		// Content Pane
		contentPane.add(menuBar);
		contentPane.add(tabbedPane);
		headerPanel.setBackground(new Color(100, 149, 237));
		headerPanel.setBounds(0, 20, 641, 51);

		contentPane.add(headerPanel);
		lblHeader.setForeground(new Color(255, 255, 255));
		lblHeader.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));

		headerPanel.add(lblHeader);
		footerPanel.setBackground(new Color(100, 149, 237));
		footerPanel.setBounds(0, 507, 641, 57);

		contentPane.add(footerPanel);
		lblFooter.setForeground(new Color(255, 255, 255));
		lblFooter.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		footerPanel.add(lblFooter);
		lblFooter_1.setForeground(new Color(255, 255, 255));
		lblFooter_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));

		footerPanel.add(lblFooter_1);

	}

	private void calculateTotalCost() {
		int ticketCount = (int) spinnerTickets.getValue();
		int moviePrice = 0;

		String selectedMovie = cmbMovie.getSelectedItem().toString();
		if (selectedMovie.contains("LOTR")) {
			moviePrice = 900;
		} else if (selectedMovie.contains("Avatar")) {
			moviePrice = 600;
		} else if (selectedMovie.contains("Avengers")) {
			moviePrice = 500;
		}

		int seatPrice = 0;
		if (rdbtnRegular.isSelected()) {
			seatPrice = 200;
		} else if (rdbtnVip.isSelected()) {
			seatPrice = 400;
		}

		int ticketPrice = moviePrice + seatPrice;

		int total = ticketPrice * ticketCount;

		if (chkPopcorn.isSelected()) {
			total += 100 * ticketCount;
		}
		if (chkDrinks.isSelected()) {
			total += 50 * ticketCount;
		}

		lblTotalCost.setText(String.valueOf(total));
	}

	public void bookTicket() {
		String name = txtName.getText().trim();

		if (name.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Customer name is required!", "Validation Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		int tickets = (int) spinnerTickets.getValue();
		if (tickets < 1) {
			JOptionPane.showMessageDialog(this, "Number of tickets must be at least 1!", "Validation Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		int confirm = JOptionPane.showConfirmDialog(this,
				"Are you sure you want to book " + tickets + " ticket(s) for " + name + "?", "Confirm Booking",
				JOptionPane.YES_NO_OPTION);

		if (confirm == JOptionPane.YES_OPTION) {
			String movie = cmbMovie.getSelectedItem().toString();
			String seatType = rdbtnRegular.isSelected() ? "Regular" : "VIP";

			if (chkPopcorn.isSelected())
				lblPopcornYoN.setText("Yes");
			else
				lblPopcornYoN.setText("No");

			if (chkDrinks.isSelected())
				lblDrinksYoN.setText("Yes");
			else
				lblDrinksYoN.setText("No");

			String total = lblTotalCost.getText();

			// Display Summary
			lblCustomerNameSummary.setText(name);
			lblMovieTypeSummary.setText(movie);
			lblSeatTypeSummary.setText(seatType);
			lblTicketSummary.setText(String.valueOf(tickets));
			lblTotalSummary.setText("\u20B1" + total);

			// Switch to Summary Tab
			tabbedPane.setSelectedIndex(1);

		}
	}

	void selectMovie() {
		String selected = cmbMovie.getSelectedItem().toString();
		int ticketCount = (int) spinnerTickets.getValue();

		int moviePrice = 0;
		if (selected.contains("LOTR")) {
			moviePrice = 900;
		} else if (selected.contains("Avatar")) {
			moviePrice = 600;
		} else if (selected.contains("Avengers")) {
			moviePrice = 500;
		}

		int seatPrice = rdbtnRegular.isSelected() ? 200 : 400;

		int ticketPrice = moviePrice + seatPrice;

		int total = ticketPrice * ticketCount;

		if (chkPopcorn.isSelected()) {
			total += 100 * ticketCount;
		}
		if (chkDrinks.isSelected()) {
			total += 50 * ticketCount;
		}

		lblTotalCost.setText(String.valueOf(total));
	}

	ItemListener getSelected = new ItemListener() {

		public void itemStateChanged(ItemEvent e) {

			var source = e.getSource();
			int state = e.getStateChange();
			int total = Integer.parseInt(lblTotalCost.getText());
			int multiplier = (int) spinnerTickets.getValue();
			if (state == ItemEvent.SELECTED) {

				if (source == rdbtnRegular)
					total += 200;
				if (source == rdbtnVip)
					total += 400;
				if (source == chkPopcorn)
					total += 100;
				if (source == chkDrinks)
					total += 50;

			} else {

				if (source == rdbtnRegular)
					total -= 200;
				if (source == rdbtnVip)
					total -= 400;
				if (source == chkPopcorn)
					total -= 100;
				if (source == chkDrinks)
					total -= 50;

			}

			lblTotalCost.setText(String.valueOf(multiplier * total));

		}

	};
	private final JMenuItem mBook = new JMenuItem("BOOK");
	private final JMenuItem mEXIT = new JMenuItem("EXIT");

	void newBooking() {
		clearInputs2();
		tabbedPane.setSelectedIndex(0);
	}

	void clearInputs() {
		int confirm = JOptionPane.showConfirmDialog(contentPane, "Are you sure you want to clear all inputs?",
				"Clear Form", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (confirm == JOptionPane.YES_OPTION) {
			txtName.setText("");
			spinnerTickets.setValue(1);
			cmbMovie.setSelectedIndex(0);
			rdbtnRegular.setSelected(true);
			chkPopcorn.setSelected(false);
			chkDrinks.setSelected(false);
			lblTotalCost.setText(String.valueOf(0));
		}
	}
	
	void clearInputs2() {
		int confirm = JOptionPane.showConfirmDialog(contentPane, "Are you sure you want to create a new booking?",
				"Clear Form", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (confirm == JOptionPane.YES_OPTION) {
			txtName.setText("");
			spinnerTickets.setValue(1);
			cmbMovie.setSelectedIndex(0);
			rdbtnRegular.setSelected(true);
			chkPopcorn.setSelected(false);
			chkDrinks.setSelected(false);
			lblTotalCost.setText(String.valueOf(0));
		}
	}
}