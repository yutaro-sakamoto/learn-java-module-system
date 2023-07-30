MODULE_DIRS = mods/org.astro mods/com.greetings
ASTRO_TARGET = mods/org.astro/org/astro/World.class
GREETINGS_TARGET = mods/com.greetings/com/greetings/Main.class
TARGET = $(ASTRO_TARGET) $(GREETINGS_TARGET)
ASTRO_SRC = src/org.astro/module-info.java src/org.astro/org/astro/World.java
GREETINGS_SRC = src/com.greetings/module-info.java src/com.greetings/com/greetings/Main.java
SRC = $(ASTRO_SRC) $(GREETINGS_SRC)

all: $(MODULE_DIRS) $(TARGET)
	java --module-path mods -m com.greetings/com.greetings.Main

$(TARGET): $(SRC)
	javac -d mods --module-source-path src $(SRC)

$(MODULE_DIRS):
	mkdir -p $(MODULE_DIRS)

clean:
	rm -rf mods

.PHONY: all clean
