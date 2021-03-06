/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MabServerType.
 */
public final class MabServerType extends ExpandableStringEnum<MabServerType> {
    /** Static value Invalid for MabServerType. */
    public static final MabServerType INVALID = fromString("Invalid");

    /** Static value Unknown for MabServerType. */
    public static final MabServerType UNKNOWN = fromString("Unknown");

    /** Static value IaasVMContainer for MabServerType. */
    public static final MabServerType IAAS_VMCONTAINER = fromString("IaasVMContainer");

    /** Static value IaasVMServiceContainer for MabServerType. */
    public static final MabServerType IAAS_VMSERVICE_CONTAINER = fromString("IaasVMServiceContainer");

    /** Static value DPMContainer for MabServerType. */
    public static final MabServerType DPMCONTAINER = fromString("DPMContainer");

    /** Static value AzureBackupServerContainer for MabServerType. */
    public static final MabServerType AZURE_BACKUP_SERVER_CONTAINER = fromString("AzureBackupServerContainer");

    /** Static value MABContainer for MabServerType. */
    public static final MabServerType MABCONTAINER = fromString("MABContainer");

    /** Static value Cluster for MabServerType. */
    public static final MabServerType CLUSTER = fromString("Cluster");

    /** Static value AzureSqlContainer for MabServerType. */
    public static final MabServerType AZURE_SQL_CONTAINER = fromString("AzureSqlContainer");

    /** Static value Windows for MabServerType. */
    public static final MabServerType WINDOWS = fromString("Windows");

    /** Static value VCenter for MabServerType. */
    public static final MabServerType VCENTER = fromString("VCenter");

    /** Static value VMAppContainer for MabServerType. */
    public static final MabServerType VMAPP_CONTAINER = fromString("VMAppContainer");

    /** Static value SQLAGWorkLoadContainer for MabServerType. */
    public static final MabServerType SQLAGWORK_LOAD_CONTAINER = fromString("SQLAGWorkLoadContainer");

    /** Static value StorageContainer for MabServerType. */
    public static final MabServerType STORAGE_CONTAINER = fromString("StorageContainer");

    /** Static value GenericContainer for MabServerType. */
    public static final MabServerType GENERIC_CONTAINER = fromString("GenericContainer");

    /** Static value SqlCluster for MabServerType. */
    public static final MabServerType SQL_CLUSTER = fromString("SqlCluster");

    /** Static value ExchangeDAG for MabServerType. */
    public static final MabServerType EXCHANGE_DAG = fromString("ExchangeDAG");

    /** Static value SharepointFarm for MabServerType. */
    public static final MabServerType SHAREPOINT_FARM = fromString("SharepointFarm");

    /** Static value HyperVCluster for MabServerType. */
    public static final MabServerType HYPER_VCLUSTER = fromString("HyperVCluster");

    /** Static value WindowsClient for MabServerType. */
    public static final MabServerType WINDOWS_CLIENT = fromString("WindowsClient");

    /**
     * Creates or finds a MabServerType from its string representation.
     * @param name a name to look for
     * @return the corresponding MabServerType
     */
    @JsonCreator
    public static MabServerType fromString(String name) {
        return fromString(name, MabServerType.class);
    }

    /**
     * @return known MabServerType values
     */
    public static Collection<MabServerType> values() {
        return values(MabServerType.class);
    }
}
