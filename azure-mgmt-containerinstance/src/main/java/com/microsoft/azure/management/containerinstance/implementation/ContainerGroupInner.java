/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.implementation;

import java.util.List;
import com.microsoft.azure.management.containerinstance.Container;
import com.microsoft.azure.management.containerinstance.ImageRegistryCredential;
import com.microsoft.azure.management.containerinstance.ContainerGroupRestartPolicy;
import com.microsoft.azure.management.containerinstance.IpAddress;
import com.microsoft.azure.management.containerinstance.OperatingSystemTypes;
import com.microsoft.azure.management.containerinstance.Volume;
import com.microsoft.azure.management.containerinstance.ContainerGroupPropertiesInstanceView;
import com.microsoft.azure.management.containerinstance.ContainerGroupDiagnostics;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A container group.
 */
@JsonFlatten
public class ContainerGroupInner extends Resource {
    /**
     * The provisioning state of the container group. This only appears in the
     * response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The containers within the container group.
     */
    @JsonProperty(value = "properties.containers", required = true)
    private List<Container> containers;

    /**
     * The image registry credentials by which the container group is created
     * from.
     */
    @JsonProperty(value = "properties.imageRegistryCredentials")
    private List<ImageRegistryCredential> imageRegistryCredentials;

    /**
     * Restart policy for all containers within the container group.
     * - `Always` Always restart
     * - `OnFailure` Restart on failure
     * - `Never` Never restart
     * . Possible values include: 'Always', 'OnFailure', 'Never'.
     */
    @JsonProperty(value = "properties.restartPolicy")
    private ContainerGroupRestartPolicy restartPolicy;

    /**
     * The IP address type of the container group.
     */
    @JsonProperty(value = "properties.ipAddress")
    private IpAddress ipAddress;

    /**
     * The operating system type required by the containers in the container
     * group. Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.osType", required = true)
    private OperatingSystemTypes osType;

    /**
     * The list of volumes that can be mounted by containers in this container
     * group.
     */
    @JsonProperty(value = "properties.volumes")
    private List<Volume> volumes;

    /**
     * The instance view of the container group. Only valid in response.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerGroupPropertiesInstanceView instanceView;

    /**
     * The diagnostic information for a container group.
     */
    @JsonProperty(value = "properties.diagnostics")
    private ContainerGroupDiagnostics diagnostics;

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the containers value.
     *
     * @return the containers value
     */
    public List<Container> containers() {
        return this.containers;
    }

    /**
     * Set the containers value.
     *
     * @param containers the containers value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withContainers(List<Container> containers) {
        this.containers = containers;
        return this;
    }

    /**
     * Get the imageRegistryCredentials value.
     *
     * @return the imageRegistryCredentials value
     */
    public List<ImageRegistryCredential> imageRegistryCredentials() {
        return this.imageRegistryCredentials;
    }

    /**
     * Set the imageRegistryCredentials value.
     *
     * @param imageRegistryCredentials the imageRegistryCredentials value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withImageRegistryCredentials(List<ImageRegistryCredential> imageRegistryCredentials) {
        this.imageRegistryCredentials = imageRegistryCredentials;
        return this;
    }

    /**
     * Get the restartPolicy value.
     *
     * @return the restartPolicy value
     */
    public ContainerGroupRestartPolicy restartPolicy() {
        return this.restartPolicy;
    }

    /**
     * Set the restartPolicy value.
     *
     * @param restartPolicy the restartPolicy value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withRestartPolicy(ContainerGroupRestartPolicy restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    /**
     * Get the ipAddress value.
     *
     * @return the ipAddress value
     */
    public IpAddress ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress value.
     *
     * @param ipAddress the ipAddress value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withIpAddress(IpAddress ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the osType value.
     *
     * @return the osType value
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType value.
     *
     * @param osType the osType value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the volumes value.
     *
     * @return the volumes value
     */
    public List<Volume> volumes() {
        return this.volumes;
    }

    /**
     * Set the volumes value.
     *
     * @param volumes the volumes value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withVolumes(List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * Get the instanceView value.
     *
     * @return the instanceView value
     */
    public ContainerGroupPropertiesInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Get the diagnostics value.
     *
     * @return the diagnostics value
     */
    public ContainerGroupDiagnostics diagnostics() {
        return this.diagnostics;
    }

    /**
     * Set the diagnostics value.
     *
     * @param diagnostics the diagnostics value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withDiagnostics(ContainerGroupDiagnostics diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }

}
