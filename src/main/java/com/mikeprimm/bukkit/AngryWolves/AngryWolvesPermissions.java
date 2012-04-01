package com.mikeprimm.bukkit.AngryWolves;

import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 * Permissions and GroupManager handling - inspired by BigBrother code
 * @author mike
 *
 */
public class AngryWolvesPermissions {
	
	public static void initialize(Server server) {
        AngryWolves.log.info("[AngryWolves] Using Bukkit API for access control");
	}
	/* Fetch specific permission for given player */
	public static boolean permission(Player player, String perm) {
		return player.hasPermission(perm);
	}
}
