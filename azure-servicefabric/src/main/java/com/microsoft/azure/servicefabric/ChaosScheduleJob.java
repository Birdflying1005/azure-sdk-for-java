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

/**
 * Defines a repetition rule and parameters of Chaos to be used with the Chaos
 * Schedule.
 */
public class ChaosScheduleJob {
    /**
     * A reference to which Chaos Parameters of the Chaos Schedule to use.
     */
    @JsonProperty(value = "ChaosParameters")
    private String chaosParameters;

    /**
     * Defines the days of the week that a Chaos Schedule Job will run for.
     */
    @JsonProperty(value = "Days")
    private ChaosScheduleJobActiveDaysOfWeek days;

    /**
     * A list of Time Ranges that specify when during active days that this job
     * will run. The times are interpreted as UTC.
     */
    @JsonProperty(value = "Times")
    private List<TimeRange> times;

    /**
     * Get a reference to which Chaos Parameters of the Chaos Schedule to use.
     *
     * @return the chaosParameters value
     */
    public String chaosParameters() {
        return this.chaosParameters;
    }

    /**
     * Set a reference to which Chaos Parameters of the Chaos Schedule to use.
     *
     * @param chaosParameters the chaosParameters value to set
     * @return the ChaosScheduleJob object itself.
     */
    public ChaosScheduleJob withChaosParameters(String chaosParameters) {
        this.chaosParameters = chaosParameters;
        return this;
    }

    /**
     * Get defines the days of the week that a Chaos Schedule Job will run for.
     *
     * @return the days value
     */
    public ChaosScheduleJobActiveDaysOfWeek days() {
        return this.days;
    }

    /**
     * Set defines the days of the week that a Chaos Schedule Job will run for.
     *
     * @param days the days value to set
     * @return the ChaosScheduleJob object itself.
     */
    public ChaosScheduleJob withDays(ChaosScheduleJobActiveDaysOfWeek days) {
        this.days = days;
        return this;
    }

    /**
     * Get a list of Time Ranges that specify when during active days that this job will run. The times are interpreted as UTC.
     *
     * @return the times value
     */
    public List<TimeRange> times() {
        return this.times;
    }

    /**
     * Set a list of Time Ranges that specify when during active days that this job will run. The times are interpreted as UTC.
     *
     * @param times the times value to set
     * @return the ChaosScheduleJob object itself.
     */
    public ChaosScheduleJob withTimes(List<TimeRange> times) {
        this.times = times;
        return this;
    }

}