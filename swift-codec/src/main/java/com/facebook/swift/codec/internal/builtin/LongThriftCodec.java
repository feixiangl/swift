/*
 * Copyright (C) 2012 Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.swift.codec.internal.builtin;

import com.facebook.swift.codec.ThriftCodec;
import com.facebook.swift.codec.metadata.ThriftType;
import com.google.common.base.Preconditions;
import org.apache.thrift.protocol.TProtocol;




public class LongThriftCodec implements ThriftCodec<Long>
{
    @Override
    public ThriftType getType()
    {
        return ThriftType.I64;
    }

    @Override
    public Long read(TProtocol protocol)
            throws Exception
    {
        Preconditions.checkNotNull(protocol, "protocol is null");
        return protocol.readI64();
    }

    @Override
    public void write(Long value, TProtocol protocol)
            throws Exception
    {
        Preconditions.checkNotNull(value, "value is null");
        Preconditions.checkNotNull(protocol, "protocol is null");
        protocol.writeI64(value);
    }
}
