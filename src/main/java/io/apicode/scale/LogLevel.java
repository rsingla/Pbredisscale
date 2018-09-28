package io.apicode.scale;

import java.util.logging.Level;

public enum LogLevel {

	INFO(Level.INFO), SEVERE(Level.SEVERE), CONFIG(Level.CONFIG), WARNING(Level.WARNING), FINE(Level.FINE),
	FINER(Level.FINER), FINEST(Level.FINEST), ALL(Level.ALL);

	public Level level;

	LogLevel(Level level) {
		this.level = level;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

}
