/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2018_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties supplied for Subnet.
 */
public class Subnet {
    /**
     * Resource ID of Virtual Network Subnet.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get resource ID of Virtual Network Subnet.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID of Virtual Network Subnet.
     *
     * @param id the id value to set
     * @return the Subnet object itself.
     */
    public Subnet withId(String id) {
        this.id = id;
        return this;
    }

}
