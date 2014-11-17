package me.hii488.moRandomStuff.ice.items;

import me.hii488.moRandomStuff.main.Main;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class FrostRod extends IceItem<FrostRod> {

    public static final class Renderer implements IItemRenderer {
        /** Defines the zLevel of rendering of item on GUI. */
        public float zLevel;

        @Override
        public boolean handleRenderType(ItemStack item, ItemRenderType type) {
            return type == ItemRenderType.INVENTORY;
        }

        @Override
        public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
            return false;
        }

        @Override
        public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

            if (type == ItemRenderType.INVENTORY) {
                IceItem<?> item2 = (IceItem<?>) item.getItem();
                FrostRod idm = instance;
                if (item2.getMeltedness() > 0) {
                    idm = instances[item2.getMeltedness()];
                }
                IIcon icon = new ItemStack(idm).getIconIndex();
                //TODO: Rather than using a different texture for each state of "meltedness", we could probably just render an
                //actual bar here.
                new RenderItem().renderIcon(0, 0, icon, 16, 16);
            }
        }
    }

    static FrostRod instance;
    private static FrostRod[] instances = new FrostRod[12];

    static final String DICT = "rodFrost";

    public FrostRod(int i) {
        super(i, 12);

        setUnlocalizedName(DICT);
    }

    @Override
    public void registerIcons(IIconRegister par1IconRegister) {
        final String baseString = Main.MODID + ":" + DICT;
        this.itemIcon = par1IconRegister.registerIcon(baseString);
        for (int i = 0; i < instances.length; i++) {
            String string = baseString + "-" + (12 - i);
            instances[i].itemIcon = par1IconRegister.registerIcon(string);
        }
    }

    public static void init() {

        initInstances();
        GameRegistry.registerItem(instance, DICT);
        OreDictionary.registerOre(DICT, instance);
        MinecraftForge.EVENT_BUS.register(instance);
        Renderer r = new Renderer();
        MinecraftForgeClient.registerItemRenderer(instance, r);
        for (FrostRod i : instances) {
            MinecraftForgeClient.registerItemRenderer(i, r);
        }

    }

    static void initInstances() {
        instance = new FrostRod(0);
        instances[0] = new FrostRod(1);
        instances[1] = new FrostRod(2);
        instances[2] = new FrostRod(3);
        instances[3] = new FrostRod(4);
        instances[4] = new FrostRod(5);
        instances[5] = new FrostRod(6);
        instances[6] = new FrostRod(7);
        instances[7] = new FrostRod(8);
        instances[8] = new FrostRod(9);
        instances[9] = new FrostRod(10);
        instances[10] = new FrostRod(11);
        instances[11] = new FrostRod(12);
    }

    @SubscribeEvent
    public void abc(EntityItemPickupEvent e) {
        super.combineMeltValues(e);
    }

    @Override
    public FrostRod withMeltedness(int i) {
        int meltedNess = Math.min(i, getMaxMeltedness());
        if (i == 0) {
            return withNoMelt();
        }
        return instances[meltedNess-1];
    }

    @Override
    public FrostRod withNoMelt() {
        return instance;
    }

    @Override
    public String toString() {
        return "FrostRod [] - Texture: " + this.iconString + " Meltedness: " + this.getMeltedness();
    }

}
