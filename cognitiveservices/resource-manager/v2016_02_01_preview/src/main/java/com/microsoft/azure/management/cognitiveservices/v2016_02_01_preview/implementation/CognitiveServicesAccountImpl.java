/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.implementation;

import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.CognitiveServicesAccount;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.CognitiveServicesAccountCreateParameters;
import java.util.Map;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.ProvisioningState;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.Sku;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.Kind;
import rx.functions.Func1;

class CognitiveServicesAccountImpl extends CreatableUpdatableImpl<CognitiveServicesAccount, CognitiveServicesAccountInner, CognitiveServicesAccountImpl> implements CognitiveServicesAccount, CognitiveServicesAccount.Definition {
    private String resourceGroupName;
    private String accountName;
    private CognitiveServicesAccountCreateParameters createParameter;
    private final CognitiveServicesManager manager;

    CognitiveServicesAccountImpl(String name, CognitiveServicesManager manager) {
        super(name, new CognitiveServicesAccountInner());
        this.manager = manager;
        // Set resource name
        this.accountName = name;
        //
        this.createParameter = new CognitiveServicesAccountCreateParameters();
    }

    CognitiveServicesAccountImpl(CognitiveServicesAccountInner inner, CognitiveServicesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.accountName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "accounts");
        //
        this.createParameter = new CognitiveServicesAccountCreateParameters();
    }

    @Override
    public CognitiveServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CognitiveServicesAccount> createResourceAsync() {
        CognitiveServicesAccountsInner client = this.manager().inner().cognitiveServicesAccounts();
        return client.createAsync(this.resourceGroupName, this.accountName, this.createParameter)
            .map(new Func1<CognitiveServicesAccountInner, CognitiveServicesAccountInner>() {
               @Override
               public CognitiveServicesAccountInner call(CognitiveServicesAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CognitiveServicesAccount> updateResourceAsync() {
        CognitiveServicesAccountsInner client = this.manager().inner().cognitiveServicesAccounts();
        return null; // NOP updateResourceAsync implementation as update is not supported
    }

    @Override
    protected Observable<CognitiveServicesAccountInner> getInnerAsync() {
        CognitiveServicesAccountsInner client = this.manager().inner().cognitiveServicesAccounts();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new CognitiveServicesAccountCreateParameters();
    }

    @Override
    public String endpoint() {
        return this.inner().endpoint();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public CognitiveServicesAccountImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public CognitiveServicesAccountImpl withKind(Kind kind) {
        this.createParameter.withKind(kind);
        return this;
    }

    @Override
    public CognitiveServicesAccountImpl withLocation(String location) {
        this.createParameter.withLocation(location);
        return this;
    }

    @Override
    public CognitiveServicesAccountImpl withProperties(Object properties) {
        this.createParameter.withProperties(properties);
        return this;
    }

    @Override
    public CognitiveServicesAccountImpl withSku(Sku sku) {
        this.createParameter.withSku(sku);
        return this;
    }

    @Override
    public CognitiveServicesAccountImpl withTags(Map<String, String> tags) {
        this.createParameter.withTags(tags);
        return this;
    }

}