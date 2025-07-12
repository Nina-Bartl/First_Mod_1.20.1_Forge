package net.nina.firstmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nina.firstmod.FirstMod;


import java.awt.*;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MODID);

    public static final RegistryObject<CreativeModeTab> FIRST_MOD_TAB = CREATIVE_MODE_TABS.register("first_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.POMIDOR.get()))
                    .title(Component.translatable("creativetab.first_mod"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.POMIDOR.get());
                        pOutput.accept(ModItems.NIEDOJRZALY_POMIDOR.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
