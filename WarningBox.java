package net.runelite.client.plugins.environmenteffects;

import java.awt.*;
import java.awt.image.BufferedImage;
import lombok.Getter;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.InfoBox;

public class WarningBox extends InfoBox
{

    @Getter
    private final String name;

    WarningBox(Plugin plugin, String name, BufferedImage image)
    {
        super(image, plugin);
        this.name = name;
    }

    @Override
    public String getTooltip()
    {
        if (name == "snow")
            return " Warning: This area will drain your stats and damage you";
        else if (name == "light")
            return " Warning: You need a light source";
        else if (name == "smoke")
            return " Warning: You need a slayer helmet or face mask ";
        else return null;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public Color getTextColor() {
        return null;
    }
}
