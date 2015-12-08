package com.sebworks.vaadstrap;

/**
 * @author seb
 *
 */
public enum ColMod implements Style {

	XS_1,XS_2,XS_3,XS_4,XS_5,XS_6,XS_7,XS_8,XS_9,XS_10,XS_11,XS_12,
	SM_1,SM_2,SM_3,SM_4,SM_5,SM_6,SM_7,SM_8,SM_9,SM_10,SM_11,SM_12,
	MD_1,MD_2,MD_3,MD_4,MD_5,MD_6,MD_7,MD_8,MD_9,MD_10,MD_11,MD_12,
	LG_1,LG_2,LG_3,LG_4,LG_5,LG_6,LG_7,LG_8,LG_9,LG_10,LG_11,LG_12,
	;

	@Override
	public String getStyleName(){
		return String.format("col-%s", name().toLowerCase().replaceAll("_", "-"));
	}
	
}
