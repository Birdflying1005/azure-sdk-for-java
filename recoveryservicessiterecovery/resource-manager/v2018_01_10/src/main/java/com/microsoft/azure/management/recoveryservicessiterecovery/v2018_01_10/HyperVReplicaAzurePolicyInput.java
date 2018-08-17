/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Hyper-V Replica Azure specific input for creating a protection profile.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaAzure")
public class HyperVReplicaAzurePolicyInput extends PolicyProviderSpecificInput {
    /**
     * The duration (in hours) to which point the recovery history needs to be
     * maintained.
     */
    @JsonProperty(value = "recoveryPointHistoryDuration")
    private Integer recoveryPointHistoryDuration;

    /**
     * The interval (in hours) at which Hyper-V Replica should create an
     * application consistent snapshot within the VM.
     */
    @JsonProperty(value = "applicationConsistentSnapshotFrequencyInHours")
    private Integer applicationConsistentSnapshotFrequencyInHours;

    /**
     * The replication interval.
     */
    @JsonProperty(value = "replicationInterval")
    private Integer replicationInterval;

    /**
     * The scheduled start time for the initial replication. If this parameter
     * is Null, the initial replication starts immediately.
     */
    @JsonProperty(value = "onlineReplicationStartTime")
    private String onlineReplicationStartTime;

    /**
     * A value indicating whether encryption needs to be enabled for Vms in
     * this cloud.
     */
    @JsonProperty(value = "encryption")
    private String encryption;

    /**
     * The list of storage accounts to which the VMs in the primary cloud can
     * replicate to.
     */
    @JsonProperty(value = "storageAccounts")
    private List<String> storageAccounts;

    /**
     * Get the duration (in hours) to which point the recovery history needs to be maintained.
     *
     * @return the recoveryPointHistoryDuration value
     */
    public Integer recoveryPointHistoryDuration() {
        return this.recoveryPointHistoryDuration;
    }

    /**
     * Set the duration (in hours) to which point the recovery history needs to be maintained.
     *
     * @param recoveryPointHistoryDuration the recoveryPointHistoryDuration value to set
     * @return the HyperVReplicaAzurePolicyInput object itself.
     */
    public HyperVReplicaAzurePolicyInput withRecoveryPointHistoryDuration(Integer recoveryPointHistoryDuration) {
        this.recoveryPointHistoryDuration = recoveryPointHistoryDuration;
        return this;
    }

    /**
     * Get the interval (in hours) at which Hyper-V Replica should create an application consistent snapshot within the VM.
     *
     * @return the applicationConsistentSnapshotFrequencyInHours value
     */
    public Integer applicationConsistentSnapshotFrequencyInHours() {
        return this.applicationConsistentSnapshotFrequencyInHours;
    }

    /**
     * Set the interval (in hours) at which Hyper-V Replica should create an application consistent snapshot within the VM.
     *
     * @param applicationConsistentSnapshotFrequencyInHours the applicationConsistentSnapshotFrequencyInHours value to set
     * @return the HyperVReplicaAzurePolicyInput object itself.
     */
    public HyperVReplicaAzurePolicyInput withApplicationConsistentSnapshotFrequencyInHours(Integer applicationConsistentSnapshotFrequencyInHours) {
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        return this;
    }

    /**
     * Get the replication interval.
     *
     * @return the replicationInterval value
     */
    public Integer replicationInterval() {
        return this.replicationInterval;
    }

    /**
     * Set the replication interval.
     *
     * @param replicationInterval the replicationInterval value to set
     * @return the HyperVReplicaAzurePolicyInput object itself.
     */
    public HyperVReplicaAzurePolicyInput withReplicationInterval(Integer replicationInterval) {
        this.replicationInterval = replicationInterval;
        return this;
    }

    /**
     * Get the scheduled start time for the initial replication. If this parameter is Null, the initial replication starts immediately.
     *
     * @return the onlineReplicationStartTime value
     */
    public String onlineReplicationStartTime() {
        return this.onlineReplicationStartTime;
    }

    /**
     * Set the scheduled start time for the initial replication. If this parameter is Null, the initial replication starts immediately.
     *
     * @param onlineReplicationStartTime the onlineReplicationStartTime value to set
     * @return the HyperVReplicaAzurePolicyInput object itself.
     */
    public HyperVReplicaAzurePolicyInput withOnlineReplicationStartTime(String onlineReplicationStartTime) {
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        return this;
    }

    /**
     * Get a value indicating whether encryption needs to be enabled for Vms in this cloud.
     *
     * @return the encryption value
     */
    public String encryption() {
        return this.encryption;
    }

    /**
     * Set a value indicating whether encryption needs to be enabled for Vms in this cloud.
     *
     * @param encryption the encryption value to set
     * @return the HyperVReplicaAzurePolicyInput object itself.
     */
    public HyperVReplicaAzurePolicyInput withEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the list of storage accounts to which the VMs in the primary cloud can replicate to.
     *
     * @return the storageAccounts value
     */
    public List<String> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the list of storage accounts to which the VMs in the primary cloud can replicate to.
     *
     * @param storageAccounts the storageAccounts value to set
     * @return the HyperVReplicaAzurePolicyInput object itself.
     */
    public HyperVReplicaAzurePolicyInput withStorageAccounts(List<String> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

}
