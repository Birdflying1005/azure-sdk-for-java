/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview.implementation.TasksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Tasks.
 */
public interface Tasks extends SupportsCreating<ProjectTask.DefinitionStages.Blank>, HasInner<TasksInner> {
    /**
     * Cancel a task.
     * The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. This method cancels a task if it's currently queued or running.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @param projectName Name of the project
     * @param taskName Name of the Task
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProjectTask> cancelAsync(String groupName, String serviceName, String projectName, String taskName);

    /**
     * Get task information.
     * The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. The GET method retrieves information about a task.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @param projectName Name of the project
     * @param taskName Name of the Task
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProjectTask> getAsync(String groupName, String serviceName, String projectName, String taskName);

    /**
     * Get tasks in a service.
     * The services resource is the top-level resource that represents the Data Migration Service. This method returns a list of tasks owned by a service resource. Some tasks may have a status of Unknown, which indicates that an error occurred while querying the status of that task.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @param projectName Name of the project
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProjectTask> listAsync(final String groupName, final String serviceName, final String projectName);

    /**
     * Delete task.
     * The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. The DELETE method deletes a task, canceling it first if it's running.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @param projectName Name of the project
     * @param taskName Name of the Task
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String groupName, String serviceName, String projectName, String taskName);

}