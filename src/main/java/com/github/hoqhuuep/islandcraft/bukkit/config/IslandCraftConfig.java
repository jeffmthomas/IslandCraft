package com.github.hoqhuuep.islandcraft.bukkit.config;

import org.bukkit.configuration.ConfigurationSection;

public class IslandCraftConfig {
    private final ConfigurationSection config;

    public IslandCraftConfig(final ConfigurationSection config) {
        this.config = config;
    }

    public final int getLocalChatRadius() {
        return config.getInt("local-chat-radius", 128); //$NON-NLS-1$
    }

    public final WorldConfig getWorldConfig(final String world) {
        return new WorldConfig(config.getConfigurationSection("worlds." + world)); //$NON-NLS-1$
    }
}