/********************************************************************************
 * Copyright (c) Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: (EPL-2.0 OR Apache-2.0)
 ********************************************************************************/

package org.eclipse.transformer.action.impl;

import java.nio.ByteBuffer;

import org.eclipse.transformer.action.InputBuffer;

/**
 * Thread-local byte buffer holder. The initial value is a byte buffer with
 * {@link #BUFFER_SIZE} bytes. {@link #getInputBuffer()} and
 * {@link #setInputBuffer(ByteBuffer)} correspond to the usual thread-local
 * {@link ThreadLocal#get()} and {@link ThreadLocal#set(Object)}.
 */
public class InputBufferImpl implements InputBuffer {
	/** Usual disk page size. */
	private static final int	PAGE_SIZE	= 4096;

	/** Initial size of byte buffer instances. */
	private static final int	BUFFER_SIZE	= PAGE_SIZE * 16;

	private final ThreadLocal<ByteBuffer>	inputBuffer;

	public InputBufferImpl() {
		inputBuffer = ThreadLocal.withInitial(() -> ByteBuffer.allocate(BUFFER_SIZE));
	}

	@Override
	public ByteBuffer getInputBuffer() {
		return inputBuffer.get();
	}

	@Override
	public void setInputBuffer(ByteBuffer buffer) {
		inputBuffer.set(buffer);
	}
}
