package pls;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class Libraryfrm {

	JFrame frmLibrary;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Libraryfrm window = new Libraryfrm();
					window.frmLibrary.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Libraryfrm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibrary = new JFrame();
		frmLibrary.setResizable(false);
		frmLibrary.setBounds(100, 100, 500, 500);
		frmLibrary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibrary.getContentPane().setLayout(null);
		
		JLabel lblBookIceandFire = new JLabel("Author: George R. R. Martin");
		lblBookIceandFire.setBounds(30, 50, 165, 49);
		frmLibrary.getContentPane().add(lblBookIceandFire);
		
		JLabel lblASongAuthor = new JLabel("Title: A Song of Ice and Fire");
		lblASongAuthor.setBounds(40, 67, 177, 49);
		frmLibrary.getContentPane().add(lblASongAuthor);
		
		JLabel lblASongPub = new JLabel("Publisher: Bantam Books");
		lblASongPub.setBounds(50, 83, 146, 49);
		frmLibrary.getContentPane().add(lblASongPub);
		
		JLabel lblTitleNoliMe = new JLabel("Title: Noli Me Tangere");
		lblTitleNoliMe.setBounds(255, 67, 146, 49);
		frmLibrary.getContentPane().add(lblTitleNoliMe);
		
		JLabel lblAuthorJoseP = new JLabel("Author: Jose P. Rizal");
		lblAuthorJoseP.setBounds(255, 50, 146, 49);
		frmLibrary.getContentPane().add(lblAuthorJoseP);
		
		JLabel lblPublisherMaximoViola = new JLabel("Publisher: Maximo Viola");
		lblPublisherMaximoViola.setBounds(255, 83, 146, 49);
		frmLibrary.getContentPane().add(lblPublisherMaximoViola);
		
		JLabel lblAuthorRobertGreen = new JLabel("Author: Robert Green");
		lblAuthorRobertGreen.setBounds(42, 143, 146, 49);
		frmLibrary.getContentPane().add(lblAuthorRobertGreen);
		
		JLabel lblTitleLaws = new JLabel("Title: 48 Laws Of Power");
		lblTitleLaws.setBounds(42, 160, 146, 49);
		frmLibrary.getContentPane().add(lblTitleLaws);
		
		JLabel lblPublisherVikingPress = new JLabel("Publisher: Viking Press");
		lblPublisherVikingPress.setBounds(42, 177, 146, 49);
		frmLibrary.getContentPane().add(lblPublisherVikingPress);
		
		JLabel lblAuthorJamesClear = new JLabel("Author: James Clear");
		lblAuthorJamesClear.setBounds(255, 143, 146, 49);
		frmLibrary.getContentPane().add(lblAuthorJamesClear);
		
		JLabel lblTitleAtomicHabits = new JLabel("Title: Atomic Habits");
		lblTitleAtomicHabits.setBounds(255, 160, 229, 49);
		frmLibrary.getContentPane().add(lblTitleAtomicHabits);
		
		JLabel lblPublisherPenguinRandom = new JLabel("Publisher: Penguin Random House");
		lblPublisherPenguinRandom.setBounds(255, 177, 198, 49);
		frmLibrary.getContentPane().add(lblPublisherPenguinRandom);
		
		JLabel lblAuthorJensonButton = new JLabel("Author: Jenson Button");
		lblAuthorJensonButton.setBounds(156, 230, 146, 49);
		frmLibrary.getContentPane().add(lblAuthorJensonButton);
		
		JLabel lblTitleHowTo = new JLabel("Title: How To Be An F1 Driver");
		lblTitleHowTo.setBounds(156, 247, 229, 49);
		frmLibrary.getContentPane().add(lblTitleHowTo);
		
		JLabel lblPublisherBonnierBooks = new JLabel("Publisher: Bonnier Books Limited");
		lblPublisherBonnierBooks.setBounds(156, 264, 229, 49);
		frmLibrary.getContentPane().add(lblPublisherBonnierBooks);	
		
		JLabel lblBookId1 = new JLabel("Book#1");
		lblBookId1.setBounds(60, 50, 46, 14);
		frmLibrary.getContentPane().add(lblBookId1);
		
		JLabel lblBookId2 = new JLabel("Book#2");
		lblBookId2.setBounds(283, 50, 46, 14);
		frmLibrary.getContentPane().add(lblBookId2);
		
		JLabel lblBookId3 = new JLabel("Book#3");
		lblBookId3.setBounds(73, 143, 46, 14);
		frmLibrary.getContentPane().add(lblBookId3);
		
		JLabel lblBookId4 = new JLabel("Book#4");
		lblBookId4.setBounds(283, 143, 46, 14);
		frmLibrary.getContentPane().add(lblBookId4);
		
		JLabel lblBookId5 = new JLabel("Book#5");
		lblBookId5.setBounds(185, 230, 46, 14);
		frmLibrary.getContentPane().add(lblBookId5);
	}
}
