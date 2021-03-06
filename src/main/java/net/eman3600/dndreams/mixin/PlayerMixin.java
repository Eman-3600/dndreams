package net.eman3600.dndreams.mixin;

import com.mojang.authlib.GameProfile;
import net.eman3600.dndreams.initializers.EntityComponents;
import net.eman3600.dndreams.initializers.ModAttributes;
import net.eman3600.dndreams.initializers.ModDimensions;
import net.eman3600.dndreams.initializers.WorldComponents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.encryption.PlayerPublicKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionTypes;
import org.checkerframework.checker.units.qual.A;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerMixin extends LivingEntity {



    protected PlayerMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "tick()V", at = @At("TAIL"))
    public void injectTick(CallbackInfo info) {
        if (getEntityWorld().getDimensionKey() == DimensionTypes.THE_END) {
            EntityComponents.TORMENT.get(this).addPerMinute(-5f);
        }

        if (WorldComponents.BLOOD_MOON.get(getEntityWorld()).isBloodMoon()) {
            EntityComponents.TORMENT.get(this).addPerMinute(2f);
        }
    }

    @Inject(method = "createPlayerAttributes", at = @At("RETURN"), cancellable = true)
    private static void injectAttributes(CallbackInfoReturnable info) {
        info.setReturnValue(((DefaultAttributeContainer.Builder)info.getReturnValue())
                .add(ModAttributes.PLAYER_MANA_REGEN, 8d)
                .add(ModAttributes.PLAYER_MAX_MANA, 25d));
    }
}
