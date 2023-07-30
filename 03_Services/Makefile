# TODO: define dependencies of source files
all:
	rm -rf mods/
	mkdir -p mods/com.greetings/
	javac -d mods --module-source-path src $$(find src -name "*.java")
	javac -d mods/com.greetings/ -p mods $$(find src/com.greetings -name "*.java")
	java -p mods -m com.greetings/com.greetings.Main
