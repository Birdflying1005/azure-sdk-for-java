/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource Type.
 */
public class ResourceType {
    /**
     * The resource type name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The resource type display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The resource type operations.
     */
    @JsonProperty(value = "operations")
    private List<ProviderOperation> operations;

    /**
     * Get the resource type name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the resource type name.
     *
     * @param name the name value to set
     * @return the ResourceType object itself.
     */
    public ResourceType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resource type display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the resource type display name.
     *
     * @param displayName the displayName value to set
     * @return the ResourceType object itself.
     */
    public ResourceType withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the resource type operations.
     *
     * @return the operations value
     */
    public List<ProviderOperation> operations() {
        return this.operations;
    }

    /**
     * Set the resource type operations.
     *
     * @param operations the operations value to set
     * @return the ResourceType object itself.
     */
    public ResourceType withOperations(List<ProviderOperation> operations) {
        this.operations = operations;
        return this;
    }

}
