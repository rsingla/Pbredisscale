package io.apicode.scale;

import com.google.common.flogger.FluentLogger;
import java.lang.annotation.Annotation;

public class FluentLogImpl implements FluentLog {

  private static final FluentLogger LOG = FluentLogger.forEnclosingClass();

  @Override
  public Class<? extends Annotation> annotationType() {
    Class method = this.getClass();
    Annotation annotation = method.getAnnotation(FluentLog.class);

    if (annotation instanceof FluentLog) {
      FluentLog myAnnotation = (FluentLog) annotation;
      System.out.println("name: " + myAnnotation.message());
      System.out.println("value: " + myAnnotation.level());
      LOG.at(myAnnotation.level().level).log(myAnnotation.message());
    }

    return annotationType();
  }

  @Override
  public String message() {
    return "";
  }

  @Override
  public LogLevel level() {
    return LogLevel.INFO;
  }
}
