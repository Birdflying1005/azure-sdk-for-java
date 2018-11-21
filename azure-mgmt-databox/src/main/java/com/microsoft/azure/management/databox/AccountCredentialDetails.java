/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Credential details of the account.
 */
public class AccountCredentialDetails {
    /**
     * Name of the account.
     */
    @JsonProperty(value = "accountName", access = JsonProperty.Access.WRITE_ONLY)
    private String accountName;

    /**
     * Connection string of the account endpoint to use the account as a
     * storage endpoint on the device.
     */
    @JsonProperty(value = "accountConnectionString", access = JsonProperty.Access.WRITE_ONLY)
    private String accountConnectionString;

    /**
     * Per share level unencrypted access credentials.
     */
    @JsonProperty(value = "shareCredentialDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<ShareCredentialDetails> shareCredentialDetails;

    /**
     * Get name of the account.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Get connection string of the account endpoint to use the account as a storage endpoint on the device.
     *
     * @return the accountConnectionString value
     */
    public String accountConnectionString() {
        return this.accountConnectionString;
    }

    /**
     * Get per share level unencrypted access credentials.
     *
     * @return the shareCredentialDetails value
     */
    public List<ShareCredentialDetails> shareCredentialDetails() {
        return this.shareCredentialDetails;
    }

}