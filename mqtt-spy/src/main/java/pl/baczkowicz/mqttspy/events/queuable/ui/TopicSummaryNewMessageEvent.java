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
package pl.baczkowicz.mqttspy.events.queuable.ui;

import pl.baczkowicz.mqttspy.storage.MessageListWithObservableTopicSummary;
import pl.baczkowicz.mqttspy.storage.UiMqttMessage;

public class TopicSummaryNewMessageEvent implements MqttSpyUIEvent
{
	private final UiMqttMessage added;
	
	private final boolean showTopic;

	private final MessageListWithObservableTopicSummary list;

	public TopicSummaryNewMessageEvent(final MessageListWithObservableTopicSummary list, final UiMqttMessage added, final boolean showTopic)
	{
		this.list = list;
		this.added = added;
		this.showTopic = showTopic;
	}
	
	public UiMqttMessage getAdded()
	{
		return added;
	}

	public boolean isShowTopic()
	{
		return showTopic;
	}

	public MessageListWithObservableTopicSummary getList()
	{
		return list;
	}
}
