/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The hardware profile.
 */
public class HardwareProfile {
    /**
     * The size of the VM.
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /**
     * Get the size of the VM.
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the size of the VM.
     *
     * @param vmSize the vmSize value to set
     * @return the HardwareProfile object itself.
     */
    public HardwareProfile withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

}
