/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents health evaluation for services of a certain service type
 * belonging to an application, containing health evaluations for each
 * unhealthy service that impacted current aggregated health state. Can be
 * returned when evaluating application health and the aggregated health state
 * is either Error or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Services")
public class ServicesHealthEvaluation extends HealthEvaluation {
    /**
     * Name of the service type of the services.
     */
    @JsonProperty(value = "ServiceTypeName")
    private String serviceTypeName;

    /**
     * Maximum allowed percentage of unhealthy services from the
     * ServiceTypeHealthPolicy.
     */
    @JsonProperty(value = "MaxPercentUnhealthyServices")
    private Integer maxPercentUnhealthyServices;

    /**
     * Total number of services of the current service type in the application
     * from the health store.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /**
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ServiceHealthEvaluation that impacted the
     * aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get name of the service type of the services.
     *
     * @return the serviceTypeName value
     */
    public String serviceTypeName() {
        return this.serviceTypeName;
    }

    /**
     * Set name of the service type of the services.
     *
     * @param serviceTypeName the serviceTypeName value to set
     * @return the ServicesHealthEvaluation object itself.
     */
    public ServicesHealthEvaluation withServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * Get maximum allowed percentage of unhealthy services from the ServiceTypeHealthPolicy.
     *
     * @return the maxPercentUnhealthyServices value
     */
    public Integer maxPercentUnhealthyServices() {
        return this.maxPercentUnhealthyServices;
    }

    /**
     * Set maximum allowed percentage of unhealthy services from the ServiceTypeHealthPolicy.
     *
     * @param maxPercentUnhealthyServices the maxPercentUnhealthyServices value to set
     * @return the ServicesHealthEvaluation object itself.
     */
    public ServicesHealthEvaluation withMaxPercentUnhealthyServices(Integer maxPercentUnhealthyServices) {
        this.maxPercentUnhealthyServices = maxPercentUnhealthyServices;
        return this;
    }

    /**
     * Get total number of services of the current service type in the application from the health store.
     *
     * @return the totalCount value
     */
    public Long totalCount() {
        return this.totalCount;
    }

    /**
     * Set total number of services of the current service type in the application from the health store.
     *
     * @param totalCount the totalCount value to set
     * @return the ServicesHealthEvaluation object itself.
     */
    public ServicesHealthEvaluation withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get list of unhealthy evaluations that led to the aggregated health state. Includes all the unhealthy ServiceHealthEvaluation that impacted the aggregated health.
     *
     * @return the unhealthyEvaluations value
     */
    public List<HealthEvaluationWrapper> unhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set list of unhealthy evaluations that led to the aggregated health state. Includes all the unhealthy ServiceHealthEvaluation that impacted the aggregated health.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set
     * @return the ServicesHealthEvaluation object itself.
     */
    public ServicesHealthEvaluation withUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }

}