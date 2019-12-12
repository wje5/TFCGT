package com.pinball3d.tfcgt.item;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.enums.Materials;
import gregtech.api.enums.SubTag;
import net.minecraft.item.Item;

public class ItemLoader {
	public static Map<String, Item> itemMap = new HashMap<String, Item>();

	public static void load() {
//		OrePrefixes.alloy.get(aMaterial)
		Iterator<Materials> it = Materials.getAll().iterator();
		while (it.hasNext()) {
			Materials i = it.next();
			if (i.contains(SubTag.METAL)) {

			}
		}
	}

	private static void register(String name) {
		Item item = createItem(name);
		GameRegistry.registerItem(item, item.getUnlocalizedName());
		itemMap.put(item.getUnlocalizedName(), item);
	}

	private static Item createItem(String name) {
		return new Item().setUnlocalizedName(name).setTextureName("tfcgt:" + name);
	}
}
