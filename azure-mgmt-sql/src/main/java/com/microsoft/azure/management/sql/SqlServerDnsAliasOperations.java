/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import rx.Completable;

/**
 * A representation of the Azure SQL Server DNS alias operations.
 */
@Fluent
@Beta(Beta.SinceVersion.V1_8_0)
public interface SqlServerDnsAliasOperations extends
    SupportsCreating<SqlServerDnsAliasOperations.DefinitionStages.WithSqlServer>,
    SqlChildrenOperations<SqlServerDnsAlias> {

    /**
     * Acquires server DNS alias from another server.
     *
     * @param resourceGroupName the name of the resource group that contains the resource
     * @param serverName the name of the server that the alias is pointing to
     * @param dnsAliasName the name of the Server DNS alias
     * @param sqlServerId the id of the other SQL server that the DNS alias was pointing to
     */
    void acquire(String resourceGroupName, String serverName, String dnsAliasName, String sqlServerId);

    /**
     * Acquires server DNS alias from another server asynchronously.
     *
     * @param resourceGroupName the name of the resource group that contains the resource
     * @param serverName the name of the server that the alias is pointing to
     * @param dnsAliasName the name of the Server DNS alias
     * @param sqlServerId the id of the other SQL server that the DNS alias was pointing to
     * @return a representation of the deferred computation of this call
     */
    Completable acquireAsync(String resourceGroupName, String serverName, String dnsAliasName, String sqlServerId);

    /**
     * Acquires server DNS alias from another server.
     *
     * @param dnsAliasName the name of the Server DNS alias
     * @param oldSqlServerId the id of the other SQL server that the DNS alias was pointing to
     * @param newSqlServerId the id of the server that the alias is pointing to
     */
    void acquire(String dnsAliasName, String oldSqlServerId, String newSqlServerId);

    /**
     * Acquires server DNS alias from another server asynchronously.
     *
     * @param dnsAliasName the name of the Server DNS alias
     * @param oldSqlServerId the id of the other SQL server that the DNS alias was pointing to
     * @param newSqlServerId the id of the server that the alias is pointing to
     * @return a representation of the deferred computation of this call
     */
    Completable acquireAsync(String dnsAliasName, String oldSqlServerId, String newSqlServerId);

    /**
     * Container interface for all the definitions that need to be implemented.
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    interface SqlServerDnsAliasOperationsDefinition extends
        SqlServerDnsAliasOperations.DefinitionStages.WithSqlServer,
        SqlServerDnsAliasOperations.DefinitionStages.WithCreate {
    }

    /**
     * Grouping of all the SQL Server DNS alias definition stages.
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    interface DefinitionStages {
        /**
         * The first stage of the SQL Server DNS alias definition.
         */
        @Beta(Beta.SinceVersion.V1_8_0)
        interface WithSqlServer {
            /**
             * Sets the parent SQL server name and resource group it belongs to.
             *
             * @param resourceGroupName the name of the resource group the parent SQL server
             * @param sqlServerName     the parent SQL server name
             * @return The next stage of the definition.
             */
            SqlServerDnsAliasOperations.DefinitionStages.WithCreate withExistingSqlServer(String resourceGroupName, String sqlServerName);

            /**
             * Sets the parent SQL server for the new Server DNS alias.
             *
             * @param sqlServerId the parent SQL server ID
             * @return The next stage of the definition.
             */
            SqlServerDnsAliasOperations.DefinitionStages.WithCreate withExistingSqlServerId(String sqlServerId);

            /**
             * Sets the parent SQL server for the new Server DNS alias.
             *
             * @param sqlServer the parent SQL server
             * @return The next stage of the definition.
             */
            SqlServerDnsAliasOperations.DefinitionStages.WithCreate withExistingSqlServer(SqlServer sqlServer);
        }

        /**
         * The final stage of the SQL Server DNS alias definition.
         */
        interface WithCreate extends Creatable<SqlServerDnsAlias> {
        }
    }

    /**
     * Grouping of the Azure SQL Server DNS alias common actions.
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    interface SqlServerDnsAliasActionsDefinition extends SqlChildrenActionsDefinition<SqlServerDnsAlias> {
        /**
         * Begins the definition of a new SQL Server DNS alias to be added to this server.
         *
         * @param serverDnsAliasName the name of the new DNS alias to be created for the selected SQL server
         * @return the first stage of the new SQL Server DNS alias definition
         */
        SqlServerDnsAliasOperations.DefinitionStages.WithCreate define(String serverDnsAliasName);

        /**
         * Acquires server DNS alias from another server.
         *
         * @param dnsAliasName the name of the Server DNS alias
         * @param sqlServerId the id of the other SQL server that the DNS alias was pointing to
         */
        void acquire(String dnsAliasName, String sqlServerId);

        /**
         * Acquires server DNS alias from another server asynchronously.
         *
         * @param dnsAliasName the name of the Server DNS alias
         * @param sqlServerId the id of the other SQL server that the DNS alias was pointing to
         * @return a representation of the deferred computation of this call
         */
        Completable acquireAsync(String dnsAliasName, String sqlServerId);
    }
}