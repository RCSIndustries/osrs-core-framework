package com.openrsc.server.constants;

import java.util.HashMap;
import java.util.Map;

public enum BoundaryId {
	NOTHING(-1),
	WALL(0),
	DOORFRAME(1),
	DOOR(2),
	WINDOW_UNUSED(3),
	FENCE_UNUSED(4),
	RAILINGS_UNUSED(5),
	STAINED_GLASS_WINDOW(6),
	HIGHWALL_UNUSED(7),
	DOOR_GRAY_BRICKS(8),
	DOORFRAME_GRAY_BRICKS(9),
	BATTLEMENT_UNUSED(10),
	DOORFRAME_UNUSED(11),
	SNOWWALL_UNUSED(12),
	ARROWSLIT_UNUSED(13),
	TIMBERWALL(14),
	TIMBERWINDOW(15),
	BLANK(16),
	HIGHBLANK(17),
	MOSSYBRICKS(18),
	DOOR_PHOENIX_HQ(19),
	DOOR_PHOENIX_WEAPON_KEY(20),
	DOOR_BLACKARM_HQ(21),
	ODD_LOOKING_WALL(22),
	DOOR_BRASS_KEY(23),
	WEB(24),
	DOOR_ERNEST_CENTER_TOP_EAST(25),
	DOOR_ERNEST_CENTER_TOP_WEST(26),
	DOOR_ERNEST_CENTER_MIDDLE_EAST(27),
	DOOR_ERNEST_CENTER_MIDDLE_WEST(28),
	DOOR_ERNEST_LEFT_BOTTOM_EAST(29),
	DOOR_ERNEST_CENTER_MIDDLE_NORTH_OR_LOCKED(30),
	DOOR_ERNEST_LEFT_MIDDLE_NORTH(31),
	DOOR_ERNEST_RIGHT_BOTTOM_NORTH_OR_CAULDRON(32),
	DOOR_ERNEST_CENTER_BOTTOM_NORTH(33),
	WINDOW_UNUSED1(34),
	DOOR_DRAYNOR_MANOR_CLOSET_KEY(35),
	DOOR_DRAYNOR_MANOR_LOBBY(36),
	DOOR_DRAYNOR_MANOR_BACK_DOOR(37),
	DOOR_BLACK_KNIGHT_GUARD_ENTRANCE(38),
	DOOR_BLACK_KNIGHT_TOWARD_MEETING(39),
	DOOR_BLACK_KNIGHT_ESCAPE_MEETING(40),
	CRUMBLED(41),
	CAVERN(42),
	DOOR_COOKING_GUILD(43),
	DOOR_CHAMPIONS_GUILD(44),
	DOOR_PRINCE_ALI_JAIL(45),
	CAVERN2(46),
	DOOR_WYDIN_GROCERY(47),
	DOOR_MELZAR_RED_KEY(48),
	DOOR_MELZAR_ORANGE_KEY(49),
	DOOR_MELZAR_YELLOW_KEY(50),
	DOOR_MELZAR_BLUE_KEY(51),
	DOOR_MELZAR_BLACK_KEY(52),
	DOOR_MELZAR_MAGENTA_KEY(53),
	DOOR_MELZAR_BASEMENT_FROM_OUTSIDE_OR_EXIT(54),
	DOOR_MINING_GUILD(55),
	WALL_UNUSED(56),
	DOOR_MAP_PIECE(57),
	STRANGE_LOOKING_WALL_KARAMJA_CRANDOR(58),
	DOOR_DRAGON_LAIR(59),
	DOOR_MAZE_KEY(60),
	DOOR_UNUSED1(61),
	MEMBERRAILINGS_UNUSED(62),
	DOOR_DRUIDIC_CAULDRON_GUARDED(63),
	DOOR_DRUIDIC_CAULDRON_WALK(64),
	MAGIC_DOOR_ENTRANA_DUNGEON(65),
	DOOR_TO_LOST_CITY(66),
	DOOR_LOST_CITY_MARKETPLACE(67),
	DOOR_CRAFTING_GUILD(68),
	DOOR_WITCHS_FRONT_KEY(69),
	DOOR_WITCHS_MAIN_ROOM(70),
	DOOR_WITCHS_RAT_MAGNET(71),
	DOOR_WITCHS_HIDEOUT(72),
	DOOR_WITCHS_SHED(73),
	DOOR_HEROS_GUILD(74),
	DOOR_GARV_GUARD(75),
	DOOR_GRUBOR_CODE(76),
	DOOR_GRIP_ROOM(77),
	DOOR_CHARLIE_COOK(78),
	STRANGE_PANEL_COOK(79),
	DOOR_MISCELLANEOUS_KEY(80),
	DOOR_GRIP_TREASURE_ROOM(81),
	DOOR_LOCKED_QUEST(82),
	DOOR_JAIL_KEY(83),
	DOOR_DUSTY_KEY(84),
	DOOR_BEGGAR_GRUM(85),
	BLOCKBLANK(86),
	UNUSUAL_LOOKING_WALL_SCORPION(87),
	DOOR_ARDY_DUNG_SE(88),
	DOOR_UNUSED2(89),
	DOOR_ARDY_DUNG_SW(90),
	DOOR_PERFECT_GOLD(91),
	DOOR_ARDY_DUNG_N(92),
	DOOR_10_GOLD_CHEST(93),
	DOOR_PICK_LOCK(94),
	DOOR_ARDOUGNE_SEWER(95),
	DOOR_CHAOS_DRUID_TOWER(96),
	DOOR_PALADIN_CASTLE(97),
	DOOR_CRATE_RIDDLE(98),
	DOOR_PIRATE_HIDEOUT(99),
	DOOR_ANIMATED_AXE(100),
	FENCE_WITH_LOOSE_PANNELS(101),
	DOOR_UNUSED3(102),
	DOOR_UNUSED4(103),
	DOOR_TEMPLE_IKOV_FEAR_ROOM(104),
	DOOR_TEMPLE_IKOV_LEVER_PIECE(105),
	DOOR_TEMPLE_IKOV_ICE_ARROW(106),
	DOOR_TEMPLE_IKOV_LEVER_PULL(107),
	DOOR_TEMPLE_IKOV_FIRE_WARRIOR(108),
	DOOR_LUCIEN_HIDEOUT(109),
	DOOR_SHINY_KEY(110),
	RAT_CAGE(111),
	DOOR_FISHING_GUILD(112),
	DOOR_KHAZARD_HOUSE(113),
	DOOR_KHAZARD_BFIELD_LOBBY(114),
	DOOR_KHAZARD_BATTLE_FIELD(115),
	DOOR_MAGIC_WHISTLE(116),
	DOOR_MERLIN_LOCKED(117),
	ARROWSLIT(118),
	SOLIDBLANK_UNUSED(119),
	DOOR_PLAGUE_UNOPENABLE(120),
	DOOR_TO_BRAVEK(121),
	DOOR_REHNISON_FAMILY(122),
	DOOR_INFECTED_CAPTURED_ELENA(123),
	LOOSE_PANEL_SEASLUG(124),
	DOOR_CONTINUE_START_GUIDE(125),
	PLANKSWINDOW_UNUSED(126),
	LOW_FENCE_UNUSED(127),
	DOOR_UNUSED5(128),
	DOOR_CONTINUE_COOKING_INSTRUCTOR(129),
	DOOR_CONTINUE_COMBAT_INSTRUCTOR(130),
	DOOR_CONTINUE_FISHING_INSTRUCTOR(131),
	DOOR_CONTINUE_MINING_INSTRUCTOR(132),
	DOOR_CONTINUE_BANK_ASSISTANT(133),
	DOOR_CONTINUE_FINANCIAL_ADVISOR(134),
	DOOR_WATERFALL_OLD_KEY(135),
	DOOR_CONTINUE_QUEST_ADVISOR(136),
	COOKING_POT_UNUSED(137),
	DOOR_MOURNER_HEADQUARTERS(138),
	DOOR_CONTINUE_WILDERNESS_GUIDE(139),
	DOOR_CONTINUE_MAGIC_INSTRUCTOR(140),
	DOOR_SICK_MOURNER(141),
	DOOR_CONTINUE_COMMUNITY_INSTRUCTOR(142),
	DOOR_CONTINUE_CONTROLS_GUIDE(143),
	PLANKSTIMBER_UNUSED(144),
	DOOR_GUIDOR_ROOM(145),
	DOOR_WIZARDS_GUILD(146),
	MAGIC_PORTAL_WIZARDS_GUILD_NORTH(147),
	MAGIC_PORTAL_WIZARDS_GUILD_EAST(148),
	MAGIC_PORTAL_WIZARDS_GUILD_SOUTH(149),
	DOOR_TRAINING_OGRES_AND_PRACTICE_ZOMBIES(150),
	CAVERN_WALL(151),
	DOOR_ELENAS_HOUSE(152),
	DOOR_ENTER_GRAND_TREE(153),
	DOOR_EXIT_GRAND_TREE(154),
	DOOR_GRANDTREE_1ST_UPSTAIRS_WEST_WING(155),
	DOOR_GRANDTREE_1ST_UPSTAIRS_EAST_WING(156),
	DOOR_GRANDTREE_2ND_UPSTAIRS_NORTH_WING(157),
	DOOR_GRANDTREE_2ND_UPSTAIRS_WEST_WING(158),
	DOOR_GRANDTREE_2ND_UPSTAIRS_SOUTH_WING(159),
	DOOR_GRANDTREE_2ND_UPSTAIRS_EAST_WING(160),
	DOOR_SHIPYARD_FOREMAN(161),
	DOOR_SHORTCUT_YANILLE_DUNGEON(162),
	LOW_WALL_BARBARIAN_LEFT(163),
	LOW_WALL_BARBARIAN_RIGHT(164),
	BLACKSMITHS_DOOR(165),
	RAILINGS_UNUSED1(166),
	RAILINGS_UNDERGROUND_NE_SLAVE(167),
	RAILINGS_UNDERGROUND_CAGED_UNICORN(168),
	RAILINGS_UNDERGROUND_GENERIC(169),
	RAILINGS_UNDERGROUND_PASSAGE(170),
	RAILINGS_UNDERGROUND_KALRAG(171),
	RAILINGS_UNDERGROUND_KARDIA(172),
	DOOR_KARDIAS_PLACE(173),
	DOORFRAME_UNUSED1(174),
	TENT_UNUSED(175),
	JAIL_DOOR_SHANTAY_PASS(176),
	JAIL_DOOR_MINING_CAMP(177),
	WINDOW_JAIL_MINING_CAMP(178),
	MAGIC_PORTAL_DECORATION_WATCHTOWER(179),
	JAIL_DOOR_MINING_CAMP_DUNGEON_CAPTURED(180),
	RAILINGS_REPAIR_EAST_GATE(181),
	RAILINGS_REPAIR_MIDDLE(182),
	RAILINGS_REPAIR_WEST_GATE(183),
	RAILINGS_REPAIR_SOUTH_WEST(184),
	RAILINGS_REPAIR_WEST(185),
	RAILINGS_REPAIR_WESTERN_MOST(186),
	CAVE_EXIT_SOUTHEAST(187),
	CAVE_EXIT_NORTHWEST(188),
	CAVE_EXIT_NORTH(189),
	CAVE_EXIT_GUTANOTH_ENTRANCE(190),
	CAVE_EXIT_EAST(191),
	CAVE_EXIT_SOUTH(192),
	RAILINGS_FUNCTIONAL(193),
	DOOR_TO_FIX_DWARF_CANNON(194),
	BATTLEMENT(195),
	TENT_DOOR_GENERIC(196),
	DOOR_TO_DWARF_CANNON_ENGINEER(197),
	TENT_DOOR_EXPERIMENTAL_ANVIL(198),
	LOW_FENCE_LUMBER_MILL(199),
	STURDY_IRON_GATE(200),
	BATTLEMENT_PEEK_GORAD_ISLAND(201),
	WATER_UNUSED(202),
	WHEAT_UNUSED(203),
	JUNGLE(204),
	WINDOW_MURDER_MYSTERY(205),
	RUT(206),
	CRUMBLED_CAVERN_1(207),
	CRUMBLED_CAVERN_2(208),
	CAVERNHOLE(209),
	FLAMEWALL(210),
	RUINED_WALL(211),
	ANCIENT_WALL(212),
	DOOR_CONTINUE_FATIGUE_EXPERT(213);

	private int boundaryId;

	private static final Map<Integer, BoundaryId> byId = new HashMap<>();

	static {
		for (BoundaryId boundary : BoundaryId.values()) {
			if (byId.put(boundary.id(), boundary) != null) {
				throw new IllegalArgumentException("duplicate id: " + boundary.id());
			}
		}
	}

	public static BoundaryId getById(Integer id) {
		return byId.getOrDefault(id, BoundaryId.NOTHING);
	}

	/**
	 * @param boundaryId The ID of the item.
	 */
	BoundaryId(int boundaryId) {
		this.boundaryId = boundaryId;
	}

	/**
	 * @return The items ID
	 */
	public int id() {
		return boundaryId;
	}
}
