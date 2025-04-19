#!/usr/bin/env sh

##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
DEFAULT_JVM_OPTS=""

APP_NAME="Gradle"
APP_BASE_NAME=`basename "$0"`

# Locate the JAVA_HOME automatically if not set
if [ -z "$JAVA_HOME" ]; then
  JAVA_EXE=$(which java)
else
  JAVA_EXE="$JAVA_HOME/bin/java"
fi

# Resolve the location of the Gradle wrapper jar file
WRAPPER_JAR="$APP_BASE_NAME-wrapper.jar"

# Determine the wrapper jar location
CLASSPATH="$APP_BASE_NAME/lib/$WRAPPER_JAR"

# Execute Gradle
exec "$JAVA_EXE" $DEFAULT_JVM_OPTS -cp "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
