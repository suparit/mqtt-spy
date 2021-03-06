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
package pl.baczkowicz.mqttspy.scripts;

import java.io.File;
import java.util.Date;
import java.util.concurrent.Executor;

import javax.script.ScriptEngine;

import pl.baczkowicz.mqttspy.scripts.io.ScriptIO;

/**
 * This class represents a JS script run with the Nashorn engine.
 */
public class Script extends BasicScriptProperties
{	
	/** The running state of the script. */
	private ScriptRunningState status;
	
	/** Number of messages published by the script. */
	private long messagesPublished;

	/** Timestamp of the last publication. */
	private Date lastPublished;
	
	/** The associated script file. */
	private File scriptFile;
	
	/** Definition of the in-line script. */
	private String scriptContent;
	
	/** Script engine instance. */
	private ScriptEngine scriptEngine;

	/** The publication script IO. */
	private ScriptIO scriptIO;
	
	/** The script runner - dedicated runnable for that script. */
	private ScriptRunner scriptRunner;
	
	/** Observer of any changes to script's properties. */
	private ScriptChangeObserver observer;

	/**
	 * Creates a script.
	 */
	public Script()
	{
		// Default
	}
	
	/**
	 * Creates a script runner for the script if it doesn't exist yet.
	 * 
	 * @param eventManager The event manager to use
	 * @param executor The executor to use
	 */
	public void createScriptRunner(final IScriptEventManager eventManager, final Executor executor)
	{
		if (scriptRunner == null)
		{
			this.scriptRunner = new ScriptRunner(eventManager, this, executor);
		}
	}
	
	/**
	 * Notifies an observer a change has occurred.
	 */
	protected void nofityChange()
	{
		if (observer != null)
		{
			observer.onChange();
		}
	}

	// ===============================
	// === Setters and getters =======
	// ===============================
	
	public void setMessagesPublished(final long messageCount)
	{
		this.messagesPublished = messageCount;		
		nofityChange();
	}
	
	public void setLastPublished(final Date lastPublishedDate)
	{
		this.lastPublished = lastPublishedDate;
		nofityChange();
	}
	
	public void setStatus(final ScriptRunningState status)
	{
		this.status = status;
		nofityChange();
	}
	
	public Date getLastPublishedDate()
	{
		return lastPublished;
	}

	public long getMessagesPublished()
	{
		return messagesPublished;
	}
	
	public File getScriptFile()
	{
		return this.scriptFile;
	}

	public ScriptEngine getScriptEngine()
	{
		return scriptEngine;
	}

	public ScriptRunningState getStatus()
	{
		return status;
	}

	public void setPublicationScriptIO(ScriptIO publicationScriptIO)
	{
		this.scriptIO = publicationScriptIO;
	}
	
	public ScriptIO getPublicationScriptIO()
	{
		return scriptIO;
	}

	public void setScriptEngine(final ScriptEngine scriptEngine)
	{
		this.scriptEngine = scriptEngine;
	}

	public void setScriptFile(final File scriptFile)
	{
		this.scriptFile = scriptFile;
	}

	public ScriptRunner getScriptRunner()
	{
		return this.scriptRunner;
	}

	/**
	 * Gets the script content.
	 * 
	 * @return the scriptContent
	 */
	public String getScriptContent()
	{
		return scriptContent;
	}

	/**
	 * Sets the script content.
	 *  
	 * @param scriptContent the scriptContent to set
	 */
	public void setScriptContent(final String scriptContent)
	{
		this.scriptContent = scriptContent;
	}
	
	public static String getScriptIdFromFile(final File file)
	{
		return file.getAbsolutePath();
	}
	
	public String getScriptId()
	{
		if (scriptFile == null)
		{
			return null;
		}
		
		return getScriptIdFromFile(scriptFile);
	}

	/**
	 * Sets the observer of the script properties.
	 * 
	 * @param observer the observer to set
	 */
	public void setObserver(ScriptChangeObserver observer)
	{
		this.observer = observer;
	}
}
