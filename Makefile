ficheroJar := Catalogo.jar

limpiar:
	rm -f catalogo.jar	
	rm -rf ../bin
compilar:limpiar
	find .. -name "*.class" | xargs rm
	mkdir bin
	find . -name "*.java" | xargs javac -cp ../bin -d ../bin

jar:compilar
	jar cvfm catalogo.jar ../Manifest.mf -C ../bin .

jar:ejecutar
	cd src
	java -cp catalogo.jar aplicacion.Principal add Mercedes azul 345 5
	java -cp catalogo.jar aplicacion.Principal remove Mercedes azul 345 5
	// antes de modificar, se debe introducir con el comando (add) Mercedes azul 345 5
	java -cp catalogo.jar aplicacion.Principal modify Mercedes gris 345 5
