/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The certificate issuer item containing certificate issuer metadata.
 */
public class CertificateIssuerItem {
    /**
     * Certificate Identifier.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The issuer provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the CertificateIssuerItem object itself.
     */
    public CertificateIssuerItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the provider value.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider value.
     *
     * @param provider the provider value to set
     * @return the CertificateIssuerItem object itself.
     */
    public CertificateIssuerItem withProvider(String provider) {
        this.provider = provider;
        return this;
    }

}
