package com.pioneerx1.player.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.util.Assert;

import com.pioneerx1.player.dto.Player;

public class PlayerDAOImplTest {
	
	@Test
	public void createShouldCreateAPlayer() {
		
		// instantiate player
		Player player = new Player();
		player.setId(1);
		player.setName("Mickles");
		player.setScore(95);
		
		// fold player into data access object
		PlayerDAO dao = new PlayerDAOImpl();
		dao.create(player);
		
		// find that player in the DAO
		Player savedPlayer = dao.read(player.getId());
		
		// Assert
		Assert.notNull(savedPlayer);
		assertEquals(savedPlayer.getName(), player.getName());
		
	}

}
