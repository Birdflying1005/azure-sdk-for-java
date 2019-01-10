/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AS2 agreement error settings.
 */
public class AS2ErrorSettings {
    /**
     * The value indicating whether to suspend duplicate message.
     */
    @JsonProperty(value = "suspendDuplicateMessage", required = true)
    private boolean suspendDuplicateMessage;

    /**
     * The value indicating whether to resend message If MDN is not received.
     */
    @JsonProperty(value = "resendIfMDNNotReceived", required = true)
    private boolean resendIfMDNNotReceived;

    /**
     * Get the value indicating whether to suspend duplicate message.
     *
     * @return the suspendDuplicateMessage value
     */
    public boolean suspendDuplicateMessage() {
        return this.suspendDuplicateMessage;
    }

    /**
     * Set the value indicating whether to suspend duplicate message.
     *
     * @param suspendDuplicateMessage the suspendDuplicateMessage value to set
     * @return the AS2ErrorSettings object itself.
     */
    public AS2ErrorSettings withSuspendDuplicateMessage(boolean suspendDuplicateMessage) {
        this.suspendDuplicateMessage = suspendDuplicateMessage;
        return this;
    }

    /**
     * Get the value indicating whether to resend message If MDN is not received.
     *
     * @return the resendIfMDNNotReceived value
     */
    public boolean resendIfMDNNotReceived() {
        return this.resendIfMDNNotReceived;
    }

    /**
     * Set the value indicating whether to resend message If MDN is not received.
     *
     * @param resendIfMDNNotReceived the resendIfMDNNotReceived value to set
     * @return the AS2ErrorSettings object itself.
     */
    public AS2ErrorSettings withResendIfMDNNotReceived(boolean resendIfMDNNotReceived) {
        this.resendIfMDNNotReceived = resendIfMDNNotReceived;
        return this;
    }

}
