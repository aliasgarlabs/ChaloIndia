

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.*;

public class Main  {
	
	private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;
	   private String sourceLabel;
	   private String destinationLabel;
	   private JLabel sourceTitle;
	   private JLabel destinationTitle;
	   static DummyTrainCreator dummyTrainCreator;
	   private JTable table;
	   
	Main()
	{
		 prepareGUI();
	}
	
	public static void main(String []args)
	{	
		dummyTrainCreator = new DummyTrainCreator();
		dummyTrainCreator.addAllTrains();
//		dummyTrainCreator.showAllTrains();
		HashMap <String,String> hm = dummyTrainCreator.getAllUniqueStations();
		
		Main main = new Main();
		main.showComboboxDemo(hm);
	
	}
	
	 private void prepareGUI(){
	      mainFrame = new JFrame("Chalo India");
	      mainFrame.setSize(800,400);
	      mainFrame.setLayout(new FlowLayout());
//	      mainFrame.addWindowListener(new WindowAdapter() {
//	         public void windowClosing(WindowEvent windowEvent){
//	            System.exit(0);
//	         }        
//	      });
	      mainFrame.getDefaultCloseOperation();
	      headerLabel = new JLabel("", JLabel.CENTER);        
	      statusLabel = new JLabel("",JLabel.CENTER);    
	      sourceTitle = new JLabel("FROM");    
	      destinationTitle = new JLabel("TO");
	      

	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());
	    
	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);  
	   }

	   private void showComboboxDemo(HashMap<String,String> hm){                                    
	      headerLabel.setText("FIND TRAINS"); 

	      final DefaultComboBoxModel stationNames = new DefaultComboBoxModel();
	      
	      Iterator it = hm.entrySet().iterator();
	      while (it.hasNext()) {
	          Map.Entry pair = (Map.Entry)it.next();
	          stationNames.addElement((pair.getValue() +" (" +pair.getKey() + ") "));
	       	 
	      }
	      
	      final JComboBox sourceCombo = new JComboBox(stationNames);    
	      sourceCombo.setSelectedIndex(0);
	      
	      JScrollPane sourceScrollPane = new JScrollPane(sourceCombo);    
	     
	      JButton showButton = new JButton("Find Trains");

	      final DefaultComboBoxModel destinationStationNames = new DefaultComboBoxModel();
	      
	      it = hm.entrySet().iterator();
	      while (it.hasNext()) {
	          Map.Entry pair = (Map.Entry)it.next();
	          destinationStationNames.addElement((pair.getValue() +" (" +pair.getKey() + ") "));
	       	 
	      }
	      
	      final JComboBox destination = new JComboBox(destinationStationNames);    
	      destination.setSelectedIndex(0);
	      
	      JScrollPane destibationScrollPane = new JScrollPane(destination);    

	    

	      showButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) { 
	        	 
	        	  if (sourceCombo.getSelectedIndex() != -1) {  
	        		  
		               sourceLabel = "Source Selected: " 
		                  + sourceCombo.getItemAt
		                    (sourceCombo.getSelectedIndex());             
		            }  
	            
	            if (destination.getSelectedIndex() != -1) {                     
	               destinationLabel= " \n Destination Selected: " 
	                  + destination.getItemAt
	                    (destination.getSelectedIndex());             
	            }              
	            statusLabel.setText(sourceLabel+"\n"+destinationLabel);
	            findTrains(sourceCombo.getItemAt
	                    (sourceCombo.getSelectedIndex()).toString(), destination.getItemAt
	                    (destination.getSelectedIndex()).toString());
	         }
	      }); 
	      
	    
	      controlPanel.add(sourceTitle);
	      controlPanel.add(sourceScrollPane);    
	      controlPanel.add(destinationTitle);
	      controlPanel.add(destibationScrollPane);          
	      controlPanel.add(showButton);   
	      
	      mainFrame.setVisible(true);             
	   }

	protected void findTrains(String sourceLabel, String desitnationLabel) {
		
		Train foundTrain[] = FindTrains.setRoute(dummyTrainCreator, sourceLabel, desitnationLabel);
		int dt=Utility.getNoOfFoundTrain(foundTrain);
		System.out.println("DT:" + dt);
		if(foundTrain!=null)
		{	
			int i=0;
			for(Train train: foundTrain)
			{		
					if(train!=null)
					{	
						i++;
						Utility.showTrainDetails(train);
					}
			}
		}
		int i=0;
		Object rowData[][] = new Object[dt][6];
		for(Train train: foundTrain)
		{		
				if(train!=null)
				{	
					rowData[i][0] = train.getTrainNo();
					rowData[i][1] = train.getTrainName();
					rowData[i][2] = train.getSourceStation().getStationName();
					rowData[i][3] = ""+Utility.getReadableTime(train.getSourceStation().getDeparture());
					rowData[i][4] = train.getDestinationStation().getStationName();
					rowData[i][5] = ""+Utility.getReadableTime(train.getDestinationStation().getArrival());
				
				}
		}
		
		 //if(dt!=0)
			    {Object columnNames[] = { "Train Number", "Train Name", "Source", "Departure", "Destination", "Arrival" };
			    table = new JTable(rowData, columnNames);

			    JScrollPane scrollPane = new JScrollPane(table);
			    mainFrame.add(scrollPane, BorderLayout.PAGE_END);
			    if(FindTrains.inDirectExists)
			    {
			    	 JLabel found = new JLabel("1 or more indirect trains found!");
					 JPanel panel = new JPanel();
					
					 panel.add(found);
					 
					 mainFrame.add(panel);
			    }
			    }
		 
		  if(FindTrains.inDirectExists)
		 {
			 JLabel found = new JLabel("1 or more indirect trains found!");
			 JPanel panel = new JPanel();
			
			 panel.add(found);
			 
			 mainFrame.add(panel);
			 
		 }
		 else
		 {
			 JLabel nofound = new JLabel("Sorry, no trains found!");
			 JPanel panel = new JPanel();
			
			 panel.add(nofound);
			 
			 mainFrame.add(panel); 
		 }
		 
		
	}
}
