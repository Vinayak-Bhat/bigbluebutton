package org.bigbluebutton.webconference.voice;

public class ParticipantJoinedVoiceRecordEvent extends AbstractVoiceRecordEvent {
	/**
	 * Hardcodes the Event Name to "ParticipantJoinedEvent"
	 */
	@Override
	public void setEvent(String event) {
		eventMap.put(EVENT, "ParticipantJoinedEvent");
	}
	
	public void setParticipant(String p) {
		eventMap.put("participant", p);
	}
	
	public void setCallerName(String name) {
		eventMap.put("callername", name);
	}
	
	public void setCallerNumber(String name) {
		eventMap.put("callernumber", name);
	}	
	
	public void setMuted(boolean muted) {
		eventMap.put("muted", Boolean.toString(muted));
	}
	
	public void setTalking(boolean talking) {
		eventMap.put("talking", Boolean.toString(talking));
	}
	
	public void setLocked(boolean locked) {
		eventMap.put("locked", Boolean.toString(locked));
	}
}
