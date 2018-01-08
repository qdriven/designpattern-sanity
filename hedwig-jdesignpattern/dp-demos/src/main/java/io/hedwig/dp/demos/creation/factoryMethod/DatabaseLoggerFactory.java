package io.hedwig.dp.demos.creation.factoryMethod;

/**
 * 1. author: patrick
 */
public class DatabaseLoggerFactory implements LoggerFactory {

  @Override
  public Logger createLogger() {
    return new DatabaseLogger();
  }
}
