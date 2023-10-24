package co.com.ajac;


import co.com.ajac.messaging.publishers.PublisherProvider;
import co.com.ajac.playcommand.commands.ProviderManager;
import co.com.ajac.infrastructure.commands.CommandProviderManager;
import co.com.ajac.infrastructure.events.EventPublisher;
import com.google.inject.AbstractModule;

import java.time.Clock;
import java.time.ZoneId;

public class StartModule extends AbstractModule {

    @Override
    public void configure() {
        bind(Clock.class).toInstance(Clock.system(ZoneId.of("America/Bogota")));
        bind(ProviderManager.class).to(CommandProviderManager.class).asEagerSingleton();
        bind(PublisherProvider.class).to(EventPublisher.class).asEagerSingleton();
    }
}

