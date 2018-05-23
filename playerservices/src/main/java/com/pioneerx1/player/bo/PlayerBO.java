package com.pioneerx1.player.bo;

import com.pioneerx1.player.dto.Player;

public interface PlayerBO {
	
	public void create(Player player);
	
	public Player findPlayer(int id);

}
