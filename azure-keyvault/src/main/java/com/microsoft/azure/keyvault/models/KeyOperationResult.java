/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import com.microsoft.rest.Base64Url;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The key operation result.
 */
public class KeyOperationResult {
    /**
     * Key identifier.
     */
    @JsonProperty(value = "kid", access = JsonProperty.Access.WRITE_ONLY)
    private String kid;

    /**
     * The result property.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private Base64Url result;

    /**
     * Get the kid value.
     *
     * @return the kid value
     */
    public String kid() {
        return this.kid;
    }

    /**
     * Get the result value.
     *
     * @return the result value
     */
    public byte[] result() {
        if (this.result == null) {
            return null;
        }
        return this.result.decodedBytes();
    }

}
