package com.pvmtracker;

import net.runelite.client.config.*;

@ConfigGroup("pvmtracker")
public interface PvMTrackerConfig extends Config
{
	int MIN_LEVEL = 1;
	int MAX__LEVEL = 120;

	// ==== Config Sections ====

	@ConfigSection(
			name = "History Panel",
			description = "Contains panel settings.",
			position = 0,
			closedByDefault = true
	)
	String panel = "panel";

	@ConfigSection(
			name = "Combat Stats",
			description = "Contains combat stat settings.",
			position = 50,
			closedByDefault = true
	)
	String cbtStats = "cbtStats";

	// ==== General ====
	@ConfigItem(
		keyName = "pluginVersion",
		name = "Plugin Version",
		description = "Hidden plugin version",
		hidden = true
	)
	default String pluginVersion()
	{
		return PvMTrackerPlugin.PLUGIN_VERSION;
	}
	@ConfigItem(
			keyName = "showFightHistoryPanel",
			name = "Enable Fight History Panel",
			description = "Enables the side panel which displays previous fight statistics.",
			position = -1
	)
	default boolean showFightHistoryPanel()
	{
		return true;
	}

	// ==== Panel Config ====

	@ConfigItem(
			keyName = "showPanelDeservedDamage",
			name = "Show Deserved Damage",
			description = "The panel will display deserved damage.",
			position = 20,
			section = panel
	)
	default boolean showPanelDeservedDamage()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showPanelDamageDealt",
			name = "Show Damage Dealt",
			description = "The panel will display damage dealt.",
			position = 30,
			section = panel
	)
	default boolean showPanelDamageDealt()
	{
		return true;
	}

	@ConfigItem(
			keyName = "trackCurrentZeros",
			name = "Track Current Zero Streak",
			description = "Starting from the first zero since last successfully hitting, " +
					"<br>track the current streak of zeros hit.",
			position = 40,
			section = panel
	)
	default boolean trackCurrentZeros() { return true; }
	@ConfigItem(
			keyName = "showLongestZeroStreak",
			name = "Show Longest Zero Streak",
			description = "The panel will display your longest streak of 0 hits.",
			position = 50,
			section = panel
	)
	default boolean showLongestZeroStreak()
	{
		return true;
	}

	@ConfigItem(
			keyName = "trackCurrentHits",
			name = "Track Current Hit Streak",
			description = "Starting from the first hit since the last zero, " +
					"<br>track the current streak of successful hits.",
			position = 60,
			section = panel
	)
	default boolean trackCurrentHits()
	{
		return true;
	}
	@ConfigItem(
			keyName = "showLongestHitStreak",
			name = "Show Longest Hit Streak",
			description = "The panel will display your longest streak of successful hits.",
			position = 70,
			section = panel
	)
	default boolean showLongestHitStreak() {return true;}
	// ==== Levels Config ====

	@Range(
			min = MIN_LEVEL,
			max = MAX__LEVEL
	)
	@ConfigItem(
			keyName = "attackLevel",
			name = "Attack Level",
			description = "Attack level used for deserved damage calculations.",
			position = 60,
			section = cbtStats
	)
	default int attackLevel()
	{
		return 99;
	}

	@Range(
			min = MIN_LEVEL,
			max = MAX__LEVEL
	)
	@ConfigItem(
			keyName = "strengthLevel",
			name = "Strength Level",
			description = "Strength level used for deserved damage calculations.",
			position = 70,
			section = cbtStats
	)
	default int strengthLevel()
	{
		return 99;
	}

	@Range(
			min = MIN_LEVEL,
			max = MAX__LEVEL
	)
	@ConfigItem(
			keyName = "defenceLevel",
			name = "Defence Level",
			description = "Defence level used for deserved damage calculations.",
			position = 80,
			section = cbtStats
	)
	default int defenceLevel()
	{
		return 99;
	}

	@Range(
			min = MIN_LEVEL,
			max = MAX__LEVEL
	)
	@ConfigItem(
			keyName = "rangedLevel",
			name = "Ranged Level",
			description = "Ranged level used for deserved damage calculations.",
			position = 90,
			section = cbtStats
	)
	default int rangedLevel()
	{
		return 99;
	}

	@Range(
			min = MIN_LEVEL,
			max = MAX__LEVEL
	)
	@ConfigItem(
			keyName = "magicLevel",
			name = "Magic Level",
			description = "Magic level used for deserved damage calculations.",
			position = 100,
			section = cbtStats
	)
	default int magicLevel()
	{
		return 99;
	}

	// ==== Miscellaneous Config ====

	@Range(
			min = 1,
			max = 1000
	)
	@ConfigItem(
			keyName = "fightHistoryRenderLimit",
			name = "Max Rendered Fights",
			description = "Maximum number of previous fights that can be displayed in the fight history." +
					"<br>Will cause game lag at extremely large numbers.",
			position = 110
	)
	default int fightHistoryRenderLimit()
	{
		return 200;
	}
}
