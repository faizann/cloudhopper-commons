/**
 * Copyright (C) 2011 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.cloudhopper.commons.util.windowing;

/**
 *
 * @author joelauer
 */
public class WindowEntryWrapper<K,R,P> implements WindowEntry<K,R,P> {

    protected final DefaultWindowEntry<K,R,P> entry;

    protected WindowEntryWrapper(DefaultWindowEntry<K,R,P> entry) {
        this.entry = entry;
    }

    @Override
    public int getCallerStatus() {
        return this.entry.getCallerStatus();
    }

    @Override
    public K getKey() {
        return this.entry.getKey();
    }

    @Override
    public R getRequest() {
        return this.entry.getRequest();
    }

    @Override
    public P getResponse() {
        return this.entry.getResponse();
    }

    @Override
    public long getRequestTime() {
        return this.entry.getRequestTime();
    }
    
    @Override
    public long getExpiryTime() {
        return this.entry.getExpiryTime();
    }
    
    @Override
    public boolean hasExpiryTime() {
        return this.entry.hasExpiryTime();
    }

    @Override
    public long getResponseTime() {
        return this.entry.getResponseTime();
    }

    @Override
    public boolean isFinished() {
        return this.entry.isFinished();
    }

    @Override
    public long getProcessingTime() {
        return this.entry.getProcessingTime();
    }

    @Override
    public boolean isSuccess() {
        return this.entry.isSuccess();
    }

    @Override
    public boolean isCancelled() {
        return this.entry.isCancelled();
    }

    @Override
    public Throwable getCause() {
        return this.entry.getCause();
    }

}