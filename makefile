KOTLIN_VER=1.4.30
KOTLIN_DIR=/usr/local/Cellar/kotlin/$(KOTLIN_VER)/libexec/lib/
CLASSES=:kotlin-stdlib.jar:kotlin-stdlib-common-$(KOTLIN_VER).jar:annotations-13.0.jar
CLASS_PATHS=$(subst :,:$(KOTLIN_DIR),$(CLASSES))
KtClass=$(shell ruby -e 'if Integer("$@"[0], exception: false).nil?; puts "$@".capitalize + "Kt"; else puts "_$@Kt"; end')
#KtClass=$(shell ./getKtName $@)
%: src/%.kt
# 	gradle run -PmainClass=$@
	java -classpath build/classes/kotlin/main$(CLASS_PATHS) $(KtClass)

.PHONY: clean
clean:
	gradle clean