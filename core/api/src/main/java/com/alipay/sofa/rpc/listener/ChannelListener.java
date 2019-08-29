/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.rpc.listener;

import com.alipay.sofa.rpc.common.annotation.Unstable;
import com.alipay.sofa.rpc.transport.AbstractChannel;

/**
 * Listener of channel event
 *
 * @author <a href=mailto:zhanggeng.zg@antfin.com>GengZhang</a>
 */
// TODO: 2018/12/27 by zmyer
@Unstable
public interface ChannelListener {

    /**
     * Handle connect event on channel active
     *
     * @param channel Channel
     */
    void onConnected(AbstractChannel channel);

    /**
     * Handle disconnect event on channel closed
     *
     * @param channel Channel
     */
    void onDisconnected(AbstractChannel channel);
}
