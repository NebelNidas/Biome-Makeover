package party.lemons.biomemakeover.mixin;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.DefaultedRegistry;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(DefaultedRegistry.class)
public class DefaultedRegistryMixin {
	@ModifyVariable(at = @At("HEAD"), method = "get(Lnet/minecraft/util/Identifier;)Ljava/lang/Object;", ordinal = 0)
	Identifier fixMissingFromRegistry(@Nullable Identifier id) {
		if(id != null) {
			if (id.getNamespace().equals("biomemakeover")) {

				switch (id.getPath()) {
					case "ancient_oak_leaves":
						return new Identifier("minecraft", "dark_oak_leaves");
					case "ancient_oak_log":
						return new Identifier("minecraft", "dark_oak_log");
					case "ancient_oak_planks":
						return new Identifier("minecraft", "dark_oak_planks");
					case "stripped_ancient_oak_log":
						return new Identifier("minecraft", "stripped_dark_oak_log");
					case "stripped_ancient_oak_wood":
						return new Identifier("minecraft", "stripped_dark_oak_wood");
					case "ancient_oak_stairs":
						return new Identifier("minecraft", "dark_oak_stairs");
					case "ancient_oak_fence":
						return new Identifier("minecraft", "dark_oak_fence");
					case "ancient_oak_fence_gate":
						return new Identifier("minecraft", "dark_oak_fence_gate");
					case "ancient_oak_button":
						return new Identifier("minecraft", "dark_oak_button");
					case "ancient_oak_trapdoor":
						return new Identifier("minecraft", "dark_oak_trapdoor");
					case "ancient_oak_door":
						return new Identifier("minecraft", "dark_oak_door");
					case "ancient_oak_pressure_plate":
						return new Identifier("minecraft", "dark_oak_pressure_plate");
					case "ancient_oak_slab":
						return new Identifier("minecraft", "dark_oak_slab");
					case "ancient_oak_boat":
						return new Identifier("minecraft", "dark_oak_boat");
					case "ancient_oak_sign":
						return new Identifier("minecraft", "dark_oak_sign");
					case "ancient_oak_wood":
						return new Identifier("minecraft", "dark_oak_wood");
				
					default:
						break;
				}
				
			}
		}
		return id;
	}
}
