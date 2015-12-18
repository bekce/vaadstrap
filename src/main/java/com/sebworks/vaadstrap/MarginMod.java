package com.sebworks.vaadstrap;

/**
 * Applies margin-top. Preferably apply this to rows.
 * 
 * @author seb
 *
 */
public enum MarginMod implements Style {

	TOP5("top5"), TOP7("top7"), TOP10("top10"), TOP15("top15"), TOP20("top20"), TOP30("top30");

	;
	private MarginMod(String value) {
		this.value = value;
	}

	private String value;

	@Override
	public String getStyleName() {
		return value;
	}

}
