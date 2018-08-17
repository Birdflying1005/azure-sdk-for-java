/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Input details specific to fabrics during Network Mapping.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("FabricSpecificUpdateNetworkMappingInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureToAzure", value = AzureToAzureUpdateNetworkMappingInput.class),
    @JsonSubTypes.Type(name = "VmmToAzure", value = VmmToAzureUpdateNetworkMappingInput.class),
    @JsonSubTypes.Type(name = "VmmToVmm", value = VmmToVmmUpdateNetworkMappingInput.class)
})
public class FabricSpecificUpdateNetworkMappingInput {
}
