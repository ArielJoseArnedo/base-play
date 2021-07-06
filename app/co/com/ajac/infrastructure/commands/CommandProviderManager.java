package co.com.ajac.infrastructure.commands;

import co.com.ajac.infrastructure.api.commands.CommandProvider;
import co.com.ajac.playcommand.commands.ProviderManager;
import co.com.ajac.infrastructure.commands.v1.CommandProviderV1;
import io.vavr.collection.List;

import javax.inject.Inject;

public class CommandProviderManager implements ProviderManager {

    private final List<CommandProvider> commandProviders;

    @Inject
    public CommandProviderManager(CommandProviderV1 commandProviderV1) {
        commandProviders = List.of(commandProviderV1);
    }

    @Override
    public List<CommandProvider> getCommandProviders() {
        return commandProviders;
    }
}
