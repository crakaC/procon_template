%: src/%.kt
	@echo "Running $@.kt > "
	@java -classpath $(shell cat .runtimeClassPath) $(shell ./convertFileName.sh $@)

.PHONY: build
build:
	./gradlew build

.PHONY: clean
clean:
	./gradlew clean