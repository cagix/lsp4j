/******************************************************************************
 * Copyright (c) 2024 Thiago Henrique Hupner and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 ******************************************************************************/

module org.eclipse.lsp4j.jsonrpc {

    requires java.logging;
    requires com.google.gson;

    exports org.eclipse.lsp4j.jsonrpc;
    exports org.eclipse.lsp4j.jsonrpc.json;
    exports org.eclipse.lsp4j.jsonrpc.json.adapters;
    exports org.eclipse.lsp4j.jsonrpc.messages;
    exports org.eclipse.lsp4j.jsonrpc.services;
    exports org.eclipse.lsp4j.jsonrpc.util;
    exports org.eclipse.lsp4j.jsonrpc.validation;
}
