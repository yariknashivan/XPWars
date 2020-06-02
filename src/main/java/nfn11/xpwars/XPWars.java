package nfn11.xpwars;

import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.screamingsandals.bedwars.commands.BaseCommand;
import org.screamingsandals.simpleinventories.listeners.InventoryListener;

import nfn11.xpwars.commands.SBWACommand;
import nfn11.xpwars.inventories.LevelShop;

public class XPWars extends JavaPlugin {
	
	private static XPWars instance;
	private Configurator configurator;
	private HashMap<String, BaseCommand> commands;
	
	@Override
	public void onEnable() {
		instance = this;
		
		configurator = new Configurator(this);
		configurator.loadDefaults();
		
		if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new nfn11.xpwars.placeholderapi.PlaceholderAPIHook(this).register();
            Bukkit.getLogger().info("[SBWA] Succesfully registered PlaceholderAPI!");
        }
		
		InventoryListener.init(this);
		LevelShop shop = new LevelShop();
		
		commands = new HashMap<>();
		new SBWACommand();
	}
	
	public static Configurator getConfigurator() {
        return instance.configurator;
    }

	public static XPWars getInstance() {
		return instance;
	}
	
	public static HashMap<String, BaseCommand> getCommands() {
        return instance.commands;
    }
}