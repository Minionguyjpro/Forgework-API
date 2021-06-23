/*
 * Minecraft Forge, Patchwork Project
 * Copyright (c) 2016-2020, 2019-2020
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.event.entity.item;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;

/**
 * Event that is fired whenever a player tosses (Q) an item or drag-n-drops a
 * stack of items outside the inventory GUI screens. If cancelled, the items
 * entity will not be created, but the items will be removed from the player's
 * inventory.
 */
public class ItemTossEvent extends ItemEvent {
	private final PlayerEntity player;

	/**
	 * Creates a new event for ItemEntities tossed by a player.
	 *
	 * @param itemEntity The ItemEntity being tossed.
	 * @param player The player tossing the item.
	 */
	public ItemTossEvent(ItemEntity itemEntity, PlayerEntity player) {
		super(itemEntity);
		this.player = player;
	}

	/**
	 * The player tossing the item.
	 */
	public PlayerEntity getPlayer() {
		return player;
	}

	@Override
	public boolean isCancelable() {
		return true;
	}
}