package io.apicode.scale;

import java.lang.annotation.Annotation;

import com.google.common.flogger.FluentLogger;

public class FluentLogImpl implements FluentLog {

	private static final FluentLogger LOG = FluentLogger.forEnclosingClass();

	private String message;
	private LogLevel logLevel;
	
	@Override
	public Class<? extends Annotation> annotationType() {
		return annotationType();
	}

	@Override
	public String message() {
		LOG.at(logLevel.level).log(message);
		return null;
	}

	@Override
	public LogLevel level() {
		return logLevel;
	}

}
