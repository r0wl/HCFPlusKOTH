package life.steeze.hcfpluskoth;

import life.steeze.hcfplus.HCFPlugin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class HCFPlusKoth extends JavaPlugin {
    private final Plugin p = Bukkit.getPluginManager().getPlugin("HCFPlus");
    private HCFPlugin hcfplus = null;

    public boolean pluginExists(){
        if(p==null) return false;
        hcfplus = (HCFPlugin) p;
        return true;
    }

    @Override
    public void onEnable(){
        if(!pluginExists()) return;
        
    }
}
