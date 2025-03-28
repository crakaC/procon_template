CLASS_PATH=$(shell cat .runtimeClassPath)
KtClass=$(shell echo $@ | awk '{print toupper(substr($$0, 0, 1)) substr($$0, 2) "Kt"}' | sed -E 's/^([0-9])/_\1/')
%: src/%.kt
	@java -classpath $(CLASS_PATH) $(KtClass)

.PHONY: build
build:
	./gradlew build

.PHONY: clean
clean:
	./gradlew clean