/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import com.microsoft.azure.management.devtestlab.v2018_09_15.Policy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.devtestlab.v2018_09_15.PolicyFragment;
import java.util.Map;
import com.microsoft.azure.management.devtestlab.v2018_09_15.PolicyStatus;
import com.microsoft.azure.management.devtestlab.v2018_09_15.PolicyFactName;
import com.microsoft.azure.management.devtestlab.v2018_09_15.PolicyEvaluatorType;
import org.joda.time.DateTime;
import rx.functions.Func1;

class PolicyImpl extends CreatableUpdatableImpl<Policy, PolicyInner, PolicyImpl> implements Policy, Policy.Definition, Policy.Update {
    private final DevTestLabManager manager;
    private String resourceGroupName;
    private String labName;
    private String policySetName;
    private String name;
    private PolicyFragment updateParameter;

    PolicyImpl(String name, DevTestLabManager manager) {
        super(name, new PolicyInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
        this.updateParameter = new PolicyFragment();
    }

    PolicyImpl(PolicyInner inner, DevTestLabManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.labName = IdParsingUtils.getValueFromIdByName(inner.id(), "labs");
        this.policySetName = IdParsingUtils.getValueFromIdByName(inner.id(), "policysets");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "policies");
        //
        this.updateParameter = new PolicyFragment();
    }

    @Override
    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Policy> createResourceAsync() {
        PoliciesInner client = this.manager().inner().policies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.labName, this.policySetName, this.name, this.inner())
            .map(new Func1<PolicyInner, PolicyInner>() {
               @Override
               public PolicyInner call(PolicyInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Policy> updateResourceAsync() {
        PoliciesInner client = this.manager().inner().policies();
        return client.updateAsync(this.resourceGroupName, this.labName, this.policySetName, this.name, this.updateParameter)
            .map(new Func1<PolicyInner, PolicyInner>() {
               @Override
               public PolicyInner call(PolicyInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PolicyInner> getInnerAsync() {
        PoliciesInner client = this.manager().inner().policies();
        return client.getAsync(this.resourceGroupName, this.labName, this.policySetName, this.name);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new PolicyFragment();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public PolicyEvaluatorType evaluatorType() {
        return this.inner().evaluatorType();
    }

    @Override
    public String factData() {
        return this.inner().factData();
    }

    @Override
    public PolicyFactName factName() {
        return this.inner().factName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PolicyStatus status() {
        return this.inner().status();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String threshold() {
        return this.inner().threshold();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String uniqueIdentifier() {
        return this.inner().uniqueIdentifier();
    }

    @Override
    public PolicyImpl withExistingPolicyset(String resourceGroupName, String labName, String policySetName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        this.policySetName = policySetName;
        return this;
    }

    @Override
    public PolicyImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public PolicyImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.inner().withDescription(description);
        } else {
            this.updateParameter.withDescription(description);
        }
        return this;
    }

    @Override
    public PolicyImpl withEvaluatorType(PolicyEvaluatorType evaluatorType) {
        if (isInCreateMode()) {
            this.inner().withEvaluatorType(evaluatorType);
        } else {
            this.updateParameter.withEvaluatorType(evaluatorType);
        }
        return this;
    }

    @Override
    public PolicyImpl withFactData(String factData) {
        if (isInCreateMode()) {
            this.inner().withFactData(factData);
        } else {
            this.updateParameter.withFactData(factData);
        }
        return this;
    }

    @Override
    public PolicyImpl withFactName(PolicyFactName factName) {
        if (isInCreateMode()) {
            this.inner().withFactName(factName);
        } else {
            this.updateParameter.withFactName(factName);
        }
        return this;
    }

    @Override
    public PolicyImpl withStatus(PolicyStatus status) {
        if (isInCreateMode()) {
            this.inner().withStatus(status);
        } else {
            this.updateParameter.withStatus(status);
        }
        return this;
    }

    @Override
    public PolicyImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public PolicyImpl withThreshold(String threshold) {
        if (isInCreateMode()) {
            this.inner().withThreshold(threshold);
        } else {
            this.updateParameter.withThreshold(threshold);
        }
        return this;
    }

}
