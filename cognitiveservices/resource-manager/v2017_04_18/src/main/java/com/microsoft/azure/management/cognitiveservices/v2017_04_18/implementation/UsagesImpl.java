/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Usages;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.UsagesResult;

class UsagesImpl extends WrapperImpl<AccountsInner> implements Usages {
    private final CognitiveServicesManager manager;

    UsagesImpl(CognitiveServicesManager manager) {
        super(manager.inner().accounts());
        this.manager = manager;
    }

    public CognitiveServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<UsagesResult> getUsagesAsync(String resourceGroupName, String accountName) {
        AccountsInner client = this.inner();
        return client.getUsagesAsync(resourceGroupName, accountName)
        .map(new Func1<UsagesResultInner, UsagesResult>() {
            @Override
            public UsagesResult call(UsagesResultInner inner) {
                return new UsagesResultImpl(inner, manager());
            }
        });
    }

}