/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resume job params.
 */
public class ResumeJobParams {
    /**
     * Resume job properties.
     */
    @JsonProperty(value = "properties")
    private ResumeJobParamsProperties properties;

    /**
     * Get resume job properties.
     *
     * @return the properties value
     */
    public ResumeJobParamsProperties properties() {
        return this.properties;
    }

    /**
     * Set resume job properties.
     *
     * @param properties the properties value to set
     * @return the ResumeJobParams object itself.
     */
    public ResumeJobParams withProperties(ResumeJobParamsProperties properties) {
        this.properties = properties;
        return this;
    }

}
