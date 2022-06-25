package net.eman3600.dndreams.cardinal_components.interfaces;

import dev.onyxstudios.cca.api.v3.component.Component;
import dev.onyxstudios.cca.api.v3.component.tick.ServerTickingComponent;

public interface ManaComponentI extends ServerTickingComponent {
    int getMana();
    int getBaseManaMax();
    int getManaMax();
    int getXPBonus();
    int getInfusion();
    void setInfusion(int change);
    int getRegenRate();

    boolean useMana(int cost);
}
