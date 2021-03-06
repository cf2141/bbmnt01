package de.jwic.mobile10.demos;

import de.jwic.events.SelectionListener;
import de.jwic.events.SelectionEvent;
import de.jwic.mobile10.demos.audio.AudioController;

public class AudioSelection implements SelectionListener {
	
	private String    audioTitle = "not set";
	private AudioController audioCtl = null;

	public AudioSelection(String t, AudioController ac){
		audioTitle = t;
		audioCtl = ac;
	}
	
	public void objectSelected(SelectionEvent event){
		System.out.println("objectSelected = "+audioTitle);
		try {
			audioCtl.setAudio(audioTitle);
			audioCtl.requireRedraw();
		} catch( Exception x2 ) {
			System.out.println("AudioSelection.objectSelected "+x2.toString());
		}
	}
	
	public void setTitle(String t){
		audioTitle = t;
	}
}