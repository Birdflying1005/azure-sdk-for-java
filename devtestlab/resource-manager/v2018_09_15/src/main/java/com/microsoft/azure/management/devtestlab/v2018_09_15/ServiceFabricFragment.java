/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A Service Fabric.
 */
@JsonFlatten
public class ServiceFabricFragment extends UpdateResource {
    /**
     * The backing service fabric resource's id.
     */
    @JsonProperty(value = "properties.externalServiceFabricId")
    private String externalServiceFabricId;

    /**
     * The resource id of the environment under which the service fabric
     * resource is present.
     */
    @JsonProperty(value = "properties.environmentId")
    private String environmentId;

    /**
     * Get the backing service fabric resource's id.
     *
     * @return the externalServiceFabricId value
     */
    public String externalServiceFabricId() {
        return this.externalServiceFabricId;
    }

    /**
     * Set the backing service fabric resource's id.
     *
     * @param externalServiceFabricId the externalServiceFabricId value to set
     * @return the ServiceFabricFragment object itself.
     */
    public ServiceFabricFragment withExternalServiceFabricId(String externalServiceFabricId) {
        this.externalServiceFabricId = externalServiceFabricId;
        return this;
    }

    /**
     * Get the resource id of the environment under which the service fabric resource is present.
     *
     * @return the environmentId value
     */
    public String environmentId() {
        return this.environmentId;
    }

    /**
     * Set the resource id of the environment under which the service fabric resource is present.
     *
     * @param environmentId the environmentId value to set
     * @return the ServiceFabricFragment object itself.
     */
    public ServiceFabricFragment withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

}
