/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Storage account information.
 */
public class StorageAccountInfo {
    /**
     * Gets or sets the account name associated with the Azure storage account.
     */
    @JsonProperty(required = true)
    private String name;

    /**
     * Gets or sets the properties associated with this storage account.
     */
    @JsonProperty(required = true)
    private StorageAccountProperties properties;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public StorageAccountProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     */
    public void setProperties(StorageAccountProperties properties) {
        this.properties = properties;
    }

}