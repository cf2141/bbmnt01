package de.jwic.mobile12.demos;

import de.jwic.controls.HTMLElement;
import java.util.HashMap;
import java.util.Map;

import de.jwic.base.IControlContainer;

/**
 * @author dotto
 * @date Jul 6, 2015
 * 
 */
public class EchoLabel extends HTMLElement {
	
	private static final long serialVersionUID = 1L;

	private String strText = "";
	private Map<String, String> styles = new HashMap<String, String>();

	/**
	 * @param container
	 */
	public EchoLabel(IControlContainer container) {
		super(container, null);
	}
	
	/**
	 * @param container
	 * @param name
	 */
	public EchoLabel(IControlContainer container, String name) {
		super(container, name);
	}
	
	/**
	 *
	 * @return java.lang.String
	 */
	public String getText() {
		return strText;
	}
	
	public String getEcho() {
		return "http:"+'/'+'/'+"localhost:8080"+'/'+"01-amp3s"+'/'+strText;
	}
	
	/**
	 *
	 * @param newText java.lang.String
	 */
	public void setText(String newText) {
		strText = newText;
		setRequireRedraw(true);
	}
	
	/**
	 * Add a style.
	 * @param style
	 * @param value
	 */
	public void setStyle(String style, String value) {
		if (value == null) {
			styles.remove(style);
		} else {
			styles.put(style, value);
		}
		requireRedraw();
	}
	
	/**
	 * @return the styles
	 */
	public Map<String, String> getStyles() {
		return styles;
	}
	
	/**
	 * Compute the complete style entry.
	 * @return
	 */
	public String computeStyle() {
		StringBuilder sb = new StringBuilder();
		for (String key : styles.keySet()) {
			sb.append(key).append(": ").append(styles.get(key)).append(";");
		}
		return sb.toString();
	}
	
	public boolean isAudio(){
		return true;
	}
	
}