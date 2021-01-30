package ca.evannosich.Trapiche;

// Import ModInitializer
import net.fabricmc.api.ModInitializer;

// Import item classes
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;

// Import Minecraft util classes
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Trapiche implements ModInitializer {
	private final static String MOD_ID = "trapiche";
	
	public final static EmeraldToolMaterial EMERALD_TOOL_MATERIAL = new EmeraldToolMaterial();
	
	public final static EmeraldSwordItem EMERALD_SWORD = new EmeraldSwordItem(EMERALD_TOOL_MATERIAL, 7, 1.6F, new Item.Settings().group(ItemGroup.COMBAT));
	public final static EmeraldShovelItem EMERALD_SHOVEL = new EmeraldShovelItem(EMERALD_TOOL_MATERIAL, 6, 1F, new Item.Settings().group(ItemGroup.TOOLS));
	public final static EmeraldPickaxeItem EMERALD_PICKAXE = new EmeraldPickaxeItem(EMERALD_TOOL_MATERIAL, 5, 1.2F, new Item.Settings().group(ItemGroup.TOOLS));
	public final static EmeraldAxeItem EMERALD_AXE = new EmeraldAxeItem(EMERALD_TOOL_MATERIAL, 9, 1F, new Item.Settings().group(ItemGroup.TOOLS));
	public final static EmeraldHoeItem EMERALD_HOE = new EmeraldHoeItem(EMERALD_TOOL_MATERIAL, 1, 4F, new Item.Settings().group(ItemGroup.TOOLS));
	
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_sword"), EMERALD_SWORD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_shovel"), EMERALD_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_pickaxe"), EMERALD_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_axe"), EMERALD_AXE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_hoe"), EMERALD_HOE);
	}
}