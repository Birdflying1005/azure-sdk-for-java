/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2018_01_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.implementation.ManagementGroupInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.implementation.ManagementManager;
import java.util.List;

/**
 * Type representing ManagementGroup.
 */
public interface ManagementGroup extends HasInner<ManagementGroupInner>, Indexable, Updatable<ManagementGroup.Update>, Refreshable<ManagementGroup>, HasManager<ManagementManager> {
    /**
     * @return the children value.
     */
    List<ManagementGroupChildInfo> children();

    /**
     * @return the details value.
     */
    ManagementGroupDetails details();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the roles value.
     */
    List<String> roles();

    /**
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a ManagementGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ManagementGroup>, UpdateStages.WithDisplayName, UpdateStages.WithParentId {
    }

    /**
     * Grouping of ManagementGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the managementgroup update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the managementgroup update allowing to specify ParentId.
         */
        interface WithParentId {
            /**
             * Specifies parentId.
             */
            Update withParentId(String parentId);
        }

    }
}
