/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Failover details for a replication protected item.
 */
public class FailoverReplicationProtectedItemDetails {
    /**
     * The name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The friendly name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * The test Vm name.
     */
    @JsonProperty(value = "testVmName")
    private String testVmName;

    /**
     * The test Vm friendly name.
     */
    @JsonProperty(value = "testVmFriendlyName")
    private String testVmFriendlyName;

    /**
     * The network connection status.
     */
    @JsonProperty(value = "networkConnectionStatus")
    private String networkConnectionStatus;

    /**
     * The network friendly name.
     */
    @JsonProperty(value = "networkFriendlyName")
    private String networkFriendlyName;

    /**
     * The network subnet.
     */
    @JsonProperty(value = "subnet")
    private String subnet;

    /**
     * The recovery point Id.
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /**
     * The recovery point time.
     */
    @JsonProperty(value = "recoveryPointTime")
    private DateTime recoveryPointTime;

    /**
     * Get the name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name.
     *
     * @param name the name value to set
     * @return the FailoverReplicationProtectedItemDetails object itself.
     */
    public FailoverReplicationProtectedItemDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the friendly name.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendly name.
     *
     * @param friendlyName the friendlyName value to set
     * @return the FailoverReplicationProtectedItemDetails object itself.
     */
    public FailoverReplicationProtectedItemDetails withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the test Vm name.
     *
     * @return the testVmName value
     */
    public String testVmName() {
        return this.testVmName;
    }

    /**
     * Set the test Vm name.
     *
     * @param testVmName the testVmName value to set
     * @return the FailoverReplicationProtectedItemDetails object itself.
     */
    public FailoverReplicationProtectedItemDetails withTestVmName(String testVmName) {
        this.testVmName = testVmName;
        return this;
    }

    /**
     * Get the test Vm friendly name.
     *
     * @return the testVmFriendlyName value
     */
    public String testVmFriendlyName() {
        return this.testVmFriendlyName;
    }

    /**
     * Set the test Vm friendly name.
     *
     * @param testVmFriendlyName the testVmFriendlyName value to set
     * @return the FailoverReplicationProtectedItemDetails object itself.
     */
    public FailoverReplicationProtectedItemDetails withTestVmFriendlyName(String testVmFriendlyName) {
        this.testVmFriendlyName = testVmFriendlyName;
        return this;
    }

    /**
     * Get the network connection status.
     *
     * @return the networkConnectionStatus value
     */
    public String networkConnectionStatus() {
        return this.networkConnectionStatus;
    }

    /**
     * Set the network connection status.
     *
     * @param networkConnectionStatus the networkConnectionStatus value to set
     * @return the FailoverReplicationProtectedItemDetails object itself.
     */
    public FailoverReplicationProtectedItemDetails withNetworkConnectionStatus(String networkConnectionStatus) {
        this.networkConnectionStatus = networkConnectionStatus;
        return this;
    }

    /**
     * Get the network friendly name.
     *
     * @return the networkFriendlyName value
     */
    public String networkFriendlyName() {
        return this.networkFriendlyName;
    }

    /**
     * Set the network friendly name.
     *
     * @param networkFriendlyName the networkFriendlyName value to set
     * @return the FailoverReplicationProtectedItemDetails object itself.
     */
    public FailoverReplicationProtectedItemDetails withNetworkFriendlyName(String networkFriendlyName) {
        this.networkFriendlyName = networkFriendlyName;
        return this;
    }

    /**
     * Get the network subnet.
     *
     * @return the subnet value
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Set the network subnet.
     *
     * @param subnet the subnet value to set
     * @return the FailoverReplicationProtectedItemDetails object itself.
     */
    public FailoverReplicationProtectedItemDetails withSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the recovery point Id.
     *
     * @return the recoveryPointId value
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recovery point Id.
     *
     * @param recoveryPointId the recoveryPointId value to set
     * @return the FailoverReplicationProtectedItemDetails object itself.
     */
    public FailoverReplicationProtectedItemDetails withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

    /**
     * Get the recovery point time.
     *
     * @return the recoveryPointTime value
     */
    public DateTime recoveryPointTime() {
        return this.recoveryPointTime;
    }

    /**
     * Set the recovery point time.
     *
     * @param recoveryPointTime the recoveryPointTime value to set
     * @return the FailoverReplicationProtectedItemDetails object itself.
     */
    public FailoverReplicationProtectedItemDetails withRecoveryPointTime(DateTime recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }

}
