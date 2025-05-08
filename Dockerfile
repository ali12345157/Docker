# Use Ubuntu as the base image to ensure availability of apt-get
FROM ubuntu:20.04

# Set the environment variable for non-interactive installation
ENV DEBIAN_FRONTEND=noninteractive

# Install OpenJDK 17 and essential tools
RUN apt-get update && apt-get install -y \
    openjdk-17-jdk \
    wget \
    unzip \
    git \
    gradle \
    && rm -rf /var/lib/apt/lists/*

# Setup Android SDK
ENV ANDROID_SDK_ROOT=/sdk
RUN mkdir -p $ANDROID_SDK_ROOT && \
    cd $ANDROID_SDK_ROOT && \
    wget https://dl.google.com/android/repository/commandlinetools-linux-11076708_latest.zip -O tools.zip && \
    unzip tools.zip && rm tools.zip && \
    mv $ANDROID_SDK_ROOT/cmdline-tools $ANDROID_SDK_ROOT/cmdline-tools_latest

# Set PATH for Android SDK tools
ENV PATH "$PATH:$ANDROID_SDK_ROOT/cmdline-tools_latest/bin:$ANDROID_SDK_ROOT/platform-tools"

# Accept Android SDK licenses
RUN yes | $ANDROID_SDK_ROOT/cmdline-tools_latest/bin/sdkmanager --sdk_root=$ANDROID_SDK_ROOT --licenses

# Install required SDK tools (platforms, build-tools, etc.)
RUN $ANDROID_SDK_ROOT/cmdline-tools_latest/bin/sdkmanager --sdk_root=$ANDROID_SDK_ROOT \
    "platform-tools" \
    "platforms;android-33" \
    "build-tools;33.0.2"

# Copy your project into the container
WORKDIR /app
COPY . .

# Set executable permission for gradlew
RUN chmod +x gradlew

# Build the app
RUN ./gradlew assembleDebug

# Default command to run the app
CMD ["./gradlew", "assembleDebug"]
