/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.lsp4j.jsonrpc.messages;

import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * A notification message. A processed notification message must not send a
 * response back. They work like events.
 */
public class NotificationMessage extends Message {

	/**
	 * The method to be invoked.
	 */
	@NonNull
	private String method;

	@NonNull
	public String getMethod() {
		return this.method;
	}

	public void setMethod(@NonNull String method) {
		this.method = method;
	}

	/**
	 * The method's params.
	 */
	private Object params;

	public Object getParams() {
		return this.params;
	}

	public void setParams(Object params) {
		this.params = params;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (!super.equals(obj))
			return false;
		NotificationMessage other = (NotificationMessage) obj;
		if (this.method == null) {
			if (other.method != null)
				return false;
		} else if (!this.method.equals(other.method))
			return false;
		if (this.params == null) {
			if (other.params != null)
				return false;
		} else if (!this.params.equals(other.params))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.method == null) ? 0 : this.method.hashCode());
		result = prime * result + ((this.params == null) ? 0 : this.params.hashCode());
		return result;
	}

}
