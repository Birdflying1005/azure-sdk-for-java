/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2018_09_15.VirtualMachineSchedules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlab.v2018_09_15.VirtualmachineLabSchedule;

class VirtualMachineSchedulesImpl extends WrapperImpl<VirtualMachineSchedulesInner> implements VirtualMachineSchedules {
    private final DevTestLabManager manager;

    VirtualMachineSchedulesImpl(DevTestLabManager manager) {
        super(manager.inner().virtualMachineSchedules());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public VirtualmachineLabScheduleImpl define(String name) {
        return wrapModel(name);
    }

    private VirtualmachineLabScheduleImpl wrapModel(ScheduleInner inner) {
        return  new VirtualmachineLabScheduleImpl(inner, manager());
    }

    private VirtualmachineLabScheduleImpl wrapModel(String name) {
        return new VirtualmachineLabScheduleImpl(name, this.manager());
    }

    @Override
    public Completable executeAsync(String resourceGroupName, String labName, String virtualMachineName, String name) {
        VirtualMachineSchedulesInner client = this.inner();
        return client.executeAsync(resourceGroupName, labName, virtualMachineName, name).toCompletable();
    }

    @Override
    public Observable<VirtualmachineLabSchedule> listAsync(final String resourceGroupName, final String labName, final String virtualMachineName) {
        VirtualMachineSchedulesInner client = this.inner();
        return client.listAsync(resourceGroupName, labName, virtualMachineName)
        .flatMapIterable(new Func1<Page<ScheduleInner>, Iterable<ScheduleInner>>() {
            @Override
            public Iterable<ScheduleInner> call(Page<ScheduleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ScheduleInner, VirtualmachineLabSchedule>() {
            @Override
            public VirtualmachineLabSchedule call(ScheduleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<VirtualmachineLabSchedule> getAsync(String resourceGroupName, String labName, String virtualMachineName, String name) {
        VirtualMachineSchedulesInner client = this.inner();
        return client.getAsync(resourceGroupName, labName, virtualMachineName, name)
        .map(new Func1<ScheduleInner, VirtualmachineLabSchedule>() {
            @Override
            public VirtualmachineLabSchedule call(ScheduleInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String labName, String virtualMachineName, String name) {
        VirtualMachineSchedulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, labName, virtualMachineName, name).toCompletable();
    }

}
