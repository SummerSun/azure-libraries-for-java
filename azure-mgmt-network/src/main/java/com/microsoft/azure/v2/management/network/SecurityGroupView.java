/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.network;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.v2.management.network.implementation.SecurityGroupNetworkInterfaceInner;
import com.microsoft.azure.v2.management.network.implementation.SecurityGroupViewResultInner;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.models.HasParent;
import com.microsoft.azure.v2.management.resources.fluentcore.model.HasInner;
import com.microsoft.azure.v2.management.resources.fluentcore.model.Refreshable;
import com.microsoft.rest.v2.annotations.Beta;

import java.util.Map;

/**
 * The information about security rules applied to the specified VM..
 */
@Fluent
@Beta
public interface SecurityGroupView extends HasInner<SecurityGroupViewResultInner>,
        HasParent<NetworkWatcher>,
        Refreshable<SecurityGroupView> {
    /**
     * @return network interfaces on the specified VM
     */
    Map<String, SecurityGroupNetworkInterfaceInner> networkInterfaces();

    /**
     * @return virtual machine id
     */
    String vmId();
}