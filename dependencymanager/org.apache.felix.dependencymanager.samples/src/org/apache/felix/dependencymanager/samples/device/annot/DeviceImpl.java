/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.dependencymanager.samples.device.annot;

import java.util.Dictionary;

import org.apache.felix.dm.annotation.api.Component;

/**
 * @author <a href="mailto:dev@felix.apache.org">Felix Project Team</a>
 */
@Component(factoryName = "Device", factoryConfigure = "configure")
public class DeviceImpl implements Device {
    int id;

    void configure(Dictionary<String, Object> configuration) {
        this.id = (Integer) configuration.get("device.id");
    }

    @Override
    public int getDeviceId() {
        return id;
    }
    
    
    @Override
    public String toString() {
        return "Device #" + id;
    }
}
