CLASS_PATH=$(shell cat classpath)
KtClass=$(shell ruby -e 'if Integer("$@"[0], exception: false).nil?; puts "$@".capitalize + "Kt"; else puts "_$@Kt"; end')
#KtClass=$(shell ./getKtName $@)
%: src/%.kt
# 	gradle run -PmainClass=$@
	java -classpath $(CLASS_PATH) $(KtClass)

.PHONY: clean
clean:
	gradle clean