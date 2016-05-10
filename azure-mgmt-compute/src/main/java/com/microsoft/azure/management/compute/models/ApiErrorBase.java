/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;


/**
 * Api error base.
 */
public class ApiErrorBase {
    /**
     * Gets or sets the error code.
     */
    private String code;

    /**
     * Gets or sets the target of the particular error.
     */
    private String target;

    /**
     * Gets or sets the error message.
     */
    private String message;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Get the target value.
     *
     * @return the target value
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target value.
     *
     * @param target the target value to set
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

}