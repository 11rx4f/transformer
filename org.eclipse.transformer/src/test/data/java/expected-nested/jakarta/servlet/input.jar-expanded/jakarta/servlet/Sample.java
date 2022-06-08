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

package jakarta.servlet;

import jakarta.servlet.Sample_Annotation;
import jakarta.servlet.data.Sample_StringConstant;

@Sample_Annotation(
	value1 = "jakarta.servlet.Servlet",
	value2 = "jakarta.servlet.Servlet=MyServlet,jakarta.servlet.Listener=MyListener")
public class Sample {
	public static final jakarta.servlet.Servlet	sampleServlet = null;
	public static final String SAMPLE_CLASS_NAME = "jakarta.servlet.Servlet";
	public static final String SAMPLE_STRING = "jakarta.servlet.Servlet=MyServlet,jakarta.servlet.Listener=MyListener";
	public static final String SAMPLE_STRING_REFERENCE = Sample_StringConstant.value;
}