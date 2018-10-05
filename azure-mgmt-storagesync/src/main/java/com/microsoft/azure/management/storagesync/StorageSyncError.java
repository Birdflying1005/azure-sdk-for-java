/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error type.
 */
public class StorageSyncError {
    /**
     * Error details of the given entry.
     */
    @JsonProperty(value = "error")
    private StorageSyncApiError error;

    /**
     * Error details of the given entry.
     */
    @JsonProperty(value = "innererror")
    private StorageSyncApiError innererror;

    /**
     * Get error details of the given entry.
     *
     * @return the error value
     */
    public StorageSyncApiError error() {
        return this.error;
    }

    /**
     * Set error details of the given entry.
     *
     * @param error the error value to set
     * @return the StorageSyncError object itself.
     */
    public StorageSyncError withError(StorageSyncApiError error) {
        this.error = error;
        return this;
    }

    /**
     * Get error details of the given entry.
     *
     * @return the innererror value
     */
    public StorageSyncApiError innererror() {
        return this.innererror;
    }

    /**
     * Set error details of the given entry.
     *
     * @param innererror the innererror value to set
     * @return the StorageSyncError object itself.
     */
    public StorageSyncError withInnererror(StorageSyncApiError innererror) {
        this.innererror = innererror;
        return this;
    }

}
