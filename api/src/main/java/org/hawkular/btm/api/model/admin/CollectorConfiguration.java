/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hawkular.btm.api.model.admin;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * This is the top level configuration object used to define how information should
 * be collected from a business transaction execution environment.
 *
 * @author gbrown
 */
public class CollectorConfiguration {

    @JsonInclude
    private Map<String,Instrumentation> instrumentation = new HashMap<String,Instrumentation>();

    /**
     * @return the instrumentation
     */
    public Map<String,Instrumentation> getInstrumentation() {
        return instrumentation;
    }

    /**
     * @param instrumentation the instrumentation to set
     */
    public void setInstrumentation(Map<String,Instrumentation> instrumentation) {
        this.instrumentation = instrumentation;
    }

}