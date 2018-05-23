package com.pioneerx1.player.dao;

import java.util.HashMap;
import java.util.Map;

import com.pioneerx1.player.dto.Player;

public class PlayerDAOImpl implements PlayerDAO {
	
	Map<Integer, Player> players = new HashMap<>();

	@Override
	public void create(Player player) {
		players.put(player.getId(), player);
	}

	@Override
	public Player read(int id) {
		return players.get(id);
	}

	@Override
	public void update(Player player) {
		// no initial implementation 
		players.put(player.getId(), player);
	}

	@Override
	public void delete(int id) {
		// no initial implementation
		players.remove(id);
	}

}
