package me.duncanruns.noitemrendering.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.render.item.ItemRenderer;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin {

    @Inject(method = "renderItem", at = @At("HEAD"),cancellable = true)
    public void renderItem(CallbackInfo info){
        info.cancel();
    }
    
}
