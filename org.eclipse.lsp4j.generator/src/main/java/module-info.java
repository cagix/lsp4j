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

module org.eclipse.lsp4j.generator {

    requires com.google.common;
    requires com.google.gson;
    requires org.eclipse.xtend.lib.macro;
    requires org.eclipse.lsp4j.jsonrpc;

    exports org.eclipse.lsp4j.generator;
}
