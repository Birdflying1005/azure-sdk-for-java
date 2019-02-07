/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlab.v2015_05_21_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2015_05_21_preview.VirtualMachines;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlab.v2015_05_21_preview.LabVirtualMachine;

class VirtualMachinesImpl extends WrapperImpl<VirtualMachinesInner> implements VirtualMachines {
    private final DevTestLabManager manager;

    VirtualMachinesImpl(DevTestLabManager manager) {
        super(manager.inner().virtualMachines());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public LabVirtualMachineImpl define(String name) {
        return wrapModel(name);
    }

    private LabVirtualMachineImpl wrapModel(LabVirtualMachineInner inner) {
        return  new LabVirtualMachineImpl(inner, manager());
    }

    private LabVirtualMachineImpl wrapModel(String name) {
        return new LabVirtualMachineImpl(name, this.manager());
    }

    @Override
    public Completable applyArtifactsAsync(String resourceGroupName, String labName, String name) {
        VirtualMachinesInner client = this.inner();
        return client.applyArtifactsAsync(resourceGroupName, labName, name).toCompletable();
    }

    @Override
    public Completable startAsync(String resourceGroupName, String labName, String name) {
        VirtualMachinesInner client = this.inner();
        return client.startAsync(resourceGroupName, labName, name).toCompletable();
    }

    @Override
    public Completable stopAsync(String resourceGroupName, String labName, String name) {
        VirtualMachinesInner client = this.inner();
        return client.stopAsync(resourceGroupName, labName, name).toCompletable();
    }

    @Override
    public Observable<LabVirtualMachine> listAsync(final String resourceGroupName, final String labName) {
        VirtualMachinesInner client = this.inner();
        return client.listAsync(resourceGroupName, labName)
        .flatMapIterable(new Func1<Page<LabVirtualMachineInner>, Iterable<LabVirtualMachineInner>>() {
            @Override
            public Iterable<LabVirtualMachineInner> call(Page<LabVirtualMachineInner> page) {
                return page.items();
            }
        })
        .map(new Func1<LabVirtualMachineInner, LabVirtualMachine>() {
            @Override
            public LabVirtualMachine call(LabVirtualMachineInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<LabVirtualMachine> getResourceAsync(String resourceGroupName, String labName, String name) {
        VirtualMachinesInner client = this.inner();
        return client.getResourceAsync(resourceGroupName, labName, name)
        .map(new Func1<LabVirtualMachineInner, LabVirtualMachine>() {
            @Override
            public LabVirtualMachine call(LabVirtualMachineInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteResourceAsync(String resourceGroupName, String labName, String name) {
        VirtualMachinesInner client = this.inner();
        return client.deleteResourceAsync(resourceGroupName, labName, name).toCompletable();
    }

}
