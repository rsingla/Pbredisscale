package io.apicode.log;

public @interface FluentLog {

	String message() default "";

	LogLevel level() default LogLevel.ALL;

}
