package com.sebworks.vaadstrap;

import java.util.Locale;

/**
 * Created by bekce on 3/14/17.
 */
public enum TextMod implements Style {
    LEAD,

    TEXT_LEFT,
    TEXT_CENTER,
    TEXT_RIGHT,
    TEXT_JUSTIFY,
    TEXT_NOWRAP,

    TEXT_LOWERCASE,
    TEXT_UPPERCASE,
    TEXT_CAPITALIZE,

    TEXT_MUTED,
    TEXT_PRIMARY,
    TEXT_SUCCESS,
    TEXT_INFO,
    TEXT_WARNING,
    TEXT_DANGER,

    BG_PRIMARY,
    BG_SUCCESS,
    BG_INFO,
    BG_WARNING,
    BG_DANGER,

    PULL_LEFT,
    PULL_RIGHT,
    CENTER_BLOCK,

    SHOW,
    HIDDEN,
    INVISIBLE,

    SR_ONLY,
    SR_ONLY_FOCUSABLE;

    private String styleName;
    TextMod(){
        this.styleName = name().toLowerCase(Locale.ENGLISH).replace('_', '-');
    }

    @Override
    public String getStyleName() {
        return styleName;
    }
}
