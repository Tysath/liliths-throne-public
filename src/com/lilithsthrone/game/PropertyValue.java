package com.lilithsthrone.game;

/**
 * @since 0.2.2
 * @version 0.2.7
 * @author Innoxia
 */
public enum PropertyValue {

	artwork(true),
	
	lightTheme(false),
	overwriteWarning(true),
	fadeInText(false),
	calendarDisplay(true),
	twentyFourHourTime(true),
	tattooRemovalConfirmations(true),
	
	furryTailPenetrationContent(false),
	nonConContent(false),
	incestContent(false),
	forcedTransformationContent(false),
	inflationContent(true),
	facialHairContent(false),
	pubicHairContent(false),
	bodyHairContent(false),
	assHairContent(false),
	feminineBeardsContent(false),
	lactationContent(true),
	cumRegenerationContent(true),
	urethralContent(false),
	nipplePenContent(true),
	analContent(true),
	futanariTesticles(true),

	levelUpHightlight(false),
	newWeaponDiscovered(false),
	newClothingDiscovered(false),
	newItemDiscovered(false),
	newRaceDiscovered(false);
	
	
	private boolean defaultValue;

	private PropertyValue(boolean defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	public boolean getDefaultValue() {
		return defaultValue;
	}
}
