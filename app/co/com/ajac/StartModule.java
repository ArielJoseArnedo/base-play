package co.com.ajac;


import co.com.ajac.base.events.Publisher;
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
        bind(Publisher.class).to(EventPublisher.class).asEagerSingleton();
    }
}

