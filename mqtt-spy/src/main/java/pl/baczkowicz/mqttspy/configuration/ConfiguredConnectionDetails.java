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
package pl.baczkowicz.mqttspy.configuration;

import pl.baczkowicz.mqttspy.configuration.generated.UserInterfaceMqttConnectionDetails;

public class ConfiguredConnectionDetails extends UserInterfaceMqttConnectionDetails
{
	private int id;
	
	private boolean modified;

	private boolean created;
	
	private boolean deleted;

	private boolean newConnection;
	
	private boolean valid;

	private UserInterfaceMqttConnectionDetails lastSavedValues;

	public ConfiguredConnectionDetails()
	{
		// Default constructor
	}
	
	public ConfiguredConnectionDetails(final int id, final boolean created, final boolean newConnection,
			final boolean modified, final UserInterfaceMqttConnectionDetails connectionDetails)
	{
		this.id = id;
		this.modified = modified;
		this.created = created;
		this.newConnection = newConnection;
		this.lastSavedValues = connectionDetails;

		setConnectionDetails(connectionDetails);
	}

	public void setConnectionDetails(final UserInterfaceMqttConnectionDetails connectionDetails)
	{
		if (connectionDetails != null)
		{
			connectionDetails.copyTo(this);
		}
	}

	public boolean isModified()
	{
		return modified;
	}

	public void setModified(boolean modified)
	{
		this.modified = modified;
	}

	public boolean isBeingCreated()
	{
		return created;
	}

	public void setBeingCreated(boolean created)
	{
		this.created = created;
	}

	public UserInterfaceMqttConnectionDetails getSavedValues()
	{
		return lastSavedValues;
	}

	public void setSavedValues(UserInterfaceMqttConnectionDetails savedValues)
	{
		this.lastSavedValues = savedValues;
	}

	public boolean isNewConnection()
	{
		return newConnection;
	}

	public void setNewConnection(boolean newConnection)
	{
		this.newConnection = newConnection;
	}

	public boolean isValid()
	{
		return valid;
	}

	public void setValid(boolean valid)
	{
		this.valid = valid;
	}
	
	public void undo()
	{
		setConnectionDetails(lastSavedValues);
		modified = newConnection;
	}

	public void apply()
	{
		setSavedValues(new ConfiguredConnectionDetails(id, false, false, false, this));
		created = false;
		newConnection = false;
		modified = false;
	}

	public boolean isDeleted()
	{
		return deleted;
	}

	public void setDeleted(boolean deleted)
	{
		this.deleted = deleted;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
}
