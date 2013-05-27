package view;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GuiSearch implements  ActionListener, ItemListener{

    private JPanel textPanel, panelForTextFields, resultPanel;
    private JLabel frameTitleLabel, titleLabel, durationLabel, artistLabel, albumLabel,releaseLabel ;
    private JTextField titleField, artistField, albumField, durationField, releaseField;
    private JButton searchButton;
    private JToggleButton btsw_selection_artist, btsw_selection_release, btsw_selection_title, btsw_selection_duration, btsw_selection_album;

    public JPanel createContentPane (){

        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        frameTitleLabel = new JLabel("Million Song DataSet Search engine");
        frameTitleLabel.setLocation(20,0);
        frameTitleLabel.setSize(400, 30);
        frameTitleLabel.setHorizontalAlignment(0);
        frameTitleLabel.setForeground(Color.BLUE);
        frameTitleLabel.setFont(new Font("Serif", Font.ITALIC, 16));
        totalGUI.add(frameTitleLabel);

        // Creation of a Panel to contain the JLabels
        textPanel = new JPanel();
        textPanel.setLayout(null);
        textPanel.setLocation(10, 40);
        textPanel.setSize(120, 200);
        totalGUI.add(textPanel);

        /*
         * Labels
         */
        
        // song title Label
        titleLabel = new JLabel("Title");
        titleLabel.setLocation(0, 0);
        titleLabel.setSize(70, 40);
        titleLabel.setHorizontalAlignment(4);
        titleLabel.setHorizontalAlignment(JLabel.LEFT);
        textPanel.add(titleLabel);

        // artist Label
        artistLabel = new JLabel("Artist");
        artistLabel.setLocation(0, 40);
        artistLabel.setSize(70, 40);
        artistLabel.setHorizontalAlignment(4);
        artistLabel.setHorizontalAlignment(JLabel.LEFT);
        textPanel.add(artistLabel);

        // album name Label
        albumLabel = new JLabel("Album name");
        albumLabel.setLocation(0, 80);
        albumLabel.setSize(120, 40);
        albumLabel.setHorizontalAlignment(4);
        albumLabel.setHorizontalAlignment(JLabel.LEFT);
        textPanel.add(albumLabel);
        
        // duration Label
        durationLabel = new JLabel("Min.Duration(s)");
        durationLabel.setLocation(0, 120);
        durationLabel.setSize(120, 40);
        durationLabel.setHorizontalAlignment(4);
        durationLabel.setHorizontalAlignment(JLabel.LEFT);
        textPanel.add(durationLabel);
        
        // release year Label
        releaseLabel = new JLabel("Release year");
        releaseLabel.setLocation(0, 160);
        releaseLabel.setSize(100, 40);
        releaseLabel.setHorizontalAlignment(4);
        releaseLabel.setHorizontalAlignment(JLabel.LEFT);
        textPanel.add(releaseLabel);
        
        /*
         * TextFields
         */
        
        // TextFields Panel Container
        panelForTextFields = new JPanel();
        panelForTextFields.setLayout(null);
        panelForTextFields.setLocation(130, 40);
        panelForTextFields.setSize(200, 200);
        totalGUI.add(panelForTextFields);

        // Song title Textfield
        titleField = new JTextField(30);
        titleField.setLocation(0, 0);
        titleField.setSize(200, 30);
        panelForTextFields.add(titleField);

        // Artist Textfield
        artistField = new JTextField(30);
        artistField.setLocation(0, 40);
        artistField.setSize(200, 30);
        panelForTextFields.add(artistField);

        // Album Name Textfield
        albumField = new JTextField(30);
        albumField.setLocation(0, 80);
        albumField.setSize(200, 30);
        panelForTextFields.add(albumField);
        
        // Minimum song duration Textfield
        durationField = new JTextField(8);
        durationField.setLocation(0, 120);
        durationField.setSize(200, 30);
        panelForTextFields.add(durationField);
        
        // Release year Textfield
        releaseField = new JTextField(4);
        releaseField.setLocation(0, 160);
        releaseField.setSize(200, 30);
        panelForTextFields.add(releaseField);
        
        // Creation of a Panel to contain the resultset of query
        resultPanel = new JPanel();
        resultPanel.setLayout(null);
        resultPanel.setLocation(240, 35);
        resultPanel.setSize(70, 80);
        totalGUI.add(resultPanel);

        /*
         * Buttons
         */
        
        // Button for search
        searchButton = new JButton("Search");
        searchButton.setLocation(150, 250);
        searchButton.setSize(120, 30);
        searchButton.addActionListener(this);
        totalGUI.add(searchButton);
        
        /*
         *  Buttons for active selection query option;
         */
        
		//for Title
		btsw_selection_title = new JToggleButton("OFF");
		btsw_selection_title.addItemListener(this);
		btsw_selection_title.setBackground(Color.lightGray);
		btsw_selection_title.setLocation(380, 40);
		btsw_selection_title.setSize(70 , 30);
		totalGUI.add(btsw_selection_title);
        totalGUI.setOpaque(true); 
        
        // For artist
		btsw_selection_artist = new JToggleButton("OFF");
		btsw_selection_artist.addItemListener(this);
		btsw_selection_artist.setBackground(Color.lightGray);
		btsw_selection_artist.setLocation(380, 80);
		btsw_selection_artist.setSize(70 , 30);
		totalGUI.add(btsw_selection_artist);   
        
		//for Album Name
		btsw_selection_album = new JToggleButton("OFF");
		btsw_selection_album.addItemListener(this);
		btsw_selection_album.setBackground(Color.lightGray);
		btsw_selection_album.setLocation(380, 120);
		btsw_selection_album.setSize(70 , 30);
		totalGUI.add(btsw_selection_album);
        totalGUI.setOpaque(true);
        
		//for duration
		btsw_selection_duration = new JToggleButton("OFF");
		btsw_selection_duration.addItemListener(this);
		btsw_selection_duration.setBackground(Color.lightGray);
		btsw_selection_duration.setLocation(380, 160);
		btsw_selection_duration.setSize(70 , 30);
		totalGUI.add(btsw_selection_duration);
        totalGUI.setOpaque(true);
        
		//for release year
		btsw_selection_release = new JToggleButton("OFF");
		btsw_selection_release.addItemListener(this);
		btsw_selection_release.setBackground(Color.lightGray);
		btsw_selection_release.setLocation(380, 200);
		btsw_selection_release.setSize(70 , 30);
		totalGUI.add(btsw_selection_release);
        totalGUI.setOpaque(true);
        
		return totalGUI;
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == searchButton)
        {
            if(titleField.getText().trim().compareTo("Bob") == 0)
            {
               // userLabel.setForeground(Color.green);
                //userLabel.setText("Correct!");
            }
            else
            {
                //userLabel.setForeground(Color.red);
                //userLabel.setText("Wrong!");
            }

            if(artistField.getText().trim().compareTo("Robert") == 0)
            {
                //passLabel.setForeground(Color.green);
                //passLabel.setText("Correct!");
            }
            else
            {
                //passLabel.setForeground(Color.red);
                //passLabel.setText("Wrong!");
            }

            //if((userLabel.getForeground() == Color.green) 
			//&& (passLabel.getForeground() == Color.green))
            //{
            //    titleLabel.setText("Logging in....");
            //    loginButton.setEnabled(false);
            //}
        }
    }


    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Million Song Data");

        GuiSearch demo = new GuiSearch();
        frame.setContentPane(demo.createContentPane());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 350);
        frame.setVisible(true);
    }
	
    @Override
	public void itemStateChanged(ItemEvent e) {
		if((e.getItemSelectable() == btsw_selection_title)&&
				(e.getStateChange() ==  ItemEvent.SELECTED))
        {
            btsw_selection_title.setText("ON");
        }
		if((e.getItemSelectable() == btsw_selection_title)&&
				(e.getStateChange() == ItemEvent.DESELECTED))
        {
            btsw_selection_title.setText("OFF");
            btsw_selection_title.setBackground(Color.lightGray);
        }
		if((e.getItemSelectable() == btsw_selection_artist)&&
				(e.getStateChange() ==  ItemEvent.SELECTED))
        {
            btsw_selection_artist.setText("ON");
        }
		if((e.getItemSelectable() == btsw_selection_artist)&&
				(e.getStateChange() == ItemEvent.DESELECTED))
        {
            btsw_selection_artist.setText("OFF");
            btsw_selection_artist.setBackground(Color.lightGray);
        }
		if((e.getItemSelectable() == btsw_selection_album)&&
				(e.getStateChange() ==  ItemEvent.SELECTED))
        {
            btsw_selection_album.setText("ON");
        }
		if((e.getItemSelectable() == btsw_selection_album)&&
				(e.getStateChange() == ItemEvent.DESELECTED))
        {
            btsw_selection_album.setText("OFF");
            btsw_selection_album.setBackground(Color.lightGray);
        }
		if((e.getItemSelectable() == btsw_selection_duration)&&
				(e.getStateChange() ==  ItemEvent.SELECTED))
        {
            btsw_selection_duration.setText("ON");
        }
		if((e.getItemSelectable() == btsw_selection_duration)&&
				(e.getStateChange() == ItemEvent.DESELECTED))
        {
            btsw_selection_duration.setText("OFF");
            btsw_selection_duration.setBackground(Color.lightGray);
        }
		if((e.getItemSelectable() == btsw_selection_release)&&
				(e.getStateChange() ==  ItemEvent.SELECTED))
        {
            btsw_selection_release.setText("ON");
        }
		if((e.getItemSelectable() == btsw_selection_release)&&
				(e.getStateChange() == ItemEvent.DESELECTED))
        {
            btsw_selection_release.setText("OFF");
            btsw_selection_release.setBackground(Color.lightGray);
        }
	}

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
