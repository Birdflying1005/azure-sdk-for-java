/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Table properties.
 */
public class DatabaseTable {
    /**
     * Indicates whether table is empty or not.
     */
    @JsonProperty(value = "hasRows", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasRows;

    /**
     * Schema-qualified name of the table.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Get indicates whether table is empty or not.
     *
     * @return the hasRows value
     */
    public Boolean hasRows() {
        return this.hasRows;
    }

    /**
     * Get schema-qualified name of the table.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

}
