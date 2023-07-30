MODULE_DIRS = mods/org.astro mods/com.greetings
ASTRO_TARGET = mods/org.astro/org/astro/World.class
GREETINGS_TARGET = mods/com.greetings/com/greetings/Main.class
TARGET = $(ASTRO_TARGET) $(GREETINGS_TARGET)
ASTRO_SRC = src/org.astro/module-info.java src/org.astro/org/astro/World.java
GREETINGS_SRC = src/com.greetings/module-info.java src/com.greetings/com/greetings/Main.java
SRC = $(ASTRO_SRC) $(GREETINGS_SRC)
ASTRO_JAR=$(LIB_DIR)/org.astro.jar
GREETINGS_JAR=$(LIB_DIR)/com.greetings.jar
LIB_DIR = mlib

all: $(MODULE_DIRS) $(TARGET)
	java --module-path mods -m com.greetings/com.greetings.Main

jar: $(ASTRO_JAR) $(GREETINGS_JAR)

$(GREETINGS_JAR): $(TARGET) $(LIB_DIR)
	jar --create --file=$(GREETINGS_JAR) --main-class=com.greetings.Main -C mods/com.greetings .

$(ASTRO_JAR): $(TARGET) $(LIB_DIR)
	jar --create --file=$(ASTRO_JAR) -C mods/org.astro .

$(TARGET): $(SRC)
	javac -d mods --module-source-path src $(SRC)

$(MODULE_DIRS):
	mkdir -p $(MODULE_DIRS)

$(LIB_DIR):
	mkdir -p $(LIB_DIR)

clean:
	rm -rf mods $(LIB_DIR)

.PHONY: all clean jar
