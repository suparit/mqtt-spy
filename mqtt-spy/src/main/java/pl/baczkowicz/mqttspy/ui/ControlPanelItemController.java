/***********************************************************************************
 * 
 * Copyright (c) 2014 Kamil Baczkowicz
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 
 *    Kamil Baczkowicz - initial API and implementation and/or initial documentation
 *    
 */
package pl.baczkowicz.mqttspy.ui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.baczkowicz.mqttspy.configuration.ConfigurationManager;
import pl.baczkowicz.mqttspy.ui.controlpanel.ItemStatus;

/**
 * Controller for a single control panel item.
 */
public class ControlPanelItemController extends AnchorPane implements Initializable
{
	final static Logger logger = LoggerFactory.getLogger(ControlPanelItemController.class);

	@FXML
	private ImageView statusIcon;

	@FXML
	private VBox itemsBox;
	
	@FXML
	private Label titleText;
	
	@FXML
	private Label detailsText;
	
	@FXML
	private Button smallButton1;
	
	@FXML
	private FlowPane details;

	@FXML
	private Button smallButton2;

	@FXML
	private ProgressIndicator progressIndicator;
	
	private ItemStatus status = ItemStatus.ERROR;

	private ConfigurationManager configurationManager;
	
	private boolean showProgress;
		
	// ===============================
	// === Initialisation ============
	// ===============================


	public void initialize(URL location, ResourceBundle resources)
	{		
		//
	}	
	
	public void init()
	{
		//
	}
	
	public static void setButtonProperties(final Button button, final String imageLocation, final boolean visibility, final EventHandler<ActionEvent> action)
	{
		button.setVisible(true);
		button.setGraphic(new ImageView(new Image(ControlPanelItemController.class.getResource(imageLocation).toString())));
		button.setOnAction(action);
	}
	
	public static void setButtonProperties(final Button button, final String imageLocation, final boolean visibility)
	{
		button.setVisible(true);
		button.setGraphic(new ImageView(new Image(ControlPanelItemController.class.getResource(imageLocation).toString())));
	}
	
	public Button getButton1()	
	{
		return smallButton1;
	}
	
	public Button getButton2()	
	{
		return smallButton2;
	}
	
	public void refresh()
	{
		String imageLocation = "";
		switch (status)
		{
			case OK:
				imageLocation = "/images/dialog-ok-apply.png";
				break;
			case INFO:
				imageLocation = "/images/dialog-information.png";
				break;
			case WARN:
				imageLocation = "/images/dialog-warning.png";
				break;
			case ERROR:
				imageLocation = "/images/dialog-error.png";
				break;
			case STATS:
				imageLocation = "/images/stats.png";
				break;
			default:
				imageLocation = "/images/dialog-error.png";
				break;
		}
		
		if (showProgress)
		{
			progressIndicator.setVisible(true);
			statusIcon.setVisible(false);
		}
		else
		{
			progressIndicator.setVisible(false);
			statusIcon.setVisible(true);
			
			statusIcon.setImage(new Image(ControlPanelItemController.class.getResource(imageLocation).toString()));		
			if (status == ItemStatus.OK)
			{
				statusIcon.setLayoutY(5);
				statusIcon.setLayoutX(5);
				statusIcon.setFitHeight(64);
				statusIcon.setFitWidth(64);
			}
			else if (status == ItemStatus.STATS)
			{
				statusIcon.setLayoutY(20);
				statusIcon.setLayoutX(20);
				statusIcon.setFitHeight(55);
				statusIcon.setFitWidth(55);
			}
			else
			{
				statusIcon.setLayoutY(10);
				statusIcon.setLayoutX(10);
				statusIcon.setFitHeight(64);
				statusIcon.setFitWidth(64);
			}
		}
	}

	// ===============================
	// === FXML ======================
	// ===============================

	// ===============================
	// === Logic =====================
	// ===============================

	// ===============================
	// === Setters and getters =======
	// ===============================
	
	public boolean isShowProgress()
	{
		return showProgress;
	}

	public void setShowProgress(boolean showProgress)
	{
		this.showProgress = showProgress;
	}

	public void setValues(final ItemStatus status, final String title, final String details)
	{
		this.status = status;		
		this.titleText.setText(title);
		this.detailsText.setText(details);
	}
	
	public void setStatus(final ItemStatus status)
	{
		this.status = status;
	}
	
	public String replaceTokens(final String value)
	{
		return value.replace("[newline]", System.lineSeparator()).replace("[version]", configurationManager.getDefaultPropertyFile().getFullVersionName());
	}
	
	public void setTitle(final String title)
	{
		this.titleText.setText(replaceTokens(title));
	}
	
	public void setDetails(final String details)
	{
		this.detailsText.setText(replaceTokens(details));
	}
	
	public VBox getCustomItems()
	{
		return this.itemsBox;
	}	
	
	public void setConfigurationMananger(final ConfigurationManager configurationManager)
	{
		this.configurationManager = configurationManager;
	}
	
	public FlowPane getDetails()
	{
		return details;
	}
}
