package si.meansoft.traincraft.items;

import java.util.Locale;

/**
 * @author Ellpeck
 */
public class ItemMaterial extends ItemSubtypeBase{

    public ItemMaterial(){
        super("material", Materials.class);
    }

    public enum Materials{

        GRAPHITE(),
        PLASTIC(),
        COAL_DUST(),
        BALLOON(),
        PROPELLER(),
        PISTON(),
        CAMSHAFT(),
        CYLINDER(),
        SEATS(),
        TRANSFORMER(),
        CONTROLS(),
        TRANSMITION(),
        GENERATOR(),
        ELECTRONIC_CIRCUIT(),
        STEAM_ENGINE(),
        DIESEL_ENGINE(),
        ELECTRIC_ENGINE(),
        FUEL_CANISTER_EMPTY(),
        FUEL_CANISTER_FULL(),
        WOODEN_BOGIE(),
        WOODEN_CAB(),
        WOODEN_FRAME(),
        IRON_BOGIE(),
        IRON_BOILER(),
        IRON_CAB(),
        IRON_CHIMNEY(),
        IRON_FRAME(),
        IRON_FIREBOX(),
        STEEL_INGOT(),
        STEEL_DUST(),
        STEEL_BOGIE(),
        STEEL_BOILER(),
        STEEL_CAB(),
        STEEL_CHIMNEY(),
        STEEL_FRAME(),
        STEEL_FIREBOX();


        public String name = name().toLowerCase(Locale.ROOT);

        Materials(String name){
            this.name = name;
        }
        Materials(){}

        public String toString(){
            return this.name;
        }

    }
}
