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
 * The certificate management attributes.
 */
public class CertificateAttributes extends Attributes {
    /**
     * Reflects the deletion recovery level currently in effect for
     * certificates in the current vault. If it contains 'Purgeable', the
     * certificate can be permanently deleted by a privileged user; otherwise,
     * only the system can purge the certificate, at the end of the retention
     * interval. Possible values include: 'Purgeable', 'Recoverable+Purgeable',
     * 'Recoverable', 'Recoverable+ProtectedSubscription'.
     */
    @JsonProperty(value = "recoveryLevel", access = JsonProperty.Access.WRITE_ONLY)
    private DeletionRecoveryLevel recoveryLevel;

    /**
     * Get the recoveryLevel value.
     *
     * @return the recoveryLevel value
     */
    public DeletionRecoveryLevel recoveryLevel() {
        return this.recoveryLevel;
    }

}
