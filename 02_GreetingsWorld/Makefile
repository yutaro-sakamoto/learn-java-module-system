MODULE_DIRS = mods/org.astro mods/com.greetings
ASTRO_TARGET = mods/org.astro/org/astro/World.class
GREETINGS_TARGET = mods/com.greetings/com/greetings/Main.class
ASTRO_SRC = src/org.astro/module-info.java src/org.astro/org/astro/World.java
GREETINGS_SRC = src/com.greetings/module-info.java src/com.greetings/com/greetings/Main.java

all: $(MODULE_DIRS) $(ASTRO_TARGET) $(GREETINGS_TARGET)
	java --module-path mods -m com.greetings/com.greetings.Main

$(ASTRO_TARGET): $(ASTRO_SRC)
	javac -d mods/org.astro $(ASTRO_SRC)

$(GREETINGS_TARGET): $(GREETINGS_SRC) $(ASTRO_TARGET)
	javac --module-path mods -d mods/com.greetings $(GREETINGS_SRC)

$(MODULE_DIRS):
	mkdir -p $(MODULE_DIRS)

clean:
	rm -rf mods

.PHONY: all clean
