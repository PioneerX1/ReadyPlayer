package com.pioneerx1.player.dao;

import com.pioneerx1.player.dto.Player;

public interface PlayerDAO {
	
	void create(Player player);
	
	Player read(int id);
	
	void update(Player player);
	
	void delete(int id);

}
