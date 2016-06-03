/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.collection;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;

import java.io.IOException;
import java.util.List;

/**
 * Provides access to listing Azure resources of a specific type based on their region (location)
 * <p>
 * (Note: this interface is not intended to be implemented by user code)
 */
public interface SupportsListingByLocation<T> {
	/**
	 * Lists all the resources of the specified type in the specified region
	 * @param region the Azure region to list the resources from
	 * @return list of resources
	 * @throws CloudException
	 * @throws IOException
	 */
	List<T> list(Region region) throws CloudException, IOException;
}