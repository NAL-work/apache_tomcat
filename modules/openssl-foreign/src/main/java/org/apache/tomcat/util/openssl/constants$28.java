/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$28 {

    static final FunctionDescriptor d2i_OCSP_RESPONSE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle d2i_OCSP_RESPONSE$MH = RuntimeHelper.downcallHandle(
        "d2i_OCSP_RESPONSE",
        constants$28.d2i_OCSP_RESPONSE$FUNC
    );
    static final FunctionDescriptor OCSP_CERTID_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OCSP_CERTID_free$MH = RuntimeHelper.downcallHandle(
        "OCSP_CERTID_free",
        constants$28.OCSP_CERTID_free$FUNC
    );
    static final FunctionDescriptor OCSP_REQUEST_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle OCSP_REQUEST_new$MH = RuntimeHelper.downcallHandle(
        "OCSP_REQUEST_new",
        constants$28.OCSP_REQUEST_new$FUNC
    );
    static final FunctionDescriptor OCSP_REQUEST_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OCSP_REQUEST_free$MH = RuntimeHelper.downcallHandle(
        "OCSP_REQUEST_free",
        constants$28.OCSP_REQUEST_free$FUNC
    );
    static final FunctionDescriptor i2d_OCSP_REQUEST$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle i2d_OCSP_REQUEST$MH = RuntimeHelper.downcallHandle(
        "i2d_OCSP_REQUEST",
        constants$28.i2d_OCSP_REQUEST$FUNC
    );
    static final FunctionDescriptor OSSL_PROVIDER_get0_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OSSL_PROVIDER_get0_name$MH = RuntimeHelper.downcallHandle(
        "OSSL_PROVIDER_get0_name",
        constants$28.OSSL_PROVIDER_get0_name$FUNC
    );
}

