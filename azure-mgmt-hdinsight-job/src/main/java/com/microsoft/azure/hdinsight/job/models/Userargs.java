/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.hdinsight.job.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Gets or sets the object containing the user arguments.
 */
public class Userargs {
    /**
     * The list of args defined by the user.
     */
    @JsonProperty(value = "arg", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> arg;

    /**
     * The callback URL, if any.
     */
    @JsonProperty(value = "callback")
    private Object callback;

    /**
     * The define properties defined by the user.
     */
    @JsonProperty(value = "define", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> define;

    /**
     * Whether or not the user enabled logs.
     */
    @JsonProperty(value = "enablelog")
    private String enablelog;

    /**
     * The query defined by the user.
     */
    @JsonProperty(value = "execute")
    private String execute;

    /**
     * The query file provided by the user.
     */
    @JsonProperty(value = "file")
    private Object file;

    /**
     * The files defined by the user.
     */
    @JsonProperty(value = "files")
    private Object files;

    /**
     * The JAR file provided by the user.
     */
    @JsonProperty(value = "jar")
    private String jar;

    /**
     * The status directory defined by the user.
     */
    @JsonProperty(value = "statusdir")
    private Object statusdir;

    /**
     * The username.
     */
    @JsonProperty(value = "user\\.name")
    private String username;

    /**
     * Get the list of args defined by the user.
     *
     * @return the arg value
     */
    public List<String> arg() {
        return this.arg;
    }

    /**
     * Get the callback URL, if any.
     *
     * @return the callback value
     */
    public Object callback() {
        return this.callback;
    }

    /**
     * Set the callback URL, if any.
     *
     * @param callback the callback value to set
     * @return the Userargs object itself.
     */
    public Userargs withCallback(Object callback) {
        this.callback = callback;
        return this;
    }

    /**
     * Get the define properties defined by the user.
     *
     * @return the define value
     */
    public List<String> define() {
        return this.define;
    }

    /**
     * Get whether or not the user enabled logs.
     *
     * @return the enablelog value
     */
    public String enablelog() {
        return this.enablelog;
    }

    /**
     * Set whether or not the user enabled logs.
     *
     * @param enablelog the enablelog value to set
     * @return the Userargs object itself.
     */
    public Userargs withEnablelog(String enablelog) {
        this.enablelog = enablelog;
        return this;
    }

    /**
     * Get the query defined by the user.
     *
     * @return the execute value
     */
    public String execute() {
        return this.execute;
    }

    /**
     * Set the query defined by the user.
     *
     * @param execute the execute value to set
     * @return the Userargs object itself.
     */
    public Userargs withExecute(String execute) {
        this.execute = execute;
        return this;
    }

    /**
     * Get the query file provided by the user.
     *
     * @return the file value
     */
    public Object file() {
        return this.file;
    }

    /**
     * Set the query file provided by the user.
     *
     * @param file the file value to set
     * @return the Userargs object itself.
     */
    public Userargs withFile(Object file) {
        this.file = file;
        return this;
    }

    /**
     * Get the files defined by the user.
     *
     * @return the files value
     */
    public Object files() {
        return this.files;
    }

    /**
     * Set the files defined by the user.
     *
     * @param files the files value to set
     * @return the Userargs object itself.
     */
    public Userargs withFiles(Object files) {
        this.files = files;
        return this;
    }

    /**
     * Get the JAR file provided by the user.
     *
     * @return the jar value
     */
    public String jar() {
        return this.jar;
    }

    /**
     * Set the JAR file provided by the user.
     *
     * @param jar the jar value to set
     * @return the Userargs object itself.
     */
    public Userargs withJar(String jar) {
        this.jar = jar;
        return this;
    }

    /**
     * Get the status directory defined by the user.
     *
     * @return the statusdir value
     */
    public Object statusdir() {
        return this.statusdir;
    }

    /**
     * Set the status directory defined by the user.
     *
     * @param statusdir the statusdir value to set
     * @return the Userargs object itself.
     */
    public Userargs withStatusdir(Object statusdir) {
        this.statusdir = statusdir;
        return this;
    }

    /**
     * Get the username.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username.
     *
     * @param username the username value to set
     * @return the Userargs object itself.
     */
    public Userargs withUsername(String username) {
        this.username = username;
        return this;
    }

}
