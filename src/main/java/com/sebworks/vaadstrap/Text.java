package com.sebworks.vaadstrap;

import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Label;

/**
 * Text class has builder methods for creating html5 compliant text
 * Created by bekce on 3/14/17.
 */
public class Text extends Label {

	protected StringBuilder sb = new StringBuilder();

	public Text() {
		setContentMode(ContentMode.HTML);
	}

	public Text(String text) {
		this();
		append(text);
	}

	public Text append(String text) {
		sb.append(text);
		return flush();
	}

	public Text startParagraph() {
		sb.append("<p>");
		return flush();
	}

	public Text startParagraph(Style style) {
		sb.append("<p class=\"").append(style.getStyleName()).append("\">");
		return flush();
	}

	public Text endParagraph() {
		sb.append("</p>");
		return flush();
	}

	public Text appendParagraph(String text) {
		sb.append("<p>").append(text).append("</p>");
		return flush();
	}

	public Text appendParagraph(Style style, String text) {
		sb.append("<p class=\"").append(style.getStyleName()).append("\">").append(text).append("</p>");
		return flush();
	}

	public Text appendMarked(String text) {
		sb.append("<mark>").append(text).append("</mark>");
		return flush();
	}

	public Text appendDeleted(String text) {
		sb.append("<del>").append(text).append("</del>");
		return flush();
	}

	public Text appendStrikethrough(String text) {
		sb.append("<s>").append(text).append("</s>");
		return flush();
	}

	public Text appendInserted(String text) {
		sb.append("<ins>").append(text).append("</ins>");
		return flush();
	}

	public Text appendUnderlined(String text) {
		sb.append("<u>").append(text).append("</u>");
		return flush();
	}

	public Text appendSmall(String text) {
		sb.append("<small>").append(text).append("</small>");
		return flush();
	}

	public Text appendBold(String text) {
		sb.append("<strong>").append(text).append("</strong>");
		return flush();
	}

	public Text appendItalics(String text) {
		sb.append("<em>").append(text).append("</em>");
		return flush();
	}

	public Text appendLink(String href, String text) {
		sb.append("<a href=\"").append(href).append("\">").append(text).append("</a>");
		return flush();
	}

	public Text appendLink(String href) {
		return appendLink(href, href);
	}

	public Text appendAbbreviation(String text, String title) {
		sb.append("<abbr title=").append(title).append("\">").append(text).append("</abbr>");
		return flush();
	}

	public Text appendAddress(String... text) {
		sb.append("<address>");
		for (int i = 0; i < text.length; i++) {
			if (i == 0) appendBold(text[i]);
			else append(text[i]);
			if (i < text.length - 1) newLine();
		}
		sb.append("</address>");
		return flush();
	}

	public Text appendH1(String header){
		sb.append("<h1>").append(header).append("</h1>");
		return flush();
	}
	public Text appendH2(String header){
		sb.append("<h2>").append(header).append("</h2>");
		return flush();
	}
	public Text appendH3(String header){
		sb.append("<h3>").append(header).append("</h3>");
		return flush();
	}
	public Text appendH4(String header){
		sb.append("<h4>").append(header).append("</h4>");
		return flush();
	}
	public Text appendH5(String header){
		sb.append("<h5>").append(header).append("</h5>");
		return flush();
	}
	public Text appendH6(String header){
		sb.append("<h6>").append(header).append("</h6>");
		return flush();
	}

	public Text newLine() {
		sb.append("<br/>");
		return flush();
	}

	public Text clear() {
		sb = new StringBuilder();
		return flush();
	}

	private Text flush() {
		setValue(sb.toString());
		return this;
	}

	@Override
	public void attach() {
		super.attach();
		setValue(sb.toString());
	}
}
