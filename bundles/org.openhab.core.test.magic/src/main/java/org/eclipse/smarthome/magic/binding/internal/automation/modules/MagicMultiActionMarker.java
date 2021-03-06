/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.magic.binding.internal.automation.modules;

import org.eclipse.smarthome.config.core.ConfigurableService;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;

/**
 * Marker for the multiple action module
 *
 * @author Stefan Triller - initial contribution
 *
 */
@Component(immediate = true, service = MagicMultiActionMarker.class, property = {
        Constants.SERVICE_PID + "=org.eclipse.smarthome.MagicMultiAction",
        ConfigurableService.SERVICE_PROPERTY_FACTORY_SERVICE + "=true",
        ConfigurableService.SERVICE_PROPERTY_LABEL + "=MagicMultiActionsService",
        ConfigurableService.SERVICE_PROPERTY_CATEGORY + "=RuleActions",
        ConfigurableService.SERVICE_PROPERTY_DESCRIPTION_URI + "=automationAction:magicMultiAction" })
public class MagicMultiActionMarker {

}
