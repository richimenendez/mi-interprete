SET JAVA_HOME = "C:\Program Files\Java\jdk1.8.0_111\bin"
SET PATH = %JAVA_HOME% ; %PATH%
SET CLASSPATH = %JAVA_HOME%;
cd = C:\Users\Richi\Desktop\Programacion\Compi\mi-interprete\src\RAnalizador
java -jar C:\Users\Richi\Desktop\Programacion\Compi\mi-interprete\java-cup-11b.jar -parser SParser -symbols SSimbolos Sins.cup
pause
