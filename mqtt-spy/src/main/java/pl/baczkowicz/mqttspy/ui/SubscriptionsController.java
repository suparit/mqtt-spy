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

import javafx.scene.control.TitledPane;
import pl.baczkowicz.mqttspy.ui.panes.TitledPaneController;
import pl.baczkowicz.mqttspy.ui.panes.TitledPaneStatus;

public class SubscriptionsController implements TitledPaneController
{
	/** Created pane status with index 3 (the last pane). */
	private final TitledPaneStatus paneStatus = new TitledPaneStatus(3);
	
	private TitledPane pane;
	
	@Override
	public TitledPane getTitledPane()
	{
		return pane;
	}

	@Override
	public void setTitledPane(TitledPane pane)
	{
		this.pane = pane;
	}

	@Override
	public TitledPaneStatus getTitledPaneStatus()
	{
		return paneStatus;
	}

}
