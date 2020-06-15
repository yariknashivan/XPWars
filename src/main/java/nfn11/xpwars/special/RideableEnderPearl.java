package nfn11.xpwars.special;

import org.bukkit.entity.Player;
import org.screamingsandals.bedwars.api.Team;
import org.screamingsandals.bedwars.api.game.Game;
import org.screamingsandals.bedwars.special.SpecialItem;

public class RideableEnderPearl extends SpecialItem implements nfn11.xpwars.special.api.RideableEnderPearl {
	private Game game;
    private Player player;
    
	public RideableEnderPearl(Game game, Player player, Team team) {
		super(game, player, team);
		this.game = game;
		this.player = player;
	}

}
