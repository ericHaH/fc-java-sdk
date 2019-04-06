/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyuncs.fc.model;

import com.google.gson.annotations.SerializedName;

public class ProvisionConfig {
    @SerializedName("resource")
    private String resource;

    @SerializedName("target")
    private Integer target;

    @SerializedName("current")
    private Integer current;

    public ProvisionConfig(String resource, Integer target, Integer current) {
        this.resource = resource;
        this.target = target;
        this.current = current;
    }

    public String getResource() {
        return resource;
    }

    public ProvisionConfig setResource(String resource) {
        this.resource = resource;
        return this;
    }

    public Integer getTarget() {
        return target;
    }

    public ProvisionConfig setTarget(Integer target) {
        this.target = target;
        return this;
    }

    public Integer getCurrent() {
        return current;
    }

    public ProvisionConfig setCurrent(Integer current) {
        this.current = current;
        return this;
    }
}