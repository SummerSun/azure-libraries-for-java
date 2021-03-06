/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.implementation;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.containerregistry.BuildTaskBuildRequest;
import com.microsoft.azure.management.containerregistry.QuickBuildRequest;

/**
 * The queue build request parameters.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("QueueBuildRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "BuildTask", value = BuildTaskBuildRequest.class),
    @JsonSubTypes.Type(name = "QuickBuild", value = QuickBuildRequest.class)
})
public class QueueBuildRequestInner {
}
