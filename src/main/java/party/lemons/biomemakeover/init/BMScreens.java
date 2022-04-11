package party.lemons.biomemakeover.init;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import party.lemons.biomemakeover.BiomeMakeover;
import party.lemons.biomemakeover.gui.DirectionalDataScreenHandler;
import party.lemons.biomemakeover.crafting.witch.screen.WitchScreenHandler;

public class BMScreens
{
	public static ScreenHandlerType<WitchScreenHandler> WITCH;
	public static ScreenHandlerType<DirectionalDataScreenHandler> DIRECTIONAL_DATA;

	public static void init()
	{
		WITCH = ScreenHandlerRegistry.registerSimple(BiomeMakeover.ID("witch"), WitchScreenHandler::new);
		DIRECTIONAL_DATA = ScreenHandlerRegistry.registerExtended(BiomeMakeover.ID("directional_data"), DirectionalDataScreenHandler::new);
	}
}
