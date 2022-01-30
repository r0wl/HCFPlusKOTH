package life.steeze.hcfpluskoth;

import life.steeze.hcfplus.HCFPlugin;
import life.steeze.hcfplus.Objects.Selection;
import org.bukkit.World;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.util.BoundingBox;

public class KOTHZone {
    private int x1,x2,z1,z2;
    private BoundingBox zone;
    private World world;

    private HCFPlugin plugin;

    public KOTHZone(Selection s, HCFPlugin plugin){
        this.x1 = s.pos1().x;
        this.z1 = s.pos1().y;
        this.x2 = s.pos2().x;
        this.z2 = s.pos2().y;
        this.zone = new BoundingBox(this.x1,0,this.z1,this.x2,255,this.z2);
        this.world = s.getWorld();
        this.plugin = plugin;
    }
}
