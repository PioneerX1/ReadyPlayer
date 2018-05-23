package com.pioneerx1.player.bo;

import com.pioneerx1.player.dao.PlayerDAO;
import com.pioneerx1.player.dto.Player;

public class PlayerBOImpl implements PlayerBO {
	
	private PlayerDAO dao;
	
	public PlayerDAO getDao() {
		return dao;
	}

	public void setDao(PlayerDAO dao) {
		this.dao = dao;
	}

	@Override
	public void create(Player player) {
		dao.create(player);
	}

	@Override
	public Player findPlayer(int id) {
		return dao.read(id);
	}

}
