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
 * Current scenario details of the protected entity.
 */
public class CurrentScenarioDetails {
    /**
     * Scenario name.
     */
    @JsonProperty(value = "scenarioName")
    private String scenarioName;

    /**
     * ARM Id of the job being executed.
     */
    @JsonProperty(value = "jobId")
    private String jobId;

    /**
     * Start time of the workflow.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * Get scenario name.
     *
     * @return the scenarioName value
     */
    public String scenarioName() {
        return this.scenarioName;
    }

    /**
     * Set scenario name.
     *
     * @param scenarioName the scenarioName value to set
     * @return the CurrentScenarioDetails object itself.
     */
    public CurrentScenarioDetails withScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
        return this;
    }

    /**
     * Get aRM Id of the job being executed.
     *
     * @return the jobId value
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Set aRM Id of the job being executed.
     *
     * @param jobId the jobId value to set
     * @return the CurrentScenarioDetails object itself.
     */
    public CurrentScenarioDetails withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get start time of the workflow.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set start time of the workflow.
     *
     * @param startTime the startTime value to set
     * @return the CurrentScenarioDetails object itself.
     */
    public CurrentScenarioDetails withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

}
