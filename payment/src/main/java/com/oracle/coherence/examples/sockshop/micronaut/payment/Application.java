/*
 * Copyright (c) 2021 Oracle and/or its affiliates.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at
 * https://oss.oracle.com/licenses/upl.
 */

package com.oracle.coherence.examples.sockshop.micronaut.payment;

import com.tangosol.net.Coherence;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Payment",
                version = "1.0",
                description = "Allows users to process payments for orders",
                license = @License(
                        name = "The Universal Permissive License (UPL), Version 1.0",
                        url = "https://github.com/coherence-sockshop-micronaut/sockshop/blob/master/LICENSE.txt"),
                contact = @Contact(
                        url = "https://github.com/coherence-sockshop-micronaut/sockshop",
                        name = "Micronaut Sock Shop")),
        servers = {@Server(
                url = "http://api.coherence.sockshop.micronaut.io/",
                description = "Micronaut Sock Shop implementation with Coherence backend")},
        externalDocs = @ExternalDocumentation(
                description = "Additional Documentation",
                url = "https://github.com/coherence-sockshop-micronaut/payment"))
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = Micronaut.run(Application.class, args);
        context.getBean(Coherence.class);
    }
}
